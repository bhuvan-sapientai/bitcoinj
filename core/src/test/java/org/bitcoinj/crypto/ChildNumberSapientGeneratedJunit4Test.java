package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ChildNumberSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${5715801c-29ce-3faa-847f-2805dbc97707}, hash: BBF596C51AAA6E2B95321EBBBFDEFCB7
    @Test()
    public void iTest() {
        //Arrange Statement(s)
        ChildNumber target = new ChildNumber(0);
        //Act Statement(s)
        int result = target.i();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${0bca5d32-7671-34ce-92f1-91721a0bb29e}, hash: 55E57355AAA96692F7F6E1FB7F7EC4C9
    @Ignore()
    @Test()
    public void isHardenedWhenAAndHARDENED_BITNotEquals0() {
        /* Branches:
         * ((a & HARDENED_BIT) != 0) : true  #  inside hasHardenedBit method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildNumber target = new ChildNumber(0);
        //Act Statement(s)
        boolean result = target.isHardened();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${dd8fd8fb-da6d-303b-bbca-e3ea2cce0645}, hash: F70BF0E94E207C4A26D32C5F352C6475
    @Test()
    public void isHardenedWhenAAndHARDENED_BITEquals0() {
        /* Branches:
         * ((a & HARDENED_BIT) != 0) : false  #  inside hasHardenedBit method
         */
        //Arrange Statement(s)
        ChildNumber target = new ChildNumber(0);
        //Act Statement(s)
        boolean result = target.isHardened();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ad9b5f75-34be-31db-8a72-a191bdec0933}, hash: AF73CFA9E49422B4605418B5F10D6468
    @Test()
    public void numTest() {
        //Arrange Statement(s)
        ChildNumber target = new ChildNumber(0);
        //Act Statement(s)
        int result = target.num();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${9bd5d305-ab5e-308f-93f5-7e7a290227df}, hash: 85E4A161B27A16CB93063477561006FC
    @Ignore()
    @Test()
    public void toStringWhenIsHardened() {
        /* Branches:
         * (isHardened()) : true
         */
        //Arrange Statement(s)
        ChildNumber target = spy(new ChildNumber(0));
        doReturn(true).when(target).isHardened();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("nullnull"));
        verify(target).isHardened();
    }

    //Sapient generated method id: ${cc64e309-f9b0-323d-8ca3-bbed5d99b609}, hash: 8E95AF4942B01D1B9B6C4B6C28C18B53
    @Ignore()
    @Test()
    public void toStringWhenIsHardenedNot() {
        /* Branches:
         * (isHardened()) : false
         */
        //Arrange Statement(s)
        ChildNumber target = spy(new ChildNumber(0));
        doReturn(false).when(target).isHardened();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("nullnull"));
        verify(target).isHardened();
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}, hash: 9EC0B67EF64C7B277B1087B91DAA01A1
    @Test()
    public void compareToTest() {
        //Arrange Statement(s)
        ChildNumber otherMock = mock(ChildNumber.class);
        doReturn(-1).when(otherMock).num();
        ChildNumber target = new ChildNumber(0);
        //Act Statement(s)
        int result = target.compareTo(otherMock);
        //Assert statement(s)
        assertThat(result, equalTo(1));
        verify(otherMock).num();
    }
}
