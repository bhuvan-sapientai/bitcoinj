package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class SegwitAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Network networkMock = mock(Network.class);

    private final Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);

    private final Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class);

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
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        int result = target.getWitnessVersion();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}
    @Ignore()
    @Test()
    public void getHashTest() {
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        //byte[] result = target.getHash();
        //Assert statement(s)
        //assertThat(result, equalTo(byteArray));
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
        //byte[] byteArray = new byte[] { (byte) 0 };
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //Act Statement(s)
        //ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        //assertThat(result, equalTo(ScriptType.P2WPKH));
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
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        //ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        //assertThat(result, equalTo(ScriptType.P2WSH));
    }

    //Sapient generated method id: ${c478dbb2-b128-33a8-ab30-ecc052f55c70}
    @Ignore()
    @Test()
    public void getOutputScriptTypeWhenProgramLengthEqualsWITNESS_PROGRAM_LENGTH_TR() {
        /* Branches:
         * (version == 0) : false
         * (version == 1) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_TR) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //Act Statement(s)
        //ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        //assertThat(result, equalTo(ScriptType.P2TR));
    }

    //Sapient generated method id: ${457f9bb6-310a-3a0a-9feb-380da95bb107}
    @Test()
    public void getOutputScriptTypeWhenProgramLengthNotEqualsWITNESS_PROGRAM_LENGTH_TRThrowsIllegalStateException() {
        /* Branches:
         * (version == 0) : false
         * (version == 1) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_TR) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        //target.getOutputScriptType();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = spy(SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray));
        doReturn("return_of_toBech32").when(target).toBech32();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("return_of_toBech32"));
        verify(target).toBech32();
    }

    //Sapient generated method id: ${1835cbcd-7354-3e46-9e0d-0f6f3c7af842}
    @Test()
    public void fromBech32Test() throws AddressFormatException {
        //Arrange Statement(s)
        //AddressParser addressParserMock = mock(AddressParser.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        /*try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
    addressParser.when(() -> AddressParser.getLegacy(networkParametersMock)).thenReturn(addressParserMock);
    doReturn(segwitAddressMock).when(addressParserMock).parseAddress("bech32");
    //Act Statement(s)
    SegwitAddress result = SegwitAddress.fromBech32(networkParametersMock, "bech32");
    //Assert statement(s)
    assertThat(result, equalTo(segwitAddressMock));
    addressParser.verify(() -> AddressParser.getLegacy(networkParametersMock), atLeast(1));
    verify(addressParserMock).parseAddress("bech32");
}*/
    }

    //Sapient generated method id: ${4624a3c5-e89b-39c5-af96-e2d3e36544b8}
    @Test()
    public void fromBech321ThrowsNullPointerException() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class)) {
            doReturn("return_of_segwitAddressHrp1").when(networkMock).segwitAddressHrp();
            bech32.when(() -> Bech32.decode("bech32")).thenReturn(bech32Bech32DataMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            SegwitAddress.fromBech32("bech32", networkMock);
            //Assert statement(s)
            verify(networkMock).segwitAddressHrp();
            bech32.verify(() -> Bech32.decode("bech32"), atLeast(1));
        }
    }

    //Sapient generated method id: ${55ddd006-41f1-399a-9286-454bb4f2e146}
    @Test()
    public void fromBechDataWhenBechDataBytesLengthLessThan1ThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(bechDataMock).bytes();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("invalid address length (0)");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
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
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(bechDataMock).bytes();
        //doReturn(22).when(bechDataMock).witnessVersion();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(byteArray2).when(bechDataMock).witnessProgram();
        //AddressFormatException addressFormatException = new AddressFormatException("Invalid script version: 22");
        //thrown.expect(AddressFormatException.class);
        //thrown.expectMessage(addressFormatException.getMessage());
        //Act Statement(s)
        //SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        //verify(bechDataMock).bytes();
        //verify(bechDataMock).witnessVersion();
        //verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${cccd7257-3b24-3280-874b-167ce1f69e7f}
    @Ignore()
    @Test()
    public void fromBechDataWhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(bechDataMock).bytes();
        //doReturn(1).when(bechDataMock).witnessVersion();
        //byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40 };
        //doReturn(byteArray2).when(bechDataMock).witnessProgram();
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 41");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        //SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        //verify(bechDataMock).bytes();
        //verify(bechDataMock).witnessVersion();
        //verify(bechDataMock).witnessProgram();
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
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(bechDataMock).bytes();
        //doReturn(0).when(bechDataMock).witnessVersion();
        //byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        //doReturn(byteArray2).when(bechDataMock).witnessProgram();
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        //SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        //verify(bechDataMock).bytes();
        //verify(bechDataMock).witnessVersion();
        //verify(bechDataMock).witnessProgram();
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
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(bechDataMock).bytes();
        //doReturn(1).when(bechDataMock).witnessVersion();
        //byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        //doReturn(byteArray2).when(bechDataMock).witnessProgram();
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 2");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        //SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        //verify(bechDataMock).bytes();
        //verify(bechDataMock).witnessVersion();
        //verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${a4895aff-f020-3d9b-a1d3-d98eb12570c5}
    @Ignore()
    @Test()
    public void fromBechDataWhenBechDataEncodingNotEqualsBech32EncodingBECH32MThrowsAddressFormatExceptionUnexpectedWitnessVersion() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : true  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : false  #  inside normalizeNetwork method
         * (witnessVersion == 0) : false
         * (witnessVersion != 0) : true
         * (bechData.encoding != Bech32.Encoding.BECH32M) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.UnexpectedWitnessVersion addressFormatExceptionUnexpectedWitnessVersion = new AddressFormatException.UnexpectedWitnessVersion("Unexpected witness version: 1");
        thrown.expect(AddressFormatException.UnexpectedWitnessVersion.class);
        thrown.expectMessage(addressFormatExceptionUnexpectedWitnessVersion.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn(0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
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
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock, byteArray)).thenReturn(segwitAddressMock);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromHash(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            verify(paramsMock, atLeast(1)).network();
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${be53216e-b382-3cec-9cf9-9cf1f2676fb2}
    @Test()
    public void fromHash1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 46");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45};
        //Act Statement(s)
        SegwitAddress.fromHash(networkMock, byteArray);
    }

    //Sapient generated method id: ${8e5f93b7-211d-30a9-8800-c94090c55827}
    @Test()
    public void fromHash1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1 };
        //Act Statement(s)
        //SegwitAddress.fromHash(networkMock, byteArray);
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
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //Act Statement(s)
        //SegwitAddress result = SegwitAddress.fromHash((Network) BitcoinNetwork.SIGNET, byteArray);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7320f23b-25f5-32e0-8740-7fe52e517f9e}
    @Test()
    public void fromHash1WhenBitcoinNetworkNotEqualsBitcoinNetworkSIGNET() throws AddressFormatException {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         * (branch expression (line 174)) : false  #  inside <init> method
         * (network instanceof BitcoinNetwork) : true  #  inside normalizeNetwork method
         * (bitcoinNetwork == BitcoinNetwork.SIGNET) : false  #  inside normalizeNetwork method
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //Act Statement(s)
        //SegwitAddress result = SegwitAddress.fromHash((Network) BitcoinNetwork.MAINNET, byteArray);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f846c9a2-4b4e-3ee7-a5eb-056c2d3f3c7c}
    @Test()
    public void fromProgramTest() {
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock, 0, byteArray)).thenReturn(segwitAddressMock);
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromProgram(paramsMock, 0, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            verify(paramsMock, atLeast(1)).network();
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock, 0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${61b6ba48-d861-3795-85e8-f30e6103f85e}
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatException() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        //AddressFormatException addressFormatException = new AddressFormatException("Invalid script version: 28");
        //thrown.expect(AddressFormatException.class);
        //thrown.expectMessage(addressFormatException.getMessage());
        //byte[] byteArray = new byte[] {};
        //Act Statement(s)
        //SegwitAddress.fromProgram(networkMock, 28, byteArray);
    }

    //Sapient generated method id: ${1a612cec-2b1a-342b-9571-97ae0640697a}
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 42");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41 };
        //Act Statement(s)
        //SegwitAddress.fromProgram(networkMock, 1, byteArray);
    }

    //Sapient generated method id: ${3d6c00a3-7826-36cf-831b-0cf40b31b46f}
    @Test()
    public void fromProgram1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        //AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        //thrown.expect(AddressFormatException.InvalidDataLength.class);
        //thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1 };
        //Act Statement(s)
        //SegwitAddress.fromProgram(networkMock, 0, byteArray);
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
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock, 1, byteArray);
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
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //Act Statement(s)
        //SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.SIGNET, 0, byteArray);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
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
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //Act Statement(s)
        //SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.REGTEST, 0, byteArray);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0f8677e5-1136-39bc-a834-9dd78dde00fb}
    @Test()
    public void fromKeyTest() {
        //Arrange Statement(s)
        //doReturn(networkMock).when(paramsMock).network();
        //ECKey keyMock = mock(ECKey.class);
        //doReturn(segwitAddressMock).when(keyMock).toAddress(ScriptType.P2WPKH, networkMock);
        //Act Statement(s)
        //SegwitAddress result = SegwitAddress.fromKey(paramsMock, keyMock);
        //Assert statement(s)
        //assertThat(result, equalTo(segwitAddressMock));
        //verify(paramsMock).network();
        //verify(keyMock).toAddress(ScriptType.P2WPKH, networkMock);
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Ignore()
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        //Network result = target.network();
        //Assert statement(s)
        //assertThat(result, equalTo(BitcoinNetwork.TESTNET));
    }

    //Sapient generated method id: ${47e11a0d-795c-3ba1-9d69-39455db34464}
    @Ignore()
    @Test()
    public void toBech32WhenWitnessVersionEquals0() {
        /* Branches:
         * (witnessVersion == 0) : true
         */
        //Arrange Statement(s)
        //Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class);
        /*try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
    MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31 };
    bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray)).thenReturn(bech32Bech32BytesMock);
    bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "tb", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
    SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
    //Act Statement(s)
    String result = target.toBech32();
    //Assert statement(s)
    assertThat(result, equalTo("return_of_encode1"));
    bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray), atLeast(1));
    bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "tb", bech32Bech32BytesMock), atLeast(1));
}*/
    }

    //Sapient generated method id: ${8e32509e-0c3c-3b2a-bd85-8f74e3effe3d}
    @Ignore()
    @Test()
    public void toBech32WhenWitnessVersionNotEquals0() {
        // Branches:         * (witnessVersion == 0) : false
        /*try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
    MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray)).thenReturn(bech32Bech32BytesMock);
    bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32M, "tb", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
    byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray2);
    //Act Statement(s)
    String result = target.toBech32();
    //Assert statement(s)
    assertThat(result, equalTo("return_of_encode1"));
    bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray), atLeast(1));
    bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32M, "tb", bech32Bech32BytesMock), atLeast(1));
}*/
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
        //byte[] byteArray = new byte[] { (byte) 0 };
        //SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //Address addressMock = mock(Address.class, "null");
        //Act Statement(s)
        //int result = target.compareTo(addressMock);
        //Assert statement(s)
        //assertThat(result, equalTo(0));
    }
}
