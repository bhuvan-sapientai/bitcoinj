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

    //Sapient generated method id: ${d65e732a-558f-3e8d-af9d-3b3f11a8dd65}
    @Ignore()
    @Test()
    public void getWitnessVersionTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
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
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            SegwitAddress target = SegwitAddress.fromProgram(networkParameters, 0, byteArray);
            //Act Statement(s)
            byte[] result = target.getHash();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
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
            SegwitAddress result = SegwitAddress.fromBech32(networkParameters, "bc1qar0srrr7xfkvy5l643lydnw9re59gtzzwf5mdq");
            SegwitAddress segwitAddress = (SegwitAddress) SegwitAddress.fromKey(networkParameters2Mock, eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress));
            addressParser.verify(() -> AddressParser.getLegacy((NetworkParameters) any()));
        }
    }

    //Sapient generated method id: ${d034a323-fe70-3d57-930f-d88d7f82f3b1}
    @Test()
    public void fromBech321WhenBechDataHrpEqualsNetworkSegwitAddressHrp() throws AddressFormatException {
        /* Branches:
         * (bechData.hrp.equals(network.segwitAddressHrp())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn("bc").when(networkMock2).segwitAddressHrp();
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            segwitAddress.when(() -> SegwitAddress.fromBechData(eq(networkMock2), (Bech32.Bech32Data) any())).thenReturn(segwitAddress2);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromBech32("bc1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4", networkMock2);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress2));
            verify(networkMock2, atLeast(1)).segwitAddressHrp();
            segwitAddress.verify(() -> SegwitAddress.fromBechData(eq(networkMock2), (Bech32.Bech32Data) any()), atLeast(1));
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
        Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class)) {
            doReturn("B").when(networkMock2).segwitAddressHrp();
            bech32.when(() -> Bech32.decode("bech32")).thenReturn(bech32Bech32DataMock);
            thrown.expect(AddressFormatException.WrongNetwork.class);
            //Act Statement(s)
            SegwitAddress.fromBech32("bech32", networkMock2);
            //Assert statement(s)
            verify(networkMock2).segwitAddressHrp();
            bech32.verify(() -> Bech32.decode("bech32"), atLeast(1));
        }
    }

    //Sapient generated method id: ${55ddd006-41f1-399a-9286-454bb4f2e146}
    @Test()
    public void fromBechDataWhenBechDataBytesLengthLessThan1ThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(bechDataMock).bytes();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("invalid address length (0)");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
    }

    //Sapient generated method id: ${e4db5260-2723-3d7e-afb8-a71fca2eb3c1}
    @Ignore()
    @Test()
    public void fromBechDataWhenDefaultBranchThrowsAddressFormatException() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 3");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${cccd7257-3b24-3280-874b-167ce1f69e7f}
    @Ignore()
    @Test()
    public void fromBechDataWhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 0");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${b64f0841-4ef5-3f4a-8c0c-710c549e6c98}
    @Ignore()
    @Test()
    public void fromBechDataWhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 3");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 18");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 0");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock2, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${646d8346-e90e-3bae-aa6b-e6b21d860fda}
    @Ignore()
    @Test()
    public void fromBechDataWhenWitnessVersionEquals0AndBechDataEncodingNotEqualsBe2ThrowsAddressFormatExceptionUnexpectedWitnessVersion() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : true  #  inside normalizeNetwork method
         * (witnessVersion == 0) : true
         * (bechData.encoding != Bech32.Encoding.BECH32) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.UnexpectedWitnessVersion addressFormatExceptionUnexpectedWitnessVersion = new AddressFormatException.UnexpectedWitnessVersion("Unexpected witness version: 0");
        thrown.expect(AddressFormatException.UnexpectedWitnessVersion.class);
        thrown.expectMessage(addressFormatExceptionUnexpectedWitnessVersion.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(BitcoinNetwork.SIGNET, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${229fca9f-f27a-32f4-8443-738583bfe113}
    @Test()
    public void fromHashTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock).network();
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock2, byteArray)).thenReturn(segwitAddress2);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromHash(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress2));
            verify(paramsMock, atLeast(1)).network();
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock2, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${be53216e-b382-3cec-9cf9-9cf1f2676fb2}
    @Test()
    public void fromHash1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 46");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45};
        //Act Statement(s)
        SegwitAddress.fromHash(networkMock2, byteArray);
    }

    //Sapient generated method id: ${8e5f93b7-211d-30a9-8800-c94090c55827}
    @Test()
    public void fromHash1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromHash(networkMock2, byteArray);
    }

    //Sapient generated method id: ${3bc3ab4d-e0e2-35ca-9969-8b098022d230}
    @Test()
    public void fromHash1WhenBitcoinNetworkEqualsBitcoinNetworkSIGNET() throws AddressFormatException {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : true  #  inside normalizeNetwork method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromHash((Network) BitcoinNetwork.SIGNET, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7320f23b-25f5-32e0-8740-7fe52e517f9e}
    @Test()
    public void fromHash1WhenBitcoinNetworkNotEqualsBitcoinNetworkSIGNET() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 1");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        SegwitAddress.fromHash((Network) BitcoinNetwork.MAINNET, byteArray);
    }

    //Sapient generated method id: ${f846c9a2-4b4e-3ee7-a5eb-056c2d3f3c7c}
    @Test()
    public void fromProgramTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock).network();
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddress2);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress2));
            verify(paramsMock, atLeast(1)).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${61b6ba48-d861-3795-85e8-f30e6103f85e}
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatException() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException addressFormatException = new AddressFormatException("Invalid script version: 22");
        thrown.expect(AddressFormatException.class);
        thrown.expectMessage(addressFormatException.getMessage());
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock2, 22, byteArray);
    }

    //Sapient generated method id: ${1a612cec-2b1a-342b-9571-97ae0640697a}
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 42");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock2, 1, byteArray);
    }

    //Sapient generated method id: ${3d6c00a3-7826-36cf-831b-0cf40b31b46f}
    @Test()
    public void fromProgram1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock2, 0, byteArray);
    }

    //Sapient generated method id: ${e7e8f18e-3295-39cb-8049-536d53368f52}
    @Test()
    public void fromProgram1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBraThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : true  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock2, 0, byteArray);
    }

    //Sapient generated method id: ${9d32af23-87ce-3045-a8b5-2cef898e457f}
    @Test()
    public void fromProgram1WhenBitcoinNetworkEqualsBitcoinNetworkSIGNET() throws AddressFormatException {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : true  #  inside normalizeNetwork method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.SIGNET, 0, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${24024f3f-9f43-31e4-8cab-e69e3caca04d}
    @Test()
    public void fromProgram1WhenBitcoinNetworkNotEqualsBitcoinNetworkSIGNET() throws AddressFormatException {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.SIGNET, 0, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
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
        SegwitAddress result = SegwitAddress.fromKey(paramsMock, eCKey);
        ECKey eCKey2Mock = mock(ECKey.class);
        SegwitAddress segwitAddress = (SegwitAddress) SegwitAddress.fromKey(networkParametersMock, eCKey2Mock);
        //Assert statement(s)
        assertThat(result, equalTo(segwitAddress));
        verify(paramsMock).network();
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Ignore()
    @Test()
    public void networkTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{(byte) 0};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddress2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            SegwitAddress target = SegwitAddress.fromProgram(networkParameters, 0, byteArray);
            //Act Statement(s)
            Network result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(networkMock));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${47e11a0d-795c-3ba1-9d69-39455db34464}
    @Ignore()
    @Test()
    public void toBech32WhenWitnessVersionEquals0() {
        /* Branches:
         * (witnessVersion == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class);
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class);
             MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class)) {
            doReturn(networkMock2).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray)).thenReturn(segwitAddressMock);
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, (byte[]) null)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "return_of_segwitAddressHrp1", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
            SegwitAddress target = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            doReturn("return_of_segwitAddressHrp1").when(networkMock).segwitAddressHrp();
            //Act Statement(s)
            String result = target.toBech32();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            verify(paramsMock).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock2, 0, byteArray), atLeast(1));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, (byte[]) null), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "return_of_segwitAddressHrp1", bech32Bech32BytesMock), atLeast(1));
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
        Address addressMock = mock(Address.class);
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