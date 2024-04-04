package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.protobuf.wallet.Protos;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bitcoinj.base.internal.Stopwatch;
import com.google.protobuf.ByteString;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class KeyCrypterScryptSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Protos.ScryptParameters scryptParametersMock = mock(Protos.ScryptParameters.class, "scryptParameters");

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final ByteString byteStringMock3 = mock(ByteString.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3983718c-5048-3283-8aaa-9c1fb1186d8b}, hash: 096B7FA6C0F507254013583C29371BF2
    @Ignore()
    @Test()
    public void randomSaltTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.security.SecureRandom::nextBytes has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = KeyCrypterScrypt.randomSalt();
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${e0a396b8-e699-3ba9-89e3-42cdae4628d2}, hash: 9CFBBB0890474E469C8E1DE0B958FDFF
    @Test()
    public void deriveKeyWhenCaughtExceptionThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (i < charSequence.length()) : true  #  inside convertToByteArray method
         * (scryptParameters.getSalt() != null) : true
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray3 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32)).thenReturn(byteArray);
            Protos.ScryptParameters scryptParameters = Protos.ScryptParameters.getDefaultInstance();
            KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParameters);
            Exception exception = new Exception();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not generate key from password and salt.", exception);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.deriveKey("deriveKey_charSequence1");
            //Assert statement(s)
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32), atLeast(1));
        }
    }

    //Sapient generated method id: ${baad55b0-0ff3-3df7-9eee-6738fae6b611}, hash: 22D2035E837CE9AEA9A97353CB7623A8
    @Ignore()
    @Test()
    public void deriveKeyWhenPasswordBytesIsNotNull() throws Exception {
        /* Branches:
         * (i < charSequence.length()) : true  #  inside convertToByteArray method
         * (scryptParameters.getSalt() != null) : true
         * (passwordBytes != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray3 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32)).thenReturn(byteArray);
            Protos.ScryptParameters scryptParameters = Protos.ScryptParameters.getDefaultInstance();
            KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParameters);
            //Act Statement(s)
            AesKey result = target.deriveKey("deriveKey_charSequence1");
            AesKey aesKey = new AesKey(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(aesKey));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32), atLeast(1));
        }
    }

    //Sapient generated method id: ${76902325-0fc0-3630-b1ca-79270b5bf07b}, hash: 91DF3607456BAC82A98D849A39A98C5C
    @Test()
    public void deriveKeyWhenScryptParametersGetSaltIsNullAndCaughtExceptionThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (i < charSequence.length()) : true  #  inside convertToByteArray method
         * (scryptParameters.getSalt() != null) : false
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray3 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32)).thenReturn(byteArray);
            Protos.ScryptParameters scryptParameters = Protos.ScryptParameters.getDefaultInstance();
            KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParameters);
            Exception exception = new Exception();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not generate key from password and salt.", exception);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.deriveKey("deriveKey_charSequence1");
            //Assert statement(s)
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32), atLeast(1));
        }
    }

    //Sapient generated method id: ${0d8ed7e6-b847-39b1-a65d-e9e00678ec99}, hash: A0C949C8F745ABB7499CF66253664D02
    @Ignore()
    @Test()
    public void deriveKeyWhenScryptParametersGetSaltIsNullAndPasswordBytesIsNotNull() throws Exception {
        /* Branches:
         * (i < charSequence.length()) : true  #  inside convertToByteArray method
         * (scryptParameters.getSalt() != null) : false
         * (passwordBytes != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray3 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32)).thenReturn(byteArray);
            Protos.ScryptParameters scryptParameters = Protos.ScryptParameters.getDefaultInstance();
            KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParameters);
            //Act Statement(s)
            AesKey result = target.deriveKey("deriveKey_charSequence1");
            AesKey aesKey = new AesKey(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(aesKey));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray2, byteArray3, 16384, 8, 1, 32), atLeast(1));
        }
    }

    //Sapient generated method id: ${1b8819ab-29ce-3ea9-8d0c-17aec2d6595c}, hash: C37FF5F3A13ADABB5031536FB796C41B
    @Ignore()
    @Test()
    public void encryptTest() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(aesKeyMock).bytes();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray3 = new byte[]{};
        doReturn(byteArray3).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        byte[] byteArray4 = new byte[]{};
        //Act Statement(s)
        EncryptedData result = target.encrypt(byteArray4, aesKeyMock);
        byte[] byteArray5 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        byte[] byteArray6 = new byte[]{};
        EncryptedData encryptedData = new EncryptedData(byteArray5, byteArray6);
        //Assert statement(s)
        assertThat(result, equalTo(encryptedData));
        verify(aesKeyMock).bytes();
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${40787a12-d2c9-3424-9699-ccf0f753bae9}, hash: 808D30764AA9D3950D15C247B89AEC02
    @Test()
    public void encryptWhenCaughtExceptionThrowsKeyCrypterException() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(aesKeyMock).bytes();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray3 = new byte[]{};
        doReturn(byteArray3).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        Exception exception = new Exception();
        KeyCrypterException keyCrypterException = new KeyCrypterException("Could not encrypt bytes.", exception);
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        byte[] byteArray4 = new byte[]{};
        //Act Statement(s)
        target.encrypt(byteArray4, aesKeyMock);
        //Assert statement(s)
        verify(aesKeyMock).bytes();
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${b02563ea-7952-35db-a26b-96043074b454}, hash: 9416576A4FBB58E4F2CC9B40BBCA3B06
    @Ignore()
    @Test()
    public void decryptTest() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(aesKeyMock).bytes();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray3 = new byte[]{};
        doReturn(byteArray3).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        byte[] byteArray4 = new byte[]{};
        byte[] byteArray5 = new byte[]{};
        EncryptedData encryptedData = new EncryptedData(byteArray4, byteArray5);
        //Act Statement(s)
        byte[] result = target.decrypt(encryptedData, aesKeyMock);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
        verify(aesKeyMock).bytes();
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${5f8bc98d-fe6d-3c6f-b8cc-0d10ce518b92}, hash: D87718AAA633E632D106364022DD01A9
    @Ignore()
    @Test()
    public void decryptWhenCaughtInvalidCipherTextExceptionThrowsKeyCrypterExceptionInvalidCipherText() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (InvalidCipherTextException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(aesKeyMock).bytes();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray3 = new byte[]{};
        doReturn(byteArray3).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        InvalidCipherTextException invalidCipherTextExceptionMock = mock(InvalidCipherTextException.class);
        KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Could not decrypt bytes", invalidCipherTextExceptionMock);
        thrown.expect(KeyCrypterException.InvalidCipherText.class);
        thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
        byte[] byteArray4 = new byte[]{};
        byte[] byteArray5 = new byte[]{};
        EncryptedData encryptedData = new EncryptedData(byteArray4, byteArray5);
        //Act Statement(s)
        target.decrypt(encryptedData, aesKeyMock);
        //Assert statement(s)
        verify(aesKeyMock).bytes();
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${51273030-c9d4-3dd2-a62d-f42a368dd9bb}, hash: F26E82F6DEDE46EC2E4A87E1C94E1D9F
    @Test()
    public void decryptWhenCaughtRuntimeExceptionThrowsKeyCrypterException() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(aesKeyMock).bytes();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray3 = new byte[]{};
        doReturn(byteArray3).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        RuntimeException runtimeException = new RuntimeException();
        KeyCrypterException keyCrypterException = new KeyCrypterException("Could not decrypt bytes", runtimeException);
        thrown.expect(KeyCrypterException.class);
        thrown.expectMessage(keyCrypterException.getMessage());
        byte[] byteArray4 = new byte[]{};
        byte[] byteArray5 = new byte[]{};
        EncryptedData encryptedData = new EncryptedData(byteArray4, byteArray5);
        //Act Statement(s)
        target.decrypt(encryptedData, aesKeyMock);
        //Assert statement(s)
        verify(aesKeyMock).bytes();
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${706a028a-ba94-35e6-bc50-a74a7895fb1e}, hash: 7D2A52A86CD22BC9BA1B2079D9FA0D19
    @Test()
    public void getUnderstoodEncryptionTypeTest() {
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        //Act Statement(s)
        Protos.Wallet.EncryptionType result = target.getUnderstoodEncryptionType();
        //Assert statement(s)
        assertThat(result, equalTo(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES));
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: DD16FCC936F601C47728F0A63F2D327A
    @Test()
    public void toStringTest() {
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(byteStringMock2).toByteArray();
        doReturn(byteStringMock, byteStringMock2, byteStringMock3).when(scryptParametersMock).getSalt();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(byteStringMock3).toByteArray();
        KeyCrypterScrypt target = new KeyCrypterScrypt(scryptParametersMock);
        doReturn(2L).when(scryptParametersMock).getN();
        doReturn(2).when(scryptParametersMock).getR();
        doReturn(2).when(scryptParametersMock).getP();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("AES-256-CBC, Scrypt (N=2, r=2, p=2)"));
        verify(scryptParametersMock, times(3)).getSalt();
        verify(byteStringMock2).toByteArray();
        verify(byteStringMock3).toByteArray();
        verify(scryptParametersMock).getN();
        verify(scryptParametersMock).getR();
        verify(scryptParametersMock).getP();
    }
}
