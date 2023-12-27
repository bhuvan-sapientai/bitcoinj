package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.crypto.MnemonicException;
import org.bitcoinj.crypto.MnemonicException.MnemonicLengthException;
import org.bitcoinj.crypto.MnemonicException.MnemonicWordException;
import org.bitcoinj.crypto.MnemonicException.MnemonicChecksumException;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.Arrays;

import org.bitcoinj.protobuf.wallet.Protos;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.crypto.AesKey;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.base.internal.InternalUtils;

import java.util.function.Supplier;
import java.security.SecureRandom;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
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

import java.util.Objects;

import org.bitcoinj.base.internal.ByteUtils;

public class DeterministicSeedSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DeterministicSeed target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final MnemonicCode INSTANCEMock = mock(MnemonicCode.class);

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${cc444f77-140b-3840-9219-40eba5f4e575}
    @Test()
    public void ofMnemonicWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 176)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofMnemonic("example mnemonic code", "example passphrase", instant);
        Instant instant2 = Objects.requireNonNull(instant);
        DeterministicSeed deterministicSeed = new DeterministicSeed("example mnemonic code", (byte[]) null, "example passphrase", instant2);

        //Assert statement(s)
        assertThat(result, equalTo(deterministicSeed));
    }

    //Sapient generated method id: ${ad639f9a-f0b3-3496-9f21-818d7b7016b0}
    @Test()
    public void ofMnemonic1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 176)) : false  #  inside <init> method
         */

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofMnemonic("example mnemonic code", "example passphrase");
        DeterministicSeed deterministicSeed = new DeterministicSeed("example mnemonic code", (byte[]) null, "example passphrase", (Instant) null);

        //Assert statement(s)
        assertThat(result, equalTo(deterministicSeed));
    }

    //Sapient generated method id: ${118bbc22-6633-3a3f-ba11-ced895a866d0}
    @Ignore()
    @Test()
    public void ofMnemonic2WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 176)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        Instant instant = Instant.now();

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofMnemonic(stringList, "myPassphrase", instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${cfa071ed-dabf-305c-9e6c-390b89e99a34}
    @Ignore()
    @Test()
    public void ofMnemonic3WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 176)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofMnemonic(stringList, "myPassphrase");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6336bb76-376a-3c95-b381-de35bcc12f08}
    @Test()
    public void ofEntropyWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 193)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Instant instant = Instant.now();

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofEntropy(byteArray, "testPassphrase", instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5d4d94a2-9c70-335e-8a9c-bd4a5fd851b5}
    @Ignore()
    @Test()
    public void ofEntropyWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 193)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        Instant instant = Instant.now();

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofEntropy(byteArray, "passphrase1", instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${652497fa-bac1-3484-bf27-237e4c010f29}
    @Test()
    public void ofEntropy1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 193)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofEntropy(byteArray, "testPassphrase");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8dba0aaa-7140-3d30-9741-f866354a7894}
    @Ignore()
    @Test()
    public void ofEntropy1WhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 193)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};

        //Act Statement(s)
        DeterministicSeed result = DeterministicSeed.ofEntropy(byteArray, "test");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e0e63339-de46-337b-b131-03efb72cf524}
    @Ignore()
    @Test()
    public void ofRandomWhenDefaultBranch() {
        /* Branches:
         * (bits <= MAX_SEED_ENTROPY_BITS) : true  #  inside getEntropy method
         * (branch expression (line 193)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            SecureRandom secureRandom = new SecureRandom();
            //Act Statement(s)
            DeterministicSeed.ofRandom(secureRandom, 1, "java.lang.String");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${11618a64-70a2-357d-8b6f-d14c69a05b95}
    @Ignore()
    @Test()
    public void ofRandomWhenBitsGreaterThanMAX_SEED_ENTROPY_BITSAndDefaultBranch() {
        /* Branches:
         * (bits <= MAX_SEED_ENTROPY_BITS) : false  #  inside getEntropy method
         * (branch expression (line 193)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            SecureRandom secureRandom = new SecureRandom();
            //Act Statement(s)
            DeterministicSeed.ofRandom(secureRandom, 519, "<value>");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${fc18df03-baea-3039-97c2-113e392d9511}
    @Test()
    public void isEncryptedWhenEncryptedMnemonicCodeIsNull() {
        /* Branches:
         * (mnemonicCode != null) : true
         * (encryptedMnemonicCode != null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("apple banana cherry", byteArray, "secret", instant);

        //Act Statement(s)
        boolean result = target.isEncrypted();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6feb8104-e1fb-3c31-8751-eb2a06a07f7a}
    @Ignore()
    @Test()
    public void isEncryptedWhenEncryptedMnemonicCodeIsNullThrowsIllegalStateException() {
        /* Branches:
         * (mnemonicCode != null) : false
         * (encryptedMnemonicCode != null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("", byteArray, "", instant);

        //Act Statement(s)
        boolean result = target.isEncrypted();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = spy(new DeterministicSeed("defaultMnemonicString", byteArray, "defaultPassphrase", instant));
        doReturn("return_of_toString1").when(target).toString(false);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("return_of_toString1"));
        verify(target).toString(false);
    }

    //Sapient generated method id: ${6dad8bd2-d85e-3449-9e91-b444ceb1332f}
    @Ignore()
    @Test()
    public void toString1WhenIsEncrypted() {
        /* Branches:
         * (isEncrypted()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
        Instant instant = Instant.now();
        DeterministicSeed target = spy(new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant));
        doReturn(true).when(target).isEncrypted();

        //Act Statement(s)
        String result = target.toString(true);

        //Assert statement(s)
        assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
        verify(target).isEncrypted();
    }

    //Sapient generated method id: ${2d2467cc-8fbc-3cca-8870-867277564658}
    @Ignore()
    @Test()
    public void toString1WhenIncludePrivate() {
        /* Branches:
         * (isEncrypted()) : false
         * (includePrivate) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
        Instant instant = Instant.now();
        DeterministicSeed target = spy(new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant));
        doReturn(false).when(target).isEncrypted();
        doReturn("return_of_toHexString1").when(target).toHexString();
        doReturn("return_of_getMnemonicString1").when(target).getMnemonicString();

        //Act Statement(s)
        String result = target.toString(true);

        //Assert statement(s)
        assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
        verify(target).isEncrypted();
        verify(target).toHexString();
        verify(target).getMnemonicString();
    }

    //Sapient generated method id: ${5ebed118-9b1d-35c1-a79b-42d21b8e7844}
    @Ignore()
    @Test()
    public void toString1WhenNotIncludePrivate() {
        /* Branches:
         * (isEncrypted()) : false
         * (includePrivate) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = spy(new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant));
        doReturn(false).when(target).isEncrypted();

        //Act Statement(s)
        String result = target.toString(false);

        //Assert statement(s)
        assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
        verify(target).isEncrypted();
    }

    //Sapient generated method id: ${4f0e57cd-1ac1-3b44-824b-cb8a3095efd9}
    @Test()
    public void toHexStringWhenSeedIsNotNull() {
        /* Branches:
         * (seed != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("0102030405");
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
            Instant instant = Instant.now();
            DeterministicSeed target = new DeterministicSeed("example mnemonic string", byteArray2, "example passphrase", instant);
            //Act Statement(s)
            String result = target.toHexString();
            //Assert statement(s)
            assertThat(result, equalTo("0102030405"));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3d9549d-5c4c-3a8a-b78c-ec40ba218fa1}
    @Ignore()
    @Test()
    public void toHexStringWhenSeedIsNull() {
        /* Branches:
         * (seed != null) : false
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("", (byte[]) null, "", instant);

        //Act Statement(s)
        String result = target.toHexString();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${e399bed6-0e41-3bca-b4bf-c1d08029cd4b}
    @Ignore()
    @Test()
    public void getSecretBytesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = spy(new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant));
        doReturn("return_of_getMnemonicString1").when(target).getMnemonicString();

        //Act Statement(s)
        byte[] result = target.getSecretBytes();
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).getMnemonicString();
    }

    //Sapient generated method id: ${4f8f55cf-ca8f-38c9-882d-bf8e910dc2ab}
    @Test()
    public void getEncryptionTypeTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant);

        //Act Statement(s)
        Protos.Wallet.EncryptionType result = target.getEncryptionType();

        //Assert statement(s)
        assertThat(result, equalTo(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES));
    }

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}
    @Test()
    public void creationTimeTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("example mnemonic string", byteArray, "example passphrase", instant);

        //Act Statement(s)
        Optional<Instant> result = target.creationTime();
        Optional<Instant> instantOptional = Optional.of(instant);

        //Assert statement(s)
        assertThat(result, equalTo(instantOptional));
    }

    //Sapient generated method id: ${f3f8c93e-4bad-3365-95b7-147d7060a76b}
    @Test()
    public void setCreationTimeTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("example", byteArray, "password", instant);
        Instant instant2 = Instant.now();

        //Act Statement(s)
        target.setCreationTime(instant2);
    }

    //Sapient generated method id: ${1cb1776a-16c9-3d5e-abdd-90b3fd00e9dd}
    @Test()
    public void clearCreationTimeTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("example mnemonic", byteArray, "example passphrase", instant);

        //Act Statement(s)
        target.clearCreationTime();
    }

    //Sapient generated method id: ${aab7b3ee-0703-3aca-9aba-6676b7a750b3}
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsGreaterThan0() {
        /* Branches:
         * (creationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("example mnemonic", byteArray, "example passphrase", instant);

        //Act Statement(s)
        target.setCreationTimeSeconds(1000L);
    }

    //Sapient generated method id: ${bef4381a-288d-3155-9098-6a9016e3326b}
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsEquals0() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("<value>", byteArray, "<value>", instant);

        //Act Statement(s)
        target.setCreationTimeSeconds(0L);
    }

    //Sapient generated method id: ${6efdfffb-ab76-3832-8528-819e02d958d6}
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("valid string", byteArray, "valid passphrase", instant);

        //Act Statement(s)
        target.setCreationTimeSeconds(0L);
    }

    //Sapient generated method id: ${8b7e84bd-0ccd-3596-9058-c8181dad2a0e}
    @Ignore()
    @Test()
    public void encryptWhenEncryptedMnemonicCodeIsNullThrowsIllegalStateException() {
        /* Branches:
         * (encryptedMnemonicCode == null) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<value>");
        AesKey aesKeyMock = mock(AesKey.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            byte[] byteArray = new byte[]{(byte) 0};
            Instant instant = Instant.now();
            DeterministicSeed target = new DeterministicSeed("test mnemonic", byteArray, "<value>", instant);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${5f5d7fab-8006-359a-b433-0cb11c860206}
    @Ignore()
    @Test()
    public void checkWhenMnemonicCodeIsNotNull() throws MnemonicException {
        /* Branches:
         * (mnemonicCode != null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon about", byteArray, "test", instant);
        List<String> stringList = new ArrayList<>();
        doNothing().when(INSTANCEMock).check(stringList);

        //Act Statement(s)
        target.check();

        //Assert statement(s)
        verify(INSTANCEMock).check(stringList);
    }

    //Sapient generated method id: ${32c74248-2930-3c12-927c-0325b00acc83}
    @Ignore()
    @Test()
    public void getEntropyBytesTest() throws MnemonicException, MnemonicLengthException, MnemonicWordException, MnemonicChecksumException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon about", byteArray, "test passphrase", instant);
        byte[] byteArray2 = new byte[]{};
        List<String> stringList = new ArrayList<>();
        doReturn(byteArray2).when(INSTANCEMock).toEntropy(stringList);

        //Act Statement(s)
        byte[] result = target.getEntropyBytes();

        //Assert statement(s)
        assertThat(result, equalTo(byteArray2));
        verify(INSTANCEMock).toEntropy(stringList);
    }

    //Sapient generated method id: ${abf14659-70c3-3a8a-bba9-d38bcc45c268}
    @Ignore()
    @Test()
    public void getMnemonicStringWhenMnemonicCodeIsNotNull() {
        /* Branches:
         * (mnemonicCode != null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("apple orange banana", byteArray, "passphrase123", instant);

        //Act Statement(s)
        String result = target.getMnemonicString();

        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${3819241d-fc61-3112-8e31-bff67d14fc8f}
    @Ignore()
    @Test()
    public void getMnemonicStringWhenMnemonicCodeIsNull() {
        /* Branches:
         * (mnemonicCode != null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Instant instant = Instant.now();
        DeterministicSeed target = new DeterministicSeed("", byteArray, "", instant);

        //Act Statement(s)
        String result = target.getMnemonicString();

        //Assert statement(s)
        assertThat(result, equalTo(""));
    }
}
