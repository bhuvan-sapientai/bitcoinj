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
import org.bouncycastle.crypto.generators.SCrypt;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.base.Base58;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.base.Address;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

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
import org.mockito.stubbing.Answer;

public class BIP38PrivateKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECKey eCKeyMock2 = mock(ECKey.class);

    private final Network networkMock = mock(Network.class, "MAINNET");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Address addressMock = mock(Address.class, "decrypt_address1");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    //Sapient generated method id: ${73e33351-5658-3751-ba89-3e4e73f20e4c}
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
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("5JrLdP")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Wrong number of bytes: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "5JrLdP");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("5JrLdP"), atLeast(1));
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("5JrLQqKm5KQ7bKz8yQFJGzKqJnqzgZwvJ7zv6Jt5Jzv5JZj5zL")).thenReturn(byteArray);
            AddressFormatException addressFormatException = new AddressFormatException("Bit 0x01 reserved for future use.");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "5JrLQqKm5KQ7bKz8yQFJGzKqJnqzgZwvJ7zv6Jt5Jzv5JZj5zL");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("5JrLQqKm5KQ7bKz8yQFJGzKqJnqzgZwvJ7zv6Jt5Jzv5JZj5zL"), atLeast(1));
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
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("5JrLjcdmvpS2tU4bYoJhW1zWyhuoxPbS7JZJgjzvXJZqMq4JZy")).thenReturn(byteArray);
            thrown.expect(ArrayIndexOutOfBoundsException.class);
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "5JrLjcdmvpS2tU4bYoJhW1zWyhuoxPbS7JZJgjzvXJZqMq4JZy");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("5JrLjcdmvpS2tU4bYoJhW1zWyhuoxPbS7JZJgjzvXJZqMq4JZy"), atLeast(1));
        }
    }

    //Sapient generated method id: ${ea3e0a91-c083-337f-8240-2ef00fcc4def}
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
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa")).thenReturn(byteArray);
            thrown.expect(ArrayIndexOutOfBoundsException.class);
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"), atLeast(1));
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
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("6PfNjgZzvQJzvKvL3zJf8jJ4zGJvM5XJzVJLZ3JZJ9ZLJvJ9zZ")).thenReturn(byteArray);
            thrown.expect(ArrayIndexOutOfBoundsException.class);
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "6PfNjgZzvQJzvKvL3zJf8jJ4zGJvM5XJzVJLZ3JZJ9ZLJvJ9zZ");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("6PfNjgZzvQJzvKvL3zJf8jJ4zGJvM5XJzVJLZ3JZJ9ZLJvJ9zZ"), atLeast(1));
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("6PfNjgZzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzv")).thenReturn(byteArray);
            thrown.expect(ArrayIndexOutOfBoundsException.class);
            //Act Statement(s)
            BIP38PrivateKey.fromBase58(networkMock, "6PfNjgZzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzv");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("6PfNjgZzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzvKzv"), atLeast(1));
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.decodeChecked("5JrLjzUzCwVzVjx2kYYGQhho1YvCv3yZmJvJ7J6jv6J8q5Jt7J")).thenReturn(byteArray);
            //Act Statement(s)
            BIP38PrivateKey result = BIP38PrivateKey.fromBase58(networkMock, "5JrLjzUzCwVzVjx2kYYGQhho1YvCv3yZmJvJ7J6jv6J8q5Jt7J");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            base58.verify(() -> Base58.decodeChecked("5JrLjzUzCwVzVjx2kYYGQhho1YvCv3yZmJvJ7J6jv6J8q5Jt7J"), atLeast(1));
        }
    }

    //Sapient generated method id: ${8b6fde7b-ab0a-316d-a770-4711036b5ad8}
    @Test()
    public void fromBase581Test() throws AddressFormatException {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "Network");
        Network networkMock = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        BIP38PrivateKey bIP38PrivateKeyMock = mock(BIP38PrivateKey.class, "UnknownObjectContent{target='org.bitcoinj.crypto.BIP38PrivateKey', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<BIP38PrivateKey> bIP38PrivateKey = mockStatic(BIP38PrivateKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            bIP38PrivateKey.when(() -> BIP38PrivateKey.fromBase58(networkMock, "String")).thenReturn(bIP38PrivateKeyMock);
            //Act Statement(s)
            BIP38PrivateKey result = BIP38PrivateKey.fromBase58(paramsMock, "String");
            //Assert statement(s)
            assertThat(result, equalTo(bIP38PrivateKeyMock));
            verify(paramsMock, atLeast(1)).network();
            bIP38PrivateKey.verify(() -> BIP38PrivateKey.fromBase58(networkMock, "String"), atLeast(1));
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
        Network networkMock = mock(Network.class);
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37};
            base58.when(() -> Base58.encodeChecked(1, byteArray2)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            //Act Statement(s)
            String result = target.toBase58();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(1, byteArray2), atLeast(1));
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
        Network networkMock = mock(Network.class, "mainnet");
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("abc123")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray3 = new byte[]{(byte) 116, (byte) 101, (byte) 115, (byte) 116, (byte) 49, (byte) 50, (byte) 51, (byte) 52};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 16384, 8, 8, 32)).thenReturn(byteArray2);
            byte[] byteArray5 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39};
            byte[] byteArray6 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
            byteUtils.when(() -> ByteUtils.concat(byteArray2, byteArray6)).thenReturn(byteArray5);
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("6588179096644488592261084001817962668245710958064839727902395581227622860262"), true)).thenReturn(eCKeyMock);
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(eCKeyMock).getPubKey();
            byte[] byteArray8 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11};
            byte[] byteArray9 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray9, byteArray6)).thenReturn(byteArray8);
            byte[] byteArray10 = new byte[]{(byte) 0};
            sCrypt.when(() -> SCrypt.generate(byteArray7, byteArray8, 1024, 1, 1, 64)).thenReturn(byteArray10);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "abc123");
            thrown.expect(ArrayIndexOutOfBoundsException.class);
            //Act Statement(s)
            target.decrypt("test1234");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("abc123"), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 16384, 8, 8, 32), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray2, byteArray6), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("6588179096644488592261084001817962668245710958064839727902395581227622860262"), true), atLeast(1));
            verify(eCKeyMock, atLeast(1)).getPubKey();
            byteUtils.verify(() -> ByteUtils.concat(byteArray9, byteArray6), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray7, byteArray8, 1024, 1, 1, 64), atLeast(1));
        }
    }

    //Sapient generated method id: ${9915c139-0a6f-3084-92a8-e77a94bf7443}
    @Test()
    public void decryptWhenArraysEqualsActualAddressHashAddressHash() throws BadPassphraseException, AddressFormatException {
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
        Address addressMock = mock(Address.class, "{}");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("KwDiBf89QgGbjEhKnhXJuH7LrciVrZi3qY6F5NtqZ61a8E4m1kz")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray3 = new byte[]{(byte) 116, (byte) 101, (byte) 115, (byte) 116, (byte) 49, (byte) 50, (byte) 51};
            sCrypt.when(() -> SCrypt.generate(byteArray3, (byte[]) null, 16384, 8, 8, 64)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            eCKey.when(() -> ECKey.fromPrivate(byteArray4, false)).thenReturn(eCKeyMock);
            doReturn(addressMock).when(eCKeyMock).toAddress(ScriptType.P2PKH, (Network) null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray5 = new byte[]{(byte) 111, (byte) 114, (byte) 103, (byte) 46, (byte) 109, (byte) 111, (byte) 99, (byte) 107, (byte) 105, (byte) 116, (byte) 111, (byte) 46, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 103, (byte) 101, (byte) 110, (byte) 46, (byte) 65, (byte) 100, (byte) 100, (byte) 114, (byte) 101, (byte) 115, (byte) 115, (byte) 36, (byte) 77, (byte) 111, (byte) 99, (byte) 107, (byte) 105, (byte) 116, (byte) 111, (byte) 77, (byte) 111, (byte) 99, (byte) 107, (byte) 36, (byte) 83, (byte) 87, (byte) 113, (byte) 108, (byte) 54, (byte) 88, (byte) 86, (byte) 88, (byte) 64, (byte) 54, (byte) 51, (byte) 56, (byte) 53, (byte) 97, (byte) 100, (byte) 98, (byte) 97};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray5)).thenReturn(sha256Hash2);
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "KwDiBf89QgGbjEhKnhXJuH7LrciVrZi3qY6F5NtqZ61a8E4m1kz");
            thrown.expect(BIP38PrivateKey.BadPassphraseException.class);
            //Act Statement(s)
            target.decrypt("test123");
            //Assert statement(s)
            base58.verify(() -> Base58.decodeChecked("KwDiBf89QgGbjEhKnhXJuH7LrciVrZi3qY6F5NtqZ61a8E4m1kz"), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, (byte[]) null, 16384, 8, 8, 64), atLeast(1));
            eCKey.verify(() -> ECKey.fromPrivate(byteArray4, false), atLeast(1));
            verify(eCKeyMock).toAddress(ScriptType.P2PKH, (Network) null);
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray5), atLeast(1));
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
        Network networkMock = mock(Network.class);
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("base58")).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37};
            base58.when(() -> Base58.encodeChecked(1, byteArray2)).thenReturn("return_of_encodeChecked1");
            BIP38PrivateKey target = BIP38PrivateKey.fromBase58(networkMock, "base58");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encodeChecked1"));
            base58.verify(() -> Base58.decodeChecked("base58"), atLeast(1));
            base58.verify(() -> Base58.encodeChecked(1, byteArray2), atLeast(1));
        }
    }
}
