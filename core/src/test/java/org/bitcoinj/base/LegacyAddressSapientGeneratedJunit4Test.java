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

    private final AddressParser addressParserMock = mock(AddressParser.class);

    private final LegacyAddress legacyAddressMock = mock(LegacyAddress.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${79fa68aa-0c43-3870-91d5-0a917e163aec}
    @Test()
    public void fromPubKeyHashTest() throws AddressFormatException {
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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        //Act Statement(s)
        LegacyAddress result = LegacyAddress.fromPubKeyHash((Network) BitcoinNetwork.TESTNET, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0f8677e5-1136-39bc-a834-9dd78dde00fb}
    @Test()
    public void fromKeyTest() {
        //Arrange Statement(s)
        doReturn(networkMock2).when(paramsMock).network();
        ECKey keyMock = mock(ECKey.class);
        doReturn(legacyAddressMock).when(keyMock).toAddress(ScriptType.P2PKH, networkMock2);
        //Act Statement(s)
        LegacyAddress result = LegacyAddress.fromKey(paramsMock, keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(legacyAddressMock));
        verify(paramsMock).network();
        verify(keyMock).toAddress(ScriptType.P2PKH, networkMock2);
    }

    //Sapient generated method id: ${d753a76d-5c29-3370-9d0f-8a56356fc6f2}
    @Test()
    public void fromScriptHashTest() throws AddressFormatException {
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
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{};
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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        //Act Statement(s)
        LegacyAddress result = LegacyAddress.fromScriptHash((Network) BitcoinNetwork.TESTNET, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e8953178-2cec-370c-a293-78116cabcb85}
    @Test()
    public void fromBase58Test() throws AddressFormatException, WrongNetwork {
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            addressParser.when(() -> AddressParser.getLegacy(networkParametersMock)).thenReturn(addressParserMock);
            doReturn(legacyAddressMock).when(addressParserMock).parseAddress("base58");
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58(networkParametersMock, "base58");
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddressMock));
            addressParser.verify(() -> AddressParser.getLegacy(networkParametersMock), atLeast(1));
            verify(addressParserMock).parseAddress("base58");
        }
    }

    //Sapient generated method id: ${3af5b857-accb-3fc3-bf10-0e28cf0e4939}
    @Ignore()
    @Test()
    public void fromBase581WhenVersionNotEqualsNetworkLegacyP2SHHeaderThrowsAddressFormatExceptionWrongNetwork() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (version == network.legacyAddressHeader()) : false
         * (version == network.legacyP2SHHeader()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(2).when(networkMock2).legacyAddressHeader();
            doReturn(-1).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            thrown.expect(AddressFormatException.WrongNetwork.class);
            //Act Statement(s)
            LegacyAddress.fromBase58("A", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(0).when(networkMock2).legacyAddressHeader();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            LegacyAddress.fromBase58("A", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
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
            doReturn(0).when(networkMock2).legacyAddressHeader();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58("A", networkMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(networkMock2).legacyAddressHeader();
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            doReturn(1).when(networkMock2).legacyAddressHeader();
            doReturn(0).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Legacy addresses are 20 byte (160 bit) hashes, but got: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            LegacyAddress.fromBase58("", networkMock2);
            //Assert statement(s)
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
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
            doReturn(1).when(networkMock2).legacyAddressHeader();
            doReturn(0).when(networkMock2).legacyP2SHHeader();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            //Act Statement(s)
            LegacyAddress result = LegacyAddress.fromBase58("", networkMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(networkMock2).legacyAddressHeader();
            verify(networkMock2).legacyP2SHHeader();
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Ignore()
    @Test()
    public void networkTest() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            LegacyAddress target = LegacyAddress.fromPubKeyHash(paramsMock, byteArray);
            //Act Statement(s)
            Network result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(networkMock));
            verify(paramsMock).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c38b3e41-62e2-35de-bc9a-013d56ed3b0b}
    @Ignore()
    @Test()
    public void getVersionWhenNotP2sh() throws AddressFormatException {
        /* Branches:
         * (p2sh) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
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
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            base58.when(() -> Base58.encodeChecked(1, (byte[]) null)).thenReturn("return_of_encodeChecked1");
            LegacyAddress target = spy(LegacyAddress.fromPubKeyHash(paramsMock, byteArray));
            doReturn(1).when(target).getVersion();
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            verify(paramsMock).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(1, (byte[]) null), atLeast(1));
            verify(target).getVersion();
        }
    }

    //Sapient generated method id: ${025c4b8d-5cd5-3634-a252-2f4b48c82089}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenNotP2sh() throws AddressFormatException {
        /* Branches:
         * (p2sh) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            LegacyAddress target = LegacyAddress.fromPubKeyHash(paramsMock, byteArray);
            //Act Statement(s)
            ScriptType result = target.getOutputScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2PKH));
            verify(paramsMock).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${62620fc3-0f73-33ec-bac4-94cb56b7b5f8}
    @Test()
    public void getParametersFromAddressTest() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            addressParser.when(() -> AddressParser.getLegacy()).thenReturn(addressParserMock);
            doReturn(addressMock).when(addressParserMock).parseAddress("A");
            networkParameters.when(() -> NetworkParameters.fromAddress(addressMock)).thenReturn(networkParametersMock);
            //Act Statement(s)
            NetworkParameters result = LegacyAddress.getParametersFromAddress("A");
            //Assert statement(s)
            assertThat(result, equalTo(networkParametersMock));
            addressParser.verify(() -> AddressParser.getLegacy(), atLeast(1));
            verify(addressParserMock).parseAddress("A");
            networkParameters.verify(() -> NetworkParameters.fromAddress(addressMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            LegacyAddress target = spy(LegacyAddress.fromPubKeyHash(paramsMock, byteArray));
            doReturn("return_of_toBase58").when(target).toBase58();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            verify(paramsMock).network();
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
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray)).thenReturn(legacyAddressMock);
            LegacyAddress target = LegacyAddress.fromPubKeyHash(paramsMock, byteArray);
            //Act Statement(s)
            int result = target.compareTo(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(paramsMock).network();
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock2, byteArray), atLeast(1));
        }
    }
}
