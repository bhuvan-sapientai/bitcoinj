package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

public class PBKDF2SHA512SapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bf721fa9-b2e9-3c97-8613-89cb319b0ef5}
    @Test()
    public void deriveWhenCNotGreaterThan0AndDkLenNotGreaterThan0AndIGreaterThanL() throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        /* Branches:
         * (c > 0) : false
         * (dkLen > 0) : false
         * (i <= l) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = PBKDF2SHA512.derive("P1", "S1", 0, 0);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${6083de3b-8578-3540-ab0c-6cab23e8ec38}
    @Ignore()
    @Test()
    public void deriveWhenDkLenNotGreaterThan0AndIGreaterThanLAndCaughtIOExceptionOrNoSuchAlgorithmExceptionOrInvThrowsRuntimeException() {
        /* Branches:
         * (c > 0) : false
         * (dkLen > 0) : false
         * (i <= l) : false
         * (catch-exception (IOException | NoSuchAlgorithmException | InvalidKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(Exception.class));
            //Act Statement(s)
            PBKDF2SHA512.derive("P1", "S1", -64, -64);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${3060f228-bd9a-3b1d-9e16-ced38010f96e}
    @Ignore()
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
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = PBKDF2SHA512.derive("P1", "S1", 2, 1);
            byte[] byteResultArray = new byte[]{(byte) -44};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${1e26360d-137e-3978-b018-4b5a879346ca}
    @Ignore()
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(Exception.class));
            //Act Statement(s)
            PBKDF2SHA512.derive("P1", "S1", 2, 1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }
}
