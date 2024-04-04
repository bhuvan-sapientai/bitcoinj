package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.Address;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.protobuf.payments.Protos;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class SendRequestSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final Coin coinMock = mock(Coin.class);

    private final Coin coinMock2 = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Transaction parentTransactionMock = mock(Transaction.class);

    private final SendRequest sendRequestMock = mock(SendRequest.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${0c46e4d2-7a4e-3719-918f-e70a73b65493}, hash: AA93586A99ABB1438414BFF374FA914E
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

    //Sapient generated method id: ${7237198f-d9d9-393e-941f-2bba58c11487}, hash: 6451FB264AB294510C56B1D1D6166292
    @Ignore()
    @Test()
    public void toTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        SendRequest result = SendRequest.to(addressMock, coinMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${56ce40b9-1db9-3e13-b777-ca3cb31859cd}, hash: A6EAF1EE18705C9991464CBDD7094EDE
    @Ignore()
    @Test()
    public void to1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        SendRequest result = SendRequest.to(eCKeyMock, coinMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9bbbf358-bd89-3710-ab26-d3239a4cc15c}, hash: 99292094693B4B4E2CDD2CB4DAF59A13
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

    //Sapient generated method id: ${1e0a17a1-6c41-343d-acba-baf19732e505}, hash: 66660FFC45BCF8A31329B36EF7319301
    @Ignore()
    @Test()
    public void forTxTest() {
        //Arrange Statement(s)
        Transaction transactionMock = mock(Transaction.class);
        //Act Statement(s)
        SendRequest result = SendRequest.forTx(transactionMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${45cba896-53a6-3fe5-870b-c2bf338ffbae}, hash: FC83BDED7FFAF44C9F44F59DF9A0AC57
    @Ignore()
    @Test()
    public void emptyWalletTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        SendRequest result = SendRequest.emptyWallet(addressMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${296cbaee-2c96-3f11-8688-962118a92952}, hash: B77EBC0BCEB604B4FA92CCFF1914645B
    @Ignore()
    @Test()
    public void childPaysForParentWhenOutputGetValueIsGreaterThanFeeRaise() {
        /* Branches:
         * (for-each(parentTransaction.getOutputs())) : true
         * (output.isMine(wallet)) : true
         * (output.isAvailableForSpending()) : true
         * (output.getValue().isGreaterThan(feeRaise)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock3 = mock(Coin.class);
        Coin coinMock4 = mock(Coin.class);
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class, CALLS_REAL_METHODS)) {
            doReturn(addressMock).when(walletMock).freshAddress(KeyChain.KeyPurpose.CHANGE);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(parentTransactionMock).getOutputs();
            doReturn(true).when(transactionOutputMock).isMine(walletMock);
            doReturn(true).when(transactionOutputMock).isAvailableForSpending();
            doReturn(true).when(coinMock).isGreaterThan(coinMock2);
            doReturn(coinMock, coinMock3).when(transactionOutputMock).getValue();
            doReturn(coinMock4).when(coinMock3).subtract(coinMock2);
            sendRequest.when(() -> SendRequest.forTx((Transaction) any())).thenReturn(sendRequestMock);
            //Act Statement(s)
            SendRequest result = SendRequest.childPaysForParent(walletMock, parentTransactionMock, coinMock2);
            //Assert statement(s)
            assertThat(result, equalTo(sendRequestMock));
            verify(walletMock, atLeast(1)).freshAddress(KeyChain.KeyPurpose.CHANGE);
            verify(parentTransactionMock, atLeast(1)).getOutputs();
            verify(transactionOutputMock, atLeast(1)).isMine(walletMock);
            verify(transactionOutputMock, atLeast(1)).isAvailableForSpending();
            verify(transactionOutputMock, times(2)).getValue();
            verify(coinMock, atLeast(1)).isGreaterThan(coinMock2);
            verify(coinMock3, atLeast(1)).subtract(coinMock2);
            sendRequest.verify(() -> SendRequest.forTx((Transaction) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${76e133a0-6d9d-3059-b9cc-b4c75368438c}, hash: 3E97C7AB633C94BA30F26393217AD4BD
    @Test()
    public void childPaysForParentWhenOutputGetValueNotIsGreaterThanFeeRaiseThrowsNullPointerException() {
        /* Branches:
         * (for-each(parentTransaction.getOutputs())) : true
         * (output.isMine(wallet)) : true
         * (output.isAvailableForSpending()) : true
         * (output.getValue().isGreaterThan(feeRaise)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(transactionOutputMock);
        doReturn(transactionOutputList).when(parentTransactionMock).getOutputs();
        doReturn(true).when(transactionOutputMock).isMine(walletMock);
        doReturn(true).when(transactionOutputMock).isAvailableForSpending();
        doReturn(coinMock).when(transactionOutputMock).getValue();
        doReturn(false).when(coinMock).isGreaterThan(coinMock2);
        thrown.expect(NullPointerException.class);
        //Act Statement(s)
        SendRequest.childPaysForParent(walletMock, parentTransactionMock, coinMock2);
        //Assert statement(s)
        verify(parentTransactionMock).getOutputs();
        verify(transactionOutputMock).isMine(walletMock);
        verify(transactionOutputMock).isAvailableForSpending();
        verify(transactionOutputMock).getValue();
        verify(coinMock).isGreaterThan(coinMock2);
    }

    //Sapient generated method id: ${f32b1224-074d-3f2a-860a-50e5e0099bd3}, hash: 1330E7E9276B99C8C1D655829292EE5B
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

    //Sapient generated method id: ${8962e036-4105-33ed-81b5-9234d4ef36a1}, hash: 8121B41AF73ABB07590ABB253A641228
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
