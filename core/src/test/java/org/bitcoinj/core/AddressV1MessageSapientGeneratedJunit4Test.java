package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;
import java.util.List;
import java.nio.ByteBuffer;
import java.io.OutputStream;

import org.bitcoinj.base.VarInt;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class AddressV1MessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final PeerAddress peerAddressMock = mock(PeerAddress.class);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<AddressMessage> addressMessage = mockStatic(AddressMessage.class)) {
            List<PeerAddress> peerAddressList = new ArrayList<>();
            addressMessage.when(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1))).thenReturn(peerAddressList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            AddressV1Message result = AddressV1Message.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            addressMessage.verify(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1)));
        }
    }

    //Sapient generated method id: ${5b004286-994d-3a7c-8b07-af8074a341ed}
    @Test()
    public void addAddressTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<AddressMessage> addressMessage = mockStatic(AddressMessage.class)) {
            List<PeerAddress> peerAddressList = new ArrayList<>();
            peerAddressList.add(peerAddressMock);
            addressMessage.when(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1))).thenReturn(peerAddressList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            AddressV1Message target = AddressV1Message.read(byteBuffer);
            //Act Statement(s)
            target.addAddress(peerAddressMock);
            //Assert statement(s)
            addressMessage.verify(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1)));
        }
    }

    //Sapient generated method id: ${d1825f21-e53f-3657-9fc6-3e103d22dcf4}
    @Test()
    public void bitcoinSerializeToStreamWhenAddressesIsNull() throws IOException, BufferUnderflowException, ProtocolException {
        /* Branches:
         * (addresses == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressMessage> addressMessage = mockStatic(AddressMessage.class)) {
            addressMessage.when(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1))).thenReturn(null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            AddressV1Message target = AddressV1Message.read(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            target.bitcoinSerializeToStream(byteArrayOutputStream);
            //Assert statement(s)
            addressMessage.verify(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1)));
        }
    }

    //Sapient generated method id: ${cbfc6dcd-0ed6-3348-ac4d-e41641a475c8}
    @Test()
    public void bitcoinSerializeToStreamWhenAddressesIsNotEmpty() throws IOException, BufferUnderflowException, ProtocolException {
        /* Branches:
         * (addresses == null) : false
         * (for-each(addresses)) : true
         */
        //Arrange Statement(s)
        VarInt varIntMock = mock(VarInt.class);
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<AddressMessage> addressMessage = mockStatic(AddressMessage.class)) {
            List<PeerAddress> peerAddressList = new ArrayList<>();
            peerAddressList.add(peerAddressMock);
            addressMessage.when(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1))).thenReturn(peerAddressList);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(peerAddressMock).serialize(1);
            varInt.when(() -> VarInt.of(1L)).thenReturn(varIntMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            AddressV1Message target = AddressV1Message.read(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            target.bitcoinSerializeToStream(byteArrayOutputStream);
            //Assert statement(s)
            addressMessage.verify(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1)));
            verify(peerAddressMock).serialize(1);
            varInt.verify(() -> VarInt.of(1L), atLeast(1));
            verify(varIntMock).serialize();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() throws BufferUnderflowException, ProtocolException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: SPACE_JOINER
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AddressMessage> addressMessage = mockStatic(AddressMessage.class)) {
            List<PeerAddress> peerAddressList = new ArrayList<>();
            addressMessage.when(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1))).thenReturn(peerAddressList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            AddressV1Message target = AddressV1Message.read(byteBuffer);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("addr: A"));
            addressMessage.verify(() -> AddressMessage.readAddresses((ByteBuffer) any(), eq(1)));
        }
    }
}
