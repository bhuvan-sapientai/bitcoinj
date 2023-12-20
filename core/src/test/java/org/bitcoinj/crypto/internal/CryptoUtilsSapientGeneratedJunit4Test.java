package org.bitcoinj.crypto.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class CryptoUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${662cd202-d3c8-3636-a60f-0effbec33b0d}
    @Test()
    public void sha256hash160Test() {
        //Arrange Statement(s)
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) -29, (byte) -80, (byte) -60, (byte) 66, (byte) -104, (byte) -4, (byte) 28, (byte) 20, (byte) -102, (byte) -5, (byte) -12, (byte) -56, (byte) -103, (byte) 111, (byte) -71, (byte) 36, (byte) 39, (byte) -82, (byte) 65, (byte) -28, (byte) 100, (byte) -101, (byte) -109, (byte) 76, (byte) -92, (byte) -107, (byte) -103, (byte) 27, (byte) 120, (byte) 82, (byte) -72, (byte) 85};
            cryptoUtils.when(() -> CryptoUtils.digestRipeMd160(byteArray2)).thenReturn(byteArray);
            byte[] byteArray3 = new byte[]{};
            //Act Statement(s)
            byte[] result = CryptoUtils.sha256hash160(byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            cryptoUtils.verify(() -> CryptoUtils.digestRipeMd160(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${650b2f65-50e0-3ede-840a-bbb1df698793}
    @Ignore()
    @Test()
    public void digestRipeMd160Test() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        byte[] result = CryptoUtils.digestRipeMd160(byteArray);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }
}
