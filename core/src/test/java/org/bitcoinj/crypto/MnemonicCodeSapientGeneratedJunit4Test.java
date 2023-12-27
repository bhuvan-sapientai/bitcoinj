package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.MnemonicException.MnemonicLengthException;
import org.bitcoinj.crypto.MnemonicException.MnemonicWordException;
import org.bitcoinj.crypto.MnemonicException.MnemonicChecksumException;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.internal.Stopwatch;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.bitcoinj.base.internal.InternalUtils;
import org.junit.Ignore;

public class MnemonicCodeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bbc7e52c-9056-3edb-af4e-83f69b845157}
    @Ignore()
    @Test()
    public void toSeedTest() {
        //Arrange Statement(s)
        try (MockedStatic<PBKDF2SHA512> pBKDF2SHA512 = mockStatic(PBKDF2SHA512.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            byte[] byteArray = new byte[]{};
            pBKDF2SHA512.when(() -> PBKDF2SHA512.derive("apple banana cherry date elderberry", "mnemonictest", 2048, 64)).thenReturn(byteArray);
            List<String> stringList = new ArrayList<>();
            stringList.add("{value=0}");
            stringList.add("apple banana cherry date elderberry");
            stringList.add("[10, 20, 30, 40, 50]");
            //Act Statement(s)
            byte[] result = MnemonicCode.toSeed(stringList, "test");
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            pBKDF2SHA512.verify(() -> PBKDF2SHA512.derive("apple banana cherry date elderberry", "mnemonictest", 2048, 64), atLeast(1));
        }
    }
}
