package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.KeyCrypterException;
import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.protobuf.wallet.Protos;
import org.bitcoinj.crypto.EncryptableItem;
import org.bitcoinj.utils.Threading;
import org.bitcoinj.crypto.ECKey;

import java.util.Map;

import org.bitcoinj.core.NetworkParameters;

import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.bitcoinj.crypto.AesKey;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;

import java.util.concurrent.CopyOnWriteArrayList;

import org.bitcoinj.crypto.EncryptedData;
import org.bitcoinj.crypto.KeyCrypterScrypt;
import com.google.protobuf.ByteString;
import org.bitcoinj.core.BloomFilter;
import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class BasicKeyChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "some_crypter_value");

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final BasicKeyChain basicKeyChainMock = mock(BasicKeyChain.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class);

    private final Executor executorMock = mock(Executor.class);

    private final EncryptableItem itemMock = mock(EncryptableItem.class);

    private final KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);

    private final KeyCrypter keyCrypterMock2 = mock(KeyCrypter.class);

    private final KeyCrypter keyCrypterMock3 = mock(KeyCrypter.class);

    private final ECKey keyMock = mock(ECKey.class);

    private final Protos.EncryptedData.Builder protosEncryptedDataBuilderMock = mock(Protos.EncryptedData.Builder.class);

    private final Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class);

    private final Protos.Key.Builder protosKeyBuilderMock2 = mock(Protos.Key.Builder.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${5263e1c8-6ee4-3528-9e17-7641d8067bcf}, hash: 1CCA5B32F5800F767BCA5985C104376F
    @Test()
    public void getKeyCrypterTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        KeyCrypter result = target.getKeyCrypter();
        //Assert statement(s)
        assertThat(result, equalTo(keyCrypterMock));
    }

    //Sapient generated method id: ${b3aabb5a-13d7-3113-8205-37e1e5c5b342}, hash: F2938E5A26593D5011E99F437871EE7B
    @Test()
    public void getKeyWhenKeyCrypterIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         * (keyCrypter == null) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
    }

    //Sapient generated method id: ${6ca88477-f407-3d5d-a5d6-4b911490bffc}, hash: 25AB880A01D861CCC48FC9E6BE972F0C
    @Ignore()
    @Test()
    public void getKeyWhenPreviousKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         * (keyCrypter == null) : true
         * (hashToKeys.isEmpty()) : true  #  inside importKeyLocked method
         * (previousKey == null) : true  #  inside importKeyLocked method
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
    }

    //Sapient generated method id: ${ed78756d-e1b2-31f5-b607-45b6371067af}, hash: A15FA8FFBDAB906ED96EBE8C05A9D289
    @Test()
    public void getKeysWhenNumberOfKeysNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (numberOfKeys > 0) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, -1);
    }

    //Sapient generated method id: ${5e2c1d6a-fa7a-31aa-89a4-55c7b4f4b9f6}, hash: 54DBBE9745CC4B3A60ADD22110D5F789
    @Test()
    public void getKeysWhenKeyCrypterIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (numberOfKeys > 0) : true
         * (hashToKeys.size() < numberOfKeys) : true
         * (keyCrypter == null) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
    }

    //Sapient generated method id: ${60ce3b48-6ab0-35db-9e0d-7284cf8f074b}, hash: F7B2A21A9EEA9FA3B49147D124A92D91
    @Ignore()
    @Test()
    public void getKeysWhenPreviousKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (numberOfKeys > 0) : true
         * (hashToKeys.size() < numberOfKeys) : true
         * (keyCrypter == null) : true
         * (i < numberOfKeys - hashToKeys.size()) : true
         * (for-each(keys)) : true  #  inside importKeysLocked method
         * (hashToKeys.isEmpty()) : true  #  inside importKeyLocked method
         * (previousKey == null) : true  #  inside importKeyLocked method
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
    }

    //Sapient generated method id: ${cc8c439a-b662-33f9-9f35-96d83f8e34c4}, hash: 062B9E432C0E83B37F5BC771586A0636
    @Test()
    public void getKeys1Test() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        List<ECKey> result = target.getKeys();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${3e4f80e0-78f4-3998-b2c2-bf3e665bc4b6}, hash: 281D5C062994BEC27ECE0DEBE036F249
    @Test()
    public void importKeysTest() {
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        List<ECKey> eCKeyList = new ArrayList<>();
        doReturn(0).when(target).importKeys(eCKeyList);
        ECKey[] eCKeyArray = new ECKey[]{};
        //Act Statement(s)
        int result = target.importKeys(eCKeyArray);
        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(target).importKeys(eCKeyList);
    }

    //Sapient generated method id: ${9c16092d-1bdb-30f4-9dd4-f705c844ea84}, hash: 619CC1BBCF58AA208595EA4023F12709
    @Test()
    public void importKeys1WhenKeyIsEncryptedThrowsKeyCrypterException() {
        /* Branches:
         * (for-each(keys)) : true
         * (keyCrypter == null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.isEncrypted()) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(true).when(keyMock).isEncrypted();
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key is encrypted but chain is not");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        List<ECKey> anyList = new ArrayList<>();
        anyList.add(keyMock);
        //Act Statement(s)
        target.importKeys(anyList);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
    }

    //Sapient generated method id: ${9b885d56-7164-33c1-9974-e0be328a75bc}, hash: 3568DFC5F452B5988F49152ADD0589C4
    @Test()
    public void importKeys1WhenKeyNotIsEncryptedThrowsKeyCrypterException() {
        /* Branches:
         * (for-each(keys)) : true
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(false).when(keyMock).isEncrypted();
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key is not encrypted but chain is");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        List<ECKey> anyList = new ArrayList<>();
        anyList.add(keyMock);
        //Act Statement(s)
        target.importKeys(anyList);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
    }

    //Sapient generated method id: ${cc49f4c0-eb5d-33b0-a1c9-0aeeb8ad7dd5}, hash: 1B649D64539188341ABE0E5CFFA89D0D
    @Test()
    public void importKeys1WhenKeyGetKeyCrypterNotEqualsKeyCrypterThrowsKeyCrypterException() {
        /* Branches:
         * (for-each(keys)) : true
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.getKeyCrypter() != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.getKeyCrypter().equals(keyCrypter)) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(true).when(keyMock).isEncrypted();
        doReturn(keyCrypterMock2, keyCrypterMock3).when(keyMock).getKeyCrypter();
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key encrypted under different parameters to chain");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        List<ECKey> anyList = new ArrayList<>();
        anyList.add(keyMock);
        //Act Statement(s)
        target.importKeys(anyList);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
        verify(keyMock, times(2)).getKeyCrypter();
    }

    //Sapient generated method id: ${dcd34d84-29ec-38ba-b13e-8865c6ba9b3c}, hash: DE0A0224B30F837C5ABDC3E6FA459128
    @Test()
    public void importKeys1WhenKeyGetKeyCrypterEqualsKeyCrypterAndKeysIsEmptyAndActuallyAddedSizeNotGreaterThan0() {
        /* Branches:
         * (for-each(keys)) : true
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.getKeyCrypter() != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.getKeyCrypter().equals(keyCrypter)) : false  #  inside checkKeyEncryptionStateMatches method
         * (for-each(keys)) : false
         * (actuallyAdded.size() > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock2);
        List<ECKey> anyList = new ArrayList<>();
        //Act Statement(s)
        int result = target.importKeys(anyList);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${776a82d2-14fa-3913-869b-5fd3b1919580}, hash: 722E4D6452A2ADAE6F5CF700D901F65D
    @Ignore()
    @Test()
    public void importKeys1WhenPreviousKeyIsNullAndActuallyAddedSizeGreaterThan0ThrowsIllegalStateException() {
        /* Branches:
         * (for-each(keys)) : true
         * (keyCrypter == null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : false  #  inside checkKeyEncryptionStateMatches method
         * (for-each(keys)) : true
         * (hasKey(key)) : true
         * (hashToKeys.isEmpty()) : true  #  inside importKeyLocked method
         * (previousKey == null) : true  #  inside importKeyLocked method
         * (actuallyAdded.size() > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            byte[] byteArray2 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock2);
            BasicKeyChain target = spy(new BasicKeyChain((KeyCrypter) null));
            doReturn(false).when(target).hasKey(eCKeyMock);
            doReturn(false).when(eCKeyMock).isWatching();
            doReturn(byteArray).when(eCKeyMock).getPubKey();
            doReturn(byteArray2).when(eCKeyMock).getPubKeyHash();
            thrown.expect(IllegalStateException.class);
            List<ECKey> anyList = new ArrayList<>();
            //Act Statement(s)
            target.importKeys(anyList);
            //Assert statement(s)
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            verify(target).hasKey(eCKeyMock);
            verify(eCKeyMock).isWatching();
            verify(eCKeyMock).getPubKey();
            verify(eCKeyMock).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${6226c405-f308-3af3-acd5-15b1f8649e8a}, hash: BC6CB4CA3498C29AA9A896659C3828CE
    @Test()
    public void importKeyWhenKeyIsEncryptedThrowsKeyCrypterException() {
        /* Branches:
         * (keyCrypter == null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.isEncrypted()) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(true).when(keyMock).isEncrypted();
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key is encrypted but chain is not");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        //Act Statement(s)
        target.importKey(keyMock);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
    }

    //Sapient generated method id: ${8b8091a7-bea8-38f5-8299-055174796a9a}, hash: E67116AA6AC09EE51425111C1D1447D0
    @Test()
    public void importKeyWhenKeyNotIsEncryptedThrowsKeyCrypterException() {
        /* Branches:
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(false).when(keyMock).isEncrypted();
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key is not encrypted but chain is");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        //Act Statement(s)
        target.importKey(keyMock);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
    }

    //Sapient generated method id: ${14e95dcb-c9d8-32d7-a36c-ce7c73b8d07c}, hash: 6F1F736B1BBD2D8C8DD3E63CA53443C2
    @Test()
    public void importKeyWhenHasKeyKey() {
        /* Branches:
         * (keyCrypter == null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : false  #  inside checkKeyEncryptionStateMatches method
         * (hasKey(key)) : true
         */
        //Arrange Statement(s)
        doReturn(false).when(keyMock).isEncrypted();
        BasicKeyChain target = spy(new BasicKeyChain((KeyCrypter) null));
        doReturn(true).when(target).hasKey(keyMock);
        //Act Statement(s)
        target.importKey(keyMock);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
        verify(target).hasKey(keyMock);
    }

    //Sapient generated method id: ${0fbbb6c0-e5fc-3b42-a92f-f76272295ca1}, hash: 2B9D3A25BB7135E56E93E021518763C5
    @Test()
    public void importKeyWhenKeyGetKeyCrypterNotEqualsKeyCrypterThrowsKeyCrypterException() {
        /* Branches:
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.getKeyCrypter() != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.getKeyCrypter().equals(keyCrypter)) : true  #  inside checkKeyEncryptionStateMatches method
         */
        //Arrange Statement(s)
        doReturn(true).when(keyMock).isEncrypted();
        doReturn(keyCrypterMock2, keyCrypterMock3).when(keyMock).getKeyCrypter();
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        KeyCrypterException keyCrypterException = new KeyCrypterException("Key encrypted under different parameters to chain");
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        //Act Statement(s)
        target.importKey(keyMock);
        //Assert statement(s)
        verify(keyMock).isEncrypted();
        verify(keyMock, times(2)).getKeyCrypter();
    }

    //Sapient generated method id: ${6a3a37d2-6642-3ccd-a791-ddfc4cd06bef}, hash: FB7776349A906BE651D433E417335266
    @Ignore()
    @Test()
    public void importKeyWhenHasKeyNotKeyAndHashToKeysIsEmptyAndPreviousKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (keyCrypter == null) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.isEncrypted()) : false  #  inside checkKeyEncryptionStateMatches method
         * (keyCrypter != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (key.getKeyCrypter() != null) : true  #  inside checkKeyEncryptionStateMatches method
         * (!key.getKeyCrypter().equals(keyCrypter)) : false  #  inside checkKeyEncryptionStateMatches method
         * (hasKey(key)) : false
         * (hashToKeys.isEmpty()) : true  #  inside importKeyLocked method
         * (previousKey == null) : true  #  inside importKeyLocked method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            doReturn(true).when(keyMock).isEncrypted();
            doReturn(keyCrypterMock2, keyCrypterMock3).when(keyMock).getKeyCrypter();
            doReturn(false).when(keyMock).isWatching();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(keyMock).getPubKeyHash();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock2);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock3));
            doReturn(false).when(target).hasKey(keyMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.importKey(keyMock);
            //Assert statement(s)
            verify(keyMock).isEncrypted();
            verify(keyMock, times(2)).getKeyCrypter();
            verify(keyMock).isWatching();
            verify(keyMock).getPubKey();
            verify(keyMock).getPubKeyHash();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            verify(target).hasKey(keyMock);
        }
    }

    //Sapient generated method id: ${44fa91be-011c-3f0c-ba05-2ff6bddb0b80}, hash: EBAAC76ED11893E9482C598761DE6AC9
    @Test()
    public void findKeyFromPubHashTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            ECKey result = target.findKeyFromPubHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3262d68-f653-32db-9e91-cc2045869e94}, hash: 71B9472304C3ABA6810C9A8DBE726B2E
    @Test()
    public void findKeyFromPubKeyTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${218c8a6e-bdce-36d0-a1a9-db8aea87747a}, hash: 0DA395BEF8FBB8B5DEE6CF5F760CA92B
    @Test()
    public void hasKeyWhenFindKeyFromPubKeyKeyGetPubKeyIsNull() {
        /* Branches:
         * (findKeyFromPubKey(key.getPubKey()) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.hasKey(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).getPubKey();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${76299944-2002-360a-8bb8-28994d8ad5a4}, hash: 8B5885FE108422823C682D4189A56974
    @Test()
    public void numKeysTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        int result = target.numKeys();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${8b7e17ce-2d02-314f-bb8f-e71b83aa7f47}, hash: 5C6C3D9020B9B0D8BE3AD221D8EA42F4
    @Test()
    public void isWatchingWhenHashToKeysIsEmpty() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        BasicKeyChain.State result = target.isWatching();
        //Assert statement(s)
        assertThat(result, equalTo(BasicKeyChain.State.EMPTY));
    }

    //Sapient generated method id: ${1c1f74e0-e925-3619-a83e-4e5986e3aeed}, hash: 25DB2DE4AD7957432C2CB4CCC62E6BA4
    @Test()
    public void removeKeyWhenAEqualsB() {
        /* Branches:
         * (hashToKeys.remove(ByteString.copyFrom(key.getPubKeyHash())) != null) : false
         * (pubkeyToKeys.remove(ByteString.copyFrom(key.getPubKey())) != null) : false
         * (a == b) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKeyHash();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(keyMock).getPubKey();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock2);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeKey(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).getPubKeyHash();
            verify(keyMock).getPubKey();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${a206f8de-38c4-3d61-a8c3-413f43400cc2}, hash: C8BAD8B6CE1B19C601710849082FBC5D
    @Test()
    public void earliestKeyCreationTimeTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        Instant result = target.earliestKeyCreationTime();
        Optional optional = Optional.empty();
        Instant instant2 = Instant.MAX;
        Instant instant = (Instant) optional.orElse(instant2);
        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${b1c37231-1147-3ac0-8762-d7c1e4be3220}, hash: 79A7D86FC1A729E6215AACDCE777CB05
    @Test()
    public void getListenersTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        List<ListenerRegistration<KeyChainEventListener>> result = target.getListeners();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${82f6de5e-6051-37f1-a097-7ec711cdfed2}, hash: B951D4325B92C1C78B1BAF9ABE2F4B1C
    @Test()
    public void serializeToEditableProtobufsTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        Map<ECKey, Protos.Key.Builder> result = target.serializeToEditableProtobufs();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${16b1754a-bfdb-3aa3-bb73-83575a15fdd0}, hash: 5C82BEA06F0E752EA26308FE74F6D80A
    @Test()
    public void serializeToProtobufTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        List<Protos.Key> result = target.serializeToProtobuf();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${b5252992-9729-3995-9a93-ad56de200d2e}, hash: 36EF43F2AC9A8E7D20093A8ECB8A20E2
    @Ignore()
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptionTypeEqualsProtosWalletEncryptionTypeENCRYPTED_SCRYPT_AES() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : true
         * (item.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Protos.EncryptedData.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Key.Builder protosKeyBuilderMock3 = mock(Protos.Key.Builder.class, "ENCRYPTED_SCRYPT_AES");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            EncryptedData encryptedData = new EncryptedData(byteArray, byteArray2);
            doReturn(encryptedDataMock, encryptedData).when(itemMock).getEncryptedData();
            doReturn(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES).when(itemMock).getEncryptionType();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            Protos.Key.Builder builder = protosKeyBuilderMock.setCreationTimestamp(1L);
            doReturn(builder).when(protosKeyBuilderMock).setCreationTimestamp(1712214274925L);
            Protos.EncryptedData encryptedData2 = protosKeyBuilderMock.getEncryptedData();
            doReturn(encryptedData2).when(protosKeyBuilderMock).getEncryptedData();
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setEncryptedData(protosEncryptedDataBuilderMock);
            doReturn(protosKeyBuilderMock3).when(protosKeyBuilderMock).setType(Protos.Key.Type.ENCRYPTED_SCRYPT_AES);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock2);
            //Act Statement(s)
            Protos.Key.Builder result = BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyBuilderMock));
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock, times(2)).getEncryptedData();
            verify(itemMock).getEncryptionType();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock, atLeast(1)).setCreationTimestamp(1712214274925L);
            verify(protosKeyBuilderMock, atLeast(1)).getEncryptedData();
            verify(protosKeyBuilderMock, atLeast(1)).setEncryptedData(protosEncryptedDataBuilderMock);
            verify(protosKeyBuilderMock, atLeast(1)).setType(Protos.Key.Type.ENCRYPTED_SCRYPT_AES);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${5d7f5fe0-fed9-38a5-8021-edd5adc6a17e}, hash: 1E37728105FDD5F09E4C08234B4F0F4D
    @Ignore()
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptionTypeNotEqualsProtosWalletEncryptionTypeENCRYPTEThrowsIllegalStateException() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : true
         * (item.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            EncryptedData encryptedData = new EncryptedData(byteArray, byteArray2);
            doReturn(encryptedDataMock, encryptedData).when(itemMock).getEncryptedData();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(itemMock).getEncryptionType();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            Protos.Key.Builder builder = protosKeyBuilderMock.setCreationTimestamp(1L);
            doReturn(builder).when(protosKeyBuilderMock).setCreationTimestamp(1L);
            Protos.EncryptedData encryptedData2 = protosKeyBuilderMock.getEncryptedData();
            doReturn(encryptedData2).when(protosKeyBuilderMock).getEncryptedData();
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setEncryptedData(protosEncryptedDataBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock2);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock, times(2)).getEncryptedData();
            verify(itemMock).getEncryptionType();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock).setCreationTimestamp(1L);
            verify(protosKeyBuilderMock).getEncryptedData();
            verify(protosKeyBuilderMock).setEncryptedData(protosEncryptedDataBuilderMock);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c57e4a51-6b5c-38f6-af65-31609a3c64a3}, hash: FB6E99FB360140770CD4FBDE270D7A8C
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptedDataIsNullAndSecretIsNotNull() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : false
         * (secret != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Key.Builder protosKeyBuilderMock3 = mock(Protos.Key.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            doReturn(null).when(itemMock).getEncryptedData();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(itemMock).getSecretBytes();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            Protos.Key.Builder builder = protosKeyBuilderMock.setCreationTimestamp(1L);
            doReturn(builder).when(protosKeyBuilderMock).setCreationTimestamp(1L);
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setSecretBytes(byteStringMock);
            doReturn(protosKeyBuilderMock3).when(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            //Act Statement(s)
            Protos.Key.Builder result = BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyBuilderMock));
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock).getEncryptedData();
            verify(itemMock).getSecretBytes();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock, atLeast(1)).setCreationTimestamp(1L);
            verify(protosKeyBuilderMock, atLeast(1)).setSecretBytes(byteStringMock);
            verify(protosKeyBuilderMock, atLeast(1)).setType(Protos.Key.Type.ORIGINAL);
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${eabd3d02-7d16-38fc-868d-6e8863269a78}, hash: B346B4B1CEA4FB909F238EFE0E67A2F3
    @Test()
    public void fromProtobufUnencryptedTest() throws UnreadableWalletException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Protos.Key> protosKeyList = new ArrayList<>();
        //Act Statement(s)
        BasicKeyChain result = BasicKeyChain.fromProtobufUnencrypted(protosKeyList);
        //Assert statement(s)
        //TODO: Please implement equals method in BasicKeyChain for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${fdf441cb-65fe-3b5c-b115-cf990a61aa5e}, hash: 0419EF920DE34463461FAE77ABD444D9
    @Test()
    public void fromProtobufEncryptedTest() throws UnreadableWalletException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Protos.Key> protosKeyList = new ArrayList<>();
        //Act Statement(s)
        BasicKeyChain result = BasicKeyChain.fromProtobufEncrypted(protosKeyList, keyCrypterMock2);
        //Assert statement(s)
        //TODO: Please implement equals method in BasicKeyChain for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}, hash: AF3BABF331BE9CA3D1FDC77580463F7B
    @Ignore()
    @Test()
    public void addEventListenerTest() {
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doNothing().when(target).addEventListener(keyChainEventListenerMock, executorMock);
        //Act Statement(s)
        target.addEventListener(keyChainEventListenerMock);
        //Assert statement(s)
        verify(target).addEventListener(keyChainEventListenerMock, executorMock);
    }

    //Sapient generated method id: ${283de23e-4782-3528-be05-a980b30b2663}, hash: FDE7C1BB7069A6F9033B73CC08C2FE92
    @Test()
    public void addEventListener1Test() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        target.addEventListener(keyChainEventListenerMock, executorMock);
    }

    //Sapient generated method id: ${8fc36a2a-7a2b-30fb-8f9a-ff37f2073d36}, hash: A89D7134A4001B7B786DC4C208C1619C
    @Test()
    public void addEventListener2Test() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        ListenerRegistration<KeyChainEventListener> listenerRegistrationMock = mock(ListenerRegistration.class);
        //Act Statement(s)
        target.addEventListener(listenerRegistrationMock);
    }

    //Sapient generated method id: ${278547ff-7b2e-3fb2-965f-5808a178e872}, hash: 495BA8C3836CCE4BABBA82B7D1715562
    @Test()
    public void removeEventListenerWhenListenerRegistrationRemoveFromListListenerListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, listeners)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class)) {
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), (CopyOnWriteArrayList) any())).thenReturn(true);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), (CopyOnWriteArrayList) any()));
        }
    }

    //Sapient generated method id: ${2729ee32-8492-327e-ba2d-e05b6e9496e8}, hash: EFBD06A7743167421F54DF8681047406
    @Test()
    public void removeEventListenerWhenListenerRegistrationNotRemoveFromListListenerListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, listeners)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class)) {
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), (CopyOnWriteArrayList) any())).thenReturn(false);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), (CopyOnWriteArrayList) any()));
        }
    }

    //Sapient generated method id: ${69dbc322-e198-3445-b244-24a19e5060ed}, hash: 82977B82E60709C01F69867B2E0DED95
    @Test()
    public void toEncryptedWhenPasswordLengthGreaterThan0() throws KeyCrypterException {
        /* Branches:
         * (password.length() > 0) : true
         */
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn(basicKeyChainMock).when(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
        //Act Statement(s)
        BasicKeyChain result = target.toEncrypted((CharSequence) "toEncrypted_charSequence1");
        //Assert statement(s)
        assertThat(result, equalTo(basicKeyChainMock));
        verify(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
    }

    //Sapient generated method id: ${673767b4-1364-3d7b-b6c6-1badb1541483}, hash: 8C2F2A92BC0DEE03443FD298EE814D49
    @Ignore()
    @Test()
    public void toEncryptedWhenPasswordLengthNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (password.length() > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.toEncrypted("toEncrypted_charSequence1");
    }

    //Sapient generated method id: ${a3eb8f1e-1d40-3d0e-8b77-6791480d2a2a}, hash: CDCD6BED28577AF9BFFE251ED363ED0E
    @Test()
    public void toEncrypted1WhenThisKeyCrypterIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (this.keyCrypter == null) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.toEncrypted(keyCrypterMock2, aesKeyMock);
    }

    //Sapient generated method id: ${ac556749-882b-361d-8590-988dd8228795}, hash: 1E68CF6B3AB68E1C26C7B83D98FD825D
    @Test()
    public void toEncrypted1WhenListenersIsEmpty() {
        /* Branches:
         * (this.keyCrypter == null) : true
         * (for-each(hashToKeys.values())) : false
         * (for-each(listeners)) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        //Act Statement(s)
        BasicKeyChain result = target.toEncrypted(keyCrypterMock2, aesKeyMock);
        //Assert statement(s)
        //TODO: Please implement equals method in BasicKeyChain for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1bdb17bb-1002-3203-937c-75660bb17455}, hash: 6DC21999C16B7DD17122867F4D0D5BDF
    @Test()
    public void toDecryptedTest() throws KeyCrypterException {
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("toDecrypted_charSequence1");
        doReturn(basicKeyChainMock).when(target).toDecrypted(aesKeyMock);
        //Act Statement(s)
        BasicKeyChain result = target.toDecrypted("toDecrypted_charSequence1");
        //Assert statement(s)
        assertThat(result, equalTo(basicKeyChainMock));
        verify(keyCrypterMock).deriveKey("toDecrypted_charSequence1");
        verify(target).toDecrypted(aesKeyMock);
    }

    //Sapient generated method id: ${0569c850-05a6-3b5c-b729-83a13ac0d2d2}, hash: C57D162DA8525F8372544AE0FFC5D57A
    @Test()
    public void toDecrypted1WhenKeyCrypterIsNullThrowsIllegalStateException() {
        /* Branches:
         * (keyCrypter != null) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.toDecrypted(aesKeyMock);
    }

    //Sapient generated method id: ${6f5f2a4b-3fd8-3dac-8e9e-54b7a090d6d4}, hash: AB492AE43799A223BCD07F550364AC95
    @Test()
    public void toDecrypted1WhenListenersIsEmpty() {
        /* Branches:
         * (keyCrypter != null) : true
         * (numKeys() > 0) : false
         * (for-each(hashToKeys.values())) : false
         * (for-each(listeners)) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        BasicKeyChain result = target.toDecrypted(aesKeyMock);
        //Assert statement(s)
        //TODO: Please implement equals method in BasicKeyChain for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${985e8ce0-cd93-3186-a94c-5b1bafe74def}, hash: 6A2D428093B107C6F5659499440B79F5
    @Test()
    public void checkPasswordWhenKeyCrypterIsNullThrowsIllegalStateException() {
        /* Branches:
         * (keyCrypter != null) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain((KeyCrypter) null);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.checkPassword("checkPassword_charSequence1");
    }

    //Sapient generated method id: ${c4b63472-48c0-3d8a-9b07-60a04d8528ed}, hash: 1FCDF0C8CF329E28E1F6ADA30DDFEC35
    @Test()
    public void checkPasswordWhenCheckAESKeyKeyCrypterDeriveKeyPassword() throws KeyCrypterException {
        /* Branches:
         * (keyCrypter != null) : true
         * (checkAESKey(keyCrypter.deriveKey(password))) : true
         */
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("checkPassword_charSequence1");
        doReturn(true).when(target).checkAESKey(aesKeyMock);
        //Act Statement(s)
        boolean result = target.checkPassword("checkPassword_charSequence1");
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(keyCrypterMock).deriveKey("checkPassword_charSequence1");
        verify(target).checkAESKey(aesKeyMock);
    }

    //Sapient generated method id: ${452473ca-005e-3b6c-9a22-7487fdbd95e4}, hash: 9A31E0C1F198D53D88106E58AC7018B4
    @Test()
    public void checkPasswordWhenCheckAESKeyNotKeyCrypterDeriveKeyPassword() throws KeyCrypterException {
        /* Branches:
         * (keyCrypter != null) : true
         * (checkAESKey(keyCrypter.deriveKey(password))) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("checkPassword_charSequence1");
        doReturn(false).when(target).checkAESKey(aesKeyMock);
        //Act Statement(s)
        boolean result = target.checkPassword("checkPassword_charSequence1");
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(keyCrypterMock).deriveKey("checkPassword_charSequence1");
        verify(target).checkAESKey(aesKeyMock);
    }

    //Sapient generated method id: ${92a561ff-2e7a-3f34-99c1-4f10c9a5739d}, hash: 9F6F7765EE47D7108B9E88C6C28E314F
    @Test()
    public void checkAESKeyWhenHashToKeysIsEmpty() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        boolean result = target.checkAESKey(aesKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${9266e2a3-866e-38e5-be88-a823742ce3e0}, hash: C9377A9A0636472E20FA6D395F0EB66A
    @Test()
    public void getFilterWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        BloomFilter result = target.getFilter(0, Double.parseDouble("0.0"), 0);
        BloomFilter bloomFilter = new BloomFilter(0, Double.parseDouble("0.0"), 0);
        //Assert statement(s)
        assertThat(result, equalTo(bloomFilter));
    }

    //Sapient generated method id: ${bce340de-c9e7-3b09-ae2c-d943d6a73f89}, hash: AC2EA9868F841E82263FA57A7B10F78B
    @Test()
    public void numBloomFilterEntriesTest() {
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        //Act Statement(s)
        int result = target.numBloomFilterEntries();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${92d970e1-425c-316a-b84d-dd818fccb15d}, hash: CBABF7901CEE490E1765145D6EB51341
    @Test()
    public void findOldestKeyAfterWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        Optional<ECKey> result = target.findOldestKeyAfter(instant);
        Optional<ECKey> eCKeyOptional = Optional.empty();
        //Assert statement(s)
        assertThat(result, equalTo(eCKeyOptional));
    }

    //Sapient generated method id: ${f86a5b47-e867-37c3-8872-383eb8f89aac}, hash: ACDB208C52E25B606083DB21808763D0
    @Test()
    public void findOldestKeyAfter1Test() {
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn(Optional.empty()).when(target).findOldestKeyAfter((Instant) any());
        //Act Statement(s)
        ECKey result = target.findOldestKeyAfter(1L);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(target).findOldestKeyAfter((Instant) any());
    }

    //Sapient generated method id: ${b76a6220-3783-3356-ae38-5dddbf5dead9}, hash: C6CDBDA2C4DAC580697A1E6F32FDF337
    @Test()
    public void findKeysBeforeWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        List<ECKey> result = target.findKeysBefore(instant);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${5cba9991-a1d7-3cf6-b24a-e46b4bae8418}, hash: BBA3AA96CD9AC4650800F7B69FECCFF7
    @Test()
    public void findKeysBefore1Test() {
        //Arrange Statement(s)
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        List<ECKey> eCKeyList = new ArrayList<>();
        doReturn(eCKeyList).when(target).findKeysBefore((Instant) any());
        //Act Statement(s)
        List<ECKey> result = target.findKeysBefore(1L);
        //Assert statement(s)
        assertThat(result, equalTo(eCKeyList));
        verify(target).findKeysBefore((Instant) any());
    }

    //Sapient generated method id: ${2f338cc5-4f2a-30e5-87d8-039bec302a04}, hash: 9F19FA2834FB9AA51F3389AD7B9B375F
    @Ignore()
    @Test()
    public void toStringWhenKeysIsNotEmpty() {
        /* Branches:
         * (for-each(keys)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "some_network_value");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(eCKeyList).when(target).getKeys();
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(eCKeyMock).formatKeyWithAddress(true, aesKey, stringBuilder, networkMock, null, "imported");
            //Act Statement(s)
            String result = target.toString(true, aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(""));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).getKeys();
            verify(eCKeyMock).formatKeyWithAddress(true, aesKey, stringBuilder, networkMock, null, "imported");
        }
    }

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}, hash: 8E2534E189F72E68B7CAB1964A84C746
    @Test()
    public void toString1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        doReturn(networkMock).when(paramsMock).network();
        BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
        doReturn("return_of_toString1").when(target).toString(false, aesKeyMock, networkMock);
        //Act Statement(s)
        String result = target.toString(false, aesKeyMock, paramsMock);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_toString1"));
        verify(paramsMock).network();
        verify(target).toString(false, aesKeyMock, networkMock);
    }
}
