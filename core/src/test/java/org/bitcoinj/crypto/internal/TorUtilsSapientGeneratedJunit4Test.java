package org.bitcoinj.crypto.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TorUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${819fa7d7-8e27-3dec-aa6d-cd2a3535a782}
    @Test()
    public void encodeOnionUrlV2WhenOnionAddrBytesLengthEquals10() {
        /* Branches:
         * (onionAddrBytes.length == 10) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9};
        //Act Statement(s)
        String result = TorUtils.encodeOnionUrlV2(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("aaaqeayeaudaocaj.onion"));
    }

    //Sapient generated method id: ${ff5377fc-9a7c-3c05-99d5-1129a469434b}
    @Ignore()
    @Test()
    public void encodeOnionUrlV2WhenOnionAddrBytesLengthNotEquals10() {
        /* Branches:
         * (onionAddrBytes.length == 10) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            String result = TorUtils.encodeOnionUrlV2(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo("aa.onion"));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${00df8018-4e21-3b3c-9542-60f1c757cd23}
    @Test()
    public void encodeOnionUrlV3WhenPubkeyLengthNotEquals32ThrowsIllegalArgumentException() {
        /* Branches:
         * (onionAddrBytes.length == 32) : true
         * (pubkey.length != 32) : true  #  inside onionChecksum method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Act Statement(s)
        String result = TorUtils.encodeOnionUrlV3(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam2dqd.onion"));
    }

    //Sapient generated method id: ${d2770bca-8ecb-3061-9bb4-2fb26b48b1a7}
    @Ignore()
    @Test()
    public void encodeOnionUrlV3WhenPubkeyLengthEquals32() {
        /* Branches:
         * (onionAddrBytes.length == 32) : true
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        String result = TorUtils.encodeOnionUrlV3(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad.onion"));
    }

    //Sapient generated method id: ${5856d451-e9da-3948-882f-0b6fac02117d}
    @Test()
    public void encodeOnionUrlV3WhenOnionAddrBytesLengthNotEquals32AndPubkeyLengthEquals32() {
        /* Branches:
         * (onionAddrBytes.length == 32) : false
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        String result = TorUtils.encodeOnionUrlV3(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("aaaqeayeaudaocajbifqydiob4ibceqtcqkrmfyydenbwha5dyp3kead.onion"));
    }

    //Sapient generated method id: ${238ad176-6ec7-3be4-bfff-5b17aab2c0aa}
    @Test()
    public void decodeOnionUrlWhenOnionUrlToLowerCaseLocaleROOTNotEndsWith_onionThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("not an onion URL: A");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("A");
    }

    //Sapient generated method id: ${29879ee2-091c-3fc3-8525-a22cd7bd4366}
    @Test()
    public void decodeOnionUrlWhenOnionAddressLengthEquals10() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : true
         */
        //Act Statement(s)
        byte[] result = TorUtils.decodeOnionUrl("3g2upl4pq6kufc4m.onion");
        byte[] byteResultArray = new byte[]{(byte) -39, (byte) -75, (byte) 71, (byte) -81, (byte) -113, (byte) -121, (byte) -107, (byte) 66, (byte) -117, (byte) -116};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${6880dde3-6ceb-3981-a91a-ccd1e9e8c79e}
    @Test()
    public void decodeOnionUrlWhenOnionAddressLengthNotEquals32Plus2Plus1ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : false
         */
        //Act Statement(s)
        byte[] result = TorUtils.decodeOnionUrl("3g2upl4pq6kufc4m.onion");
        byte[] byteResultArray = new byte[]{(byte) -39, (byte) -75, (byte) 71, (byte) -81, (byte) -113, (byte) -121, (byte) -107, (byte) 66, (byte) -117, (byte) -116};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${4e8a04e4-36d4-3362-99fb-a0130d4e1638}
    @Test()
    public void decodeOnionUrlWhenTorVersionNotEquals3ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unrecognizable length: abcdefghijklmnopqrstuvwxyz234567.onion");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("abcdefghijklmnopqrstuvwxyz234567.onion");
    }

    //Sapient generated method id: ${3a0ced63-2292-3005-91da-695ad52f3b0f}
    @Test()
    public void decodeOnionUrlWhenPubkeyLengthNotEquals32ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : true  #  inside onionChecksum method
         */
        //Act Statement(s)
        byte[] result = TorUtils.decodeOnionUrl("aaaaaaaaaaaaaaaa.onion");
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${19ae2bcb-f221-3512-8327-009575a3d347}
    @Test()
    public void decodeOnionUrlWhenArraysNotEqualsChecksumOnionChecksumPubkeyTorVersionThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         * (!Arrays.equals(checksum, onionChecksum(pubkey, torVersion))) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unrecognizable length: d6c27d7b6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c.onion");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("d6c27d7b6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c6f6e6d6c.onion");
    }

    //Sapient generated method id: ${4932bb95-3a7f-3564-8d40-72a99b1aaa2b}
    @Test()
    public void decodeOnionUrlWhenArraysEqualsChecksumOnionChecksumPubkeyTorVersion() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         * (!Arrays.equals(checksum, onionChecksum(pubkey, torVersion))) : false
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unrecognizable length: abcdefghijklmnopqrstuvwxyz234567.onion");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("abcdefghijklmnopqrstuvwxyz234567.onion");
    }
}