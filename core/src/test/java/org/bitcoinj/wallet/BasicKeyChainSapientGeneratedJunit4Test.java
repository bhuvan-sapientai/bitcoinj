package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.KeyCrypterException;
import org.bitcoinj.base.Network;

import java.util.Arrays;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.protobuf.wallet.Protos;
import org.bitcoinj.crypto.EncryptableItem;
import org.bitcoinj.utils.Threading;
import org.bitcoinj.crypto.ECKey;

import java.util.Map;
import java.util.HashMap;

import org.bitcoinj.core.NetworkParameters;

import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.bitcoinj.crypto.AesKey;
import org.mockito.stubbing.Answer;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.crypto.EncryptedData;
import org.bitcoinj.crypto.KeyCrypterScrypt;
import com.google.protobuf.ByteString;
import org.bitcoinj.core.BloomFilter;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

import java.util.Objects;

public class BasicKeyChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "value");

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final BasicKeyChain basicKeyChainMock = mock(BasicKeyChain.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class);

    private final EncryptedData encryptedDataMock2 = mock(EncryptedData.class);

    private final EncryptableItem itemMock = mock(EncryptableItem.class);

    private final KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class, "{}");

    private final KeyCrypter keyCrypterMock2 = mock(KeyCrypter.class);

    private final KeyCrypter keyCrypterMock3 = mock(KeyCrypter.class);

    private final ECKey keyMock = mock(ECKey.class);

    private final Network networkMock = mock(Network.class);

    private final Protos.EncryptedData.Builder protosEncryptedDataBuilderMock = mock(Protos.EncryptedData.Builder.class);

    private final Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$Key$Builder', onlyPojoFunctions=false, builderPattern=false}");

    private final Protos.Key.Builder protosKeyBuilderMock2 = mock(Protos.Key.Builder.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final ByteString byteString2Mock = mock(ByteString.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final Protos.Key.Builder protosKeyBuilderMock3 = mock(Protos.Key.Builder.class);

    //Sapient generated method id: ${5263e1c8-6ee4-3528-9e17-7641d8067bcf}
    @Test()
    public void getKeyCrypterTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, equalTo(keyCrypterMock));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${7da9c3a1-3a35-37ee-9318-c7cb30afd316}
    @Test()
    public void getKeysWhenHashToKeysValuesIteratorNotHasNext() {
        /* Branches:
         * (numberOfKeys > 0) : false
         * (hashToKeys.size() < numberOfKeys) : false
         * (hashToKeys.values().iterator().hasNext()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            List<ECKey> result = target.getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${cc8c439a-b662-33f9-9f35-96d83f8e34c4}
    @Test()
    public void getKeys1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            List<ECKey> result = target.getKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${3e4f80e0-78f4-3998-b2c2-bf3e665bc4b6}
    @Test()
    public void importKeysTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            List list = new ArrayList<>();
            doReturn(0).when(target).importKeys(list);
            ECKey eCKey = new ECKey();
            ECKey eCKey2 = new ECKey();
            ECKey eCKey3 = new ECKey();
            ECKey[] eCKeyArray = new ECKey[]{eCKey, eCKey2, eCKey3};
            //Act Statement(s)
            int result = target.importKeys(eCKeyArray);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).importKeys(list);
        }
    }

    //Sapient generated method id: ${dcd34d84-29ec-38ba-b13e-8865c6ba9b3c}
    @Ignore()
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
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class, "false");
        ECKey eCKeyMock = mock(ECKey.class, "false");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(false).when(keyMock).isEncrypted();
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            KeyCrypterException keyCrypterException = new KeyCrypterException("Key is not encrypted but chain is");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            List<ECKey> anyList = new ArrayList<>();
            anyList.add(keyMock);
            anyList.add(eCKeyMock);
            //Act Statement(s)
            target.importKeys(anyList);
            //Assert statement(s)
            verify(keyMock).isEncrypted();
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${776a82d2-14fa-3913-869b-5fd3b1919580}
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
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class, "[]");
        ECKey keyMock2 = mock(ECKey.class, "[]");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(false).when(keyMock).isEncrypted();
            doReturn(false).when(keyMock2).isEncrypted();
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = spy(new BasicKeyChain((KeyCrypter) null));
            doReturn(true).when(target).hasKey(keyMock);
            doReturn(true).when(target).hasKey(keyMock2);
            List<ECKey> anyList = new ArrayList<>();
            anyList.add(keyMock);
            anyList.add(keyMock2);
            //Act Statement(s)
            int result = target.importKeys(anyList);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isEncrypted();
            verify(keyMock2).isEncrypted();
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).hasKey(keyMock);
            verify(target).hasKey(keyMock2);
        }
    }

    //Sapient generated method id: ${14e95dcb-c9d8-32d7-a36c-ce7c73b8d07c}
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = spy(new BasicKeyChain((KeyCrypter) null));
            ECKey eCKey = new ECKey();
            doReturn(true).when(target).hasKey(eCKey);
            //Act Statement(s)
            target.importKey(eCKey);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).hasKey(eCKey);
        }
    }

    //Sapient generated method id: ${44fa91be-011c-3f0c-ba05-2ff6bddb0b80}
    @Test()
    public void findKeyFromPubHashTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3262d68-f653-32db-9e91-cc2045869e94}
    @Test()
    public void findKeyFromPubKeyTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${218c8a6e-bdce-36d0-a1a9-db8aea87747a}
    @Test()
    public void hasKeyWhenFindKeyFromPubKeyKeyGetPubKeyIsNull() {
        /* Branches:
         * (findKeyFromPubKey(key.getPubKey()) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            ECKey eCKey = new ECKey();
            //Act Statement(s)
            boolean result = target.hasKey(eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${76299944-2002-360a-8bb8-28994d8ad5a4}
    @Test()
    public void numKeysTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            int result = target.numKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${8b7e17ce-2d02-314f-bb8f-e71b83aa7f47}
    @Test()
    public void isWatchingWhenHashToKeysIsEmpty() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            BasicKeyChain.State result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(BasicKeyChain.State.EMPTY));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${1c1f74e0-e925-3619-a83e-4e5986e3aeed}
    @Test()
    public void removeKeyWhenAEqualsB() {
        /* Branches:
         * (hashToKeys.remove(ByteString.copyFrom(key.getPubKeyHash())) != null) : false
         * (pubkeyToKeys.remove(ByteString.copyFrom(key.getPubKey())) != null) : false
         * (a == b) : true
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class, "[1, 2, 3, 4, 5]");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKeyHash();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(keyMock).getPubKey();
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            ByteString byteString2 = ByteString.copyFrom(byteArray);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            ByteString byteString3 = ByteString.empty();
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString3);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeKey(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).getPubKeyHash();
            verify(keyMock).getPubKey();
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${a206f8de-38c4-3d61-a8c3-413f43400cc2}
    @Test()
    public void earliestKeyCreationTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            Optional optional = Optional.empty();
            Instant instant2 = Instant.MAX;
            Instant instant = (Instant) optional.orElse(instant2);
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${b1c37231-1147-3ac0-8762-d7c1e4be3220}
    @Test()
    public void getListenersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            List<ListenerRegistration<KeyChainEventListener>> result = target.getListeners();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${16b1754a-bfdb-3aa3-bb73-83575a15fdd0}
    @Ignore()
    @Test()
    public void serializeToProtobufTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyResultList = new ArrayList<>(Arrays.asList(key));
            //Assert statement(s)
            assertThat(result.size(), equalTo(protosKeyResultList.size()));
            assertThat(result, containsInRelativeOrder(protosKeyResultList.toArray()));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${b5252992-9729-3995-9a93-ad56de200d2e}
    @Ignore()
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptionTypeEqualsProtosWalletEncryptionTypeENCRYPTED_SCRYPT_AES() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : true
         * (item.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : true
         */
        //Arrange Statement(s)
        EncryptableItem itemMock = mock(EncryptableItem.class, "<void>");
        Protos.Key.Builder protosKeyBuilderMock2 = mock(Protos.Key.Builder.class, "<void>");
        Protos.Key.Builder protosKeyBuilderMock3 = mock(Protos.Key.Builder.class, "<void>");
        try (MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            doReturn(null).when(itemMock).getEncryptedData();
            doReturn(null).when(itemMock).getSecretBytes();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setCreationTimestamp(1703678892767L);
            doReturn(protosKeyBuilderMock3).when(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
            //Act Statement(s)
            Protos.Key.Builder result = BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyBuilderMock));
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock).getEncryptedData();
            verify(itemMock).getSecretBytes();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock).setCreationTimestamp(1703678892767L);
            verify(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
        }
    }

    //Sapient generated method id: ${5d7f5fe0-fed9-38a5-8021-edd5adc6a17e}
    @Ignore()
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptionTypeNotEqualsProtosWalletEncryptionTypeENCRYPTEThrowsIllegalStateException() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : true
         * (item.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : false
         */
        //Arrange Statement(s)
        EncryptableItem itemMock = mock(EncryptableItem.class, "2022-01-01T00:00:00Z");
        Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class);
        Protos.Key.Builder protosKeyBuilderMock2 = mock(Protos.Key.Builder.class);
        try (MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            doReturn(null).when(itemMock).getEncryptedData();
            doReturn(null).when(itemMock).getSecretBytes();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            Protos.Key.Builder builder = protosKeyBuilderMock.setCreationTimestamp(1L);
            doReturn(builder).when(protosKeyBuilderMock).setCreationTimestamp(1703678891580L);
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
            //Act Statement(s)
            Protos.Key.Builder result = BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyBuilderMock));
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock).getEncryptedData();
            verify(itemMock).getSecretBytes();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock).setCreationTimestamp(1703678891580L);
            verify(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
        }
    }

    //Sapient generated method id: ${c57e4a51-6b5c-38f6-af65-31609a3c64a3}
    @Ignore()
    @Test()
    public void serializeEncryptableItemWhenItemGetEncryptedDataIsNullAndSecretIsNotNull() {
        /* Branches:
         * (item.isEncrypted()) : true
         * (item.getEncryptedData() != null) : false
         * (secret != null) : true
         */
        //Arrange Statement(s)
        EncryptableItem itemMock = mock(EncryptableItem.class, "2021-10-01T10:00:00Z");
        Protos.Key.Builder protosKeyBuilderMock2 = mock(Protos.Key.Builder.class, "2021-10-01T10:00:00Z");
        Protos.Key.Builder protosKeyBuilderMock4 = mock(Protos.Key.Builder.class, "ORIGINAL");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Key> protosKey = mockStatic(Protos.Key.class)) {
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(itemMock).creationTime();
            doReturn(true).when(itemMock).isEncrypted();
            doReturn(null).when(itemMock).getEncryptedData();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(itemMock).getSecretBytes();
            protosKey.when(() -> Protos.Key.newBuilder()).thenReturn(protosKeyBuilderMock);
            doReturn(protosKeyBuilderMock2).when(protosKeyBuilderMock).setCreationTimestamp(1703678892385L);
            doReturn(protosKeyBuilderMock3).when(protosKeyBuilderMock).setSecretBytes((ByteString) any());
            doReturn(protosKeyBuilderMock4).when(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
            ByteString byteString2 = ByteString.empty();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            //Act Statement(s)
            Protos.Key.Builder result = BasicKeyChain.serializeEncryptableItem(itemMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyBuilderMock));
            verify(itemMock).creationTime();
            verify(itemMock).isEncrypted();
            verify(itemMock).getEncryptedData();
            verify(itemMock).getSecretBytes();
            protosKey.verify(() -> Protos.Key.newBuilder(), atLeast(1));
            verify(protosKeyBuilderMock).setCreationTimestamp(1703678892385L);
            verify(protosKeyBuilderMock).setSecretBytes((ByteString) any());
            verify(protosKeyBuilderMock).setType(Protos.Key.Type.ORIGINAL);
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${eabd3d02-7d16-38fc-868d-6e8863269a78}
    @Ignore()
    @Test()
    public void fromProtobufUnencryptedTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chain
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            //Act Statement(s)
            BasicKeyChain result = BasicKeyChain.fromProtobufUnencrypted(protosKeyList);
            BasicKeyChain basicKeyChain = new BasicKeyChain();
            //Assert statement(s)
            //TODO: Please implement equals method in BasicKeyChain for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(basicKeyChain));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${fdf441cb-65fe-3b5c-b115-cf990a61aa5e}
    @Ignore()
    @Test()
    public void fromProtobufEncryptedTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chain
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock2 = mock(KeyCrypter.class, "{}");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            BasicKeyChain result = BasicKeyChain.fromProtobufEncrypted(protosKeyList, keyCrypterMock2);
            KeyCrypter keyCrypter = Objects.requireNonNull(keyCrypterMock2);
            BasicKeyChain basicKeyChain = new BasicKeyChain(keyCrypter);
            //Assert statement(s)
            //TODO: Please implement equals method in BasicKeyChain for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(basicKeyChain));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}
    @Ignore()
    @Test()
    public void addEventListenerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doNothing().when(target).addEventListener(keyChainEventListenerMock, (Executor) null);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).addEventListener(keyChainEventListenerMock, (Executor) null);
        }
    }

    //Sapient generated method id: ${283de23e-4782-3528-be05-a980b30b2663}
    @Ignore()
    @Test()
    public void addEventListener1Test() {
        //Arrange Statement(s)
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class, "null");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock, executor);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${8fc36a2a-7a2b-30fb-8f9a-ff37f2073d36}
    @Test()
    public void addEventListener2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            Object object = new Object();
            ListenerRegistration<KeyChainEventListener> listenerRegistration = new ListenerRegistration<>(object, (Executor) null);
            //Act Statement(s)
            target.addEventListener(listenerRegistration);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${278547ff-7b2e-3fb2-965f-5808a178e872}
    @Test()
    public void removeEventListenerWhenListenerRegistrationRemoveFromListListenerListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, listeners)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${2729ee32-8492-327e-ba2d-e05b6e9496e8}
    @Test()
    public void removeEventListenerWhenListenerRegistrationNotRemoveFromListListenerListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, listeners)) : false
         */
        //Arrange Statement(s)
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), any())).thenReturn(false);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(keyChainEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${69dbc322-e198-3445-b244-24a19e5060ed}
    @Test()
    public void toEncryptedWhenPasswordLengthGreaterThan0() throws KeyCrypterException {
        /* Branches:
         * (password.length() > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doReturn(basicKeyChainMock).when(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
            //Act Statement(s)
            BasicKeyChain result = target.toEncrypted((CharSequence) "toEncrypted_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(basicKeyChainMock));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
        }
    }

    //Sapient generated method id: ${d9be1371-e617-30dc-aa03-828f363c5022}
    @Ignore()
    @Test()
    public void toEncryptedWhenPasswordLengthNotGreaterThan0() throws KeyCrypterException {
        /* Branches:
         * (password.length() > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doReturn(basicKeyChainMock).when(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
            //Act Statement(s)
            BasicKeyChain result = target.toEncrypted((CharSequence) "toEncrypted_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(basicKeyChainMock));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).toEncrypted((KeyCrypterScrypt) any(), (AesKey) any());
        }
    }

    //Sapient generated method id: ${1bdb17bb-1002-3203-937c-75660bb17455}
    @Test()
    public void toDecryptedTest() throws KeyCrypterException {
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class, "UnknownObjectContent{target='org.bitcoinj.crypto.AesKey', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("toDecrypted_charSequence1");
            doReturn(basicKeyChainMock).when(target).toDecrypted(aesKeyMock);
            //Act Statement(s)
            BasicKeyChain result = target.toDecrypted((CharSequence) "toDecrypted_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(basicKeyChainMock));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(keyCrypterMock).deriveKey("toDecrypted_charSequence1");
            verify(target).toDecrypted(aesKeyMock);
        }
    }

    //Sapient generated method id: ${2571c489-32ab-35c1-bd4a-d0b0f5d4d34d}
    @Ignore()
    @Test()
    public void checkPasswordWhenKeyCrypterIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (keyCrypter != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${92a561ff-2e7a-3f34-99c1-4f10c9a5739d}
    @Test()
    public void checkAESKeyWhenHashToKeysIsEmpty() {
        /* Branches:
         * (hashToKeys.isEmpty()) : true
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            boolean result = target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9266e2a3-866e-38e5-be88-a823742ce3e0}
    @Test()
    public void getFilterWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            BloomFilter result = target.getFilter(1000, Double.parseDouble("0.01"), 10);
            BloomFilter bloomFilter = new BloomFilter(1000, Double.parseDouble("0.01"), 10);
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilter));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${bce340de-c9e7-3b09-ae2c-d943d6a73f89}
    @Test()
    public void numBloomFilterEntriesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            //Act Statement(s)
            int result = target.numBloomFilterEntries();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${92d970e1-425c-316a-b84d-dd818fccb15d}
    @Test()
    public void findOldestKeyAfterWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            Optional<ECKey> result = target.findOldestKeyAfter(instant);
            Optional<ECKey> eCKeyOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyOptional));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${f86a5b47-e867-37c3-8872-383eb8f89aac}
    @Test()
    public void findOldestKeyAfter1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doReturn(Optional.empty()).when(target).findOldestKeyAfter((Instant) any());
            //Act Statement(s)
            ECKey result = target.findOldestKeyAfter(1620000000L);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).findOldestKeyAfter((Instant) any());
        }
    }

    //Sapient generated method id: ${b76a6220-3783-3356-ae38-5dddbf5dead9}
    @Test()
    public void findKeysBeforeWhenHashToKeysValuesIsEmpty() {
        /* Branches:
         * (for-each(hashToKeys.values())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = new BasicKeyChain(keyCrypterMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            List<ECKey> result = target.findKeysBefore(instant);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${5cba9991-a1d7-3cf6-b24a-e46b4bae8418}
    @Test()
    public void findKeysBefore1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(BasicKeyChain.class);
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(reentrantLock);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            List<ECKey> eCKeyList = new ArrayList<>();
            doReturn(eCKeyList).when(target).findKeysBefore((Instant) any());
            //Act Statement(s)
            List<ECKey> result = target.findKeysBefore(0L);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyList));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).findKeysBefore((Instant) any());
        }
    }

    //Sapient generated method id: ${2f338cc5-4f2a-30e5-87d8-039bec302a04}
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
        ECKey eCKeyMock = mock(ECKey.class);
        AesKey aesKeyMock = mock(AesKey.class, "bXlTZWNyZXRLZXk=");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(eCKeyList).when(target).getKeys();
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(eCKeyMock).formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, null, "imported");
            //Act Statement(s)
            String result = target.toString(true, aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(""));
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).getKeys();
            verify(eCKeyMock).formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, null, "imported");
        }
    }

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}
    @Test()
    public void toString1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "{}");
        Network networkMock = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        AesKey aesKeyMock = mock(AesKey.class, "null");
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(networkMock).when(paramsMock).network();
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(BasicKeyChain.class)).thenReturn(null);
            BasicKeyChain target = spy(new BasicKeyChain(keyCrypterMock));
            doReturn("return_of_toString1").when(target).toString(false, aesKeyMock, networkMock);
            //Act Statement(s)
            String result = target.toString(false, aesKeyMock, paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            verify(paramsMock).network();
            threading.verify(() -> Threading.lock(BasicKeyChain.class), atLeast(1));
            verify(target).toString(false, aesKeyMock, networkMock);
        }
    }
}
