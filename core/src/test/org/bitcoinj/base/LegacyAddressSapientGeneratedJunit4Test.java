package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.bitcoinj.base.exceptions.AddressFormatException.WrongNetwork;
import org.junit.rules.ExpectedException;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class LegacyAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Network networkMock = mock(Network.class, "network");

    private final Address addressMock = mock(Address.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final LegacyAddress legacyAddressMock = mock(LegacyAddress.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${79fa68aa-0c43-3870-91d5-0a917e163aec}
    @Test()
    public void fromPubKeyHashTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromPubKeyHash(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddressMock));
            verify(paramsMock, atLeast(1)).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${4cf58fae-b862-3e2e-ba5b-9dfef56ed1a1}
    @Test()
    public void fromPubKeyHash1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.REGTEST) : true  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        LegacyAddress.fromPubKeyHash((Network) BitcoinNetwork.REGTEST, byteArray);
    }

    //Sapient generated method id: ${bb0cb823-1d23-33b4-9331-4d8c1a8de53d}
    @Test()
    public void fromPubKeyHash1WhenBitcoinNetworkNotEqualsBitcoinNetworkREGTESTAndDefaultBranch() throws AddressFormatException {
        /* Branches:
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.REGTEST) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 1");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        LegacyAddress.fromPubKeyHash((Network) BitcoinNetwork.REGTEST, byteArray);
    }

    //Sapient generated method id: ${0f8677e5-1136-39bc-a834-9dd78dde00fb}
    @Ignore()
    @Test()
    public void fromKeyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(networkMock2).when(paramsMock).network();
        ECKey eCKey = new ECKey();
        //Act Statement(s)
        LegacyAddress result = LegacyAddress.fromKey(paramsMock, eCKey);
        ECKey eCKey2Mock = mock(ECKey.class);
        LegacyAddress legacyAddress = (LegacyAddress) LegacyAddress.fromKey(networkParametersMock, eCKey2Mock);
        //Assert statement(s)
        assertThat(result, equalTo(legacyAddress));
        verify(paramsMock).network();
    }

    //Sapient generated method id: ${d753a76d-5c29-3370-9d0f-8a56356fc6f2}
    @Test()
    public void fromScriptHashTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromScriptHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromScriptHash(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddressMock));
            verify(paramsMock, atLeast(1)).network();
            legacyAddress.verify(() -> LegacyAddress.fromScriptHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${282c9809-4cd2-35ef-82ef-b6a605f9b9f2}
    @Test()
    public void fromScriptHash1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.REGTEST) : true  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 1");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        LegacyAddress.fromScriptHash((Network) BitcoinNetwork.REGTEST, byteArray);
    }

    //Sapient generated method id: ${8510bfd3-68d7-3f42-a5b0-1e40cbf83e55}
    @Test()
    public void fromScriptHash1WhenBitcoinNetworkNotEqualsBitcoinNetworkREGTESTAndDefaultBranch() throws AddressFormatException {
        /* Branches:
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.REGTEST) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        LegacyAddress.fromScriptHash((Network) BitcoinNetwork.MAINNET, byteArray);
    }

    //Sapient generated method id: ${e8953178-2cec-370c-a293-78116cabcb85}
    @Ignore()
    @Test()
    public void fromBase58Test() throws AddressFormatException, WrongNetwork {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters2Mock = mock(NetworkParameters.class);
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            AddressParser addressParser2 = AddressParser.getDefault();
            addressParser.when(() -> AddressParser.getLegacy((NetworkParameters) any())).thenReturn(addressParser2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58(networkParameters, "String");
            LegacyAddress legacyAddress = (LegacyAddress) LegacyAddress.fromKey(networkParameters2Mock, eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddress));
            addressParser.verify(() -> AddressParser.getLegacy((NetworkParameters) any()));
        }
    }

    //Sapient generated method id: ${3af5b857-accb-3fc3-bf10-0e28cf0e4939}
    @Ignore()
    @Test()
    public void fromBase581WhenVersionNotEqualsNetworkLegacyP2SHHeaderThrowsAddressFormatExceptionWrongNetwork() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : false
         * (version == network.legacyP2SHHeader()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(0).when(networkMock2).legacyAddressHeader();
            doReturn(5).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2")).thenReturn(byteArray);
            thrown.expect(AddressFormatException.WrongNetwork.class);
            //Act Statement(s)
            LegacyAddress.fromBase58("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"), atLeast(1));
        }
    }

    //Sapient generated method id: ${1c4558e4-0a5f-33f9-96ec-b3bd2fc69962}
    @Ignore()
    @Test()
    public void fromBase581WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : true
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(48).when(networkMock2).legacyAddressHeader();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("Kzgj7xqX7KJrJLJZv5yZvz3zJ9J5zZL5J8z")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            LegacyAddress.fromBase58("Kzgj7xqX7KJrJLJZv5yZvz3zJ9J5zZL5J8z", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            base58.verify(() -> Base58.decodeChecked("Kzgj7xqX7KJrJLJZv5yZvz3zJ9J5zZL5J8z"), atLeast(1));
        }
    }

    //Sapient generated method id: ${82756cd6-efc2-395d-a8e8-c86c1c59e46c}
    @Ignore()
    @Test()
    public void fromBase581WhenDefaultBranch() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : true
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(111).when(networkMock2).legacyAddressHeader();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy")).thenReturn(byteArray);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy", networkMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(networkMock2).legacyAddressHeader();
            base58.verify(() -> Base58.decodeChecked("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy"), atLeast(1));
        }
    }

    //Sapient generated method id: ${7c9c139f-7435-3707-ad38-58cee4f1f08b}
    @Ignore()
    @Test()
    public void fromBase581WhenNetworkNotInstanceOfBitcoinNetworkAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : false
         * (version == network.legacyP2SHHeader()) : true
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(48).when(networkMock2).legacyAddressHeader();
            doReturn(50).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("3QJmV3qfvL9SuYo34YihAf3sRCW3qSinyC")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            LegacyAddress.fromBase58("3QJmV3qfvL9SuYo34YihAf3sRCW3qSinyC", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked("3QJmV3qfvL9SuYo34YihAf3sRCW3qSinyC"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f9d6d2c1-ada0-3afa-ac24-51115d2c6bbe}
    @Ignore()
    @Test()
    public void fromBase581WhenNetworkNotInstanceOfBitcoinNetworkAndDefaultBranch() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : false
         * (version == network.legacyP2SHHeader()) : true
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(48).when(networkMock2).legacyAddressHeader();
            doReturn(50).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy")).thenReturn(byteArray);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy", networkMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy"), atLeast(1));
        }
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Ignore()
    @Test()
    public void networkTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            LegacyAddress legacyAddress2 = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddress2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            LegacyAddress target = LegacyAddress.fromPubKeyHash(networkParameters, byteArray);
            //Act Statement(s)
            Network result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(networkMock));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c38b3e41-62e2-35de-bc9a-013d56ed3b0b}
    @Ignore()
    @Test()
    public void getVersionWhenNotP2sh() throws AddressFormatException {
        /* Branches:
         * (p2sh) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            LegacyAddress legacyAddress2 = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddress2);
            LegacyAddress target = LegacyAddress.fromPubKeyHash(paramsMock, byteArray);
            doReturn(0).when(networkMock).legacyAddressHeader();
            //Act Statement(s)
            int result = target.getVersion();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(paramsMock).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
            verify(networkMock).legacyAddressHeader();
        }
    }

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}
    @Ignore()
    @Test()
    public void toBase58Test() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            LegacyAddress legacyAddress2 = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddress2);
            base58.when(() -> Base58.encodeChecked(0, (byte[]) null)).thenReturn("1PMycacnJaSqwwJqjawXBErnLsZ7RkXUAs");
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            LegacyAddress target = spy(LegacyAddress.fromPubKeyHash(networkParameters, byteArray));
            doReturn(0).when(target).getVersion();
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("1PMycacnJaSqwwJqjawXBErnLsZ7RkXUAs"));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(0, (byte[]) null), atLeast(1));
            verify(target).getVersion();
        }
    }

    //Sapient generated method id: ${025c4b8d-5cd5-3634-a252-2f4b48c82089}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenNotP2sh() throws AddressFormatException {
        /* Branches:
         * (p2sh) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            LegacyAddress legacyAddress2 = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddress2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            LegacyAddress target = LegacyAddress.fromPubKeyHash(networkParameters, byteArray);
            //Act Statement(s)
            ScriptType result = target.getOutputScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2PKH));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${62620fc3-0f73-33ec-bac4-94cb56b7b5f8}
    @Ignore()
    @Test()
    public void getParametersFromAddressTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            AddressParser addressParser2 = AddressParser.getDefault();
            addressParser.when(() -> AddressParser.getLegacy()).thenReturn(addressParser2);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.fromAddress(addressMock)).thenReturn(networkParameters2);
            //Act Statement(s)
            NetworkParameters result = LegacyAddress.getParametersFromAddress("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
            //Assert statement(s)
            assertThat(result, equalTo(networkParameters2));
            addressParser.verify(() -> AddressParser.getLegacy(), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.fromAddress(addressMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            LegacyAddress target = spy(LegacyAddress.fromPubKeyHash(networkParameters, byteArray));
            doReturn("return_of_toBase58").when(target).toBase58();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
            verify(target).toBase58();
        }
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Ignore()
    @Test()
    public void compareToTest() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("org.bitcoin.test");
            LegacyAddress target = LegacyAddress.fromPubKeyHash(networkParameters, byteArray);
            //Act Statement(s)
            int result = target.compareTo(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }
}
