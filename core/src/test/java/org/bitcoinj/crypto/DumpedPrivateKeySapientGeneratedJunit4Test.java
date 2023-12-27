package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.bitcoinj.base.exceptions.AddressFormatException.WrongNetwork;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.util.Set;

import org.bitcoinj.base.Base58;

import java.util.HashSet;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.Networks;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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

public class DumpedPrivateKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final DumpedPrivateKey dumpedPrivateKeyMock = mock(DumpedPrivateKey.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${26136c5c-c65d-3a7d-8830-42141a37ced6}
    @Test()
    public void fromBase58WhenVersionNotEqualsParamsGetDumpedPrivateKeyHeaderThrowsAddressFormatExceptionWrongNetwork() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : false
         * (version == params.getDumpedPrivateKeyHeader()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getDumpedPrivateKeyHeader();
            thrown.expect(AddressFormatException.WrongNetwork.class);
            //Act Statement(s)
            DumpedPrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
        }
    }

    //Sapient generated method id: ${7e09a9e8-c8bf-35bf-a350-e9526dfcae8c}
    @Ignore()
    @Test()
    public void fromBase58WhenVersionNotEqualsPGetDumpedPrivateKeyHeaderThrowsAddressFormatExceptionInvalidPrefix() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : true
         * (for-each(Networks.get())) : true
         * (version == p.getDumpedPrivateKeyHeader()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Networks> networks = mockStatic(Networks.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            Set<NetworkParameters> networkParametersSet = new HashSet<>();
            networkParametersSet.add(networkParametersMock);
            networks.when(() -> Networks.get()).thenReturn(networkParametersSet);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            doReturn(networkMock).when(networkParametersMock).network();
            Network network = null;
            //Act Statement(s)
            DumpedPrivateKey result = DumpedPrivateKey.fromBase58(network, "A");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networks.verify(() -> Networks.get(), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
            verify(networkParametersMock).network();
        }
    }

    //Sapient generated method id: ${ffa61a27-94f2-3c92-b2f9-4f488d4526ce}
    @Ignore()
    @Test()
    public void fromBase58WhenDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : false
         * (version == params.getDumpedPrivateKeyHeader()) : true
         * (branch expression (line 87)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Wrong number of bytes for a private key (32 or 33): 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            DumpedPrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
        }
    }

    //Sapient generated method id: ${dac65800-d6b1-3668-b6a2-79c54ec6f30a}
    @Ignore()
    @Test()
    public void fromBase58WhenDefaultBranch() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : false
         * (version == params.getDumpedPrivateKeyHeader()) : true
         * (branch expression (line 87)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            //Act Statement(s)
            DumpedPrivateKey result = DumpedPrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
        }
    }

    //Sapient generated method id: ${300529ff-f3e9-35c4-9ee9-36efe8815233}
    @Ignore()
    @Test()
    public void fromBase58WhenVersionEqualsPGetDumpedPrivateKeyHeaderAndDefaultBranchThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : true
         * (for-each(Networks.get())) : true
         * (version == p.getDumpedPrivateKeyHeader()) : true
         * (branch expression (line 87)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Networks> networks = mockStatic(Networks.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            Set<NetworkParameters> networkParametersSet = new HashSet<>();
            networkParametersSet.add(networkParametersMock);
            networks.when(() -> Networks.get()).thenReturn(networkParametersSet);
            doReturn(1).when(networkParametersMock).getDumpedPrivateKeyHeader();
            doReturn(networkMock).when(networkParametersMock).network();
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Wrong number of bytes for a private key (32 or 33): 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            Network network = null;
            //Act Statement(s)
            DumpedPrivateKey.fromBase58(network, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networks.verify(() -> Networks.get(), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
            verify(networkParametersMock).network();
        }
    }

    //Sapient generated method id: ${383d88b9-8c60-3753-a6ca-6a76e8547478}
    @Ignore()
    @Test()
    public void fromBase58WhenVersionEqualsPGetDumpedPrivateKeyHeaderAndDefaultBranch() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (network == null) : true
         * (for-each(Networks.get())) : true
         * (version == p.getDumpedPrivateKeyHeader()) : true
         * (branch expression (line 87)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Networks> networks = mockStatic(Networks.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            Set<NetworkParameters> networkParametersSet = new HashSet<>();
            networkParametersSet.add(networkParametersMock);
            networks.when(() -> Networks.get()).thenReturn(networkParametersSet);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            doReturn(networkMock).when(networkParametersMock).network();
            Network network = null;
            //Act Statement(s)
            DumpedPrivateKey result = DumpedPrivateKey.fromBase58(network, "A");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            networks.verify(() -> Networks.get(), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
            verify(networkParametersMock).network();
        }
    }

    //Sapient generated method id: ${7db4cc0f-2240-39ef-8ec1-ef3bf4e46c71}
    @Test()
    public void fromBase581WhenParamsIsNull() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (params == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DumpedPrivateKey> dumpedPrivateKey = mockStatic(DumpedPrivateKey.class, CALLS_REAL_METHODS)) {
            dumpedPrivateKey.when(() -> DumpedPrivateKey.fromBase58((Network) null, "base58")).thenReturn(dumpedPrivateKeyMock);
            NetworkParameters networkParameters = null;
            //Act Statement(s)
            DumpedPrivateKey result = DumpedPrivateKey.fromBase58(networkParameters, "base58");
            //Assert statement(s)
            assertThat(result, equalTo(dumpedPrivateKeyMock));
            dumpedPrivateKey.verify(() -> DumpedPrivateKey.fromBase58((Network) null, "base58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f6c172d6-f6c4-3102-9bf3-d914858795c8}
    @Test()
    public void fromBase581WhenParamsIsNotNull() throws AddressFormatException, WrongNetwork {
        /* Branches:
         * (params == null) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        try (MockedStatic<DumpedPrivateKey> dumpedPrivateKey = mockStatic(DumpedPrivateKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            dumpedPrivateKey.when(() -> DumpedPrivateKey.fromBase58(networkMock, "base58")).thenReturn(dumpedPrivateKeyMock);
            //Act Statement(s)
            DumpedPrivateKey result = DumpedPrivateKey.fromBase58(paramsMock, "base58");
            //Assert statement(s)
            assertThat(result, equalTo(dumpedPrivateKeyMock));
            verify(paramsMock, atLeast(1)).network();
            dumpedPrivateKey.verify(() -> DumpedPrivateKey.fromBase58(networkMock, "base58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}
    @Ignore()
    @Test()
    public void toBase58Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.encodeChecked(0, byteArray)).thenReturn("return_of_encodeChecked1");
            DumpedPrivateKey target = new DumpedPrivateKey(networkMock, byteArray, false);
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
            base58.verify(() -> Base58.encodeChecked(0, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}
    @Ignore()
    @Test()
    public void getKeyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.fromPrivate(byteArray, false)).thenReturn(eCKeyMock);
            byte[] byteArray2 = new byte[]{};
            DumpedPrivateKey target = spy(new DumpedPrivateKey(networkMock, byteArray2, false));
            doReturn(false).when(target).isPubKeyCompressed();
            //Act Statement(s)
            ECKey result = target.getKey();
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            eCKey.verify(() -> ECKey.fromPrivate(byteArray, false), atLeast(1));
            verify(target).isPubKeyCompressed();
        }
    }

    //Sapient generated method id: ${f6f91d22-38a0-3b18-941c-9fb0a5c7d7d7}
    @Ignore()
    @Test()
    public void isPubKeyCompressedWhen32IndexOfBytesEquals1() {
        /* Branches:
         * (bytes.length == 33) : true
         * (bytes[32] == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            DumpedPrivateKey target = new DumpedPrivateKey(networkMock, byteArray, false);
            //Act Statement(s)
            boolean result = target.isPubKeyCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${3eaafa4b-9675-3dcf-9ef0-5452df8e13df}
    @Ignore()
    @Test()
    public void isPubKeyCompressedWhen32IndexOfBytesNotEquals1() {
        /* Branches:
         * (bytes.length == 33) : true
         * (bytes[32] == 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            DumpedPrivateKey target = new DumpedPrivateKey(networkMock, byteArray, false);
            //Act Statement(s)
            boolean result = target.isPubKeyCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
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
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getDumpedPrivateKeyHeader();
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.encodeChecked(0, byteArray)).thenReturn("return_of_encodeChecked1");
            DumpedPrivateKey target = new DumpedPrivateKey(networkMock, byteArray, false);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDumpedPrivateKeyHeader();
            base58.verify(() -> Base58.encodeChecked(0, byteArray), atLeast(1));
        }
    }
}
