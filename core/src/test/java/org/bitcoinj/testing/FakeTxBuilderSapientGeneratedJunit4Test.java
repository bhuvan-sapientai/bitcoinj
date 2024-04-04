package org.bitcoinj.testing;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.core.VerificationException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;

import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.TransactionConfidence;
import org.bitcoinj.base.Address;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.store.BlockStore;
import org.mockito.MockedStatic;
import org.bitcoinj.core.StoredBlock;
import org.bitcoinj.core.ProtocolException;
import org.bitcoinj.script.ScriptBuilder;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

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

    //Sapient generated method id: ${211162e4-2a32-3ff6-ab53-26894c139a7c}, hash: C7E1C6077CA0FE8499065372579A206B
    @Test()
    public void createFakeTxTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ECKey - Method: toAddress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any())).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${ca2d87fa-9b31-3344-a08d-c5119edbe4e6}, hash: CFBFC8D63EE9739920EA9F9419223DA0
    @Test()
    public void createFakeTx1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ECKey - Method: toAddress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any())).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            verify(paramsMock, atLeast(1)).network();
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithoutChangeAddress(eq(coin), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9c18527-1ae0-30a4-b8d8-35892f3fee40}, hash: DAA901F394C52C00180BD784C9DB994E
    @Ignore()
    @Test()
    public void createFakeTxWithoutChangeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Coin coin = Coin.COIN;
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTx(eq(coin), (ECKey) any())).thenReturn(transactionMock);
            doReturn(transactionOutputMock).when(transactionMock).getOutput(0L);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTxWithoutChange(transactionOutputMock2);
            Transaction transaction = new Transaction();
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTx(eq(coin), (ECKey) any()), atLeast(1));
            verify(transactionMock, atLeast(1)).getOutput(0L);
        }
    }

    //Sapient generated method id: ${0830d095-8eb4-37ca-beae-5eb8a100eb8f}, hash: 22A1D6258BC602CBD3B805237E4B5EB7
    @Ignore()
    @Test()
    public void createFakeCoinbaseTxTest() {
        //Act Statement(s)
        Transaction result = FakeTxBuilder.createFakeCoinbaseTx();
        Transaction transaction = Transaction.coinbase();
        //Assert statement(s)
        assertThat(result, equalTo(transaction));
    }

    //Sapient generated method id: ${f6a38e48-7cc0-35fc-bac6-5234e82a0bee}, hash: EC5985A82D20A17D1063E4F5DC83E2E6
    @Ignore()
    @Test()
    public void createFakeTxWithChangeAddressTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t, object of type TransactionInput
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Transaction result = FakeTxBuilder.createFakeTxWithChangeAddress(coinMock, addressMock, addressMock2);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        Transaction transaction = Transaction.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(transaction));
    }

    //Sapient generated method id: ${d8a69eb0-c6c9-3aaf-ac93-4b2edd3e6190}, hash: 3E16DE3CF2FD21839B0E2CE1A5CA6AA2
    @Ignore()
    @Test()
    public void createFakeTxWithoutChangeAddressWhenSplitGreaterThanValueGetValue() {
        /* Branches:
         * (split < 0) : true
         * (split == 0) : true
         * (split > value.getValue()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx1, prevTx2, t, object of type TransactionInput
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin valueMock = mock(Coin.class);
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            doReturn(0L).when(valueMock).getValue();
            Coin coin3 = Coin.valueOf(7L);
            coin.when(() -> Coin.valueOf(7L)).thenReturn(coin3);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTxWithoutChangeAddress(valueMock, addressMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction = Transaction.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            verify(valueMock, times(3)).getValue();
            coin.verify(() -> Coin.valueOf(7L), atLeast(1));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${4dabd547-3de6-3c74-a633-929892028759}, hash: 0465C2A1452635D64BEAB8C9BAE098CE
    @Test()
    public void createFakeTx2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ECKey - Method: toAddress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeTxWithChangeAddress(eq(coinMock), eq(addressMock), (Address) any())).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(networkMock, coinMock, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeTxWithChangeAddress(eq(coinMock), eq(addressMock), (Address) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6b76aa5-cca9-3031-8205-7de39bacf11f}, hash: 6A999B11E714D8D324CBC8171E0DBE9A
    @Test()
    public void createFakeTx3Test() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${615ffca2-38e4-3a09-a2bc-388d110af724}, hash: BF4244316DC2C01C4E7225A16F8843E3
    @Ignore()
    @Test()
    public void createFakeTx4Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction result = FakeTxBuilder.createFakeTx(coinMock, eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${1b8d7166-5631-385c-bd74-0f7d05da32b6}, hash: E010972842292FCDA52FC449EA47416F
    @Ignore()
    @Test()
    public void createFakeTx5Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: prevTx, t, feederTx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            Transaction transaction3 = Transaction.read(byteBuffer);
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction3).thenReturn(transactionMock);
            //Act Statement(s)
            Transaction[] result = FakeTxBuilder.createFakeTx(coinMock, addressMock, addressMock2);
            Transaction[] transactionResultArray = new Transaction[]{transaction3, transactionMock};
            //Assert statement(s)
            assertThat(result, equalTo(transactionResultArray));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${673ec283-dc7b-3925-8066-6a0fcd44e3e9}, hash: FC188F629A342C2727023CEE7443B46B
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

    //Sapient generated method id: ${bd1e7178-e141-3b6b-aac8-b7bdd57849a9}, hash: 15005871AD81F8243CC10A7459298A35
    @Ignore()
    @Test()
    public void createFakeDoubleSpendTxnsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: t1
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        FakeTxBuilder.DoubleSpends result = FakeTxBuilder.createFakeDoubleSpendTxns(addressMock);
        //Assert statement(s)
        //TODO: Please implement equals method in DoubleSpends for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2153ea4f-9833-3015-8c5d-245a3ea7ba69}, hash: BC8AA592740C496B1BDC964B72596387
    @Ignore()
    @Test()
    public void createFakeDoubleSpendTxnsWhenCaughtProtocolExceptionThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (ProtocolException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: t1
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(ProtocolException.class)));
        //Act Statement(s)
        FakeTxBuilder.createFakeDoubleSpendTxns(addressMock);
    }

    //Sapient generated method id: ${d64878ab-154c-3b0a-8f34-c3cd406d1bcd}, hash: B02374231243698C2516FFC982A099F3
    @Ignore()
    @Test()
    public void createFakeBlockTest() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (int) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (int) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${ad33d704-3063-3f3f-910e-9fcf825217f6}, hash: B3FE4F7AEABB2D2F0F0CD130294C5050
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

    //Sapient generated method id: ${bcd6af45-aa61-35c1-9a73-4f070e52ba84}, hash: 375AD655F9E9E07BDD4CF9EA78B4948E
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
        Instant instant = Instant.ofEpochSecond(1700000000);
        Transaction[] transactionArray = new Transaction[]{transactionMock};
        //Act Statement(s)
        FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, previousStoredBlockMock, 0L, instant, 0, transactionArray);
        Transaction[] transactionTransactionArrayArray = new Transaction[]{transactionMock};
        //Assert statement(s)
        //TODO: Please implement equals method in BlockPair for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        assertThat(transactionArray, equalTo(transactionTransactionArrayArray));
        verify(blockStoreMock).put(storedBlockMock);
        verify(blockStoreMock).setChainHead(storedBlockMock);
        verify(previousStoredBlockMock).getHeader();
        verify(blockMock).createNextBlock(eq(null), eq(0L), (Instant) any(), eq(0));
        verify(blockMock2, atLeast(1)).addTransaction(transactionMock);
        verify(transactionMock).getConfidence();
        verify(transactionConfidenceMock).maybeSetSourceToNetwork();
        verify(blockMock2, atLeast(1)).solve();
        verify(previousStoredBlockMock).build(blockMock2);
    }

    //Sapient generated method id: ${bb501089-99bf-38dd-bee0-0947caacce98}, hash: BA100ABFB85349269DBDAD49194678D2
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
        thrown.expectCause(is(instanceOf(VerificationException.class)));
        Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${1a15db4d-141d-3311-8317-07e838579120}, hash: ACAF1704E670647159E4471F0BEF2AA8
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

    //Sapient generated method id: ${357f00c0-9f18-3a72-a333-089a95eb4d8d}, hash: E7E0C7212D0FBA6198533B0C3F2EF1E3
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

    //Sapient generated method id: ${697ace40-8b6b-3ed3-a879-eec94c321048}, hash: CFBCA938F0A92F33AA6F34C58A270EB5
    @Test()
    public void createFakeBlock5Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(storedBlockMock).when(blockStoreMock).getChainHead();
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            verify(blockStoreMock, atLeast(1)).getChainHead();
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(storedBlockMock), eq(0L), (Instant) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${6f67fe3c-b522-3087-84e8-b80e731ad93e}, hash: ED1B68A11B63D06D55BBC475F2411AA9
    @Test()
    public void createFakeBlock5WhenCaughtBlockStoreExceptionThrowsRuntimeException() throws BlockStoreException {
        /* Branches:
         * (catch-exception (BlockStoreException)) : true
         */
        //Arrange Statement(s)
        BlockStoreException blockStoreExceptionMock = mock(BlockStoreException.class);
        doThrow(blockStoreExceptionMock).when(blockStoreMock).getChainHead();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(BlockStoreException.class)));
        Instant instant = Instant.ofEpochSecond(1700000000);
        Transaction[] transactionArray = new Transaction[]{};
        //Act Statement(s)
        FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, instant, 0, transactionArray);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
    }

    //Sapient generated method id: ${93f240e5-e78e-3a05-b3cd-efe915f6debe}, hash: 99811B7DD18F5BB918F6E0CB5D0CD53D
    @Ignore()
    @Test()
    public void createFakeBlock6Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (int) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0L, 1L, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(0L), (int) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${d848803b-3dda-322b-83d2-de8058b032f2}, hash: FB44B63242BFA4F5AB6195AA7E77D6DA
    @Ignore()
    @Test()
    public void createFakeBlock7Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (int) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, 0, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (int) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${bf7d877f-bd20-32bb-a7d1-c683bc225cca}, hash: 41F5E077BBE027198235FA5287C3BA15
    @Ignore()
    @Test()
    public void createFakeBlock8Test() throws BlockStoreException {
        //Arrange Statement(s)
        try (MockedStatic<FakeTxBuilder> fakeTxBuilder = mockStatic(FakeTxBuilder.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            fakeTxBuilder.when(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (int) any(), eq(0), eq(transactionArray))).thenReturn(fakeTxBuilderBlockPairMock);
            //Act Statement(s)
            FakeTxBuilder.BlockPair result = FakeTxBuilder.createFakeBlock(blockStoreMock, transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(fakeTxBuilderBlockPairMock));
            fakeTxBuilder.verify(() -> FakeTxBuilder.createFakeBlock(eq(blockStoreMock), eq(1L), (int) any(), eq(0), eq(transactionArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${a3e4190c-182c-33e0-b260-86c912fd5f94}, hash: BF5202D5A61B21014462044F02FC457F
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
        verify(blockMock2, atLeast(1)).solve();
    }

    //Sapient generated method id: ${6ceb4e69-8b85-32e6-af84-49d1386cc6a5}, hash: 27A2576E24734CC2FFEF0BCFCE803996
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

    //Sapient generated method id: ${662bf410-b04f-374e-8e8d-01253b065880}, hash: BF3B6FB30D6B900690243653A554E8C0
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
        verify(blockMock, atLeast(1)).addTransaction(transactionMock);
        verify(blockMock, atLeast(1)).solve();
    }
}
