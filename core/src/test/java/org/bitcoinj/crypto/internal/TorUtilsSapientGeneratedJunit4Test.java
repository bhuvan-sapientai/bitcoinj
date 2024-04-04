package org.bitcoinj.crypto.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class TorUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${819fa7d7-8e27-3dec-aa6d-cd2a3535a782}, hash: AAF5E9D689FE89676140E815F576F48D
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

    //Sapient generated method id: ${7772dff9-1395-3eaf-a5f8-8a5f82a89c07}, hash: 9DE00814B27C45A6AAF1E6B44745E679
    @Test()
    public void encodeOnionUrlV2WhenOnionAddrBytesLengthNotEquals10ThrowsIllegalArgumentException() {
        /* Branches:
         * (onionAddrBytes.length == 10) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        TorUtils.encodeOnionUrlV2(byteArray);
    }

    //Sapient generated method id: ${770d5ddf-7d7f-397b-93e0-bb80a5da3970}, hash: 436C3B90CA217AE2A4312705AB19C61F
    @Test()
    public void encodeOnionUrlV3WhenOnionAddrBytesLengthNotEquals32ThrowsIllegalArgumentException() {
        /* Branches:
         * (onionAddrBytes.length == 32) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        TorUtils.encodeOnionUrlV3(byteArray);
    }

    //Sapient generated method id: ${00df8018-4e21-3b3c-9542-60f1c757cd23}, hash: 1056EA6769B304B7797DA2CDDDD0838E
    @Test()
    public void encodeOnionUrlV3WhenPubkeyLengthNotEquals32ThrowsIllegalArgumentException() {
        /* Branches:
         * (onionAddrBytes.length == 32) : true
         * (pubkey.length != 32) : true  #  inside onionChecksum method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        TorUtils.encodeOnionUrlV3(byteArray);
    }

    //Sapient generated method id: ${d2770bca-8ecb-3061-9bb4-2fb26b48b1a7}, hash: FF7DC8198E0AF8DFB086410311A9E997
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

    //Sapient generated method id: ${238ad176-6ec7-3be4-bfff-5b17aab2c0aa}, hash: B363AFDBDFEEAC16E04330C83B06760B
    @Test()
    public void decodeOnionUrlWhenOnionUrlToLowerCaseLocaleROOTNotEndsWith_onionThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("not an onion URL: BCDEFG");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("BCDEFG");
    }

    //Sapient generated method id: ${29879ee2-091c-3fc3-8525-a22cd7bd4366}, hash: 655DA47EAE4B4E3A79C1D8D14CE6E7C6
    @Ignore()
    @Test()
    public void decodeOnionUrlWhenOnionAddressLengthEquals10() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = TorUtils.decodeOnionUrl("onionUrl1");
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${6880dde3-6ceb-3981-a91a-ccd1e9e8c79e}, hash: 459020F4642F1F27E81E3BBDF32A7816
    @Test()
    public void decodeOnionUrlWhenOnionAddressLengthNotEquals32Plus2Plus1ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : false
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unrecognizable length: .ONION");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl(".ONION");
    }

    //Sapient generated method id: ${4e8a04e4-36d4-3362-99fb-a0130d4e1638}, hash: D064BA85E2386436A6DE840E63136918
    @Ignore()
    @Test()
    public void decodeOnionUrlWhenTorVersionNotEquals3ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown version: IJ.ONION");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("IJ.ONION");
    }

    //Sapient generated method id: ${3a0ced63-2292-3005-91da-695ad52f3b0f}, hash: 4AEDBAFF57F3F33FD278391AC4185EAA
    @Test()
    public void decodeOnionUrlWhenPubkeyLengthNotEquals32ThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : true  #  inside onionChecksum method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        TorUtils.decodeOnionUrl("onionUrl1");
    }

    //Sapient generated method id: ${19ae2bcb-f221-3512-8327-009575a3d347}, hash: 217BF44D6807186950F9F30246CD07E2
    @Ignore()
    @Test()
    public void decodeOnionUrlWhenArraysNotEqualsChecksumOnionChecksumPubkeyTorVersionThrowsIllegalArgumentException() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         * (!Arrays.equals(checksum, onionChecksum(pubkey, torVersion))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bad checksum: KLM.ONION");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        TorUtils.decodeOnionUrl("KLM.ONION");
    }

    //Sapient generated method id: ${4932bb95-3a7f-3564-8d40-72a99b1aaa2b}, hash: 8006E4258B5B68BFD00344C9F0A7A701
    @Ignore()
    @Test()
    public void decodeOnionUrlWhenArraysEqualsChecksumOnionChecksumPubkeyTorVersion() {
        /* Branches:
         * (!onionUrl.toLowerCase(Locale.ROOT).endsWith(".onion")) : false
         * (onionAddress.length == 10) : false
         * (onionAddress.length == 32 + 2 + 1) : true
         * (torVersion != 0x03) : false
         * (pubkey.length != 32) : false  #  inside onionChecksum method
         * (!Arrays.equals(checksum, onionChecksum(pubkey, torVersion))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = TorUtils.decodeOnionUrl("onionUrl1");
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }
}
