package org.bitcoinj.testing;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.core.VerificationException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;

import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

import org.bitcoinj.core.TransactionConfidence;
import org.bitcoinj.script.Script;
import org.bitcoinj.base.Address;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.store.BlockStore;
import org.mockito.MockedStatic;
import org.bitcoinj.core.StoredBlock;
import org.bitcoinj.script.ScriptBuilder;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;
import org.bitcoinj.core.ProtocolException;

public class FakeTxBuilderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final Address addressMock2 = mock(Address.class);

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final BlockStore blockStoreMock = mock(BlockStore.class);

    private final Coin coinMock = mock(Coin.class);

    private final FakeTxBuilder.BlockPair fakeTxBuilderBlockPairMock = mock(FakeTxBuilder.BlockPair.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final StoredBlock previousStoredBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${211162e4-2a32-3ff6-ab53-26894c139a7c}
    @Test()
    public void createFakeTxTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction transaction = new Transaction();
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any())).thenReturn(transaction);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${ca2d87fa-9b31-3344-a08d-c5119edbe4e6}
    @Test()
    public void createFakeTx1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "org.bitcoinj.core.Transaction");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.RegTestParams");
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            Transaction transaction = new Transaction();
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any())).thenReturn(transaction);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            verify(paramsMock, atLeast(1)).network();
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9c18527-1ae0-30a4-b8d8-35892f3fee40}
    @Ignore()
    @Test()
    public void createFakeTxWithoutChangeTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction transactionMock2 = mock(Transaction.class);
        Coin coin2Mock = mock(Coin.class);
        Transaction transactionMock3 = mock(Transaction.class);
        Coin coin2Mock2 = mock(Coin.class);
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTx(eq(coin), (ECKey) any())).thenReturn(transactionMock);
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock2, coin2Mock, byteArray);
            doReturn(transactionOutput).when(transactionMock).getOutput(0L);
            byte[] byteArray2 = new byte[]{};
            TransactionOutput transactionOutput2 = new TransactionOutput(transactionMock3, coin2Mock2, byteArray2);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTxWithoutChange(transactionOutput2);
            Transaction transaction = new Transaction();
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTx(eq(coin), (ECKey) any()), atLeast(1));
            verify(transactionMock, atLeast(1)).getOutput(0L);
        }
    }

    //Sapient generated method id: ${0830d095-8eb4-37ca-beae-5eb8a100eb8f}
    @Ignore()
    @Test()
    public void createFakeCoinbaseTxTest() {

        //Act Statement(s)
        Transaction result = FakeTxBuilder.createFakeCoinbaseTx();
        Transaction transaction = Transaction.coinbase();

        //Assert statement(s)
        assertThat(result, equalTo(transaction));
    }

    //Sapient generated method id: ${f6a38e48-7cc0-35fc-bac6-5234e82a0bee}
    @Ignore()
    @Test()
    public void createFakeTxWithChangeAddressTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class, "10");
        Address addressMock = mock(Address.class, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        Address addressMock2 = mock(Address.class, "1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2");
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            Coin coin2 = Coin.valueOf(1, 11);
            coin.when(() -> Coin.valueOf(1, 11)).thenReturn(coin2);
            TransactionSignature transactionSignature2 = TransactionSignature.dummy();
            transactionSignature.when(() -> TransactionSignature.dummy()).thenReturn(transactionSignature2);
            Script script = ScriptBuilder.createInputScript(transactionSignature2);
            scriptBuilder.when(() -> ScriptBuilder.createInputScript((TransactionSignature) any())).thenReturn(script);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction2 = Transaction.read(byteBuffer);
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTxWithChangeAddress(coinMock, addressMock, addressMock2);
            //Assert statement(s)
            assertThat(result, equalTo(transaction2));
            coin.verify(() -> Coin.valueOf(1, 11), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.dummy(), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createInputScript((TransactionSignature) any()));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${d8a69eb0-c6c9-3aaf-ac93-4b2edd3e6190}
    @Ignore()
    @Test()
    public void createFakeTxWithoutChangeAddressWhenSplitGreaterThanValueGetValue() {
        /* Branches:
         * (split < 0) : true
         * (split == 0) : true
         * (split > value.getValue()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx1, prevTx2, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            doReturn(0L).when(valueMock).getValue();
            Coin coin2 = Coin.valueOf(7L);
            coin.when(() -> Coin.valueOf(7L)).thenReturn(coin2);
            TransactionSignature transactionSignature2 = TransactionSignature.dummy();
            Script script = ScriptBuilder.createInputScript(transactionSignature2);
            Coin coin3 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin3);
            TransactionSignature transactionSignature3 = TransactionSignature.dummy();
            transactionSignature.when(() -> TransactionSignature.dummy()).thenReturn(transactionSignature2).thenReturn(transactionSignature3);
            Script script2 = ScriptBuilder.createInputScript(transactionSignature3);
            scriptBuilder.when(() -> ScriptBuilder.createInputScript((TransactionSignature) any())).thenReturn(script).thenReturn(script2);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction2 = Transaction.read(byteBuffer);
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTxWithoutChangeAddress(valueMock, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(transaction2));
            verify(valueMock, times(3)).getValue();
            coin.verify(() -> Coin.valueOf(7L), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.dummy(), atLeast(2));
            scriptBuilder.verify(() -> ScriptBuilder.createInputScript((TransactionSignature) any()), atLeast(2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${4dabd547-3de6-3c74-a633-929892028759}
    @Test()
    public void createFakeTx2Test() {
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithChangeAddress((Coin) any(), eq(addressMock), (Address) any())).thenReturn(transactionMock);
            Coin coin = Coin.valueOf(0L);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(networkMock, coin, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithChangeAddress((Coin) any(), eq(addressMock), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6b76aa5-cca9-3031-8205-7de39bacf11f}
    @Test()
    public void createFakeTx3Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTx(networkMock, coinMock, addressMock)).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(paramsMock, coinMock, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            verify(paramsMock, atLeast(1)).network();
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTx(networkMock, coinMock, addressMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${615ffca2-38e4-3a09-a2bc-388d110af724}
    @Ignore()
    @Test()
    public void createFakeTx4Test() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            Coin coin2 = Coin.valueOf(1, 11);
            coin.when(() -> Coin.valueOf(1, 11)).thenReturn(coin2);
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            Coin coin3 = Coin.valueOf(0L);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(coin3, eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(transaction2));
            coin.verify(() -> Coin.valueOf(1, 11), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${1b8d7166-5631-385c-bd74-0f7d05da32b6}
    @Ignore()
    @Test()
    public void createFakeTx5Test() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t, feederTx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        Address addressMock2 = mock(Address.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            Coin coin2 = Coin.valueOf(1, 11);
            coin.when(() -> Coin.valueOf(1, 11)).thenReturn(coin2);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction2 = Transaction.read(byteBuffer);
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction[] result = FakeTxBuilder.createFakeTx(coinMock, addressMock, addressMock2);
            Transaction[] transactionResultArray = new Transaction[]{transaction2, transactionMock};
            //Assert statement(s)
            assertThat(result, equalTo(transactionResultArray));
            coin.verify(() -> Coin.valueOf(1, 11), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${673ec283-dc7b-3925-8066-6a0fcd44e3e9}
    @Test()
    public void roundTripTransactionTest() {
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txMock).serialize();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.roundTripTransaction(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            verify(txMock).serialize();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${bd1e7178-e141-3b6b-aac8-b7bdd57849a9}
    @Ignore()
    @Test()
    public void createFakeDoubleSpendTxnsTest() {
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 33, (byte) 116, (byte) -117, (byte) -103, (byte) 81, (byte) 52, (byte) -35, (byte) -83, (byte) -87, (byte) 24, (byte) 26, (byte) -3, (byte) -97, (byte) -15, (byte) -112, (byte) 120, (byte) 61, (byte) 75, (byte) -17, (byte) -61, (byte) -101, (byte) -19, (byte) 90, (byte) -111, (byte) -101, (byte) 5, (byte) 34, (byte) 101, (byte) -103, (byte) -45, (byte) -72, (byte) -7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction2 = Transaction.read(byteBuffer);
            Transaction transaction3 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2).thenReturn(transaction3);
            //Act Statement(s)
            FakeTxBuilder.DoubleSpends result = FakeTxBuilder.createFakeDoubleSpendTxns(addressMock);
            FakeTxBuilder.DoubleSpends fakeTxBuilderDoubleSpends = new FakeTxBuilder.DoubleSpends();
            //Assert statement(s)
            //TODO: Please implement equals method in DoubleSpends for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(fakeTxBuilderDoubleSpends));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${2153ea4f-9833-3015-8c5d-245a3ea7ba69}
    @Ignore()
    @Test()
    public void createFakeDoubleSpendTxnsWhenCaughtProtocolExceptionThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (ProtocolException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 12, (byte) 16, (byte) 99, (byte) 27, (byte) 48, (byte) -114, (byte) -95, (byte) 21, (byte) -84, (byte) -38, (byte) -88, (byte) -31, (byte) -95, (byte) -68, (byte) -126, (byte) 94, (byte) -28, (byte) 126, (byte) 118, (byte) -35, (byte) -122, (byte) -34, (byte) 61, (byte) -14, (byte) -62, (byte) 12, (byte) -112, (byte) -43, (byte) -23, (byte) -52, (byte) -86, (byte) 74, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction2 = Transaction.read(byteBuffer);
            Transaction transaction3 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2).thenReturn(transaction3);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(ProtocolException.class));
            //Act Statement(s)
            FakeTxBuilder.createFakeDoubleSpendTxns(addressMock);
            //Assert statement(s)
            transaction.verify(() -> Transaction.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${d64878ab-154c-3b0a-8f34-c3cd406d1bcd}
    @Test()
    public void createFakeBlockTest() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${ad33d704-3063-3f3f-910e-9fcf825217f6}
    @Test()
    public void createFakeBlock1Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, 1L, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${bcd6af45-aa61-35c1-9a73-4f070e52ba84}
    @Ignore()
    @Test()
    public void createFakeBlock2WhenTransactionsIsNotEmpty() throws VerificationException, BlockStoreException {
        /* Branches:
         * (for-each(transactions)) : true
         */
        //Arrange Statement(s)
        doNothing().when(blockStoreMock).put(storedBlockMock);
        doNothing().when(blockStoreMock).setChainHead(storedBlockMock);
        doReturn(blockMock).when(previousStoredBlockMock).getHeader();
        doReturn(blockMock2).when(blockMock).createNextBlock(eq(null), eq(0L), (Instant) any(), eq(0));
        doNothing().when(blockMock2).addTransaction(transactionMock);
        doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
        doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
        doNothing().when(blockMock2).solve();
        doReturn(storedBlockMock).when(previousStoredBlockMock).build(blockMock2);
        Instant instant = Instant.now();
        Transaction[] transactionArray = new Transaction[]{transactionMock};

        //Act Statement(s)
        FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, previousStoredBlockMock, 0L, instant, 0, transactionArray);
        FakeTxBuilder.BlockPair fakeTxBuilderBlockPair = new FakeTxBuilder.BlockPair(blockMock2, storedBlockMock);
        Transaction[] transactionTransactionArrayArray = new Transaction[]{transactionMock};

        //Assert statement(s)
        //TODO: Please implement equals method in BlockPair for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(fakeTxBuilderBlockPair));
        assertThat(transactionArray, equalTo(transactionTransactionArrayArray));
        verify(blockStoreMock).put(storedBlockMock);
        verify(blockStoreMock).setChainHead(storedBlockMock);
        verify(previousStoredBlockMock).getHeader();
        verify(blockMock).createNextBlock(eq(null), eq(0L), (Instant) any(), eq(0));
        verify(blockMock2).addTransaction(transactionMock);
        verify(transactionMock).getConfidence();
        verify(transactionConfidenceMock).maybeSetSourceToNetwork();
        verify(blockMock2).solve();
        verify(previousStoredBlockMock).build(blockMock2);
    }

    //Sapient generated method id: ${bb501089-99bf-38dd-bee0-0947caacce98}
    @Test()
    public void createFakeBlock2WhenCaughtVerificationExceptionOrBlockStoreExceptionThrowsRuntimeException() throws VerificationException {
        /* Branches:
         * (for-each(transactions)) : true
         * (catch-exception (VerificationException | BlockStoreException)) : true
         */
        //Arrange Statement(s)
        doReturn(blockMock).when(previousStoredBlockMock).getHeader();
        doReturn(blockMock2).when(blockMock).createNextBlock(eq(null), eq(0L), (Instant) any(), eq(0));
        doNothing().when(blockMock2).addTransaction(transactionMock);
        doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
        doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
        doNothing().when(blockMock2).solve();
        VerificationException verificationExceptionMock = mock(VerificationException.class);
        doThrow(verificationExceptionMock).when(previousStoredBlockMock).build(blockMock2);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(VerificationException.class));
        Instant instant = Instant.now();
        Transaction[] transactionArray = new Transaction[]{transactionMock};

        //Act Statement(s)
        FakeTxBuilder.createFakeBlock(blockStoreMock, previousStoredBlockMock, 0L, instant, 0, transactionArray);
        Transaction[] transactionTransactionArrayArray = new Transaction[]{transactionMock};

        //Assert statement(s)
        assertThat(transactionArray, equalTo(transactionTransactionArrayArray));
        verify(previousStoredBlockMock).getHeader();
        verify(blockMock).createNextBlock(eq(null), eq(0L), (Instant) any(), eq(0));
        verify(blockMock2).addTransaction(transactionMock);
        verify(transactionMock).getConfidence();
        verify(transactionConfidenceMock).maybeSetSourceToNetwork();
        verify(blockMock2).solve();
        verify(previousStoredBlockMock).build(blockMock2);
    }

    //Sapient generated method id: ${1a15db4d-141d-3311-8317-07e838579120}
    @Test()
    public void createFakeBlock3Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, storedBlockMock, 0L, 1L, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${357f00c0-9f18-3a72-a333-089a95eb4d8d}
    @Test()
    public void createFakeBlock4Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(3L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, storedBlockMock, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(3L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${697ace40-8b6b-3ed3-a879-eec94c321048}
    @Test()
    public void createFakeBlock5Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(storedBlockMock).when(blockStoreMock).getChainHead();
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            verify(blockStoreMock, atLeast(1)).getChainHead();
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${6f67fe3c-b522-3087-84e8-b80e731ad93e}
    @Test()
    public void createFakeBlock5WhenCaughtBlockStoreExceptionThrowsRuntimeException() throws BlockStoreException {
        /* Branches:
         * (catch-exception (BlockStoreException)) : true
         */
        //Arrange Statement(s)
        BlockStoreException blockStoreExceptionMock = mock(BlockStoreException.class);
        doThrow(blockStoreExceptionMock).when(blockStoreMock).getChainHead();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(BlockStoreException.class));
        Instant instant = Instant.now();
        Transaction[] transactionArray = new Transaction[]{};

        //Act Statement(s)
        FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, 0, transactionArray);

        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
    }

    //Sapient generated method id: ${93f240e5-e78e-3a05-b3cd-efe915f6debe}
    @Test()
    public void createFakeBlock6Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, 1L, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${d848803b-3dda-322b-83d2-de8058b032f2}
    @Test()
    public void createFakeBlock7Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${bf7d877f-bd20-32bb-a7d1-c683bc225cca}
    @Test()
    public void createFakeBlock8Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${a3e4190c-182c-33e0-b260-86c912fd5f94}
    @Test()
    public void makeSolvedTestBlockTest() throws BlockStoreException {
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(blockMock2).when(blockMock).createNextBlock(addressMock);
        doNothing().when(blockMock2).solve();

        //Act Statement(s)
        Block result = FakeTxBuilder.makeSolvedTestBlock(blockStoreMock, addressMock);

        //Assert statement(s)
        assertThat(result, equalTo(blockMock2));
        verify(blockStoreMock).getChainHead();
        verify(blockMock).createNextBlock(addressMock);
        verify(blockMock2).solve();
    }

    //Sapient generated method id: ${6ceb4e69-8b85-32e6-af84-49d1386cc6a5}
    @Test()
    public void makeSolvedTestBlock1Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.makeSolvedTestBlock(blockMock2, (Address) null, transactionArray)).thenReturn(blockMock);
            //Act Statement(s)
            Block result = FakeTxBuilder.makeSolvedTestBlock(blockMock2, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(blockMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.makeSolvedTestBlock(blockMock2, (Address) null, transactionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${662bf410-b04f-374e-8e8d-01253b065880}
    @Test()
    public void makeSolvedTestBlock2WhenTransactionsIsNotEmpty() throws BlockStoreException {
        /* Branches:
         * (for-each(transactions)) : true
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        doReturn(blockMock).when(prevMock).createNextBlock(addressMock);
        doNothing().when(blockMock).addTransaction(transactionMock);
        doNothing().when(blockMock).solve();
        Transaction[] transactionArray = new Transaction[]{transactionMock};

        //Act Statement(s)
        Block result = FakeTxBuilder.makeSolvedTestBlock(prevMock, addressMock, transactionArray);

        //Assert statement(s)
        assertThat(result, equalTo(blockMock));
        verify(prevMock).createNextBlock(addressMock);
        verify(blockMock).addTransaction(transactionMock);
        verify(blockMock).solve();
    }
}
