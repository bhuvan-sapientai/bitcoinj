package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.bitcoinj.crypto.BIP38PrivateKey.BadPassphraseException;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;
import org.bitcoinj.base.ScriptType;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bitcoinj.base.Base58;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bitcoinj.core.NetworkParameters;

import javax.crypto.spec.SecretKeySpec;

import org.bitcoinj.base.Address;

import javax.crypto.Cipher;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class BIP38PrivateKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class, "decrypt_address1");

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECKey eCKeyMock2 = mock(ECKey.class);

    private final Network networkMock = mock(Network.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${83728dd4-a2e2-3e7f-a038-ed2e41b9581d}, hash: 61320A34603F4F8B6E5D097E287F148E
    @Ignore()
    @Test()
    public void fromBase58WhenVersionNotEquals1ThrowsAddressFormatExceptionInvalidPrefix() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "testnet");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("cNhdzjJ1GjJzW9Jz5z9QJ6XZvWjJz")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 8");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "cNhdzjJ1GjJzW9Jz5z9QJ6XZvWjJz");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("cNhdzjJ1GjJzW9Jz5z9QJ6XZvWjJz"), atLeast(1));
        }
    }

    //Sapient generated method id: ${73e33351-5658-3751-ba89-3e4e73f20e4c}, hash: C83FAC72BA4AB5CC82C638FE3163D060
    @Ignore()
    @Test()
    public void fromBase58WhenBytesLengthNotEquals38ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "testnet");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("cTJZb3")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Wrong number of bytes: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "cTJZb3");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("cTJZb3"), atLeast(1));
        }
    }

    //Sapient generated method id: ${02506b6c-e853-3f99-9d29-03669221c0d7}, hash: 7EA6F3F6D46B8BDF532001D3DEB9CF5A
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd1NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bit 0x01 reserved for future use.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${1b4de6b2-67d7-32d1-8353-d98dbdb2b359}, hash: 42E63BEC6023D51E7A69B4CB53D360BE
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd2NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "testnet");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("cNhdUJ5Kf6f9JyvL5GZJLJfZJzJj1jZz5J8Q9z2J3JQv")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bit 0x02 reserved for future use.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "cNhdUJ5Kf6f9JyvL5GZJLJfZJzJj1jZz5J8Q9z2J3JQv");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("cNhdUJ5Kf6f9JyvL5GZJLJfZJzJj1jZz5J8Q9z2J3JQv"), atLeast(1));
        }
    }

    //Sapient generated method id: ${ea3e0a91-c083-337f-8240-2ef00fcc4def}, hash: 1C95096E71DFC60778CE053554B6F788
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd8NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bit 0x08 reserved for future use.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${d7bd1264-de6b-376e-a826-5d410914e98c}, hash: BF61E92E56ED9FDC9DC70B965E843FEF
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd16NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bit 0x10 reserved for future use.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${50491cf4-d3fa-3c36-825e-efcace443007}, hash: 2D3E1D90055F431DD387CB31A0DDDB7E
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd192NotEquals192ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : true
         * ((bytes[1] & 0xc0) != 0xc0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("2NEpo7TZRhJHJ8LfZ9eJL7B7qo4Zz7WjyeT")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bits 0x40 and 0x80 must be set for non-EC-multiplied keys.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "2NEpo7TZRhJHJ8LfZ9eJL7B7qo4Zz7WjyeT");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("2NEpo7TZRhJHJ8LfZ9eJL7B7qo4Zz7WjyeT"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f26013fa-89fa-35ab-9347-c099da16ee58}, hash: 1CC5448742AAFAC0CA66C7DAAFEEBC88
    @Ignore()
    @Test()
    public void fromBase58WhenByte0NotEquals67ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : false
         * (byte0 == 0x43) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("3vQB7B6MrGQZaxCuFg4oh")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Second byte must by 0x42 or 0x43.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "3vQB7B6MrGQZaxCuFg4oh");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("3vQB7B6MrGQZaxCuFg4oh"), atLeast(1));
        }
    }

    //Sapient generated method id: ${4451c2c0-4fe0-36a0-be7c-0f2dd9fff16b}, hash: FF1F9080D3B11B121372A3D81CF9A0C3
    @Ignore()
    @Test()
    public void fromBase58WhenHasLotAndSequenceThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : true
         * ((bytes[1] & 0xc0) != 0xc0) : false
         * (hasLotAndSequence) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "testnet");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("cNhdv5g")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Non-EC-multiplied keys cannot have lot/sequence.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "cNhdv5g");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("cNhdv5g"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3424833-8035-39b8-8e5a-df166c2100e4}, hash: EE26370C40979B1CC21822E5BC7961D5
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd192NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : false
         * (byte0 == 0x43) : true
         * ((bytes[1] & 0xc0) != 0x00) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "value");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("value")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bits 0x40 and 0x80 must be cleared for EC-multiplied keys.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "value");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("value"), atLeast(1));
        }
    }

    //Sapient generated method id: ${b500449b-926d-3292-bd59-bdb554003351}, hash: 12670D4BEFE0A7F6F11E5B97547FC204
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd192Equals0() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : false
         * (byte0 == 0x43) : true
         * ((bytes[1] & 0xc0) != 0x00) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("2NEpo7TZRRrLZSi2pmh5zYgGZJGJYiUy7J")).thenReturn(byteArray);
            //Act Statement(s)
            BIP38PrivateKey result = BIP38PrivateKey.fromBase58(networkMock, "2NEpo7TZRRrLZSi2pmh5zYgGZJGJYiUy7J");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("2NEpo7TZRRrLZSi2pmh5zYgGZJGJYiUy7J"), atLeast(1));
        }
    }

    //Sapient generated method id: ${3d89f2cd-4a6d-3148-8610-912d5c75c7a1}, hash: E0F809804E57061398EC2CE77C444C99
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd192Equals192AndNotHasLotAndSequence() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : false
         * ((bytes[1] & 0x20) != 0) : false
         * ((bytes[1] & 0x01) != 0) : false
         * ((bytes[1] & 0x02) != 0) : false
         * ((bytes[1] & 0x08) != 0) : false
         * ((bytes[1] & 0x10) != 0) : false
         * (byte0 == 0x42) : true
         * ((bytes[1] & 0xc0) != 0xc0) : false
         * (hasLotAndSequence) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("2CzZgjZzgjzCGKX6eXJGdJqJtKJvJ")).thenReturn(byteArray);
            //Act Statement(s)
            BIP38PrivateKey result = BIP38PrivateKey.fromBase58(networkMock, "2CzZgjZzgjzCGKX6eXJGdJqJtKJvJ");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("2CzZgjZzgjzCGKX6eXJGdJqJtKJvJ"), atLeast(1));
        }
    }

    //Sapient generated method id: ${8b6fde7b-ab0a-316d-a770-4711036b5ad8}, hash: 3E65B0CE16C227BE2155C5D72006B065
    @Test()
    public void fromBase581Test() throws AddressFormatException {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        BIP38PrivateKey bIP38PrivateKeyMock = mock(BIP38PrivateKey.class);
        try (MockedStatic<BIP38PrivateKey> bIP38PrivateKey = mockStatic(BIP38PrivateKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            bIP38PrivateKey.when(() -> BIP38PrivateKey.fromBase58(networkMock, "base58")).thenReturn(bIP38PrivateKeyMock);
            //Act Statement(s)
            BIP38PrivateKey result = BIP38PrivateKey.fromBase58(paramsMock, "base58");
            //Assert statement(s)
            assertThat(result, equalTo(bIP38PrivateKeyMock));
            verify(paramsMock, atLeast(1)).network();
            bIP38PrivateKey.verify(() -> BIP38PrivateKey.fromBase58(networkMock, "base58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}, hash: 8C71EA5E9E2D91AA6D73C3FB4757E2DB
    @Ignore()
    @Test()
    public void toBase58Test() throws AddressFormatException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            base58.when(() -> Base58.encodeChecked(1, (byte[]) null)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "3vQB7B6MrGQZaxCuFg4oh");
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.encodeChecked(1, (byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${3a01d180-7c05-3471-8a45-84968628803b}, hash: 42BA90B650FEF8014803DA69ACC8CE30
    @Ignore()
    @Test()
    public void decryptWhenHashBytesLengthNotEquals40ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("CD");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${e819e8a9-22c3-30bd-8231-cc5495e30e8e}, hash: 0B28A18B28D334208E12BFB080085504
    @Ignore()
    @Test()
    public void decryptWhenSaltLengthNotEquals12ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("BD");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
        }
    }

    //Sapient generated method id: ${294d8d72-c645-35c6-bd98-3b9543c5a78c}, hash: 7B466C8202F51F79A0A189F887957A5E
    @Ignore()
    @Test()
    public void decryptWhenDecrypted2LengthNotEquals16ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("BC");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${76a9ebc5-f2b2-3566-b306-9bfde7b9a7f4}, hash: B04304D9B15D05E0AAC3AEC6EB088385
    @Ignore()
    @Test()
    public void decryptWhenDecrypted1LengthNotEquals16ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("BD");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${75d8a9d0-9bad-3aa7-9fda-5a2a7546ef45}, hash: D24BCA8C07C0036F284D9F174AFC6136
    @Ignore()
    @Test()
    public void decryptWhenSeedLengthNotEquals24ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("BC");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d1d1dfa-be52-37c8-802a-34446c1ca8b4}, hash: F0B91E65BED8F4B8FB5CF5FDE5A85DE4
    @Ignore()
    @Test()
    public void decryptWhenPassFactorSignumLessThan0ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : true  #  inside decryptEC method
         * (passFactor.signum() >= 0) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
        }
    }

    //Sapient generated method id: ${0b68acdf-3947-37d6-88a9-0dbd77c72a08}, hash: 6B40E3D26B8C32F9551D486530EFF0AE
    @Ignore()
    @Test()
    public void decryptWhenSeedFactorSignumLessThan0ThrowsIllegalStateException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : true  #  inside decryptEC method
         * (passFactor.signum() >= 0) : true  #  inside decryptEC method
         * (seedFactor.signum() >= 0) : false  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
        }
    }

    //Sapient generated method id: ${f2a2f7aa-5c7e-3b08-8e87-d8dd7812dcd9}, hash: CE134C36A98134964E2DE5F78AA0EB62
    @Ignore()
    @Test()
    public void decryptWhenArraysNotEqualsActualAddressHashAddressHashThrowsBIP38PrivateKeyBadPassphraseException() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : true  #  inside decryptEC method
         * (passFactor.signum() >= 0) : true  #  inside decryptEC method
         * (seedFactor.signum() >= 0) : true  #  inside decryptEC method
         * (!Arrays.equals(actualAddressHash, addressHash)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true)).thenReturn(eCKeyMock2);
            doReturn(addressMock).when(eCKeyMock2).toAddress(ScriptType.P2PKH, networkMock);
            byte[] byteArray14 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray14)).thenReturn(sha256HashMock);
            byte[] byteArray15 = new byte[]{};
            doReturn(byteArray15).when(sha256HashMock).getBytes();
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(BIP38PrivateKey.BadPassphraseException.class);
            //Act Statement(s)
            target.decrypt("BC");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true), atLeast(1));
            verify(eCKeyMock2, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray14), atLeast(1));
            verify(sha256HashMock, atLeast(1)).getBytes();
        }
    }

    //Sapient generated method id: ${9915c139-0a6f-3084-92a8-e77a94bf7443}, hash: 546C57B9A0785659F08E959D1A026FF7
    @Ignore()
    @Test()
    public void decryptWhenArraysEqualsActualAddressHashAddressHash() throws BadPassphraseException, AddressFormatException, GeneralSecurityException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : true  #  inside decryptEC method
         * (passFactor.signum() >= 0) : true  #  inside decryptEC method
         * (seedFactor.signum() >= 0) : true  #  inside decryptEC method
         * (!Arrays.equals(actualAddressHash, addressHash)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKeyMock).thenReturn(eCKeyMock2);
            doReturn(addressMock).when(eCKeyMock2).toAddress(ScriptType.P2PKH, networkMock);
            byte[] byteArray14 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray14)).thenReturn(sha256HashMock);
            byte[] byteArray15 = new byte[]{};
            doReturn(byteArray15).when(sha256HashMock).getBytes();
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            //Act Statement(s)
            ECKey result = target.decrypt("passphrase1");
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock2));
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(2));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            verify(eCKeyMock2, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray14), atLeast(1));
            verify(sha256HashMock, atLeast(1)).getBytes();
        }
    }

    //Sapient generated method id: ${062ab01c-ed32-3a39-a3aa-46641f8c88e2}, hash: 7553F0DF47EECEBC69690C5F9D2F23E5
    @Ignore()
    @Test()
    public void decryptWhenCaughtGeneralSecurityExceptionThrowsRuntimeException() throws BadPassphraseException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, AddressFormatException, NoSuchPaddingException, NoSuchAlgorithmException {
        /* Branches:
         * (ecMultiply) : true
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hasLotAndSequence) : true  #  inside decryptEC method
         * (hashBytes.length == 40) : true  #  inside decryptEC method
         * (salt.length == 12) : true  #  inside decryptEC method
         * (decrypted2.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (decrypted1.length == 16) : true  #  inside decryptEC method
         * (i < 16) : true  #  inside decryptEC method
         * (seed.length == 24) : true  #  inside decryptEC method
         * (passFactor.signum() >= 0) : true  #  inside decryptEC method
         * (seedFactor.signum() >= 0) : true  #  inside decryptEC method
         * (catch-exception (GeneralSecurityException)) : true  #  inside decryptEC method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Cipher cipherMock = mock(Cipher.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Cipher> cipher = mockStatic(Cipher.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            cipher.when(() -> Cipher.getInstance("AES/ECB/NoPadding")).thenReturn(cipherMock);
            doNothing().when(cipherMock).init(eq(2), (SecretKeySpec) any());
            byte[] byteArray8 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray9 = new byte[]{};
            doReturn(byteArray8).when(cipherMock).doFinal(byteArray9);
            byte[] byteArray10 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            byte[] byteArray11 = new byte[]{};
            doReturn(byteArray10).when(cipherMock).doFinal(byteArray11);
            byte[] byteArray12 = new byte[]{};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            byte[] byteArray14 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray15 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray10, byteArray15)).thenReturn(byteArray14);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true)).thenReturn(eCKeyMock2);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "");
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(GeneralSecurityException.class)));
            //Act Statement(s)
            target.decrypt("BC");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            cipher.verify(() -> Cipher.getInstance("AES/ECB/NoPadding"), atLeast(1));
            verify(cipherMock, atLeast(1)).init(eq(2), (SecretKeySpec) any());
            verify(cipherMock, atLeast(1)).doFinal(byteArray9);
            verify(cipherMock, atLeast(1)).doFinal(byteArray11);
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray10, byteArray15), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 101ABF031FDE3D79740B888196D4EDD9
    @Ignore()
    @Test()
    public void toStringTest() throws AddressFormatException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            base58.when(() -> Base58.encodeChecked(1, (byte[]) null)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "3vQB7B6MrGQZaxCuFg4oh");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.encodeChecked(1, (byte[]) null), atLeast(1));
        }
    }
}
