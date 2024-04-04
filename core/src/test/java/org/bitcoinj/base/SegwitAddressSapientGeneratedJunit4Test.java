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

    private final Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class);

    private final Bech32.Bech32Data bechDataMock = mock(Bech32.Bech32Data.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final SegwitAddress segwitAddressMock = mock(SegwitAddress.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d65e732a-558f-3e8d-af9d-3b3f11a8dd65}, hash: C61344340DD6EBB3B1DC19092186CA91
    @Test()
    public void getWitnessVersionTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        int result = target.getWitnessVersion();
        //Assert statement(s)
        assertThat((short) result, equalTo((short) 0));
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}, hash: 07EF74D229A6B24462A4F2D08680F2DF
    @Test()
    public void getHashTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        byte[] result = target.getHash();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
    }

    //Sapient generated method id: ${a692d7f0-dc47-3a18-8225-b89fa3c261a6}, hash: 12855B7CCCEE1C03EDDC95671CE72E08
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
        byte[] byteArray = new byte[]{};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //Act Statement(s)
        ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        assertThat(result, equalTo(ScriptType.P2WPKH));
    }

    //Sapient generated method id: ${5c374f49-747d-3cb2-93fb-1c8ea0f8d19f}, hash: 4680844BA8B0F8004952B1EB7B28B324
    @Test()
    public void getOutputScriptTypeWhenProgramLengthEqualsWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (version == 0) : true
         * (programLength == WITNESS_PROGRAM_LENGTH_PKH) : false
         * (programLength == WITNESS_PROGRAM_LENGTH_SH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        assertThat(result, equalTo(ScriptType.P2WSH));
    }

    //Sapient generated method id: ${c478dbb2-b128-33a8-ab30-ecc052f55c70}, hash: B8902C464BAFD565154242F4B146B779
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
        byte[] byteArray = new byte[]{};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        //Act Statement(s)
        ScriptType result = target.getOutputScriptType();
        //Assert statement(s)
        assertThat(result, equalTo(ScriptType.P2TR));
    }

    //Sapient generated method id: ${457f9bb6-310a-3a0a-9feb-380da95bb107}, hash: 3BD3B9E5045F83A6D5EC9FC677F00BBD
    @Ignore()
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
        byte[] byteArray = new byte[]{};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getOutputScriptType();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: DE5A7653CA38A7AEA66B845E873841B2
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

    //Sapient generated method id: ${1835cbcd-7354-3e46-9e0d-0f6f3c7af842}, hash: 01418724B40D997A50C90ACA4E042705
    @Test()
    public void fromBech32Test() throws AddressFormatException {
        //Arrange Statement(s)
        AddressParser addressParserMock = mock(AddressParser.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class)) {
            addressParser.when(() -> AddressParser.getLegacy(networkParametersMock)).thenReturn(addressParserMock);
            doReturn(segwitAddressMock).when(addressParserMock).parseAddress("bech32");
            //Act Statement(s)
            SegwitAddress result = SegwitAddress.fromBech32(networkParametersMock, "bech32");
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            addressParser.verify(() -> AddressParser.getLegacy(networkParametersMock), atLeast(1));
            verify(addressParserMock).parseAddress("bech32");
        }
    }

    //Sapient generated method id: ${4624a3c5-e89b-39c5-af96-e2d3e36544b8}, hash: 44BE6985E873E521AD07E63F47DC1569
    @Test()
    public void fromBech321ThrowsNullPointerException() throws AddressFormatException {
        /*
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

    //Sapient generated method id: ${55ddd006-41f1-399a-9286-454bb4f2e146}, hash: 3B20A1A643D831137D39FF4F9C955648
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

    //Sapient generated method id: ${e4db5260-2723-3d7e-afb8-a71fca2eb3c1}, hash: 651812F1A379C6F60E2B75533D4F5509
    @Test()
    public void fromBechDataWhenDefaultBranchThrowsAddressFormatException() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn((short) 20).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException addressFormatException = new AddressFormatException("Invalid script version: 20");
        thrown.expect(AddressFormatException.class);
        thrown.expectMessage(addressFormatException.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${cccd7257-3b24-3280-874b-167ce1f69e7f}, hash: 15EF563DDB96128F4A803D9B5BBCF954
    @Test()
    public void fromBechDataWhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn((short) 0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 48");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${b64f0841-4ef5-3f4a-8c0c-710c549e6c98}, hash: DF28FA6FE442380C256244862D374E0A
    @Test()
    public void fromBechDataWhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (bechData.bytes().length < 1) : false
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn((short) 0).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${ab2442ff-aa2a-3ddb-b100-2f639a4f858b}, hash: FC2034B008E1F5884A9DCFE707CF75E5
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
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(bechDataMock).bytes();
        doReturn((short) 1).when(bechDataMock).witnessVersion();
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
        doReturn(byteArray2).when(bechDataMock).witnessProgram();
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 1: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        SegwitAddress.fromBechData(networkMock, bechDataMock);
        //Assert statement(s)
        verify(bechDataMock).bytes();
        verify(bechDataMock).witnessVersion();
        verify(bechDataMock).witnessProgram();
    }

    //Sapient generated method id: ${a4895aff-f020-3d9b-a1d3-d98eb12570c5}, hash: 87A87EF2CF151050B5C7142F247B108D
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
        doReturn((short) 1).when(bechDataMock).witnessVersion();
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

    //Sapient generated method id: ${646d8346-e90e-3bae-aa6b-e6b21d860fda}, hash: A772B29CD0BFDDCD7F5F3F8A1BCB1987
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
        doReturn((short) 0).when(bechDataMock).witnessVersion();
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

    //Sapient generated method id: ${229fca9f-f27a-32f4-8443-738583bfe113}, hash: 0C6F57ED37F9336F021AFB4EC31E8866
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

    //Sapient generated method id: ${be53216e-b382-3cec-9cf9-9cf1f2676fb2}, hash: 7E6A8BE978B380046578AB84D68C48A0
    @Test()
    public void fromHash1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 48");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47};
        //Act Statement(s)
        SegwitAddress.fromHash(networkMock, byteArray);
    }

    //Sapient generated method id: ${8e5f93b7-211d-30a9-8800-c94090c55827}, hash: 5487103801449FC7BD3C397572A9F389
    @Test()
    public void fromHash1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromHash(networkMock, byteArray);
    }

    //Sapient generated method id: ${3bc3ab4d-e0e2-35ca-9969-8b098022d230}, hash: C5CCFAF081C2E78FB37C010DBAE8E2E0
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromHash((Network) BitcoinNetwork.SIGNET, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7320f23b-25f5-32e0-8740-7fe52e517f9e}, hash: 632B1D57DF73A07F078CCDA6AEEE2548
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromHash((Network) BitcoinNetwork.MAINNET, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f846c9a2-4b4e-3ee7-a5eb-056c2d3f3c7c}, hash: B4A28C01DAC73DD79EB8D116DBAA8A7F
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

    //Sapient generated method id: ${61b6ba48-d861-3795-85e8-f30e6103f85e}, hash: 14846F91C973E806879BE49A9B15B9B9
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatException() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException addressFormatException = new AddressFormatException("Invalid script version: 28");
        thrown.expect(AddressFormatException.class);
        thrown.expectMessage(addressFormatException.getMessage());
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock, 28, byteArray);
    }

    //Sapient generated method id: ${1a612cec-2b1a-342b-9571-97ae0640697a}, hash: A5B03F8051E371C022484A4F62979322
    @Test()
    public void fromProgram1WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length: 48");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock, 0, byteArray);
    }

    //Sapient generated method id: ${3d6c00a3-7826-36cf-831b-0cf40b31b46f}, hash: 23B209597079EF69C4910FB2E9496182
    @Test()
    public void fromProgram1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() {
        /* Branches:
         * (branch expression (line 151)) : false  #  inside <init> method
         * (branch expression (line 153)) : false  #  inside <init> method
         * (branch expression (line 159)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Invalid length for address version 0: 2");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        SegwitAddress.fromProgram(networkMock, 0, byteArray);
    }

    //Sapient generated method id: ${e7e8f18e-3295-39cb-8049-536d53368f52}, hash: FE1839E2E9C842D1A09D89F4D86589F1
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

    //Sapient generated method id: ${9d32af23-87ce-3045-a8b5-2cef898e457f}, hash: C7CC8D0932D6C11296E1083EA8D9DF00
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.SIGNET, 0, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${24024f3f-9f43-31e4-8cab-e69e3caca04d}, hash: CC66885A56DCAFA57122EBF0603165EF
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromProgram((Network) BitcoinNetwork.TESTNET, 0, byteArray);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0f8677e5-1136-39bc-a834-9dd78dde00fb}, hash: 8A82DF32FF2E071416CA112A1A0E795E
    @Test()
    public void fromKeyTest() {
        //Arrange Statement(s)
        doReturn(networkMock).when(paramsMock).network();
        ECKey keyMock = mock(ECKey.class);
        doReturn(segwitAddressMock).when(keyMock).toAddress(ScriptType.P2WPKH, networkMock);
        //Act Statement(s)
        SegwitAddress result = SegwitAddress.fromKey(paramsMock, keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(segwitAddressMock));
        verify(paramsMock).network();
        verify(keyMock).toAddress(ScriptType.P2WPKH, networkMock);
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}, hash: B1714A9A798D70AFC12D1529BA03BD30
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        //Act Statement(s)
        Network result = target.network();
        //Assert statement(s)
        assertThat(result, equalTo(BitcoinNetwork.TESTNET));
    }

    //Sapient generated method id: ${47e11a0d-795c-3ba1-9d69-39455db34464}, hash: 76031AF17EBF8B5FEDCDE96EE6B27921
    @Test()
    public void toBech32WhenWitnessVersionEquals0() {
        /* Branches:
         * (witnessVersion == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "tb", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
            SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
            //Act Statement(s)
            String result = target.toBech32();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "tb", bech32Bech32BytesMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8e32509e-0c3c-3b2a-bd85-8f74e3effe3d}, hash: 6B0F29ABE4AD0A51D3B6D86137F7B0C5
    @Ignore()
    @Test()
    public void toBech32WhenWitnessVersionNotEquals0() {
        /* Branches:
         * (witnessVersion == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
            byte[] byteArray = new byte[]{};
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32M, "tb", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
            SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.MAINNET, 0, byteArray);
            //Act Statement(s)
            String result = target.toBech32();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofSegwit((short) 0, byteArray), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32M, "tb", bech32Bech32BytesMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}, hash: 384BB99FE85E4EE3852561B83E0A9E10
    @Ignore()
    @Test()
    public void compareToTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: SEGWIT_ADDRESS_COMPARATOR
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        SegwitAddress target = SegwitAddress.fromProgram(BitcoinNetwork.SIGNET, 0, byteArray);
        Address addressMock = mock(Address.class);
        //Act Statement(s)
        int result = target.compareTo(addressMock);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }
}
