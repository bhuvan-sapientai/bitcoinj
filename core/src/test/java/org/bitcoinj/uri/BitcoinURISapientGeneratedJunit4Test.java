package org.bitcoinj.uri;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.base.Address;

import java.net.URLEncoder;

import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.base.exceptions.AddressFormatException;

import java.net.URISyntaxException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.bitcoinj.base.AddressParser;

import static org.mockito.Mockito.doThrow;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class BitcoinURISapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AddressFormatException addressFormatExceptionMock = mock(AddressFormatException.class);

    private final Coin amountMock = mock(Coin.class);

    private final Coin coinMock = mock(Coin.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Address addressMock = mock(Address.class);

    private final AddressParser addressParserMock = mock(AddressParser.class);

    //Sapient generated method id: ${39df292f-de4b-38aa-9d8a-bcdaa5b5ecc6}
    @Ignore()
    @Test()
    public void ofWhenDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 151)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        URISyntaxException uRISyntaxException = new URISyntaxException("input1", "reason1");
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad URI syntax", uRISyntaxException);
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1");
    }

    //Sapient generated method id: ${d34fb8b6-55d6-38fc-bb53-2e328e0b61ef}
    @Ignore()
    @Test()
    public void ofWhenDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No data found after the bitcoin: prefix");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1");
    }

    //Sapient generated method id: ${7773165d-b328-3a80-98d5-6fcc776ba188}
    @Test()
    public void ofWhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : false  #  inside <init> method
         * (branch expression (line 170)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Unsupported URI scheme: null");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("");
    }

    //Sapient generated method id: ${27fc21c5-b553-3f02-aa9f-178af9b22de5}
    @Ignore()
    @Test()
    public void ofWhenSepIndexEqualsMinus1ThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("s1");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1");
    }

    //Sapient generated method id: ${dd2c5058-f830-3772-a62c-68d807694793}
    @Ignore()
    @Test()
    public void ofWhenAmountSignumLessThan0ThrowsOptionalFieldValidationException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.parseCoin("str1")).thenReturn(coinMock);
            doReturn(0).when(coinMock).signum();
            OptionalFieldValidationException optionalFieldValidationException = new OptionalFieldValidationException("s1");
            thrown.expect(OptionalFieldValidationException.class);
            thrown.expectMessage(optionalFieldValidationException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("uri1");
            //Assert statement(s)
            coin.verify(() -> Coin.parseCoin("str1"), atLeast(1));
            verify(coinMock).signum();
        }
    }

    //Sapient generated method id: ${9dd5024a-79d7-36e3-9fda-7651fb8db2a4}
    @Ignore()
    @Test()
    public void ofWhenNameTokenStartsWithReq_ThrowsRequiredFieldValidationException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : false  #  inside parseParameters method
         * (nameToken.startsWith("req-")) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RequiredFieldValidationException requiredFieldValidationException = new RequiredFieldValidationException("s1");
        thrown.expect(RequiredFieldValidationException.class);
        thrown.expectMessage(requiredFieldValidationException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1");
    }

    //Sapient generated method id: ${caa4a191-81c3-3e6c-95b7-822f843a88ef}
    @Test()
    public void ofWhenParameterMapNotContainsKeyKeyAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : false  #  inside parseParameters method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 202)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException addressFormatExceptionMock2 = mock(AddressFormatException.class);
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            addressParser.when(() -> AddressParser.getDefault()).thenReturn(addressParserMock);
            doThrow(addressFormatExceptionMock).when(addressParserMock).parseAddress("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
            BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad address", addressFormatExceptionMock2);
            thrown.expect(BitcoinURIParseException.class);
            thrown.expectMessage(bitcoinURIParseException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("bitcoin:1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
            //Assert statement(s)
            addressParser.verify(() -> AddressParser.getDefault(), atLeast(1));
            verify(addressParserMock).parseAddress("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        }
    }

    //Sapient generated method id: ${baaf99e2-188e-3e9f-863a-b147d884edcd}
    @Ignore()
    @Test()
    public void ofWhenDefaultBranchAndParameterMapNotContainsKeyKeyAndDefaultBranch() throws BitcoinURIParseException, AddressFormatException, URISyntaxException, UnsupportedEncodingException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : false  #  inside <init> method
         * (branch expression (line 170)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : false  #  inside parseParameters method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 207)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            AddressParser addressParser2 = AddressParser.getDefault();
            addressParser.when(() -> AddressParser.getDefault()).thenReturn(addressParser2);
            //Act Statement(s)
            BitcoinURI result = BitcoinURI.of("bitcoin:1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            addressParser.verify(() -> AddressParser.getDefault(), atLeast(1));
        }
    }

    //Sapient generated method id: ${48571aab-4d95-30ba-91d1-29a98afd0585}
    @Ignore()
    @Test()
    public void ofWhenParameterMapNotContainsKeyKeyAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : false  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : true  #  inside <init> method
         * (branch expression (line 202)) : true  #  inside <init> method
         * (branch expression (line 207)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad address", addressFormatExceptionMock);
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("bitcoin:1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
    }

    //Sapient generated method id: ${7c2d10a0-fb9d-36dc-bd2a-a784309a73e1}
    @Ignore()
    @Test()
    public void ofWhenDefaultBranchAndDefaultBranchAndDefaultBranch() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : false  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : true  #  inside <init> method
         * (branch expression (line 202)) : true  #  inside <init> method
         * (branch expression (line 207)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.parseCoin("0.001")).thenReturn(coinMock);
            doReturn(0).when(coinMock).signum();
            BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad address", addressFormatExceptionMock);
            thrown.expect(BitcoinURIParseException.class);
            thrown.expectMessage(bitcoinURIParseException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("bitcoin://1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa?amount=0.001&label=Example");
            //Assert statement(s)
            coin.verify(() -> Coin.parseCoin("0.001"), atLeast(1));
            verify(coinMock).signum();
        }
    }

    //Sapient generated method id: ${57287d12-b415-364b-80de-9e918d1aff88}
    @Ignore()
    @Test()
    public void ofWhenAmountSignumNotLessThan0AndParameterMapNotContainsKeyKeyAndDefaultBranchAndDefaultBThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : false  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 207)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.parseCoin("str1")).thenReturn(coinMock);
            doReturn(0).when(coinMock).signum();
            BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No address and no r= parameter found");
            thrown.expect(BitcoinURIParseException.class);
            thrown.expectMessage(bitcoinURIParseException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("uri1");
            //Assert statement(s)
            coin.verify(() -> Coin.parseCoin("str1"), atLeast(1));
            verify(coinMock).signum();
        }
    }

    //Sapient generated method id: ${71b99644-3a78-3380-89aa-33dc53a3399c}
    @Ignore()
    @Test()
    public void ofWhenParameterMapNotContainsKeyKeyAndDefaultBranchAndDefaultBranch() throws BitcoinURIParseException, URISyntaxException, UnsupportedEncodingException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : false  #  inside parseParameters method
         * (nameToken.startsWith("req-")) : false  #  inside parseParameters method
         * (valueToken.length() > 0) : true  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : true  #  inside <init> method
         * (branch expression (line 207)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        BitcoinURI result = BitcoinURI.of("uri1");
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${4d2c3bfb-33c0-3670-9b58-dd07b16ccb86}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 151)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        URISyntaxException uRISyntaxException = new URISyntaxException("input1", "reason1");
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad URI syntax", uRISyntaxException);
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        Network network = null;
        //Act Statement(s)
        BitcoinURI.of("uri1", network);
    }

    //Sapient generated method id: ${d5d4b0ab-3555-3c3b-9c18-bc381f72dc5f}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 151)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
        URISyntaxException uRISyntaxException = new URISyntaxException("input1", "reason1");
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad URI syntax", uRISyntaxException);
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1", networkMock);
        //Assert statement(s)
        verify(networkMock).uriScheme();
    }

    //Sapient generated method id: ${f4529e75-dc70-300e-8234-195da462bf9a}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No data found after the bitcoin: prefix");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1", networkMock);
    }

    //Sapient generated method id: ${c00cf289-3a3d-331c-a607-b9f7f3fa4ac9}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchAndDefaultBranchAndDefaultBranch2ThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No data found after the bitcoin: prefix");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        Network network = null;
        //Act Statement(s)
        BitcoinURI.of("uri1", network);
    }

    //Sapient generated method id: ${d9bdbd65-2823-3dd6-b3ba-b2ddac24df86}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchAndDefaultBranchAndDefaultBranch3ThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : false  #  inside <init> method
         * (branch expression (line 170)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Unsupported URI scheme: ");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        Network network = null;
        //Act Statement(s)
        BitcoinURI.of("", network);
    }

    //Sapient generated method id: ${00a9463b-0e75-3b4c-b78c-84369b0ccec0}
    @Ignore()
    @Test()
    public void of1WhenSepIndexEqualsMinus1ThrowsBitcoinURIParseException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("s1");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1", networkMock);
        //Assert statement(s)
        verify(networkMock).uriScheme();
    }

    //Sapient generated method id: ${61e8147e-7d09-3241-a928-94d9a0098eff}
    @Ignore()
    @Test()
    public void of1WhenAmountSignumLessThan0ThrowsOptionalFieldValidationException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            coin.when(() -> Coin.parseCoin("str1")).thenReturn(coinMock);
            doReturn(0).when(coinMock).signum();
            OptionalFieldValidationException optionalFieldValidationException = new OptionalFieldValidationException("s1");
            thrown.expect(OptionalFieldValidationException.class);
            thrown.expectMessage(optionalFieldValidationException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("uri1", networkMock);
            //Assert statement(s)
            verify(networkMock).uriScheme();
            coin.verify(() -> Coin.parseCoin("str1"), atLeast(1));
            verify(coinMock).signum();
        }
    }

    //Sapient generated method id: ${c749b3c4-95d9-3a64-b938-34126c9a49cf}
    @Ignore()
    @Test()
    public void of1WhenNameTokenStartsWithReq_ThrowsRequiredFieldValidationException() throws BitcoinURIParseException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : false  #  inside parseParameters method
         * (nameToken.startsWith("req-")) : true  #  inside parseParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
        RequiredFieldValidationException requiredFieldValidationException = new RequiredFieldValidationException("s1");
        thrown.expect(RequiredFieldValidationException.class);
        thrown.expectMessage(requiredFieldValidationException.getMessage());
        //Act Statement(s)
        BitcoinURI.of("uri1", networkMock);
        //Assert statement(s)
        verify(networkMock).uriScheme();
    }

    //Sapient generated method id: ${390db66d-29ff-3afc-87e3-1a5205737b10}
    @Ignore()
    @Test()
    public void of1WhenParameterMapNotContainsKeyKeyAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : false  #  inside parseParameters method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 202)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("Bad address", addressFormatExceptionMock);
            thrown.expect(BitcoinURIParseException.class);
            thrown.expectMessage(bitcoinURIParseException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("uri1", networkMock);
            //Assert statement(s)
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${437e7e57-bac7-32c0-8b61-08020dfb5a66}
    @Ignore()
    @Test()
    public void of1WhenDefaultBranchAndDefaultBranchAndParameterMapNotContainsKeyKeyAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : false  #  inside parseParameters method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 207)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No address and no r= parameter found");
        thrown.expect(BitcoinURIParseException.class);
        thrown.expectMessage(bitcoinURIParseException.getMessage());
        Network network = null;
        //Act Statement(s)
        BitcoinURI.of("uri1", network);
    }

    //Sapient generated method id: ${e7aa5600-af84-32da-9acd-ab946091d594}
    @Ignore()
    @Test()
    public void of1WhenNameValuePairTokensIsEmptyAndDefaultBranchAndDefaultBranchAndParameterMapNotContainsKeyKeyAndDefaultBranch() throws BitcoinURIParseException, AddressFormatException, URISyntaxException, UnsupportedEncodingException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : false  #  inside <init> method
         * (branch expression (line 170)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : false  #  inside parseParameters method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 207)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn("f").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("BC");
            //Act Statement(s)
            BitcoinURI result = BitcoinURI.of("F:E", networkMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("BC");
        }
    }

    //Sapient generated method id: ${f8bd3d80-d37f-3908-97b3-37bfd949586a}
    @Ignore()
    @Test()
    public void of1WhenParameterMapNotContainsKeyKeyAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsBitcoinURIParseException() throws BitcoinURIParseException, AddressFormatException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : true  #  inside parseParameters method
         * (amount.signum() < 0) : false  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 207)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            coin.when(() -> Coin.parseCoin("str1")).thenReturn(coinMock);
            doReturn(0).when(coinMock).signum();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURIParseException bitcoinURIParseException = new BitcoinURIParseException("No address and no r= parameter found");
            thrown.expect(BitcoinURIParseException.class);
            thrown.expectMessage(bitcoinURIParseException.getMessage());
            //Act Statement(s)
            BitcoinURI.of("uri1", networkMock);
            //Assert statement(s)
            verify(networkMock).uriScheme();
            coin.verify(() -> Coin.parseCoin("str1"), atLeast(1));
            verify(coinMock).signum();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${3d432913-00a8-3112-9542-e8483d58f908}
    @Ignore()
    @Test()
    public void of1WhenValueTokenLengthGreaterThan0AndParameterMapNotContainsKeyKeyAndDefaultBranchAndDefaultBranch() throws BitcoinURIParseException, URISyntaxException, UnsupportedEncodingException {
        /* Branches:
         * (branch expression (line 143)) : false  #  inside <init> method
         * (branch expression (line 168)) : true  #  inside <init> method
         * (branch expression (line 178)) : true  #  inside <init> method
         * (branch expression (line 183)) : false  #  inside <init> method
         * (for-each(nameValuePairTokens)) : true  #  inside parseParameters method
         * (sepIndex == -1) : false  #  inside parseParameters method
         * (sepIndex == 0) : false  #  inside parseParameters method
         * (FIELD_AMOUNT.equals(nameToken)) : false  #  inside parseParameters method
         * (nameToken.startsWith("req-")) : false  #  inside parseParameters method
         * (valueToken.length() > 0) : true  #  inside parseParameters method
         * (parameterMap.containsKey(key)) : false  #  inside putWithValidation method
         * (branch expression (line 194)) : true  #  inside <init> method
         * (branch expression (line 207)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
        //Act Statement(s)
        BitcoinURI result = BitcoinURI.of("uri1", networkMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(networkMock).uriScheme();
    }

    //Sapient generated method id: ${c4381d74-a818-3102-bb71-8a52fdc28571}
    @Ignore()
    @Test()
    public void getAddressTest() throws BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        BitcoinURI target = new BitcoinURI(networkParameters, "String");
        //Act Statement(s)
        Address result = target.getAddress();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${53b9c084-e3a6-30ca-9486-e38775bc2ed4}
    @Ignore()
    @Test()
    public void getAmountTest() throws BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        BitcoinURI target = new BitcoinURI(networkParameters, "bitcoin://1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        //Act Statement(s)
        Coin result = target.getAmount();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${e814b19a-5fe6-3010-a284-7ef6ca4bf6d0}
    @Ignore()
    @Test()
    public void getLabelTest() throws AddressFormatException, BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn(networkMock).when(paramsMock).network();
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURI target = new BitcoinURI(paramsMock, "input1");
            //Act Statement(s)
            String result = target.getLabel();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(paramsMock).network();
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}
    @Ignore()
    @Test()
    public void getMessageTest() throws BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        BitcoinURI target = new BitcoinURI(networkParameters, "bitcoin://example.com");
        //Act Statement(s)
        String result = target.getMessage();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${66b4e342-34c5-3dff-b40e-0cd84e0e25ab}
    @Ignore()
    @Test()
    public void getPaymentRequestUrlTest() throws BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        BitcoinURI target = new BitcoinURI(networkParameters, "bitcoin://1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        //Act Statement(s)
        String result = target.getPaymentRequestUrl();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${fc1f60f4-c8f5-33e1-b825-058d1ec7544e}
    @Ignore()
    @Test()
    public void getPaymentRequestUrlsWhenUrlIsNull() throws AddressFormatException, BitcoinURIParseException {
        /* Branches:
         * (i > 0) : false
         * (url == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn(networkMock).when(paramsMock).network();
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURI target = new BitcoinURI(paramsMock, "input1");
            //Act Statement(s)
            List<String> result = target.getPaymentRequestUrls();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(paramsMock).network();
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${17090579-1d20-371f-acd5-04a2a623862e}
    @Ignore()
    @Test()
    public void getParameterByNameTest() throws AddressFormatException, BitcoinURIParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn(networkMock).when(paramsMock).network();
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURI target = new BitcoinURI(paramsMock, "input1");
            //Act Statement(s)
            Object result = target.getParameterByName("name1");
            Object object = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(object));
            verify(paramsMock).network();
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${f1c167b8-807f-381c-ac3e-7052d2752ba4}
    @Ignore()
    @Test()
    public void toStringWhenFirst() throws AddressFormatException, BitcoinURIParseException {
        /* Branches:
         * (for-each(parameterMap.entrySet())) : true
         * (first) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "<init>_address2");
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            doReturn(networkMock).when(paramsMock).network();
            doReturn("return_of_uriScheme1").when(networkMock).uriScheme();
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("arg0");
            BitcoinURI target = new BitcoinURI(paramsMock, "input1");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            verify(paramsMock).network();
            verify(networkMock).uriScheme();
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("arg0");
        }
    }

    //Sapient generated method id: ${8f170931-bb37-330c-b94e-4710106cc98f}
    @Test()
    public void convertToBitcoinURITest() throws UnsupportedEncodingException {
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "convertToBitcoinURI_address1");
        try (MockedStatic<BitcoinURI> bitcoinURI = mockStatic(BitcoinURI.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(addressMock).network();
            bitcoinURI.when(() -> BitcoinURI.convertToBitcoinURI(networkMock, "convertToBitcoinURI_address1", coinMock, "label1", "message1")).thenReturn("return_of_convertToBitcoinURI1");
            //Act Statement(s)
            String result = BitcoinURI.convertToBitcoinURI(addressMock, coinMock, "label1", "message1");
            //Assert statement(s)
            assertThat(result, equalTo("return_of_convertToBitcoinURI1"));
            verify(addressMock, atLeast(1)).network();
            bitcoinURI.verify(() -> BitcoinURI.convertToBitcoinURI(networkMock, "convertToBitcoinURI_address1", coinMock, "label1", "message1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${9632ec06-4b48-3a90-a951-3aa1cd289ee7}
    @Test()
    public void convertToBitcoinURI1Test() throws UnsupportedEncodingException {
        //Arrange Statement(s)
        try (MockedStatic<BitcoinURI> bitcoinURI = mockStatic(BitcoinURI.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            bitcoinURI.when(() -> BitcoinURI.convertToBitcoinURI(networkMock, "address1", coinMock, "label1", "message1")).thenReturn("return_of_convertToBitcoinURI1");
            //Act Statement(s)
            String result = BitcoinURI.convertToBitcoinURI(paramsMock, "address1", coinMock, "label1", "message1");
            //Assert statement(s)
            assertThat(result, equalTo("return_of_convertToBitcoinURI1"));
            verify(paramsMock, atLeast(1)).network();
            bitcoinURI.verify(() -> BitcoinURI.convertToBitcoinURI(networkMock, "address1", coinMock, "label1", "message1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${c5b9dee3-0b45-3657-88d8-98c2089fe610}
    @Test()
    public void convertToBitcoinURI2WhenAmountSignumLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (amount != null) : true
         * (amount.signum() < 0) : true
         */
        //Arrange Statement(s)
        doReturn(-1).when(amountMock).signum();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Coin must be positive");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        BitcoinURI.convertToBitcoinURI(networkMock, "address1", amountMock, "label1", "message1");
        //Assert statement(s)
        verify(amountMock).signum();
    }

    //Sapient generated method id: ${009ef36d-64be-37fc-85de-4e46a308a572}
    @Test()
    public void convertToBitcoinURI2WhenNotEqualsMessageAndNotQuestionMarkHasBeenOutput() throws UnsupportedEncodingException {
        /* Branches:
         * (amount != null) : false
         * (amount != null) : false
         * (label != null) : true
         * (!"".equals(label)) : false
         * (message != null) : true
         * (!"".equals(message)) : true
         * (questionMarkHasBeenOutput) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BitcoinURI> bitcoinURI = mockStatic(BitcoinURI.class, CALLS_REAL_METHODS)) {
            doReturn("CF").when(networkMock).uriScheme();
            bitcoinURI.when(() -> BitcoinURI.encodeURLString("BI")).thenReturn("EH");
            Coin coin = null;
            //Act Statement(s)
            String result = BitcoinURI.convertToBitcoinURI(networkMock, "DG", coin, "", "BI");
            //Assert statement(s)
            assertThat(result, equalTo("CF:DG?message=EH"));
            verify(networkMock, atLeast(1)).uriScheme();
            bitcoinURI.verify(() -> BitcoinURI.encodeURLString("BI"), atLeast(1));
        }
    }

    //Sapient generated method id: ${61c36ba6-5b41-3a2a-9fbe-6ec426b6ce88}
    @Test()
    public void convertToBitcoinURI2WhenMessageIsNotNullAndNotEqualsMessageAndQuestionMarkHasBeenOutput() throws UnsupportedEncodingException {
        /* Branches:
         * (amount != null) : false
         * (amount != null) : false
         * (label != null) : true
         * (!"".equals(label)) : true
         * (questionMarkHasBeenOutput) : false
         * (message != null) : true
         * (!"".equals(message)) : true
         * (questionMarkHasBeenOutput) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BitcoinURI> bitcoinURI = mockStatic(BitcoinURI.class, CALLS_REAL_METHODS)) {
            doReturn("B").when(networkMock).uriScheme();
            bitcoinURI.when(() -> BitcoinURI.encodeURLString("A")).thenReturn("D");
            bitcoinURI.when(() -> BitcoinURI.encodeURLString("F")).thenReturn("E");
            Coin coin = null;
            //Act Statement(s)
            String result = BitcoinURI.convertToBitcoinURI(networkMock, "C", coin, "A", "F");
            //Assert statement(s)
            assertThat(result, equalTo("B:C?label=D&message=E"));
            verify(networkMock, atLeast(1)).uriScheme();
            bitcoinURI.verify(() -> BitcoinURI.encodeURLString("A"), atLeast(1));
            bitcoinURI.verify(() -> BitcoinURI.encodeURLString("F"), atLeast(1));
        }
    }

    //Sapient generated method id: ${01f4f405-197f-3337-bb77-8b92e3ab7ea8}
    @Test()
    public void convertToBitcoinURI2WhenQuestionMarkHasBeenOutputAndMessageIsNotNullAndNotEqualsMessageAndQuestionMarkHasBeenOutput() throws UnsupportedEncodingException {
        /* Branches:
         * (amount != null) : true
         * (amount.signum() < 0) : false
         * (amount != null) : true
         * (label != null) : true
         * (!"".equals(label)) : true
         * (questionMarkHasBeenOutput) : true
         * (message != null) : true
         * (!"".equals(message)) : true
         * (questionMarkHasBeenOutput) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BitcoinURI> bitcoinURI = mockStatic(BitcoinURI.class, CALLS_REAL_METHODS)) {
            doReturn("C").when(networkMock).uriScheme();
            doReturn(1).when(amountMock).signum();
            doReturn("E").when(amountMock).toPlainString();
            bitcoinURI.when(() -> BitcoinURI.encodeURLString("A")).thenReturn("F");
            bitcoinURI.when(() -> BitcoinURI.encodeURLString("B")).thenReturn("G");
            //Act Statement(s)
            String result = BitcoinURI.convertToBitcoinURI(networkMock, "D", amountMock, "A", "B");
            //Assert statement(s)
            assertThat(result, equalTo("C:D?amount=E&label=F&message=G"));
            verify(networkMock, atLeast(1)).uriScheme();
            verify(amountMock, atLeast(1)).signum();
            verify(amountMock, atLeast(1)).toPlainString();
            bitcoinURI.verify(() -> BitcoinURI.encodeURLString("A"), atLeast(1));
            bitcoinURI.verify(() -> BitcoinURI.encodeURLString("B"), atLeast(1));
        }
    }

    //Sapient generated method id: ${5af14921-4417-30ef-9c77-3fd56869b8d4}
    @Test()
    public void encodeURLStringTest() throws UnsupportedEncodingException {
        //Act Statement(s)
        String result = BitcoinURI.encodeURLString("A");
        //Assert statement(s)
        assertThat(result, equalTo("A"));
    }

    //Sapient generated method id: ${1cc4a011-1d12-3e83-aab8-bbe3cd9a39e7}
    @Test()
    public void encodeURLStringWhenCaughtUnsupportedEncodingExceptionThrowsRuntimeException() throws UnsupportedEncodingException {
        /* Branches:
         * (catch-exception (UnsupportedEncodingException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<URLEncoder> uRLEncoder = mockStatic(URLEncoder.class)) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException();
            uRLEncoder.when(() -> URLEncoder.encode("stringToEncode1", "UTF-8")).thenThrow(unsupportedEncodingException);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(UnsupportedEncodingException.class)));
            //Act Statement(s)
            BitcoinURI.encodeURLString("stringToEncode1");
            //Assert statement(s)
            uRLEncoder.verify(() -> URLEncoder.encode("stringToEncode1", "UTF-8"), atLeast(1));
        }
    }
}
