package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.bitcoinj.crypto.BIP38PrivateKey.BadPassphraseException;

import java.security.InvalidKeyException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;
import org.bouncycastle.crypto.generators.SCrypt;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import javax.crypto.Cipher;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.Base58;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;

import java.security.GeneralSecurityException;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.base.Address;

public class BIP38PrivateKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final Network networkMock = mock(Network.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${83728dd4-a2e2-3e7f-a038-ed2e41b9581d}
    @Ignore()
    @Test()
    public void fromBase58WhenVersionNotEquals1ThrowsAddressFormatExceptionInvalidPrefix() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${73e33351-5658-3751-ba89-3e4e73f20e4c}
    @Ignore()
    @Test()
    public void fromBase58WhenBytesLengthNotEquals38ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${02506b6c-e853-3f99-9d29-03669221c0d7}
    @Ignore()
    @Test()
    public void fromBase58When1IndexOfBytesAnd1NotEquals0ThrowsAddressFormatException() throws AddressFormatException {
        /* Branches:
         * (version != 0x01) : false
         * (bytes.length != 38) : false
         * ((bytes[1] & 0x04) != 0) : true
         * ((bytes[1] & 0x20) != 0) : true
         * ((bytes[1] & 0x01) != 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${1b4de6b2-67d7-32d1-8353-d98dbdb2b359}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${ea3e0a91-c083-337f-8240-2ef00fcc4def}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${d7bd1264-de6b-376e-a826-5d410914e98c}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${50491cf4-d3fa-3c36-825e-efcace443007}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f26013fa-89fa-35ab-9347-c099da16ee58}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${4451c2c0-4fe0-36a0-be7c-0f2dd9fff16b}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3424833-8035-39b8-8e5a-df166c2100e4}
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
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bits 0x40 and 0x80 must be cleared for EC-multiplied keys.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${b500449b-926d-3292-bd59-bdb554003351}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${3d89f2cd-4a6d-3148-8610-912d5c75c7a1}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Mismatched version number: 0");
            thrown.expect(AddressFormatException.InvalidPrefix.class);
            thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "A");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${8b6fde7b-ab0a-316d-a770-4711036b5ad8}
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

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}
    @Ignore()
    @Test()
    public void toBase58Test() throws AddressFormatException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            base58.when(() -> Base58.encodeChecked(1, (byte[]) null)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(1, (byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${9915c139-0a6f-3084-92a8-e77a94bf7443}
    @Ignore()
    @Test()
    public void decryptWhenArraysEqualsActualAddressHashAddressHash() throws BadPassphraseException, AddressFormatException {
        /* Branches:
         * (ecMultiply) : false
         * (i < 32) : true  #  inside decryptNoEC method
         * (!Arrays.equals(actualAddressHash, addressHash)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
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
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${3a01d180-7c05-3471-8a45-84968628803b}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("HG");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${e819e8a9-22c3-30bd-8231-cc5495e30e8e}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("GH");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${294d8d72-c645-35c6-bd98-3b9543c5a78c}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true)).thenReturn(eCKeyMock);
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(eCKeyMock).getPubKey();
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray7 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray7, byteArray4)).thenReturn(byteArray6);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("GH");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${76a9ebc5-f2b2-3566-b306-9bfde7b9a7f4}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 16384, 8, 8, 32)).thenReturn(byteArray2);
            byte[] byteArray5 = new byte[]{};
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray2, byteArray6)).thenReturn(byteArray5);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray7 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray5)).thenReturn(byteArray7);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray7)).thenReturn(new BigInteger("0"));
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKeyMock);
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(eCKeyMock).getPubKey();
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray10, byteArray6)).thenReturn(byteArray9);
            byte[] byteArray11 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray8, byteArray9, 1024, 1, 1, 64)).thenReturn(byteArray11);
            byte[] byteArray12 = new byte[]{};
            byte[] byteArray13 = new byte[]{};
            byte[] byteArray14 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray13, byteArray14)).thenReturn(byteArray12);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 16384, 8, 8, 32), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray2, byteArray6), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray5), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray7), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray10, byteArray6), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray8, byteArray9, 1024, 1, 1, 64), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray13, byteArray14), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${75d8a9d0-9bad-3aa7-9fda-5a2a7546ef45}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
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
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("GH");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d1d1dfa-be52-37c8-802a-34446c1ca8b4}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
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
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${0b68acdf-3947-37d6-88a9-0dbd77c72a08}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 10, (byte) 23, (byte) -26, (byte) -127, (byte) 123, (byte) 69, (byte) -29, (byte) -99, (byte) 2, (byte) 21, (byte) 86, (byte) -50, (byte) -28, (byte) -124, (byte) 3, (byte) 100, (byte) -110, (byte) -121, (byte) -18, (byte) 43, (byte) 118, (byte) -52, (byte) 94, (byte) 49, (byte) 79, (byte) -43, (byte) 23, (byte) 50, (byte) 123, (byte) -120, (byte) -98, (byte) 125};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
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
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("passphrase1");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${f2a2f7aa-5c7e-3b08-8e87-d8dd7812dcd9}
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
        Address addressMock = mock(Address.class, "decrypt_address1");
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray3 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray3, (byte[]) null, 16384, 8, 8, 64)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            eCKey.when(() -> ECKey.fromPrivate(byteArray4, false)).thenReturn(eCKeyMock);
            doReturn(addressMock).when(eCKeyMock).toAddress(ScriptType.P2PKH, (Network) null);
            byte[] byteArray5 = new byte[]{(byte) 111, (byte) 114, (byte) 103, (byte) 46, (byte) 109, (byte) 111, (byte) 99, (byte) 107, (byte) 105, (byte) 116, (byte) 111, (byte) 46, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 103, (byte) 101, (byte) 110, (byte) 46, (byte) 65, (byte) 100, (byte) 100, (byte) 114, (byte) 101, (byte) 115, (byte) 115, (byte) 36, (byte) 77, (byte) 111, (byte) 99, (byte) 107, (byte) 105, (byte) 116, (byte) 111, (byte) 77, (byte) 111, (byte) 99, (byte) 107, (byte) 36, (byte) 86, (byte) 82, (byte) 122, (byte) 52, (byte) 105, (byte) 88, (byte) 77, (byte) 71, (byte) 64, (byte) 53, (byte) 51, (byte) 56, (byte) 49, (byte) 51, (byte) 52, (byte) 51, (byte) 57};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray5)).thenReturn(sha256HashMock);
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock).getBytes();
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "A");
            thrown.expect(BIP38PrivateKey.BadPassphraseException.class);
            //Act Statement(s)
            target.decrypt("B");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, (byte[]) null, 16384, 8, 8, 64), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(byteArray4, false), atLeast(1));
            verify(eCKeyMock).toAddress(ScriptType.P2PKH, (Network) null);
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray5), atLeast(1));
            verify(sha256HashMock).getBytes();
        }
    }

    //Sapient generated method id: ${062ab01c-ed32-3a39-a3aa-46641f8c88e2}
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
        ECKey eCKeyMock2 = mock(ECKey.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Cipher> cipher = mockStatic(Cipher.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
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
            Cipher cipher2 = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.when(() -> Cipher.getInstance("AES/ECB/NoPadding")).thenReturn(cipher2);
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray10)).thenReturn(byteArray8);
            byte[] byteArray11 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23};
            byte[] byteArray12 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray13 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray12, byteArray13)).thenReturn(byteArray11);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true)).thenReturn(eCKeyMock2);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(GeneralSecurityException.class));
            //Act Statement(s)
            target.decrypt("GH");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("49077681614212739786150305969899946917523563121946014925060302183826805099238"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray7, byteArray4), atLeast(1));
            cipher.verify(() -> Cipher.getInstance("AES/ECB/NoPadding"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray10), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray12, byteArray13), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("9613300040244241813015825405042226619880518057925427324612100285473162286655"), true), atLeast(1));
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
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("AB")).thenReturn(byteArray);
            base58.when(() -> Base58.encodeChecked(1, (byte[]) null)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "AB");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.decodeChecked("AB"), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(1, (byte[]) null), atLeast(1));
        }
    }
}
