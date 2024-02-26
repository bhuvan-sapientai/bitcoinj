package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class PBKDF2SHA512SapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${4e65e438-c2cc-36eb-b7b6-206502cbfb7c}
    @Test()
    public void deriveWhenCNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (c > 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        PBKDF2SHA512.derive("P1", "S1", -1, 0);
    }

    //Sapient generated method id: ${f73eb3cd-3938-3e7b-a3e8-d45af4579767}
    @Test()
    public void deriveWhenDkLenNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (c > 0) : true
         * (dkLen > 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        PBKDF2SHA512.derive("P1", "S1", 1, -1);
    }

    //Sapient generated method id: ${3060f228-bd9a-3b1d-9e16-ced38010f96e}
    @Test()
    public void deriveWhenKLessThanU_XORLength() throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        /* Branches:
         * (c > 0) : true
         * (dkLen > 0) : true
         * (i <= l) : true
         * (j < c) : true  #  inside F method
         * (j == 0) : true  #  inside F method
         * (k < U_XOR.length) : true  #  inside F method
         */

        //Act Statement(s)
        byte[] result = PBKDF2SHA512.derive("P1", "S1", 2, 1);
        byte[] byteResultArray = new byte[]{(byte) -44};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${1e26360d-137e-3978-b018-4b5a879346ca}
    @Test()
    public void deriveWhenKLessThanU_XORLengthAndCaughtIOExceptionOrNoSuchAlgorithmExceptionOrInvalidKeyExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (c > 0) : true
         * (dkLen > 0) : true
         * (i <= l) : true
         * (j < c) : true  #  inside F method
         * (j == 0) : true  #  inside F method
         * (k < U_XOR.length) : true  #  inside F method
         * (catch-exception (IOException | NoSuchAlgorithmException | InvalidKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 115, (byte) 111, (byte) 109, (byte) 101, (byte) 79, (byte) 116, (byte) 104, (byte) 101, (byte) 114, (byte) 86, (byte) 97, (byte) 108, (byte) 117, (byte) 101};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
            byteUtils.when(() -> ByteUtils.concat(byteArray2, byteArray3)).thenReturn(byteArray);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(Exception.class)));
            //Act Statement(s)
            PBKDF2SHA512.derive("someValue", "someOtherValue", 1, 32);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.concat(byteArray2, byteArray3), atLeast(1));
        }
    }
}
