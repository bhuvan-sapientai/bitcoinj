package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Address;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.protobuf.payments.Protos;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

import java.util.List;

import org.bitcoinj.core.TransactionOutput;

import java.util.ArrayList;

import static org.mockito.Mockito.times;

public class SendRequestSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

    private final Coin coinMock = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final SendRequest sendRequestMock = mock(SendRequest.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Coin coinMock2 = mock(Coin.class);

    private final Transaction parentTransactionMock = mock(Transaction.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final Transaction transactionMock = mock(Transaction.class);

    //Sapient generated method id: ${0c46e4d2-7a4e-3719-918f-e70a73b65493}
    @Ignore()
    @Test()
    public void allowUnconfirmedTest() {
        //Arrange Statement(s)
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class)) {
            sendRequest.when(() -> SendRequest.to(eCKeyMock, coinMock)).thenReturn(sendRequestMock);
            SendRequest target = SendRequest.to(networkParametersMock, eCKeyMock, coinMock);
            //Act Statement(s)
            target.allowUnconfirmed();
            //Assert statement(s)
            sendRequest.verify(() -> SendRequest.to(eCKeyMock, coinMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7237198f-d9d9-393e-941f-2bba58c11487}
    @Ignore()
    @Test()
    public void toTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class, "100000");
        //Act Statement(s)
        SendRequest result = SendRequest.to(addressMock, coinMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${56ce40b9-1db9-3e13-b777-ca3cb31859cd}
    @Ignore()
    @Test()
    public void to1Test() {
        //Arrange Statement(s)
        ECKey eCKey = new ECKey();
        Coin coinMock = mock(Coin.class, "1000000");
        //Act Statement(s)
        SendRequest result = SendRequest.to(eCKey, coinMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9bbbf358-bd89-3710-ab26-d3239a4cc15c}
    @Test()
    public void to2Test() {
        //Arrange Statement(s)
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class, CALLS_REAL_METHODS)) {
            sendRequest.when(() -> SendRequest.to(eCKeyMock, coinMock)).thenReturn(sendRequestMock);
            //Act Statement(s)
            SendRequest result = SendRequest.to(networkParametersMock, eCKeyMock, coinMock);
            //Assert statement(s)
            assertThat(result, equalTo(sendRequestMock));
            sendRequest.verify(() -> SendRequest.to(eCKeyMock, coinMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1e0a17a1-6c41-343d-acba-baf19732e505}
    @Ignore()
    @Test()
    public void forTxTest() {
        //Act Statement(s)
        SendRequest result = SendRequest.forTx(transactionMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${45cba896-53a6-3fe5-870b-c2bf338ffbae}
    @Ignore()
    @Test()
    public void emptyWalletTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        SendRequest result = SendRequest.emptyWallet(addressMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${296cbaee-2c96-3f11-8688-962118a92952}
    @Ignore()
    @Test()
    public void childPaysForParentWhenOutputGetValueIsGreaterThanFeeRaise() {
        /* Branches:
         * (for-each(parentTransaction.getOutputs())) : true
         * (output.isMine(wallet)) : true
         * (output.isAvailableForSpending()) : true
         * (output.getValue().isGreaterThan(feeRaise)) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        Wallet walletMock = mock(Wallet.class, "wallet");
        Transaction transaction = new Transaction();
        Coin coin = Coin.valueOf(0L);
        //Act Statement(s)
        SendRequest.childPaysForParent(walletMock, transaction, coin);
    }

    //Sapient generated method id: ${76e133a0-6d9d-3059-b9cc-b4c75368438c}
    @Ignore()
    @Test()
    public void childPaysForParentWhenOutputGetValueNotIsGreaterThanFeeRaiseThrowsNullPointerException() {
        /* Branches:
         * (for-each(parentTransaction.getOutputs())) : true
         * (output.isMine(wallet)) : true
         * (output.isAvailableForSpending()) : true
         * (output.getValue().isGreaterThan(feeRaise)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: output, tx, outputToSpend
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "100");
        Transaction parentTransactionMock = mock(Transaction.class, "[{getValue={value=100}, isMine={value=true}, isAvailableForSpending={value=true}}]");
        Transaction transactionMock2 = mock(Transaction.class);
        Coin coinMock2 = mock(Coin.class);
        Coin coinMock3 = mock(Coin.class, "50");
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class, CALLS_REAL_METHODS)) {
            doReturn(null).when(walletMock).freshAddress(KeyChain.KeyPurpose.CHANGE);
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coinMock, byteArray);
            byte[] byteArray2 = new byte[]{};
            TransactionOutput transactionOutput2 = new TransactionOutput(transactionMock2, coinMock2, byteArray2);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutput);
            transactionOutputList.add(transactionOutput2);
            doReturn(transactionOutputList).when(parentTransactionMock).getOutputs();
            sendRequest.when(() -> SendRequest.forTx((Transaction) any())).thenReturn(sendRequestMock);
            //Act Statement(s)
            SendRequest result = SendRequest.childPaysForParent(walletMock, parentTransactionMock, coinMock3);
            //Assert statement(s)
            assertThat(result, equalTo(sendRequestMock));
            verify(walletMock, atLeast(1)).freshAddress(KeyChain.KeyPurpose.CHANGE);
            verify(parentTransactionMock, atLeast(1)).getOutputs();
            sendRequest.verify(() -> SendRequest.forTx((Transaction) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f32b1224-074d-3f2a-860a-50e5e0099bd3}
    @Ignore()
    @Test()
    public void fromPaymentDetailsWhenPaymentDetailsHasMemo() {
        /* Branches:
         * (paymentDetails.hasMemo()) : true
         */
        //Arrange Statement(s)
        Protos.PaymentDetails paymentDetailsMock = mock(Protos.PaymentDetails.class);
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class)) {
            doReturn(true).when(paymentDetailsMock).hasMemo();
            doReturn("return_of_getMemo1").when(paymentDetailsMock).getMemo();
            sendRequest.when(() -> SendRequest.to(eCKeyMock, coinMock)).thenReturn(sendRequestMock);
            SendRequest target = SendRequest.to(networkParametersMock, eCKeyMock, coinMock);
            //Act Statement(s)
            SendRequest result = target.fromPaymentDetails(paymentDetailsMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paymentDetailsMock).hasMemo();
            verify(paymentDetailsMock).getMemo();
            sendRequest.verify(() -> SendRequest.to(eCKeyMock, coinMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8962e036-4105-33ed-81b5-9234d4ef36a1}
    @Ignore()
    @Test()
    public void toStringWhenAesKeyIsNull() {
        /* Branches:
         * (aesKey != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class)) {
            ECKey eCKey = new ECKey();
            sendRequest.when(() -> SendRequest.to(eq(eCKey), (Coin) any())).thenReturn(sendRequestMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Coin coin = Coin.valueOf(0L);
            SendRequest target = SendRequest.to(networkParameters, eCKey, coin);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            sendRequest.verify(() -> SendRequest.to(eq(eCKey), (Coin) any()));
        }
    }
}
