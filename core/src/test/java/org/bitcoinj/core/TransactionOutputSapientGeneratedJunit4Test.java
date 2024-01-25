package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;

import org.bitcoinj.script.ScriptException;

import java.nio.BufferOverflowException;

import org.bitcoinj.base.Network;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.base.Coin;
import org.bitcoinj.base.internal.ByteUtils;
import org.bitcoinj.script.Script;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TransactionOutputSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Transaction parentMock = mock(Transaction.class, "parent");

    private final Address addressMock = mock(Address.class, "toString_address1");

    private final Coin coinMock = mock(Coin.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final TransactionBag transactionBagMock = mock(TransactionBag.class, "{}");

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final Coin valueMock = mock(Coin.class);

    private final Coin coinMock2 = mock(Coin.class);

    private final Coin feePerKbMock = mock(Coin.class);

    private final Transaction transaction2Mock = mock(Transaction.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}
    @Ignore()
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 113)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.read((ByteBuffer) any())).thenReturn(coinMock);
            doReturn(-1).when(coinMock).signum();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Transaction transaction = new Transaction();
            //Act Statement(s)
            TransactionOutput result = TransactionOutput.read(byteBuffer, transaction);
            TransactionOutput transactionOutput = new TransactionOutput(transaction, coinMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutput));
            coin.verify(() -> Coin.read((ByteBuffer) any()));
            verify(coinMock).signum();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d8c4a0e8-c71c-3527-9380-5b503cb51b26}
    @Ignore()
    @Test()
    public void getScriptPubKeyWhenScriptPubKeyIsNull() throws ScriptException {
        /* Branches:
         * (scriptPubKey == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, coin, byteArray);
            //Act Statement(s)
            Script result = target.getScriptPubKey();
            Script script = Script.parse(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(script));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            //TODO: Needs to return real value
            doReturn(null).when(coinMock).write((ByteBuffer) any());
            byte[] byteArray = new byte[]{(byte) 0};
            //TODO: Needs to return real value
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin2 = Coin.valueOf(0L);
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, coin2, byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).write((ByteBuffer) any());
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
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
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer).when(coinMock).write((ByteBuffer) any());
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin2 = Coin.valueOf(0L);
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, coin2, byteArray);
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).write((ByteBuffer) any());
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
        }
    }

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}
    @Ignore()
    @Test()
    public void bitcoinSerializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).serialize();
            //Act Statement(s)
            byte[] result = target.bitcoinSerialize();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${c2057553-a090-359a-8f38-97b151dff7fd}
    @Ignore()
    @Test()
    public void messageSizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, coin, byteArray);
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(10));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}
    @Ignore()
    @Test()
    public void getMessageSizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "100");
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.sizeOf(3L)).thenReturn(0);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, valueMock, byteArray);
            //Act Statement(s)
            int result = target.getMessageSize();
            //Assert statement(s)
            assertThat(result, equalTo(11));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            varInt.verify(() -> VarInt.sizeOf(3L), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Ignore()
    @Test()
    public void getValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, valueMock, byteArray);
            //Act Statement(s)
            Coin result = target.getValue();
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${5bcb3b3c-5ea7-3d20-9987-985b89448502}
    @Ignore()
    @Test()
    public void setValueWhenValueEqualsCoinNEGATIVE_SATOSHI() {
        /* Branches:
         * (value.signum() >= 0) : false
         * (value.equals(Coin.NEGATIVE_SATOSHI)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "-100");
        Coin valueMock2 = mock(Coin.class, "-100");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            doReturn(0).when(valueMock2).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, valueMock2, byteArray);
            //Act Statement(s)
            target.setValue(valueMock);
            //Assert statement(s)
            verify(valueMock).signum();
            verify(valueMock2).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${1512a6d8-4a05-326e-b3dd-4d4a200cdbb3}
    @Ignore()
    @Test()
    public void isDustWhenGetValueIsLessThanGetMinNonDustValue() throws ScriptException {
        /* Branches:
         * (!ScriptPattern.isOpReturn(getScriptPubKey())) : true
         * (getValue().isLessThan(getMinNonDustValue())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock)).thenReturn(false);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn(false).when(coinMock).isLessThan(coinMock2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin2 = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin2, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            doReturn(coinMock2).when(target).getMinNonDustValue();
            //Act Statement(s)
            boolean result = target.isDust();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock), atLeast(1));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).isLessThan(coinMock2);
            verify(target).getScriptPubKey();
            verify(target).getMinNonDustValue();
        }
    }

    //Sapient generated method id: ${2671fc62-9d04-3f3e-a465-132118ac400d}
    @Ignore()
    @Test()
    public void isDustWhenGetValueNotIsLessThanGetMinNonDustValue() throws ScriptException {
        /* Branches:
         * (!ScriptPattern.isOpReturn(getScriptPubKey())) : true
         * (getValue().isLessThan(getMinNonDustValue())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock)).thenReturn(false);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn(false).when(coinMock).isLessThan(coinMock2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin2 = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin2, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            doReturn(coinMock2).when(target).getMinNonDustValue();
            //Act Statement(s)
            boolean result = target.isDust();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock), atLeast(1));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).isLessThan(coinMock2);
            verify(target).getScriptPubKey();
            verify(target).getMinNonDustValue();
        }
    }

    //Sapient generated method id: ${56feab69-3bac-32f8-927a-f7c60d18ad44}
    @Ignore()
    @Test()
    public void getMinNonDustValueWhenScriptPatternIsSentToMultisigScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin feePerKbMock = mock(Coin.class, "1000");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(coinMock).when(feePerKbMock).multiply(158L);
            doReturn(coinMock2).when(coinMock).divide(1000L);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            Coin result = target.getMinNonDustValue(feePerKbMock);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            verify(feePerKbMock).multiply(158L);
            verify(coinMock).divide(1000L);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${8cbc06c4-1459-31a6-850c-6fee0995bd76}
    @Ignore()
    @Test()
    public void getMinNonDustValueWhenScriptPatternIsP2WHScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : false
         * (ScriptPattern.isP2WH(script)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin feePerKbMock = mock(Coin.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(coinMock).when(feePerKbMock).multiply(76L);
            doReturn(coinMock2).when(coinMock).divide(1000L);
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            Coin result = target.getMinNonDustValue(feePerKbMock);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            verify(feePerKbMock).multiply(76L);
            verify(coinMock).divide(1000L);
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${bd8a0d32-2d95-31c0-994b-38d4ed2b0b5d}
    @Ignore()
    @Test()
    public void getMinNonDustValueWhenScriptPatternNotIsP2WHScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : false
         * (ScriptPattern.isP2WH(script)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.sizeOf(0L)).thenReturn(1);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(false);
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            Coin result = target.getMinNonDustValue(coinMock);
            Coin coin2 = Coin.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            varInt.verify(() -> VarInt.sizeOf(0L), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${401a91da-a15a-3723-9d69-a56bc3876009}
    @Ignore()
    @Test()
    public void getMinNonDustValue1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(coinMock).when(target).getMinNonDustValue((Coin) any());
            //Act Statement(s)
            Coin result = target.getMinNonDustValue();
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getMinNonDustValue((Coin) any());
        }
    }

    //Sapient generated method id: ${993d0a78-f718-3863-8dd8-90d21ecce547}
    @Ignore()
    @Test()
    public void markAsSpentWhenLogIsDebugEnabled() {
        /* Branches:
         * (parent != null) : true
         * (log.isDebugEnabled()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "100");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(sha256HashMock).when(target).getParentTransactionHash();
            doReturn(1).when(target).getIndex();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
            TransactionInput transactionInput = new TransactionInput(transaction2Mock, byteArray2, transactionOutPointMock);
            //Act Statement(s)
            target.markAsSpent(transactionInput);
            //Assert statement(s)
            assertThat(target.getSpentBy(), equalTo(transactionInput));
            assertThat(target.isAvailableForSpending(), equalTo(Boolean.FALSE));
            verify(valueMock, atLeast(1)).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getParentTransactionHash();
            verify(target, atLeast(1)).getIndex();
        }
    }

    //Sapient generated method id: ${0f6f4feb-7052-382e-b4ce-ba460f9a31f8}
    @Ignore()
    @Test()
    public void markAsSpentWhenLogNotIsDebugEnabledAndLogIsDebugEnabled() {
        /* Branches:
         * (parent != null) : true
         * (log.isDebugEnabled()) : false
         * (log.isDebugEnabled()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(sha256HashMock).when(target).getParentTransactionHash();
            doReturn(0).when(target).getIndex();
            byte[] byteArray2 = new byte[]{};
            Coin coin2 = Coin.valueOf(0L);
            TransactionInput transactionInput = new TransactionInput(transaction2Mock, byteArray2, transactionOutPointMock, coin2);
            //Act Statement(s)
            target.markAsSpent(transactionInput);
            //Assert statement(s)
            assertThat(target.getSpentBy(), equalTo(transactionInput));
            assertThat(target.isAvailableForSpending(), equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getParentTransactionHash();
            verify(target, atLeast(1)).getIndex();
        }
    }

    //Sapient generated method id: ${09d5345d-e107-31c7-9a3b-6583c251053f}
    @Ignore()
    @Test()
    public void markAsUnspentWhenLogIsDebugEnabled() {
        /* Branches:
         * (parent != null) : true
         * (log.isDebugEnabled()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(sha256HashMock).when(target).getParentTransactionHash();
            doReturn(1).when(target).getIndex();
            //Act Statement(s)
            target.markAsUnspent();
            //Assert statement(s)
            assertThat(target.getSpentBy(), is(nullValue()));
            assertThat(target.isAvailableForSpending(), equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getParentTransactionHash();
            verify(target).getIndex();
        }
    }

    //Sapient generated method id: ${9a71a0e1-99a1-3130-b13d-ca016bcc679e}
    @Ignore()
    @Test()
    public void markAsUnspentWhenLogNotIsDebugEnabledAndLogIsDebugEnabled() {
        /* Branches:
         * (parent != null) : true
         * (log.isDebugEnabled()) : false
         * (log.isDebugEnabled()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(sha256HashMock).when(target).getParentTransactionHash();
            doReturn(0).when(target).getIndex();
            //Act Statement(s)
            target.markAsUnspent();
            //Assert statement(s)
            assertThat(target.getSpentBy(), is(nullValue()));
            assertThat(target.isAvailableForSpending(), equalTo(Boolean.TRUE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getParentTransactionHash();
            verify(target).getIndex();
        }
    }

    //Sapient generated method id: ${27e4fc26-31eb-3fd4-a413-3a676e4ddd64}
    @Ignore()
    @Test()
    public void isMineOrWatchedWhenIsWatchedTransactionBag() {
        /* Branches:
         * (isMine(transactionBag)) : false
         * (isWatched(transactionBag)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(false).when(target).isMine(transactionBagMock);
            doReturn(true).when(target).isWatched(transactionBagMock);
            //Act Statement(s)
            boolean result = target.isMineOrWatched(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isMine(transactionBagMock);
            verify(target).isWatched(transactionBagMock);
        }
    }

    //Sapient generated method id: ${f213c504-6285-3313-a6e2-90864ba6c6a7}
    @Ignore()
    @Test()
    public void isMineOrWatchedWhenIsWatchedNotTransactionBag() {
        /* Branches:
         * (isMine(transactionBag)) : false
         * (isWatched(transactionBag)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "[{parent={value=<value>}, params={value=<value>}, value={value=<value>}, scriptBytes={value=<value>}}]");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(false).when(target).isMine(transactionBagMock);
            doReturn(false).when(target).isWatched(transactionBagMock);
            //Act Statement(s)
            boolean result = target.isMineOrWatched(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isMine(transactionBagMock);
            verify(target).isWatched(transactionBagMock);
        }
    }

    //Sapient generated method id: ${f667fa78-377b-35f8-bced-a8618a98908c}
    @Ignore()
    @Test()
    public void isWatchedWhenTransactionBagIsWatchedScriptScript() throws ScriptException {
        /* Branches:
         * (transactionBag.isWatchedScript(script)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "<TransactionBag object>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(true).when(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isWatched(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${2cdc015a-21ac-30a9-96e7-2bbf24fee106}
    @Ignore()
    @Test()
    public void isWatchedWhenTransactionBagNotIsWatchedScriptScript() throws ScriptException {
        /* Branches:
         * (transactionBag.isWatchedScript(script)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "TransactionBag object");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isWatched(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${47e14f1c-4271-3dac-8ae7-306c265200e6}
    @Ignore()
    @Test()
    public void isWatchedWhenCaughtScriptException() throws ScriptException {
        /* Branches:
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "new TransactionBag()");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isWatched(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isWatchedScript(scriptMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${3b12729d-adee-3b4d-8d0b-662b58683ffb}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagIsPubKeyMineScriptPatternExtractKeyFromP2PKScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : true
         * (transactionBag.isPubKeyMine(ScriptPattern.extractKeyFromP2PK(script))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${6e67a9bd-53fa-32f7-aef7-2c990422adda}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagNotIsPubKeyMineScriptPatternExtractKeyFromP2PKScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : true
         * (transactionBag.isPubKeyMine(ScriptPattern.extractKeyFromP2PK(script))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "null");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c07e3a7e-a49e-31e2-af2d-c76cd5f99f94}
    @Ignore()
    @Test()
    public void isMineWhenParentIsNull() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : true
         * (catch-exception (ScriptException)) : true
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyMine(byteArray);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, (Transaction) null, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyMine(byteArray);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${690be08b-a7ca-3f3b-a0ac-63aca6272885}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagIsPayToScriptHashMineScriptPatternExtractHashFromP2SHScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (transactionBag.isPayToScriptHashMine(ScriptPattern.extractHashFromP2SH(script))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "1000");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPayToScriptHashMine(byteArray);
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPayToScriptHashMine(byteArray);
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${d615858a-5f43-364e-af2f-6f474932a1a0}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagNotIsPayToScriptHashMineScriptPatternExtractHashFromP2SHScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (transactionBag.isPayToScriptHashMine(ScriptPattern.extractHashFromP2SH(script))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "TransactionBag object");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${9033e590-5d4b-3b5f-ab02-9f097eb69a71}
    @Ignore()
    @Test()
    public void isMineWhenScriptPatternIsP2SHScriptAndCaughtScriptExceptionAndParentIsNotNull() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (catch-exception (ScriptException)) : true
         * (parent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPayToScriptHashMine(byteArray);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c4f8c84a-6c34-3a9d-a7f2-75f291c5b412}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagIsPubKeyHashMineScriptPatternExtractHashFromP2PKHScriptScriptTypeP2PKH() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : true
         * (transactionBag.isPubKeyHashMine(ScriptPattern.extractHashFromP2PKH(script), ScriptType.P2PKH)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "[{signum={value=1}, isP2PK={value=false}, extractHashFromP2PKH={resultList=[0, 1, 2]}, isP2SH={value=false}, checkArgument={value=null}, isP2PKH={value=true}, isPubKeyHashMine={value=true}}]");
        Coin valueMock = mock(Coin.class, "1000");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c7a723e4-1568-385d-9cba-bf90ff97f0e1}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagNotIsPubKeyHashMineScriptPatternExtractHashFromP2PKHScriptScriptTypeP2PKH() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : true
         * (transactionBag.isPubKeyHashMine(ScriptPattern.extractHashFromP2PKH(script), ScriptType.P2PKH)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "[{parent={}, params={}, value={}, scriptBytes={resultList=[]}}]");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${de419ef6-2fe1-32fb-ab46-f291cd400bcd}
    @Ignore()
    @Test()
    public void isMineWhenScriptPatternNotIsP2WPKHScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${523ce101-3ab8-3bf4-9085-9dcd7391af24}
    @Ignore()
    @Test()
    public void isMineWhenScriptPatternIsP2PKHScriptAndCaughtScriptExceptionAndParentIsNotNull() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : true
         * (catch-exception (ScriptException)) : true
         * (parent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "<generated TransactionBag object>");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${d78fcc98-8841-39d7-81f5-99a04327d1b3}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagIsPubKeyHashMineScriptPatternExtractHashFromP2WHScriptScriptTypeP2WPKH() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : true
         * (transactionBag.isPubKeyHashMine(ScriptPattern.extractHashFromP2WH(script), ScriptType.P2WPKH)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${36284511-a62b-3d58-ac2b-00b762354705}
    @Ignore()
    @Test()
    public void isMineWhenTransactionBagNotIsPubKeyHashMineScriptPatternExtractHashFromP2WHScriptScriptTypeP2WPKH() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : true
         * (transactionBag.isPubKeyHashMine(ScriptPattern.extractHashFromP2WH(script), ScriptType.P2WPKH)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "TransactionBag");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(false).when(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray2 = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(transactionBagMock).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${57475f2a-e73d-32b6-bbf4-313947b1388c}
    @Ignore()
    @Test()
    public void isMineWhenScriptPatternIsP2WPKHScriptAndCaughtScriptExceptionAndParentIsNotNull() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : true
         * (catch-exception (ScriptException)) : true
         * (parent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "<TransactionBag object>");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            boolean result = target.isMine(transactionBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn("return_of_toString1").when(target).toString((Network) null);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).toString((Network) null);
        }
    }

    //Sapient generated method id: ${3eef7f03-7884-3cd9-bc30-92ac3c847af3}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsP2SHScriptAndNetworkIsNotNull() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (network != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "toString_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("0.01 BTC").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            doReturn(ScriptType.P2SH).when(scriptMock).getScriptType();
            doReturn(addressMock).when(scriptMock).getToAddress(networkMock);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 0.01 BTC to P2SH toString_address1 script:toString_script1"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(scriptMock).getScriptType();
            verify(scriptMock).getToAddress(networkMock);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${39599903-db62-343e-9f0d-4380d0c6e11a}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsP2PKScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "0");
        Script scriptMock = mock(Script.class, "toString_script1");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("0 BTC").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("040c9cbb9ef69a5c6f5e9f9b6d5f5e0b4b9d6d6a7d5c2c3e6e3f525d8d5a4a4c7d7f0f5f9d365d9c6d5f5e0b4b9d6d6a7d5c2c3e6e3f525d8d5a4a4c7d7f0f5f9d365d9c");
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray2 = new byte[]{(byte) 65, (byte) 4, (byte) -100, (byte) -69, (byte) -98, (byte) -10, (byte) -102, (byte) 92, (byte) 111, (byte) 94, (byte) -97, (byte) -101, (byte) 109, (byte) 95, (byte) 94, (byte) 11, (byte) 75, (byte) -99, (byte) 109, (byte) 106, (byte) 125, (byte) 92, (byte) 44, (byte) 62, (byte) 110, (byte) 63, (byte) 82, (byte) 93, (byte) -115, (byte) 90, (byte) 74, (byte) 76, (byte) 125, (byte) 127, (byte) 15, (byte) 95, (byte) -99, (byte) 54, (byte) 93, (byte) -100, (byte) 109, (byte) 95, (byte) 94, (byte) 11, (byte) 75, (byte) -99, (byte) 109, (byte) 106, (byte) 125, (byte) 92, (byte) 44, (byte) 62, (byte) 110, (byte) 63, (byte) 82, (byte) 93, (byte) -115, (byte) 90, (byte) 74, (byte) 76, (byte) 125, (byte) 127, (byte) 15, (byte) 95, (byte) -99, (byte) 54, (byte) 93, (byte) -84};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray2));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 0 BTC to pubkey 040c9cbb9ef69a5c6f5e9f9b6d5f5e0b4b9d6d6a7d5c2c3e6e3f525d8d5a4a4c7d7f0f5f9d365d9c6d5f5e0b4b9d6d6a7d5c2c3e6e3f525d8d5a4a4c7d7f0f5f9d365d9c script:toString_script1"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${28bc2346-f0d9-3478-972e-4812b3734f5f}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsP2SHScriptAndNetworkIsNotNullAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (network != null) : true
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "toString_script1");
        Address addressMock = mock(Address.class, "UNKNOWN");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("100.00 BTC").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            doReturn(ScriptType.P2SH).when(scriptMock).getScriptType();
            doReturn(addressMock).when(scriptMock).getToAddress(networkMock);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 100.00 BTC to P2SH  script:toString_script1 [exception: BC]"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(scriptMock).getScriptType();
            verify(scriptMock).getToAddress(networkMock);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${840c4869-c88d-3219-9e45-45ec7a7456b9}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsP2PKScriptAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : true
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("<String>").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin2 = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin2, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(""));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${0fd81350-f26c-386d-a950-2395771ee0c3}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsSentToMultisigScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "1000");
        Script scriptMock = mock(Script.class, "toString_script1");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("toFriendlyString").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of toFriendlyString to multisig script:toString_script1"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${df2a211a-9661-30a8-ac4e-7c98b603c6e7}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternNotIsSentToMultisigScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "100000");
        Script scriptMock = mock(Script.class, "toString_script1");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("0.00100000 BTC").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            doReturn(ScriptType.P2PK).when(scriptMock).getScriptType();
            doReturn(addressMock).when(scriptMock).getToAddress(networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 0.00100000 BTC to P2PK toString_address1 script:toString_script1"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(scriptMock).getScriptType();
            verify(scriptMock).getToAddress(networkMock);
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${9584fab0-943a-3856-9da4-1ca4383e25df}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternIsSentToMultisigScriptAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "toString_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("0.00001").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 0.00001 to multisig script:toString_script1 [exception: B]"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${0971f5e6-21ca-3086-99fd-461bc3eface3}
    @Ignore()
    @Test()
    public void toString1WhenScriptPatternNotIsSentToMultisigScriptAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isP2TR(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : false
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "toString_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn("0.00001 BTC").when(coinMock).toFriendlyString();
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = spy(new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray));
            doReturn(scriptMock).when(target).getScriptPubKey();
            //Act Statement(s)
            String result = target.toString(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("TxOut of 0.00001 BTC (unknown type) script:toString_script1 [exception: B]"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).toFriendlyString();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(target).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${4d7dd834-8921-38f6-84de-0501ab8366a5}
    @Ignore()
    @Test()
    public void getParentTransactionHashWhenParentIsNull() {
        /* Branches:
         * (parent == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = new TransactionOutput(networkParameters, (Transaction) null, coin, byteArray);
            //Act Statement(s)
            Sha256Hash result = target.getParentTransactionHash();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${e644ab91-31d4-35d0-b6e1-8e573a7420d7}
    @Ignore()
    @Test()
    public void getParentTransactionHashWhenParentIsNotNull() {
        /* Branches:
         * (parent == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, valueMock, byteArray);
            //Act Statement(s)
            Sha256Hash result = target.getParentTransactionHash();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6a43988f-50bf-31c7-ad26-48bea935d3ab}
    @Ignore()
    @Test()
    public void getParentTransactionDepthInBlocksWhenConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDING() {
        /* Branches:
         * (getParentTransaction() != null) : true
         * (confidence.getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING).when(transactionConfidenceMock).getConfidenceType();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionOutput target = new TransactionOutput(networkParametersMock, transactionMock, valueMock, byteArray);
            //Act Statement(s)
            int result = target.getParentTransactionDepthInBlocks();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).getConfidenceType();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6e970e92-4103-3cca-98e3-4e8db0b37090}
    @Ignore()
    @Test()
    public void getParentTransactionDepthInBlocksWhenConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeBUILDING() {
        /* Branches:
         * (getParentTransaction() != null) : true
         * (confidence.getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction transactionMock2 = mock(Transaction.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, coin, byteArray));
            doReturn(transactionMock, transactionMock2).when(target).getParentTransaction();
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
            doReturn(transactionConfidence).when(transactionMock2).getConfidence();
            //Act Statement(s)
            int result = target.getParentTransactionDepthInBlocks();
            //Assert statement(s)
            assertThat(result, equalTo(-1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target, times(2)).getParentTransaction();
            verify(transactionMock2).getConfidence();
        }
    }

    //Sapient generated method id: ${9763c2e9-d52b-3ce1-9db2-684a329dc1e1}
    @Ignore()
    @Test()
    public void getOutPointForTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "100");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(-1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            TransactionOutput target = spy(new TransactionOutput(networkParameters, transaction, valueMock, byteArray));
            doReturn(1).when(target).getIndex();
            doReturn(transactionMock).when(target).getParentTransaction();
            //Act Statement(s)
            TransactionOutPoint result = target.getOutPointFor();
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(1L, transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutPoint));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getIndex();
            verify(target).getParentTransaction();
        }
    }

    //Sapient generated method id: ${3c03c698-f46c-318b-b32e-0af843250226}
    @Ignore()
    @Test()
    public void duplicateDetachedWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 113)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            doReturn(1).when(coinMock).signum();
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction transaction = new Transaction();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            TransactionOutput target = new TransactionOutput(networkParameters, transaction, valueMock, byteArray);
            //Act Statement(s)
            TransactionOutput result = target.duplicateDetached();
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            TransactionOutput transactionOutput = new TransactionOutput((Transaction) null, coinMock, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutput));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(coinMock).signum();
        }
    }
}
