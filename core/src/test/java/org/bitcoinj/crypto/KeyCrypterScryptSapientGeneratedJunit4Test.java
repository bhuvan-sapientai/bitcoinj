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

import org.junit.Ignore;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class KeyCrypterScryptSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AesKey aesKeyMock = mock(AesKey.class, "[9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]");

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class, "[1, 2, 3, 4]");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Protos.ScryptParameters scryptParametersMock = mock(Protos.ScryptParameters.class, "scryptParameters");

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final Protos.ScryptParameters.Builder protosScryptParametersBuilderMock = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=true, builderPattern=false}");

    private final Protos.ScryptParameters.Builder protosScryptParametersBuilderMock2 = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=false, builderPattern=false}");

    private final Protos.ScryptParameters.Builder protosScryptParametersBuilderMock3 = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=true, builderPattern=false}");

    //Sapient generated method id: ${e0a396b8-e699-3ba9-89e3-42cdae4628d2}
    @Ignore()
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
        Protos.ScryptParameters.Builder protosScryptParametersBuilderMock = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(protosScryptParametersBuilderMock2).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            doReturn(protosScryptParametersBuilderMock3).when(protosScryptParametersBuilderMock2).setN(1000L);
            doReturn(scryptParametersMock).when(protosScryptParametersBuilderMock3).build();
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray4 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32)).thenReturn(byteArray2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            doReturn(byteStringMock, byteStringMock2).when(scryptParametersMock).getSalt();
            doReturn(byteArray4).when(byteStringMock2).toByteArray();
            doReturn(1L, 2L).when(scryptParametersMock).getN();
            doReturn(0, 2).when(scryptParametersMock).getR();
            doReturn(0, 2).when(scryptParametersMock).getP();
            Exception exception = new Exception();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not generate key from password and salt.", exception);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.deriveKey("deriveKey_charSequence1");
            //Assert statement(s)
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            verify(protosScryptParametersBuilderMock2).setN(1000L);
            verify(protosScryptParametersBuilderMock3).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32), atLeast(1));
            verify(scryptParametersMock, times(2)).getSalt();
            verify(byteStringMock2).toByteArray();
            verify(scryptParametersMock, times(2)).getN();
            verify(scryptParametersMock, times(2)).getR();
            verify(scryptParametersMock, times(2)).getP();
        }
    }

    //Sapient generated method id: ${baad55b0-0ff3-3df7-9eee-6738fae6b611}
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
        Protos.ScryptParameters.Builder protosScryptParametersBuilderMock = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(protosScryptParametersBuilderMock2).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            doReturn(protosScryptParametersBuilderMock3).when(protosScryptParametersBuilderMock2).setN(1000L);
            doReturn(scryptParametersMock).when(protosScryptParametersBuilderMock3).build();
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray4 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32)).thenReturn(byteArray2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            doReturn(byteStringMock, byteStringMock2).when(scryptParametersMock).getSalt();
            doReturn(byteArray4).when(byteStringMock2).toByteArray();
            doReturn(1L, 2L).when(scryptParametersMock).getN();
            doReturn(0, 2).when(scryptParametersMock).getR();
            doReturn(0, 2).when(scryptParametersMock).getP();
            //Act Statement(s)
            AesKey result = target.deriveKey("deriveKey_charSequence1");
            AesKey aesKey = new AesKey(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(aesKey));
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            verify(protosScryptParametersBuilderMock2).setN(1000L);
            verify(protosScryptParametersBuilderMock3).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32), atLeast(1));
            verify(scryptParametersMock, times(2)).getSalt();
            verify(byteStringMock2).toByteArray();
            verify(scryptParametersMock, times(2)).getN();
            verify(scryptParametersMock, times(2)).getR();
            verify(scryptParametersMock, times(2)).getP();
        }
    }

    //Sapient generated method id: ${76902325-0fc0-3630-b1ca-79270b5bf07b}
    @Ignore()
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
        Protos.ScryptParameters.Builder protosScryptParametersBuilderMock = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(protosScryptParametersBuilderMock2).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            doReturn(protosScryptParametersBuilderMock3).when(protosScryptParametersBuilderMock2).setN(16384L);
            doReturn(scryptParametersMock).when(protosScryptParametersBuilderMock3).build();
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1};
            byte[] byteArray4 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32)).thenReturn(byteArray2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(16384);
            doReturn(null).when(scryptParametersMock).getSalt();
            doReturn(1L, 2L).when(scryptParametersMock).getN();
            doReturn(0, 2).when(scryptParametersMock).getR();
            doReturn(0, 2).when(scryptParametersMock).getP();
            Exception exception = new Exception();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not generate key from password and salt.", exception);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.deriveKey("deriveKey_charSequence1");
            //Assert statement(s)
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            verify(protosScryptParametersBuilderMock2).setN(16384L);
            verify(protosScryptParametersBuilderMock3).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32), atLeast(1));
            verify(scryptParametersMock).getSalt();
            verify(scryptParametersMock, times(2)).getN();
            verify(scryptParametersMock, times(2)).getR();
            verify(scryptParametersMock, times(2)).getP();
        }
    }

    //Sapient generated method id: ${0d8ed7e6-b847-39b1-a65d-e9e00678ec99}
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
        Protos.ScryptParameters.Builder protosScryptParametersBuilderMock = mock(Protos.ScryptParameters.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$ScryptParameters$Builder', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<SCrypt> sCrypt = mockStatic(SCrypt.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(protosScryptParametersBuilderMock2).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            doReturn(protosScryptParametersBuilderMock3).when(protosScryptParametersBuilderMock2).setN(1L);
            doReturn(scryptParametersMock).when(protosScryptParametersBuilderMock3).build();
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 1};
            byte[] byteArray4 = new byte[]{};
            sCrypt.when(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32)).thenReturn(byteArray2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1);
            doReturn(null).when(scryptParametersMock).getSalt();
            doReturn(1L, 2L).when(scryptParametersMock).getN();
            doReturn(0, 2).when(scryptParametersMock).getR();
            doReturn(0, 8).when(scryptParametersMock).getP();
            //Act Statement(s)
            AesKey result = target.deriveKey("deriveKey_charSequence1");
            AesKey aesKey = new AesKey(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(aesKey));
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            verify(protosScryptParametersBuilderMock2).setN(1L);
            verify(protosScryptParametersBuilderMock3).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            sCrypt.verify(() -> SCrypt.generate(byteArray3, byteArray4, 1, 0, 0, 32), atLeast(1));
            verify(scryptParametersMock).getSalt();
            verify(scryptParametersMock, times(2)).getN();
            verify(scryptParametersMock, times(2)).getR();
            verify(scryptParametersMock, times(2)).getP();
        }
    }

    //Sapient generated method id: ${1b8819ab-29ce-3ea9-8d0c-17aec2d6595c}
    @Ignore()
    @Test()
    public void encryptTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class, "[1, 2, 3, 4, 5]");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            doReturn(byteArray).when(aesKeyMock).bytes();
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
            //Act Statement(s)
            EncryptedData result = target.encrypt(byteArray3, aesKeyMock);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray5 = new byte[]{(byte) 0};
            EncryptedData encryptedData = new EncryptedData(byteArray4, byteArray5);
            //Assert statement(s)
            assertThat(result, equalTo(encryptedData));
            verify(aesKeyMock).bytes();
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${40787a12-d2c9-3424-9699-ccf0f753bae9}
    @Ignore()
    @Test()
    public void encryptWhenCaughtExceptionThrowsKeyCrypterException() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class, "bXlTZWNyZXRLaWw=");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(aesKeyMock).bytes();
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            Exception exception = new Exception();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not encrypt bytes.", exception);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            byte[] byteArray3 = new byte[]{(byte) 0};
            //Act Statement(s)
            target.encrypt(byteArray3, aesKeyMock);
            //Assert statement(s)
            verify(aesKeyMock).bytes();
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${b02563ea-7952-35db-a26b-96043074b454}
    @Ignore()
    @Test()
    public void decryptTest() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(aesKeyMock).bytes();
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            //Act Statement(s)
            byte[] result = target.decrypt(encryptedDataMock, aesKeyMock);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            verify(aesKeyMock).bytes();
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${5f8bc98d-fe6d-3c6f-b8cc-0d10ce518b92}
    @Ignore()
    @Test()
    public void decryptWhenCaughtInvalidCipherTextExceptionThrowsKeyCrypterExceptionInvalidCipherText() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (InvalidCipherTextException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class, "[7, 8, 9, 16, 17, 18, 19, 20, 21, 22]");
        InvalidCipherTextException invalidCipherTextExceptionMock = mock(InvalidCipherTextException.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class, "[1, 2, 3]");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            doReturn(byteArray).when(aesKeyMock).bytes();
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Could not decrypt bytes", invalidCipherTextExceptionMock);
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(encryptedDataMock, aesKeyMock);
            //Assert statement(s)
            verify(aesKeyMock).bytes();
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${51273030-c9d4-3dd2-a62d-f42a368dd9bb}
    @Ignore()
    @Test()
    public void decryptWhenCaughtRuntimeExceptionThrowsKeyCrypterException() throws KeyCrypterException, IllegalArgumentException, DataLengthException, IllegalStateException, InvalidCipherTextException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cipher
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(aesKeyMock).bytes();
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(1000);
            RuntimeException runtimeException = new RuntimeException();
            KeyCrypterException keyCrypterException = new KeyCrypterException("Could not decrypt bytes", runtimeException);
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(encryptedDataMock, aesKeyMock);
            //Assert statement(s)
            verify(aesKeyMock).bytes();
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${706a028a-ba94-35e6-bc50-a74a7895fb1e}
    @Test()
    public void getUnderstoodEncryptionTypeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(10000);
            //Act Statement(s)
            Protos.Wallet.EncryptionType result = target.getUnderstoodEncryptionType();
            //Assert statement(s)
            assertThat(result, equalTo(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES));
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
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
        Protos.ScryptParameters scryptParametersMock2 = mock(Protos.ScryptParameters.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.ScryptParameters> protosScryptParameters = mockStatic(Protos.ScryptParameters.class)) {
            protosScryptParameters.when(() -> Protos.ScryptParameters.newBuilder()).thenReturn(protosScryptParametersBuilderMock);
            doReturn(null).when(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            KeyCrypterScrypt target = new KeyCrypterScrypt(10000);
            doReturn(2L).when(scryptParametersMock2).getN();
            doReturn(2).when(scryptParametersMock2).getR();
            doReturn(2).when(scryptParametersMock2).getP();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("AES-256-CBC, Scrypt (N=2, r=2, p=2)"));
            protosScryptParameters.verify(() -> Protos.ScryptParameters.newBuilder(), atLeast(1));
            verify(protosScryptParametersBuilderMock).setSalt((ByteString) any());
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            verify(scryptParametersMock2).getN();
            verify(scryptParametersMock2).getR();
            verify(scryptParametersMock2).getP();
        }
    }
}
