package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class SegwitAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Network networkMock = mock(Network.class, "network");

    private final Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final SegwitAddress segwitAddressMock = mock(SegwitAddress.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);

    private final NetworkParameters networkParameters2Mock = mock(NetworkParameters.class);

    //Sapient generated method id: ${d65e732a-558f-3e8d-af9d-3b3f11a8dd65}
    @Ignore()
    @Test()
    public void getWitnessVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            SegwitAddress target = SegwitAddress.fromProgram(networkParameters, 0, byteArray);
            //Act Statement(s)
            int result = target.getWitnessVersion();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}
    @Ignore()
    @Test()
    public void getHashTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "Network");
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddress2);
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Act Statement(s)
            byte[] result = target.getHash();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${a692d7f0-dc47-3a18-8225-b89fa3c261a6}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenProgramLengthEqualsWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (version == 0) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_PKH) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Act Statement(s)
            ScriptType result = target.getOutputScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2WPKH));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${5c374f49-747d-3cb2-93fb-1c8ea0f8d19f}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenProgramLengthEqualsWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (version == 0) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_PKH) : false
         * (programLength == WITNESS_PROGRAM_LENGTH_SH) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Act Statement(s)
            ScriptType result = target.getOutputScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2WSH));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${722ec9f7-f329-3888-baca-7ec3ae8143ae}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenProgramLengthNotEqualsWITNESS_PROGRAM_LENGTH_SHThrowsIllegalStateException() {
        /* Branches:
         * (version == 0) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_PKH) : false
         * (programLength == WITNESS_PROGRAM_LENGTH_SH) : false
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getOutputScriptType();
            //Assert statement(s)
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "Network");
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{(byte) 0};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            SegwitAddress target = spy(SegwitAddress.fromProgram(paramsMock, 0, byteArray));
            doReturn("return_of_toBech32").when(target).toBech32();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBech32"));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
            verify(target).toBech32();
        }
    }

    //Sapient generated method id: ${1835cbcd-7354-3e46-9e0d-0f6f3c7af842}
    @Ignore()
    @Test()
    public void fromBech32Test() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            AddressParser addressParser2 = AddressParser.getDefault();
            addressParser.when(() -> AddressParser.getLegacy((NetworkParameters) any())).thenReturn(addressParser2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromBech32(networkParameters, "String");
            SegwitAddress segwitAddress = (SegwitAddress) SegwitAddress.fromKey(networkParameters2Mock, eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress));
            addressParser.verify(() -> AddressParser.getLegacy((NetworkParameters) any()));
        }
    }

    //Sapient generated method id: ${61bca67c-cffc-3512-88bb-0a75b094cedc}
    @Ignore()
    @Test()
    public void fromBech321WhenBechDataHrpNotEqualsNetworkSegwitAddressHrpThrowsAddressFormatExceptionWrongNetwork() throws AddressFormatException {
        /* Branches:
         * (bechData.hrp.equals(network.segwitAddressHrp())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class, "tb");
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class)) {
            doReturn("tb").when(networkMock2).segwitAddressHrp();
            bech32.when(() -> Bech32.decode("bc1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4")).thenReturn(bech32Bech32DataMock);
            thrown.expect(AddressFormatException.WrongNetwork.class);
            //Act Statement(s)
            SegwitAddress.fromBech32("bc1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4", networkMock2);
            //Assert statement(s)
            verify(networkMock2).segwitAddressHrp();
            bech32.verify(() -> Bech32.decode("bc1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4"), atLeast(1));
        }
    }

    //Sapient generated method id: ${55ddd006-41f1-399a-9286-454bb4f2e146}
    @Test()
    public void fromBechDataWhenBechDataBytesLengthLessThan1ThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : true
         */
        //Arrange Statement(s)
        Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class, "[]");
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(bechDataMock).bytes();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("invalid address length (0)");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        Network networkMock2 = mock(Network.class, "hrp");
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
    }

    //Sapient generated method id: ${ab2442ff-aa2a-3ddb-b100-2f639a4f858b}
    @Ignore()
    @Test()
    public void fromBechDataWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBraThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : true  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class, "[0]");
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 3");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        Network networkMock2 = mock(Network.class, "MAINNET");
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${51ad6411-1dac-3c29-99aa-78df8c853675}
    @Ignore()
    @Test()
    public void fromBechDataWhenBechDataEncodingEqualsBech32EncodingBECH32M() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : true  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (witnessVersion == 0) : false
         * (witnessVersion != 0) : true
         * (bechData.encoding != Bech32.Encoding.BECH32M) : false
         */
        //Arrange Statement(s)
        Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class, "[0, 1, 2, 3]");
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 4");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        Network networkMock2 = mock(Network.class, "{}");
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${229fca9f-f27a-32f4-8443-738583bfe113}
    @Ignore()
    @Test()
    public void fromHashTest() {
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock2, byteArray)).thenReturn(segwitAddress2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromHash(networkParameters, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress2));
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f846c9a2-4b4e-3ee7-a5eb-056c2d3f3c7c}
    @Test()
    public void fromProgramTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "TESTNET");
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            verify(paramsMock, atLeast(1)).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${e7e8f18e-3295-39cb-8049-536d53368f52}
    @Test()
    public void fromProgram1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBraThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : true  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 3");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        Network networkMock2 = mock(Network.class, "MAINNET");
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock2, 0, byteArray);
    }

    //Sapient generated method id: ${0f8677e5-1136-39bc-a834-9dd78dde00fb}
    @Ignore()
    @Test()
    public void fromKeyTest() {
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        ECKey eCKey = new ECKey();
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromKey(networkParameters, eCKey);
        ECKey eCKey2Mock = mock(ECKey.class);
        SegwitAddress segwitAddress = (SegwitAddress) SegwitAddress.fromKey(networkParameters2Mock, eCKey2Mock);
        //Assert statement(s)
        assertThat(result, equalTo(segwitAddress));
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Ignore()
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Act Statement(s)
            Network result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(networkMock));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${47e11a0d-795c-3ba1-9d69-39455db34464}
    @Ignore()
    @Test()
    public void toBech32WhenWitnessVersionEquals0() {
        /* Branches:
         * (witnessVersion == 0) : true
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class, "UnknownObjectContent{target='org.bitcoinj.base.Bech32$Bech32Bytes', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class);
             MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddress2);
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, (byte[]) null)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "string", bech32Bech32BytesMock)).thenReturn("string");
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            SegwitAddress target = SegwitAddress.fromProgram(networkParameters, 0, byteArray);
            doReturn("string").when(networkMock).segwitAddressHrp();
            //Act Statement(s)
            String result = target.toBech32();
            //Assert statement(s)
            assertThat(result, equalTo("string"));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, (byte[]) null), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "string", bech32Bech32BytesMock), atLeast(1));
            verify(networkMock).segwitAddressHrp();
        }
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Ignore()
    @Test()
    public void compareToTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "{}");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            SegwitAddress target = SegwitAddress.fromProgram(networkParameters, 0, byteArray);
            //Act Statement(s)
            int result = target.compareTo(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }
}
