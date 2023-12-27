package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.VarInt;

import java.util.Date;
import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;

import java.util.EnumSet;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.internal.Stopwatch;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;
import org.bitcoinj.script.ScriptBuilder;

import java.time.Instant;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
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
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import java.util.stream.IntStream;
import java.util.function.IntFunction;

import org.bitcoinj.base.internal.TimeUtils;

import java.util.stream.Stream;
import java.util.stream.Collector;

import org.junit.Ignore;
import org.bitcoinj.base.internal.InternalUtils;

public class BlockSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash prevBlockHashMock = mock(Sha256Hash.class, "<init>_sha256Hash1");

    private final Address addressMock = mock(Address.class, "{}");

    private final Block blockMock = mock(Block.class);

    private final Coin coinMock = mock(Coin.class, "50");

    private final Transaction coinbaseMock = mock(Transaction.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);

    private final Transaction tMock = mock(Transaction.class, "addTransaction_transaction1");

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Sha256Hash sha256Hash3Mock = mock(Sha256Hash.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (payload.hasRemaining()) : true
         * (branch expression (line 229)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
    sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock).thenReturn(sha256Hash2);
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L).thenReturn(1L).thenReturn(0L).thenReturn(0L);
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(80))).thenReturn(byteArray);
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray)).thenReturn(byteArray2);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer2);
    sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray2)).thenReturn(sha256Hash3);
    ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Block result = Block.read(byteBuffer3);
    Instant instant = Instant.ofEpochSecond(1L);
    Block block = new Block(0L, sha256HashMock, sha256Hash2, instant, 0L, 0L, (List) null);
    //Assert statement(s)
    assertThat(result, equalTo(block));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(4));
    sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(2));
    buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(80)));
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5d51d406-d3a8-3e14-a87e-a1fa21738c45}
    @Test()
    public void readWhenPayloadNotHasRemainingAndDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (payload.hasRemaining()) : false
         * (branch expression (line 229)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
    sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock).thenReturn(sha256Hash2);
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L).thenReturn(1L).thenReturn(0L).thenReturn(0L);
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(80))).thenReturn(byteArray);
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray)).thenReturn(byteArray2);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer2);
    sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray2)).thenReturn(sha256Hash3);
    ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Block result = Block.read(byteBuffer3);
    Instant instant = Instant.ofEpochSecond(1L);
    Block block = new Block(0L, sha256HashMock, sha256Hash2, instant, 0L, 0L, (List) null);
    //Assert statement(s)
    assertThat(result, equalTo(block));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(4));
    sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(2));
    buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(80)));
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${e6dc3848-c1e2-342a-b3a0-7909e742a115}
    @Ignore()
    @Test()
    public void createGenesisTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            Transaction transaction2 = new Transaction();
            byte[] byteArray = new byte[]{};
            transaction.when(() -> Transaction.coinbase(byteArray)).thenReturn(transaction2);
            Instant instant = Instant.now();
            //Act Statement(s)
            Block result = Block.createGenesis(instant, 123456789L);
            List<Transaction> transactionList = new ArrayList<>();
            Block block = new Block(1L, instant, 123456789L, transactionList);
            //Assert statement(s)
            assertThat(result, equalTo(block));
            transaction.verify(() -> Transaction.coinbase(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${189343d6-b069-3cec-9237-6054c5ebf02a}
    @Ignore()
    @Test()
    public void createGenesis1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
    Transaction transaction2 = new Transaction();
    byte[] byteArray = new byte[] {};
    transaction.when(() -> Transaction.coinbase(byteArray)).thenReturn(transaction2);
    Instant instant = Instant.now();
    //Act Statement(s)
    Block result = Block.createGenesis(instant, 1000000L, 12345L);
    List<Transaction> transactionList = new ArrayList<>();
    Block block = new Block(1L, instant, 1000000L, 12345L, transactionList);
    //Assert statement(s)
    assertThat(result, equalTo(block));
    transaction.verify(() -> Transaction.coinbase(byteArray), atLeast(1));
}*/
    }

    //Sapient generated method id: ${3214fc90-c318-3485-ab82-b6576fb3f20c}
    @Test()
    public void messageSizeWhenTransactionsIsNotEmpty() {
        /* Branches:
         * (transactions != null) : true
         * (for-each(transactions)) : true
         */
        //Arrange Statement(s)
        Transaction transactionMock2 = mock(Transaction.class);
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transactionMock);
            Block target = spy(new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, transactionList));
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock2);
            doReturn(transactionList2).when(target).getTransactions();
            doReturn(1).when(transactionMock2).messageSize();
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(82));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
            verify(target).getTransactions();
            verify(transactionMock2).messageSize();
        }
    }

    //Sapient generated method id: ${00efdb93-15a3-3d3f-b810-496322c66dd3}
    @Test()
    public void writeHeaderTest() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1703673666L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    Transaction transaction = new Transaction();
    List<Transaction> transactionList = new ArrayList<>();
    transactionList.add(transaction);
    Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList));
    doReturn(sha256HashMock).when(target).getMerkleRoot();
    byte[] byteArray = new byte[] { (byte) 0 };
    doReturn(byteArray).when(sha256HashMock).serialize();
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.writeHeader(outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1L), (OutputStream) any()));
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1703673666L), (OutputStream) any()));
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (OutputStream) any()), atLeast(2));
    verify(target).getMerkleRoot();
    verify(sha256HashMock).serialize();
}*/
    }

    //Sapient generated method id: ${4ad7e438-6eca-3d1b-8003-c0d91ba506a4}
    @Test()
    public void bitcoinSerializeToStreamWhenTransactionsIsNull() throws IOException {
        /* Branches:
         * (transactions == null) : true  #  inside writeTransactions method
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        //Instant instant = Instant.now();
        //List<Transaction> transactionList = new ArrayList<>();
        //Block target = spy(new Block(123456789L, sha256Hash, sha256Hash2, instant, 987654321L, 123456789L, transactionList));
        //doNothing().when(target).writeHeader((OutputStream) any());
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.bitcoinSerializeToStream(outputStream);
        //Assert statement(s)
        //verify(target).writeHeader((OutputStream) any());
    }

    //Sapient generated method id: ${3823bdd3-9168-3dd9-b7f9-f789af57be37}
    @Test()
    public void bitcoinSerializeToStreamWhenTransactionsIsNotEmpty() throws IOException {
        /* Branches:
         * (transactions == null) : false  #  inside writeTransactions method
         * (for-each(transactions)) : true  #  inside writeTransactions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //VarInt varIntMock = mock(VarInt.class);
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    varInt.when(() -> VarInt.of(1L)).thenReturn(varIntMock);
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(varIntMock).serialize();
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    Transaction transaction = new Transaction();
    List<Transaction> transactionList = new ArrayList<>();
    transactionList.add(transaction);
    Block target = spy(new Block(0L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList));
    doNothing().when(target).writeHeader((OutputStream) any());
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(1L), atLeast(1));
    verify(varIntMock).serialize();
    verify(target).writeHeader((OutputStream) any());
}*/
    }

    //Sapient generated method id: ${204e0053-2b46-391f-8365-46fec875a044}
    @Ignore()
    @Test()
    public void unCacheTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 1L, 1L, transactionList);
        //Act Statement(s)
        target.unCache();
    }

    //Sapient generated method id: ${1f6862ab-ded4-3755-ba95-62ba3fe7cf68}
    @Test()
    public void getHashWhenHashIsNull() throws IOException {
        /* Branches:
         * (hash == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256Hash2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer2);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer3);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(1L, sha256Hash3, sha256Hash4, instant, 12345L, 67890L, transactionList));
            doNothing().when(target).writeHeader((ByteArrayOutputStream) any());
            //Act Statement(s)
            Sha256Hash result = target.getHash();
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
            verify(target).writeHeader((ByteArrayOutputStream) any());
        }
    }

    //Sapient generated method id: ${21cc821e-654e-3c72-ab54-ac023644cb88}
    @Test()
    public void getHashWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (hash == null) : true
         * (catch-exception (IOException)) : true  #  inside calculateHash method
         */
        //Arrange Statement(s)
        //IOException iOExceptionMock = mock(IOException.class);
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
    byte[] byteArray = new byte[] { (byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86 };
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
    Sha256Hash sha256Hash2 = Sha256Hash.wrapReversed(byteArray);
    sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256Hash2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(1L, sha256Hash3, sha256Hash4, instant, 12345L, 67890L, transactionList));
    doThrow(iOExceptionMock).when(target).writeHeader((ByteArrayOutputStream) any());
    thrown.expect(RuntimeException.class);
    thrown.expectCause(isA(IOException.class));
    //Act Statement(s)
    target.getHash();
    //Assert statement(s)
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
    verify(target).writeHeader((ByteArrayOutputStream) any());
}*/
    }

    //Sapient generated method id: ${fe9c0d83-f1f6-3a4e-95d4-e0b20ca2644f}
    @Ignore()
    @Test()
    public void getWorkTest() throws VerificationException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.decodeCompactBits(100000L)).thenReturn(new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639935"));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 100000L, 0L, transactionList);
            //Act Statement(s)
            BigInteger result = target.getWork();
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(100000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${5618602c-f2a3-3b0a-b201-790f61f71edb}
    @Ignore()
    @Test()
    public void cloneAsHeaderWhenDefaultBranch() throws IOException {
        /* Branches:
         * (branch expression (line 229)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList));
        doReturn(sha256HashMock).when(target).getMerkleRoot();
        doReturn(sha256HashMock2).when(target).getHash();
        //Act Statement(s)
        Block result = target.cloneAsHeader();
        Block block = new Block(1L, sha256Hash, sha256HashMock, instant, 0L, 0L, (List) null);
        //Assert statement(s)
        assertThat(result, equalTo(block));
        verify(target).getMerkleRoot();
        verify(target).getHash();
    }

    //Sapient generated method id: ${a20be125-4037-35ac-8ccc-c17e96e9f3ba}
    @Test()
    public void toStringWhenTransactionsIsNotEmpty() throws IOException {
        /* Branches:
         * (isBIP34()) : true
         * (isBIP66()) : true
         * (isBIP65()) : true
         * (!bips.isEmpty()) : true
         * (transactions != null) : true
         * (transactions.size() > 0) : true
         * (for-each(transactions)) : true
         */
        //Arrange Statement(s)
        //Sha256Hash sha256HashMock = mock(Sha256Hash.class, "toString_sha256Hash1");
        /*try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
    MockedStatic<InternalUtils> internalUtils = mockStatic(InternalUtils.class)) {
    String[] stringArray = new String[] { "BIP34", "BIP66", "BIP65" };
    internalUtils.when(() -> InternalUtils.commaJoin(stringArray)).thenReturn("BIP34, BIP66, BIP65");
    timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("B");
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(2L, sha256Hash, sha256Hash2, instant, 12345L, 67890L, transactionList));
    doReturn("A").when(target).getHashAsString();
    doReturn(true).when(target).isBIP34();
    doReturn(true).when(target).isBIP66();
    doReturn(true).when(target).isBIP65();
    doReturn(sha256HashMock).when(target).getPrevBlockHash();
    //Act Statement(s)
    String result = target.toString();
    //Assert statement(s)
    assertThat(result, equalTo(" block: \n   hash: A\n   version: 2 (BIP34, BIP66, BIP65)\n   previous block: toString_sha256Hash1\n   time: 2023-12-27T10:41:09.158546Z (B)\n   difficulty target (nBits): 12345\n   nonce: 67890\n"));
    internalUtils.verify(() -> InternalUtils.commaJoin(stringArray), atLeast(1));
    timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
    verify(target).getHashAsString();
    verify(target).isBIP34();
    verify(target).isBIP66();
    verify(target).isBIP65();
    verify(target).getPrevBlockHash();
}*/
    }

    //Sapient generated method id: ${39445404-da76-3069-979e-97ca80f06363}
    @Test()
    public void toStringWhenBipsIsEmptyAndTransactionsIsNotNullAndTransactionsSizeGreaterThan0AndTransactionsIsNotEmpty() throws IOException {
        /* Branches:
         * (isBIP34()) : false
         * (isBIP66()) : false
         * (isBIP65()) : false
         * (!bips.isEmpty()) : false
         * (transactions != null) : true
         * (transactions.size() > 0) : true
         * (for-each(transactions)) : true
         */
        //Arrange Statement(s)
        //Sha256Hash sha256HashMock = mock(Sha256Hash.class, "toString_sha256Hash1");
        /*try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
    MockedStatic<InternalUtils> internalUtils = mockStatic(InternalUtils.class)) {
    String[] stringArray = new String[] { null, null, null };
    internalUtils.when(() -> InternalUtils.commaJoin(stringArray)).thenReturn("");
    timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("B");
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(2L, sha256Hash, sha256Hash2, instant, 123456789L, 987654321L, transactionList));
    doReturn("A").when(target).getHashAsString();
    doReturn(false).when(target).isBIP34();
    doReturn(false).when(target).isBIP66();
    doReturn(false).when(target).isBIP65();
    doReturn(sha256HashMock).when(target).getPrevBlockHash();
    //Act Statement(s)
    String result = target.toString();
    //Assert statement(s)
    assertThat(result, equalTo(" block: \n   hash: A\n   version: 2\n   previous block: toString_sha256Hash1\n   time: 2023-12-27T10:41:10.865665Z (B)\n   difficulty target (nBits): 123456789\n   nonce: 987654321\n"));
    internalUtils.verify(() -> InternalUtils.commaJoin(stringArray), atLeast(1));
    timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
    verify(target).getHashAsString();
    verify(target).isBIP34();
    verify(target).isBIP66();
    verify(target).isBIP65();
    verify(target).getPrevBlockHash();
}*/
    }

    //Sapient generated method id: ${509317cf-bd89-3145-9409-0a31694f5bc5}
    @Test()
    public void solveWhenCheckProofOfWorkFalse() throws VerificationException, IOException {
        /* Branches:
         * (checkProofOfWork(false)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
    Stopwatch stopwatch2 = Stopwatch.start();
    stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 1000000L, 0L, transactionList));
    doReturn(true).when(target).checkProofOfWork(false);
    //Act Statement(s)
    target.solve();
    //Assert statement(s)
    stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
    verify(target).checkProofOfWork(false);
}*/
    }

    //Sapient generated method id: ${d37d7484-af92-3706-b499-35bf30f33cdc}
    @Ignore()
    @Test()
    public void solveWhenWatchElapsedCompareToWarningThresholdNotGreaterThan0ThrowsRuntimeException() throws VerificationException {
        /* Branches:
         * (checkProofOfWork(false)) : false
         * (watch.isRunning()) : true
         * (watch.elapsed().compareTo(warningThreshold) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 1L, transactionList));
            doReturn(false).when(target).checkProofOfWork(false);
            doNothing().when(target).setNonce(2L);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(VerificationException.class));
            //Act Statement(s)
            target.solve();
            //Assert statement(s)
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            verify(target, times(2)).checkProofOfWork(false);
            verify(target).setNonce(2L);
        }
    }

    //Sapient generated method id: ${18c031c9-4c57-3eb1-ab6e-4e1ca4c9189e}
    @Test()
    public void solveWhenWatchElapsedCompareToWarningThresholdNotGreaterThan0AndCaughtVerificationExceptionThrowsRuntimeException() throws VerificationException {
        /* Branches:
         * (checkProofOfWork(false)) : false
         * (watch.isRunning()) : true
         * (watch.elapsed().compareTo(warningThreshold) > 0) : false
         * (catch-exception (VerificationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
    Stopwatch stopwatch2 = Stopwatch.start();
    stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 1L, transactionList));
    doReturn(false).when(target).checkProofOfWork(false);
    doNothing().when(target).setNonce(2L);
    thrown.expect(RuntimeException.class);
    thrown.expectCause(isA(VerificationException.class));
    //Act Statement(s)
    target.solve();
    //Assert statement(s)
    stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
    verify(target).checkProofOfWork(false);
    verify(target).setNonce(2L);
}*/
    }

    //Sapient generated method id: ${a78f48f5-e036-367a-889c-d2bfa33d4f6b}
    @Test()
    public void checkProofOfWorkWhenContextGetIsRelaxProofOfWork() throws VerificationException, IOException {
        /* Branches:
         * (Context.get().isRelaxProofOfWork()) : true
         */
        //Arrange Statement(s)
        //Coin coinMock = mock(Coin.class);
        /*try (MockedStatic<Context> context = mockStatic(Context.class)) {
    Context context2 = new Context(0, coinMock, false, true);
    context.when(() -> Context.get()).thenReturn(context2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 100000L, 0L, transactionList);
    //Act Statement(s)
    boolean result = target.checkProofOfWork(true);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    context.verify(() -> Context.get(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${ec7cb281-e854-3bff-9915-30a4e6b6cb9a}
    @Test()
    public void checkProofOfWorkWhenHCompareToTargetNotGreaterThan0() throws VerificationException, IOException {
        /* Branches:
         * (Context.get().isRelaxProofOfWork()) : false
         * (h.compareTo(target) > 0) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Context> context = mockStatic(Context.class)) {
    Context context2 = new Context();
    context.when(() -> Context.get()).thenReturn(context2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 1000L, 0L, transactionList));
    doReturn(sha256HashMock).when(target).getHash();
    doReturn(new BigInteger("0")).when(sha256HashMock).toBigInteger();
    //Act Statement(s)
    boolean result = target.checkProofOfWork(false);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    context.verify(() -> Context.get(), atLeast(1));
    verify(target).getHash();
    verify(sha256HashMock).toBigInteger();
}*/
    }

    //Sapient generated method id: ${01e1e146-56ff-3c5d-98cd-96ce26194128}
    @Test()
    public void checkProofOfWorkWhenThrowExceptionThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (Context.get().isRelaxProofOfWork()) : false
         * (h.compareTo(target) > 0) : true
         * (throwException) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<Context> context = mockStatic(Context.class)) {
    Context context2 = Context.get();
    context.when(() -> Context.get()).thenReturn(context2);
    byteUtils.when(() -> ByteUtils.decodeCompactBits(1000L)).thenReturn(new BigInteger("1"));
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
    Instant instant = Instant.now();
    List<Transaction> transactionList = new ArrayList<>();
    Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 1000L, 0L, transactionList));
    doReturn(sha256HashMock).when(target).getHash();
    doReturn(new BigInteger("2")).when(sha256HashMock).toBigInteger();
    doReturn("").when(target).getHashAsString();
    thrown.expect(VerificationException.class);
    //Act Statement(s)
    target.checkProofOfWork(true);
    //Assert statement(s)
    context.verify(() -> Context.get(), atLeast(1));
    byteUtils.verify(() -> ByteUtils.decodeCompactBits(1000L), atLeast(1));
    verify(target).getHash();
    verify(sha256HashMock).toBigInteger();
    verify(target).getHashAsString();
}*/
    }

    //Sapient generated method id: ${65f39198-b245-3198-a967-66db273f4e47}
    @Ignore()
    @Test()
    public void checkProofOfWorkWhenNotThrowException() throws VerificationException, IOException {
        /* Branches:
         * (Context.get().isRelaxProofOfWork()) : false
         * (h.compareTo(target) > 0) : true
         * (throwException) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            Context context2 = new Context();
            context.when(() -> Context.get()).thenReturn(context2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 1000L, 0L, transactionList));
            doReturn(sha256HashMock).when(target).getHash();
            doReturn(new BigInteger("1")).when(sha256HashMock).toBigInteger();
            //Act Statement(s)
            boolean result = target.checkProofOfWork(false);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).getHash();
            verify(sha256HashMock).toBigInteger();
        }
    }

    //Sapient generated method id: ${76b783da-10a4-301d-8694-a0c90ae391aa}
    @Ignore()
    @Test()
    public void checkWitnessRootWhenWitnessGetPushCountNotEquals1ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (witnessCommitment != null) : true
         * (witness.getPushCount() != 1) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            Transaction transaction = new Transaction();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transaction);
            Block target = new Block(0L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkWitnessRoot();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9edfd91-e9e8-35bd-8689-0b3d48046688}
    @Ignore()
    @Test()
    public void checkWitnessRootWhenWitnessReservedLengthNotEquals32ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (witnessCommitment != null) : true
         * (witness.getPushCount() != 1) : false
         * (witnessReserved.length != 32) : true
         */
        //Arrange Statement(s)
        Transaction coinbaseMock = mock(Transaction.class, "[{getWitness={pushes={resultList=[{getPush={value=byte[]}}]}}}]");
        Transaction transactionMock = mock(Transaction.class, "[]");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(coinbaseMock).isCoinBase();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(coinbaseMock);
            transactionList.add(transactionMock);
            Block target = new Block(0L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkWitnessRoot();
            //Assert statement(s)
            verify(coinbaseMock).isCoinBase();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${f8101b45-6ced-3853-9c5b-9964ca74e824}
    @Ignore()
    @Test()
    public void checkWitnessRootWhenTxHasWitnessesThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (witnessCommitment != null) : false
         * (for-each(transactions)) : true
         * (tx.hasWitnesses()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: coinbase
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        Transaction transaction = new Transaction();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 12345L, 67890L, transactionList);
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.checkWitnessRoot();
    }

    //Sapient generated method id: ${fd982829-94d6-3fc3-b3f6-714bba94a6df}
    @Ignore()
    @Test()
    public void checkWitnessRootWhenTxNotHasWitnesses() throws VerificationException {
        /* Branches:
         * (witnessCommitment != null) : false
         * (for-each(transactions)) : true
         * (tx.hasWitnesses()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: coinbase
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        Transaction transaction = new Transaction();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 12345L, 67890L, transactionList);
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.checkWitnessRoot();
    }

    //Sapient generated method id: ${78f6c7e1-9a47-3f05-9b6b-fe118ce26cc6}
    @Ignore()
    @Test()
    public void checkWitnessRootWhenWitnessRootHashEqualsWitnessCommitment() throws VerificationException {
        /* Branches:
         * (witnessCommitment != null) : true
         * (witness.getPushCount() != 1) : false
         * (witnessReserved.length != 32) : false
         * (!witnessRootHash.equals(witnessCommitment)) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 1L, 1L, transactionList);
        thrown.expect(IndexOutOfBoundsException.class);
        //Act Statement(s)
        target.checkWitnessRoot();
    }

    //Sapient generated method id: ${747ecfeb-1e17-3eb7-a378-ec4973d4afdf}
    @Ignore()
    @Test()
    public void getMerkleRootWhenLeftLessThanLevelSize() {
        /* Branches:
         * (merkleRoot == null) : true
         * (for-each(transactions)) : true  #  inside buildMerkleTree method
         * (useWTxId) : false  #  inside buildMerkleTree method
         * (useWTxId) : false  #  inside buildMerkleTree method
         * (levelSize > 1) : true  #  inside buildMerkleTree method
         * (left < levelSize) : true  #  inside buildMerkleTree method
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256HashMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            Instant instant = Instant.now();
            Transaction transaction = new Transaction();
            Transaction transaction2 = new Transaction();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transaction);
            transactionList.add(transaction2);
            Block target = new Block(1L, sha256Hash2, (Sha256Hash) null, instant, 12345L, 67890L, transactionList);
            //Act Statement(s)
            Sha256Hash result = target.getMerkleRoot();
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1eb2dd3d-216f-38fe-92e6-28030e535086}
    @Ignore()
    @Test()
    public void getWitnessRootWhenLeftLessThanLevelSize() {
        /* Branches:
         * (witnessRoot == null) : true
         * (for-each(transactions)) : true  #  inside buildMerkleTree method
         * (useWTxId) : true  #  inside buildMerkleTree method
         * (tx.isCoinBase()) : true  #  inside buildMerkleTree method
         * (levelSize > 1) : true  #  inside buildMerkleTree method
         * (left < levelSize) : true  #  inside buildMerkleTree method
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        Transaction transaction = new Transaction();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 12345L, 67890L, transactionList);
        //Act Statement(s)
        Sha256Hash result = target.getWitnessRoot();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0b8a4f94-16c7-37c8-9def-1c851d8a9eb6}
    @Ignore()
    @Test()
    public void getWitnessRootWhenLevelSizeGreaterThan1AndLeftLessThanLevelSize() {
        /* Branches:
         * (witnessRoot == null) : true
         * (for-each(transactions)) : true  #  inside buildMerkleTree method
         * (useWTxId) : true  #  inside buildMerkleTree method
         * (tx.isCoinBase()) : false  #  inside buildMerkleTree method
         * (useWTxId) : true  #  inside buildMerkleTree method
         * (levelSize > 1) : true  #  inside buildMerkleTree method
         * (left < levelSize) : true  #  inside buildMerkleTree method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);
        Sha256Hash sha256Hash2Mock2 = mock(Sha256Hash.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256HashMock);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = new Block(0L, sha256Hash2Mock, sha256Hash2Mock2, instant, 0L, 0L, transactionList);
            //Act Statement(s)
            Sha256Hash result = target.getWitnessRoot();
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${7792ad1e-81d3-3ebb-862c-c536da819bb1}
    @Ignore()
    @Test()
    public void addTransactionTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 10L, 0L, transactionList));
        Transaction transaction = new Transaction();
        doNothing().when(target).addTransaction(transaction, true);
        //Act Statement(s)
        target.addTransaction(transaction);
        //Assert statement(s)
        verify(target).addTransaction(transaction, true);
    }

    //Sapient generated method id: ${d97d700f-e389-3c0d-a528-7d586716c160}
    @Ignore()
    @Test()
    public void addTransaction1WhenTNotIsCoinBaseThrowsRuntimeException() {
        /* Branches:
         * (transactions == null) : true
         * (runSanityChecks) : true
         * (transactions.size() == 0) : true
         * (!t.isCoinBase()) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
        RuntimeException runtimeException = new RuntimeException("Attempted to add a non-coinbase transaction as the first transaction: Transaction{d21633ba23f70118185227be58a63527675641ad37967e2aa461559f577aec43\nweight: 40 wu, 10 bytes\npurpose: UNKNOWN\n   INCOMPLETE: No inputs!\n}");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        Transaction transaction = new Transaction();
        //Act Statement(s)
        target.addTransaction(transaction, true);
    }

    //Sapient generated method id: ${e1b4bd2a-cb92-3eb4-90d3-3f52e6b197ea}
    @Ignore()
    @Test()
    public void addTransaction1WhenRunSanityChecksAndTransactionsSizeNotGreaterThan0() {
        /* Branches:
         * (transactions == null) : true
         * (runSanityChecks) : true
         * (transactions.size() == 0) : true
         * (!t.isCoinBase()) : false
         * (runSanityChecks) : true
         * (transactions.size() > 0) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
        RuntimeException runtimeException = new RuntimeException("Attempted to add a non-coinbase transaction as the first transaction: Transaction{d21633ba23f70118185227be58a63527675641ad37967e2aa461559f577aec43\nweight: 40 wu, 10 bytes\npurpose: UNKNOWN\n   INCOMPLETE: No inputs!\n}");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        Transaction transaction = new Transaction();
        //Act Statement(s)
        target.addTransaction(transaction, true);
    }

    //Sapient generated method id: ${eb769896-33d2-3c67-b884-5ba464258a44}
    @Ignore()
    @Test()
    public void addTransaction1WhenTransactionsSizeGreaterThan0AndTIsCoinBaseThrowsRuntimeException() {
        /* Branches:
         * (transactions == null) : false
         * (runSanityChecks) : true
         * (transactions.size() == 0) : true
         * (!t.isCoinBase()) : false
         * (runSanityChecks) : true
         * (transactions.size() > 0) : true
         * (t.isCoinBase()) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
        RuntimeException runtimeException = new RuntimeException("Attempted to add a non-coinbase transaction as the first transaction: Transaction{d21633ba23f70118185227be58a63527675641ad37967e2aa461559f577aec43\nweight: 40 wu, 10 bytes\npurpose: UNKNOWN\n   INCOMPLETE: No inputs!\n}");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        Transaction transaction = new Transaction();
        //Act Statement(s)
        target.addTransaction(transaction, true);
    }

    //Sapient generated method id: ${76e9080f-1fcf-3e39-ab18-0fcd35f45357}
    @Ignore()
    @Test()
    public void getTimeSecondsTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 10L, 0L, transactionList);
        //Act Statement(s)
        long result = target.getTimeSeconds();
        //Assert statement(s)
        assertThat(result, equalTo(1703673688L));
    }

    //Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}
    @Ignore()
    @Test()
    public void getTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 1000000L, 123456789L, transactionList));
        Instant instant2 = Instant.now();
        doReturn(instant2).when(target).time();
        //Act Statement(s)
        Date result = target.getTime();
        Date date = new Date();
        //Assert statement(s)
        assertThat(result, equalTo(date));
        verify(target).time();
    }

    //Sapient generated method id: ${b6c6aab8-aa02-3896-912a-afa962530341}
    @Ignore()
    @Test()
    public void setTimeTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 10L, 0L, transactionList);
        Instant instant2 = Instant.now();
        //Act Statement(s)
        target.setTime(instant2);
    }

    //Sapient generated method id: ${e4716d7b-d0a8-3ea7-9511-d0814940c698}
    @Ignore()
    @Test()
    public void setDifficultyTargetTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
        //Act Statement(s)
        target.setDifficultyTarget(0L);
        //Assert statement(s)
        assertThat(target.getDifficultyTarget(), equalTo(0L));
    }

    //Sapient generated method id: ${0be890c6-07ff-3caa-900d-7f2c5fdb948c}
    @Ignore()
    @Test()
    public void getTransactionsWhenTransactionsIsNull() {
        /* Branches:
         * (transactions == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 100L, 0L, transactionList);
        //Act Statement(s)
        List<Transaction> result = target.getTransactions();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${50f3a1bd-c437-315a-9f18-b168fe5b35f9}
    @Ignore()
    @Test()
    public void getTransactionsWhenTransactionsIsNotNull() {
        /* Branches:
         * (transactions == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 10L, 0L, transactionList);
        //Act Statement(s)
        List<Transaction> result = target.getTransactions();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${85066d45-849c-3f18-ae04-7ae737ab916d}
    @Ignore()
    @Test()
    public void addCoinbaseTransactionWhenHeightGreaterThanOrEqualsToBlockBLOCK_HEIGHT_GENESIS() {
        /* Branches:
         * (height >= Block.BLOCK_HEIGHT_GENESIS) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: coinbase
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock = mock(ECKey.class);
        Script scriptMock = mock(Script.class);
        Coin coinMock = mock(Coin.class, "1000000");
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKOutputScript(eCKeyMock)).thenReturn(scriptMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(scriptMock).program();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 503316480L, 12345L, transactionList);
            //Act Statement(s)
            target.addCoinbaseTransaction(byteArray, coinMock, 0);
            //Assert statement(s)
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKOutputScript(eCKeyMock), atLeast(1));
            verify(scriptMock).program();
        }
    }

    //Sapient generated method id: ${74772bff-3501-3cd8-8bea-e39619bf6308}
    @Ignore()
    @Test()
    public void createNextBlockTest() throws IOException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 50L, 0L, transactionList));
        Address addressMock = mock(Address.class, "123 Main St, Anytown, USA, 12345");
        byte[] byteArray = new byte[]{};
        Coin coin = Coin.FIFTY_COINS;
        doReturn(blockMock).when(target).createNextBlock(eq(addressMock), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coin), eq(10));
        Instant instant2 = Instant.now();
        //Act Statement(s)
        Block result = target.createNextBlock(addressMock, 1L, instant2, 10);
        //Assert statement(s)
        assertThat(result, equalTo(blockMock));
        verify(target).createNextBlock(eq(addressMock), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coin), eq(10));
    }

    //Sapient generated method id: ${2a52bcf0-36c6-3d80-880e-4e3ed3cadaa9}
    @Ignore()
    @Test()
    public void createNextBlock1WhenTimeCompareToBitcoinTimeGreaterThanOrEqualsTo0AndCaughtVerificationExceptionThrowsRuntimeException() throws VerificationException {
        /* Branches:
         * (to != null) : true
         * (prevOut == null) : true
         * (time().compareTo(bitcoinTime) >= 0) : true
         * (catch-exception (VerificationException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: b, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256Hash3Mock2 = mock(Sha256Hash.class);
        Address addressMock = mock(Address.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            Sha256Hash sha256Hash2 = Sha256Hash.wrap(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{};
            script.when(() -> Script.createInputScript(byteArray3, byteArray3)).thenReturn(byteArray2);
            Instant instant2 = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transactionMock);
            Block target = spy(new Block(0L, sha256Hash3Mock, sha256Hash3Mock2, instant2, 0L, 0L, transactionList));
            doReturn(sha256HashMock).when(target).getHash();
            Instant instant3 = Instant.now();
            Instant instant4 = Instant.now();
            doReturn(instant3, instant4).when(target).time();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(VerificationException.class));
            TransactionOutPoint transactionOutPoint = null;
            Instant instant5 = Instant.now();
            byte[] byteArray4 = new byte[]{};
            //Act Statement(s)
            target.createNextBlock(addressMock, 0L, transactionOutPoint, instant5, byteArray4, coinMock, 0);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            script.verify(() -> Script.createInputScript(byteArray3, byteArray3), atLeast(1));
            verify(target).getHash();
            verify(target, times(2)).time();
        }
    }

    //Sapient generated method id: ${81e77f10-001b-3845-b918-29f8837bf1bf}
    @Ignore()
    @Test()
    public void createNextBlock1WhenTimeCompareToBitcoinTimeGreaterThanOrEqualsTo0AndBGetVersionNotEqualsVersionThrowsRuntimeException() {
        /* Branches:
         * (to != null) : true
         * (prevOut == null) : true
         * (time().compareTo(bitcoinTime) >= 0) : true
         * (b.getVersion() != version) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 100000L, 12345L, transactionList);
            thrown.expect(NullPointerException.class);
            TransactionOutPoint transactionOutPoint = null;
            Instant instant2 = Instant.now();
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.createNextBlock(addressMock, 1L, transactionOutPoint, instant2, byteArray, coinMock, 1);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2646b16a-1e16-3dd9-a7ef-0bd15d51fd8a}
    @Ignore()
    @Test()
    public void createNextBlock1WhenPrevOutIsNullAndTimeCompareToBitcoinTimeLessThan0AndCaughtVerificationExceptiThrowsRuntimeException() throws VerificationException {
        /* Branches:
         * (to != null) : true
         * (prevOut == null) : true
         * (time().compareTo(bitcoinTime) >= 0) : false
         * (catch-exception (VerificationException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: b, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            Sha256Hash sha256Hash2 = Sha256Hash.wrap(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{};
            script.when(() -> Script.createInputScript(byteArray3, byteArray3)).thenReturn(byteArray2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer2);
            Instant instant2 = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(1L, sha256Hash3, sha256Hash4, instant2, 123456789L, 987654321L, transactionList));
            doReturn(sha256HashMock).when(target).getHash();
            Instant instant3 = Instant.now();
            Instant instant4 = Instant.now();
            doReturn(instant3, instant4).when(target).time();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(VerificationException.class));
            TransactionOutPoint transactionOutPoint = null;
            Instant instant5 = Instant.now();
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Act Statement(s)
            target.createNextBlock(addressMock, 1L, transactionOutPoint, instant5, byteArray4, coinMock, 1);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            script.verify(() -> Script.createInputScript(byteArray3, byteArray3), atLeast(1));
            verify(target).getHash();
            verify(target, times(2)).time();
        }
    }

    //Sapient generated method id: ${aacd592f-f02f-31f4-b5ea-602c7f5659ee}
    @Test()
    public void createNextBlock1WhenPrevOutIsNullAndTimeCompareToBitcoinTimeLessThan0AndBGetVersionEqualsVersion() throws VerificationException {
        /* Branches:
         * (to != null) : true
         * (prevOut == null) : true
         * (time().compareTo(bitcoinTime) >= 0) : false
         * (b.getVersion() != version) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: b, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            Sha256Hash sha256Hash2 = Sha256Hash.wrap(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{};
            script.when(() -> Script.createInputScript(byteArray3, byteArray3)).thenReturn(byteArray2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer2);
            Instant instant2 = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(1L, sha256Hash3, sha256Hash4, instant2, 123456789L, 123456789L, transactionList));
            doReturn(sha256HashMock).when(target).getHash();
            Instant instant3 = Instant.now();
            Instant instant4 = Instant.now();
            doReturn(instant3, instant4).when(target).time();
            thrown.expect(RuntimeException.class);
            TransactionOutPoint transactionOutPoint = null;
            Instant instant5 = Instant.now();
            byte[] byteArray4 = new byte[]{};
            //Act Statement(s)
            target.createNextBlock(addressMock, 1L, transactionOutPoint, instant5, byteArray4, coinMock, 1);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            script.verify(() -> Script.createInputScript(byteArray3, byteArray3), atLeast(1));
            verify(target).getHash();
            verify(target, times(2)).time();
        }
    }

    //Sapient generated method id: ${5aa0f94d-2730-3d92-bfdb-633a24522e0f}
    @Ignore()
    @Test()
    public void createNextBlock2Test() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList));
        Instant instant2 = Instant.now();
        doReturn(instant2).when(target).time();
        Address addressMock = mock(Address.class, "<Address object>");
        TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256Hash3Mock);
        byte[] byteArray = new byte[]{};
        Coin coin = Coin.FIFTY_COINS;
        doReturn(blockMock).when(target).createNextBlock(eq(addressMock), eq(1L), eq(transactionOutPoint), (Instant) any(), eq(byteArray), eq(coin), eq(-1));
        //Act Statement(s)
        Block result = target.createNextBlock(addressMock, transactionOutPoint);
        //Assert statement(s)
        assertThat(result, equalTo(blockMock));
        verify(target).time();
        verify(target).createNextBlock(eq(addressMock), eq(1L), eq(transactionOutPoint), (Instant) any(), eq(byteArray), eq(coin), eq(-1));
    }

    //Sapient generated method id: ${9089251b-7fcd-3df4-a3d9-36a398f576e9}
    @Ignore()
    @Test()
    public void createNextBlock3Test() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 10L, 12345L, transactionList));
        Instant instant2 = Instant.now();
        doReturn(instant2).when(target).time();
        Address addressMock = mock(Address.class, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        byte[] byteArray = new byte[]{};
        doReturn(blockMock).when(target).createNextBlock(eq(addressMock), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coinMock), eq(-1));
        //Act Statement(s)
        Block result = target.createNextBlock(addressMock, coinMock);
        //Assert statement(s)
        assertThat(result, equalTo(blockMock));
        verify(target).time();
        verify(target).createNextBlock(eq(addressMock), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coinMock), eq(-1));
    }

    //Sapient generated method id: ${9376ef76-eb03-3aaa-9f07-f18616efcce5}
    @Ignore()
    @Test()
    public void createNextBlock4Test() throws IOException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant, 100L, 0L, transactionList));
        Coin coin = Coin.FIFTY_COINS;
        doReturn(blockMock).when(target).createNextBlock(addressMock, coin);
        //Act Statement(s)
        Block result = target.createNextBlock(addressMock);
        //Assert statement(s)
        assertThat(result, equalTo(blockMock));
        verify(target).createNextBlock(addressMock, coin);
    }

    //Sapient generated method id: ${e90d4d66-0fbb-30b1-bd3e-40e882dc04c8}
    @Ignore()
    @Test()
    public void createNextBlockWithCoinbase1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            Instant instant2 = Instant.now();
            List<Transaction> transactionList = new ArrayList<>();
            Block target = spy(new Block(1L, sha256Hash, sha256Hash2, instant2, 100000L, 123456L, transactionList));
            byte[] byteArray = new byte[]{(byte) 0};
            Coin coin = Coin.FIFTY_COINS;
            doReturn(blockMock).when(target).createNextBlock(eq((Address) null), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coin), eq(10));
            //Act Statement(s)
            Block result = target.createNextBlockWithCoinbase(1L, byteArray, 10);
            //Assert statement(s)
            assertThat(result, equalTo(blockMock));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
            verify(target).createNextBlock(eq((Address) null), eq(1L), eq((TransactionOutPoint) null), (Instant) any(), eq(byteArray), eq(coin), eq(10));
        }
    }

    //Sapient generated method id: ${b1de45ae-92f5-3d47-bf89-a39b62cd74d0}
    @Test()
    public void hasTransactionsWhenThisTransactionsNotIsEmpty() {
        /* Branches:
         * (this.transactions != null) : true
         * (!this.transactions.isEmpty()) : true
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        //Instant instant = Instant.now();
        //Transaction transaction = new Transaction();
        //List<Transaction> transactionList = new ArrayList<>();
        //transactionList.add(transaction);
        //Block target = new Block(1L, sha256Hash, sha256Hash2, instant, 123456L, 123456L, transactionList);
        //Act Statement(s)
        //boolean result = target.hasTransactions();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${0d3a6d3b-c436-377f-ab9c-a457e7c942c0}
    @Ignore()
    @Test()
    public void isBIP34WhenVersionGreaterThanOrEqualsToBLOCK_VERSION_BIP34() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP34) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(2L, sha256Hash, sha256Hash2, instant, 1000000L, 12345L, transactionList);
        //Act Statement(s)
        boolean result = target.isBIP34();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${524b2c51-4209-335f-b9a6-95f0a1c42048}
    @Ignore()
    @Test()
    public void isBIP34WhenVersionLessThanBLOCK_VERSION_BIP34() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP34) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(2L, sha256Hash, sha256Hash2, instant, 1000L, 0L, transactionList);
        //Act Statement(s)
        boolean result = target.isBIP34();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${7ea60408-d6d5-3314-9488-a4e88b4152f5}
    @Test()
    public void isBIP66WhenVersionGreaterThanOrEqualsToBLOCK_VERSION_BIP66() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP66) : true
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        //Instant instant = Instant.now();
        //List<Transaction> transactionList = new ArrayList<>();
        //Block target = new Block(3L, sha256Hash, sha256Hash2, instant, 1000000L, 123456L, transactionList);
        //Act Statement(s)
        //boolean result = target.isBIP66();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${9961ab63-c19c-3c4f-92da-e87f63e0eb14}
    @Ignore()
    @Test()
    public void isBIP66WhenVersionLessThanBLOCK_VERSION_BIP66() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP66) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        Transaction transaction = new Transaction();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        Block target = new Block(2L, sha256Hash, sha256Hash2, instant, 0L, 0L, transactionList);
        //Act Statement(s)
        boolean result = target.isBIP66();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6f046946-88a5-32cb-b851-ece6cb72c287}
    @Ignore()
    @Test()
    public void isBIP65WhenVersionGreaterThanOrEqualsToBLOCK_VERSION_BIP65() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP65) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(4L, sha256Hash, sha256Hash2, instant, 1000000L, 123456L, transactionList);
        //Act Statement(s)
        boolean result = target.isBIP65();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${967ec60e-30cc-3b5a-9a53-9ac275a92e43}
    @Ignore()
    @Test()
    public void isBIP65WhenVersionLessThanBLOCK_VERSION_BIP65() {
        /* Branches:
         * (version >= BLOCK_VERSION_BIP65) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        Instant instant = Instant.now();
        List<Transaction> transactionList = new ArrayList<>();
        Block target = new Block(3L, sha256Hash, sha256Hash2, instant, 100000L, 12345L, transactionList);
        //Act Statement(s)
        boolean result = target.isBIP65();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${fb3876c8-5280-3a36-97f2-204a8dfec077}
    @Ignore()
    @Test()
    public void verifyTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Block> block = mockStatic(Block.class, CALLS_REAL_METHODS)) {
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            block.when(() -> Block.verifyTransactions((NetworkParameters) any(), eq(block2), eq(0), any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            EnumSet<Block.VerifyFlag> blockVerifyFlagSet = EnumSet.noneOf(Block.VerifyFlag.class);
            //Act Statement(s)
            Block.verify(networkParameters, block2, 0, blockVerifyFlagSet);
            //Assert statement(s)
            block.verify(() -> Block.verifyTransactions((NetworkParameters) any(), eq(block2), eq(0), any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7fead6ed-c6b6-35cb-847e-5f7a5d39b2e2}
    @Ignore()
    @Test()
    public void verifyTransactionsWhenBlockTransactionsIsEmptyThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (block.transactions.isEmpty()) : true
         */
        //Arrange Statement(s)
        thrown.expect(VerificationException.class);
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        Block blockMock = mock(Block.class, "[]");
        EnumSet<Block.VerifyFlag> blockVerifyFlagSet = EnumSet.noneOf(Block.VerifyFlag.class);
        //Act Statement(s)
        Block.verifyTransactions(networkParameters, blockMock, 0, blockVerifyFlagSet);
    }

    //Sapient generated method id: ${8f79fc9c-f0b2-33bf-8322-5c332e41e782}
    @Ignore()
    @Test()
    public void verifyTransactionsWhenBlockMessageSizeGreaterThanMAX_BLOCK_SIZEThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (block.transactions.isEmpty()) : false
         * (block.messageSize() > MAX_BLOCK_SIZE) : true
         */
        //Arrange Statement(s)
        doReturn(1000001).when(blockMock).messageSize();
        thrown.expect(VerificationException.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        EnumSet<Block.VerifyFlag> blockVerifyFlagSet = EnumSet.noneOf(Block.VerifyFlag.class);
        //Act Statement(s)
        Block.verifyTransactions(networkParametersMock, blockMock, 0, blockVerifyFlagSet);
        //Assert statement(s)
        verify(blockMock).messageSize();
    }
}
