package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.net.UnknownHostException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;

import java.nio.ByteBuffer;
import java.net.Inet4Address;

import org.bitcoinj.crypto.internal.TorUtils;

import java.net.Inet6Address;

import org.bitcoinj.base.VarInt;

import java.net.InetAddress;

import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;

import org.bitcoinj.base.internal.Buffers;

import java.time.Instant;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

public class PeerAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Services servicesMock = mock(Services.class, "services");

    private final ByteBuffer byteBufferMock = mock(ByteBuffer.class);

    private final Inet4Address inet4AddressMock = mock(Inet4Address.class);

    private final Inet6Address inet6AddressMock = mock(Inet6Address.class);

    private final Services servicesMock = mock(Services.class);

    private final Services servicesMock2 = mock(Services.class);

    private final VarInt varIntMock = mock(VarInt.class);

    private final VarInt varIntMock2 = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${8e7c5be6-5337-3c53-b54a-24702ea2a526}, hash: 8255ACC5D45653DEA2A770C54CE21D9F
    @Test()
    public void simpleTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();

        //Act Statement(s)
        PeerAddress result = PeerAddress.simple(inetAddress, 0);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${61d1f796-4c0e-34e0-9313-737133052c85}, hash: 19ED20BC9F05824615E0B67033451D66
    @Test()
    public void simple1Test() {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);

        //Act Statement(s)
        PeerAddress result = PeerAddress.simple(inetSocketAddress);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${22fb7b99-09e3-349c-9181-3d6ef3cfa974}, hash: 4A28698CE209F9B131AF734C90113D3A
    @Test()
    public void inetTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e9287c70-6cb7-3b87-a7a3-ce1da3a0dec3}, hash: 7282474DE4633654FE860C8249BEE40C
    @Test()
    public void inet1Test() {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        Instant instant = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetSocketAddress, servicesMock, instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ce99f7e6-1ff6-3845-bc38-dce3496f92e0}, hash: 2450A319C84DB623EB7C73DB6FCE033D
    @Test()
    public void readWhenProtocolVariantGreaterThan2ThrowsIllegalStateException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : true
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${5f2264f0-82f4-32a2-ad0f-9b6413447d7a}, hash: 6B51F6667C932BBC154195704A223034
    @Test()
    public void readWhenIdNotIsPresent() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(2L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${f4a755a2-0015-3529-9c2e-6baedc9b944c}, hash: 0C8608F7AE9BB60B2A8F47BCB0416820
    @Test()
    public void readWhenArraysEqualsONIONCAT_PREFIXArraysCopyOfAddrBytes6() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         * (Arrays.equals(ONIONCAT_PREFIX, Arrays.copyOf(addrBytes, 6))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<TorUtils> torUtils = mockStatic(TorUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            byte[] byteArray2 = new byte[]{};
            torUtils.when(() -> TorUtils.encodeOnionUrlV2(byteArray2)).thenReturn("return_of_encodeOnionUrlV2");
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 0);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            services.verify(() -> Services.read((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)));
            torUtils.verify(() -> TorUtils.encodeOnionUrlV2(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${86f795a4-60b5-3506-9594-97a8329330f2}, hash: E4B8D6897D8750898AD872E85614235E
    @Test()
    public void readWhenArraysNotEqualsONIONCAT_PREFIXArraysCopyOfAddrBytes6() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         * (Arrays.equals(ONIONCAT_PREFIX, Arrays.copyOf(addrBytes, 6))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 0);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(1));
            services.verify(() -> Services.read((ByteBuffer) any()), atLeast(1));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6699f3ef-f230-349c-8bf3-9a41a76b182e}, hash: F0C073688493A3A948A1FC28AF45F395
    @Test()
    public void readWhenSwitchIdGetCaseI2P() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = I2P or switch(id.get()) = CJDNS) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(2L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${e610ff89-19f9-30b2-a6d4-3f040d563f5c}, hash: 0BE520620D194CFECEB6388196BB4CA2
    @Test()
    public void readWhenAddrLenNotEquals4ThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV4) : true
         * (addrLen != 4) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(987654321L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${e17c23e7-1e10-329e-9a68-ec0a3de670a9}, hash: 695C3B151666549595A929E8411041E6
    @Test()
    public void readWhenAddrLenEquals4() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV4) : true
         * (addrLen != 4) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(1));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()), atLeast(1));
            verify(varIntMock, atLeast(1)).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3019096-b872-34f9-8f18-211ece0d2c40}, hash: 68940B9E506A16F0D4A865A3C529A4F5
    @Test()
    public void readWhenAddrLenNotEquals16ThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV6) : true
         * (addrLen != 16) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${f6949cef-7181-305d-a857-39f617738109}, hash: A26D493CCB5C7D790F3AAEBF9D6E61A0
    @Test()
    public void readWhenAddrLenEquals16() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV6) : true
         * (addrLen != 16) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(1));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()), atLeast(1));
            verify(varIntMock, atLeast(1)).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${2db0b1a8-13e0-3171-950f-8f0b3f73e860}, hash: 008E1AB5F0CD14A2198F82E5E1895994
    @Test()
    public void readWhenAddrLenNotEquals10ThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV2) : true
         * (addrLen != 10) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${efec9101-bd23-3b0e-a50f-17663f8e0c6c}, hash: 5BC594935A2AAF756B3B70E148E901CC
    @Test()
    public void readWhenAddrLenEquals10() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV2) : true
         * (addrLen != 10) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<TorUtils> torUtils = mockStatic(TorUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            torUtils.when(() -> TorUtils.encodeOnionUrlV2(byteArray)).thenReturn("aaaqeayeaudaocaj.onion");
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            torUtils.verify(() -> TorUtils.encodeOnionUrlV2(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${baad0387-05c8-37ad-b7be-95ed76f9fa45}, hash: D4A190012E3D5B66688B4C9726584E97
    @Test()
    public void readWhenAddrLenNotEquals32ThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV3) : true
         * (addrLen != 32) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(2L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${8b80c52d-4f7b-31f2-a343-dcba6c724a1c}, hash: A26CA33EB8D7DF5339D97EB5CF0E1563
    @Test()
    public void readWhenAddrLenEquals32() throws BufferUnderflowException, ProtocolException, UnknownHostException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV3) : true
         * (addrLen != 32) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<TorUtils> torUtils = mockStatic(TorUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            services.when(() -> Services.of(0L)).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            torUtils.when(() -> TorUtils.encodeOnionUrlV3(byteArray)).thenReturn("aaaqeayeaudaocajbifqydiob4ibceqtcqkrmfyydenbwha5dyp3kead.onion");
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            torUtils.verify(() -> TorUtils.encodeOnionUrlV3(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${81dadd94-33eb-39be-8ed0-621caad3ffd7}, hash: 2B63109B40998F292A9CE0119E94F014
    @Test()
    public void localhostTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS)) {
            doReturn(0).when(paramsMock).getPort();
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(0))).thenReturn(peerAddressMock);
            //Act Statement(s)
            PeerAddress result = PeerAddress.localhost(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(peerAddressMock));
            verify(paramsMock, atLeast(1)).getPort();
            peerAddress.verify(() -> PeerAddress.simple((InetAddress) any(), eq(0)), atLeast(1));
        }
    }

    //Sapient generated method id: ${1d945e61-ead1-3fca-bada-791c0fd91213}, hash: 4495718FF60B9519922F78D316ACAD2F
    @Test()
    public void writeWhenProtocolVariantGreaterThan2ThrowsIllegalStateException() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        target.write(byteBuffer, 3);
    }

    //Sapient generated method id: ${a6605660-e17e-3c1f-a57a-45c5a3065f12}, hash: FEF5A350162855F11E43864B2D88D430
    @Test()
    public void writeWhenAddrIsNotNull() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         * (addr != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer).when(servicesMock).write((ByteBuffer) any());
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 127, (byte) 0, (byte) 0, (byte) 1};
            peerAddress.when(() -> PeerAddress.mapIntoIPv6(byteArray2)).thenReturn(byteArray);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.ofEpochSecond(1700000000);
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer3, 1);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer3));
            verify(servicesMock, atLeast(1)).write((ByteBuffer) any());
            peerAddress.verify(() -> PeerAddress.mapIntoIPv6(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${27c81483-3328-3bec-ac88-f353bc69d343}, hash: B5C902CBCB196D51A2F4E1E69C19AD54
    @Test()
    public void writeWhenAddrInstanceOfInet4Address() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            doReturn(0L).when(servicesMock).bits();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            varInt.when(() -> VarInt.of(4L)).thenReturn(varIntMock2);
            doReturn(byteBufferMock).when(varIntMock2).write((ByteBuffer) any());
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer3);
            Instant instant = Instant.ofEpochSecond(1700000000);
            PeerAddress target = PeerAddress.inet(inet4AddressMock, 0, servicesMock, instant);
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer4, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer4));
            verify(servicesMock).bits();
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            varInt.verify(() -> VarInt.of(4L), atLeast(1));
            verify(varIntMock2).write((ByteBuffer) any());
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${aa685a74-e3ad-313d-b4e6-082a58c2ab81}, hash: 30B7E01DAE63BDE35832074E48232DF1
    @Test()
    public void writeWhenHostnameIsNullThrowsIllegalStateException() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         * (addr != null) : false
         * (hostname != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            Services services = Services.of(0L);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((InetAddress) null, 0, services, instant);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer2).when(servicesMock).write((ByteBuffer) any());
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.write(byteBuffer3, 1);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            verify(servicesMock).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${cee73d7a-0a6e-3902-a8a7-5f2836a98c81}, hash: 32A5DA2E44ACEFFA9485E9F072B4CEEF
    @Test()
    public void writeWhenAddrInstanceOfInet6Address() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : false
         * (addr instanceof Inet6Address) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            doReturn(0L).when(servicesMock).bits();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            varInt.when(() -> VarInt.of(16L)).thenReturn(varIntMock2);
            doReturn(byteBufferMock).when(varIntMock2).write((ByteBuffer) any());
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer3);
            Instant instant = Instant.ofEpochSecond(1700000000);
            PeerAddress target = PeerAddress.inet(inet6AddressMock, 0, servicesMock, instant);
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer4, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer4));
            verify(servicesMock).bits();
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            varInt.verify(() -> VarInt.of(16L), atLeast(1));
            verify(varIntMock2).write((ByteBuffer) any());
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${8d097f9a-4563-3eb3-803e-5e275a2ff1ba}, hash: D803B530A327398F2766F627B5FD92CE
    @Test()
    public void writeWhenAddrNotInstanceOfInet6AddressThrowsIllegalStateException() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : false
         * (addr instanceof Inet6Address) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            doReturn(0L).when(servicesMock).bits();
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer).when(varIntMock).write((ByteBuffer) any());
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.ofEpochSecond(1700000000);
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            target.write(byteBuffer2, 2);
            //Assert statement(s)
            verify(servicesMock).bits();
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${8aa7c410-9bc6-3be2-9c6b-d2313678408d}, hash: B8AC49CD0950E15C93F4AA80868FE96B
    @Test()
    public void writeWhenAddrIsNullAndHostnameIsNullThrowsIllegalStateException() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : false
         * (addr == null) : true
         * (hostname != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            Services services = Services.of(0L);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((InetAddress) null, 8080, services, instant);
            doReturn(0L).when(servicesMock).bits();
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.write(byteBuffer3, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            verify(servicesMock).bits();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: E9AF775F294CB4086D4370CE0BBDA688
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = spy(PeerAddress.inet(inetAddress, 8080, services, instant));
        doReturn(1).when(target).getMessageSize(1);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        doReturn(byteBuffer).when(target).write((ByteBuffer) any(), eq(1));

        //Act Statement(s)
        byte[] result = target.serialize(1);

        //Assert statement(s)
        assertThat(result.length, equalTo(0));
        verify(target).getMessageSize(1);
        verify(target).write((ByteBuffer) any(), eq(1));
    }

    //Sapient generated method id: ${af39f50b-3759-3ed1-9698-c6f0052233ac}, hash: 7A7499FFD3619D60C940F335FA0AFA92
    @Test()
    public void getMessageSizeWhenProtocolVariantGreaterThan2ThrowsIllegalStateException() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());

        //Act Statement(s)
        target.getMessageSize(3);
    }

    //Sapient generated method id: ${917fd796-333c-3f6b-8022-973831ce7fea}, hash: 89DC33A365C9F110537D1C92299AA8C4
    @Test()
    public void getMessageSizeWhenProtocolVariantNotEquals2() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Act Statement(s)
        int result = target.getMessageSize(1);

        //Assert statement(s)
        assertThat(result, equalTo(30));
    }

    //Sapient generated method id: ${8ccc1762-4703-3bd1-961e-73f2b1a59f66}, hash: EA0EADB0D4F7DD979ADCD6F38D0B6108
    @Test()
    public void getMessageSizeWhenAddrInstanceOfInet4Address() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : true
         */
        //Arrange Statement(s)
        doReturn(1L).when(servicesMock).bits();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inet4AddressMock, 0, servicesMock, instant);

        //Act Statement(s)
        int result = target.getMessageSize(2);

        //Assert statement(s)
        assertThat(result, equalTo(13));
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${d46027ac-c001-346f-8801-d2171e0afd0b}, hash: 891CE9E9F55CE57AA8B5418248F2D677
    @Test()
    public void getMessageSizeWhenAddrInstanceOfInet6Address() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : false
         * (addr instanceof Inet6Address) : true
         */
        //Arrange Statement(s)
        doReturn(1L).when(servicesMock).bits();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inet6AddressMock, 0, servicesMock, instant);

        //Act Statement(s)
        int result = target.getMessageSize(2);

        //Assert statement(s)
        assertThat(result, equalTo(25));
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${b71a6650-73d0-3aad-b021-a10337c87928}, hash: 376877DAA3C11C52855D05F2B8337E3E
    @Test()
    public void getMessageSizeWhenAddrNotInstanceOfInet6AddressThrowsIllegalStateException() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : true
         * (addr instanceof Inet4Address) : false
         * (addr instanceof Inet6Address) : false
         */
        //Arrange Statement(s)
        doReturn(1L).when(servicesMock).bits();
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        thrown.expect(IllegalStateException.class);

        //Act Statement(s)
        target.getMessageSize(2);

        //Assert statement(s)
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${18a834e5-1ed0-39ad-9bfc-c078f9f62d82}, hash: 677818BFC372F21931E839ADF9532744
    @Test()
    public void getMessageSizeWhenHostnameIsNullThrowsIllegalStateException() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (addr != null) : false
         * (addr == null) : true
         * (hostname != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((InetAddress) null, 0, services, instant);
        doReturn(1L).when(servicesMock).bits();
        thrown.expect(IllegalStateException.class);

        //Act Statement(s)
        target.getMessageSize(2);

        //Assert statement(s)
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${b1cf9104-71c3-3ed1-a574-f4bba85b9153}, hash: 8DB1B0ECBF44F87443745E3FE78B19D9
    @Test()
    public void getByAddressTest() throws UnknownHostException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};

        //Act Statement(s)
        InetAddress result = PeerAddress.getByAddress(byteArray);
        InetAddress inetAddress = InetAddress.getLoopbackAddress();

        //Assert statement(s)
        assertThat(result, equalTo(inetAddress));
    }

    //Sapient generated method id: ${e29149e3-926b-3931-a470-4c7147be7ce2}, hash: 7D8735E7054FF44151286B23119E5D1D
    @Test()
    public void getByAddressWhenCaughtUnknownHostExceptionThrowsRuntimeException() throws UnknownHostException {
        /* Branches:
         * (catch-exception (UnknownHostException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<InetAddress> inetAddress = mockStatic(InetAddress.class)) {
            UnknownHostException unknownHostException = new UnknownHostException();
            byte[] byteArray = new byte[]{};
            inetAddress.when(() -> InetAddress.getByAddress(byteArray)).thenThrow(unknownHostException);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(UnknownHostException.class)));
            //Act Statement(s)
            PeerAddress.getByAddress(byteArray);
            //Assert statement(s)
            inetAddress.verify(() -> InetAddress.getByAddress(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${a62aeb0f-ad3d-3413-9ea5-1459537584f3}, hash: 1DAC022529FD871C085A74650F1E8EAA
    @Test()
    public void mapIntoIPv6WhenIpLengthNotEquals16ThrowsIllegalArgumentException() {
        /* Branches:
         * (ip.length == 4) : false
         * (ip.length == 16) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{(byte) 0};

        //Act Statement(s)
        PeerAddress.mapIntoIPv6(byteArray);
    }

    //Sapient generated method id: ${f725f5d2-5b15-31f0-bd89-6a8220f44ba5}, hash: 946DDF1C11ADB40795901BD0C2CC5F9A
    @Test()
    public void mapIntoIPv6WhenIpLengthEquals16AndIpLengthEquals16() {
        /* Branches:
         * (ip.length == 4) : false
         * (ip.length == 16) : true
         * (ip.length == 16) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15};

        //Act Statement(s)
        byte[] result = PeerAddress.mapIntoIPv6(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
    }

    //Sapient generated method id: ${0e431553-3cd7-3cf1-89c5-ebfb93338756}, hash: B3137281A22C328DBF7A9122A6669E08
    @Test()
    public void mapIntoIPv6WhenIpLengthEquals16AndIpLengthNotEquals16() {
        /* Branches:
         * (ip.length == 4) : false
         * (ip.length == 16) : true
         * (ip.length == 16) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = PeerAddress.mapIntoIPv6(byteArray);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${5fc69f6e-540a-3a35-8caa-84ba195c637c}, hash: 76A9A1D3C88CCBC27D6939A3338A99BE
    @Test()
    public void getSocketAddressTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Act Statement(s)
        InetSocketAddress result = target.getSocketAddress();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 0);

        //Assert statement(s)
        assertThat(result, equalTo(inetSocketAddress));
    }

    //Sapient generated method id: ${042a07c6-415f-3feb-9b50-b06f1fcd4b38}, hash: 698ACEF80BA603298026219EF8EEE4E9
    @Test()
    public void timeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Act Statement(s)
        Instant result = target.time();

        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}, hash: FFFA6B70A03D44EB3DAE7D59B00AD455
    @Test()
    public void getTimeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Act Statement(s)
        long result = target.getTime();

        //Assert statement(s)
        assertThat(result, equalTo(1700000000L));
    }

    //Sapient generated method id: ${95f6af8f-2efe-3edb-bb32-8b4aec91c38e}, hash: 466DA7032F6938C9ED7D3176A04A7D1A
    @Test()
    public void toStringWhenAddrIsNotNull() {
        /* Branches:
         * (hostname != null) : false
         * (addr != null) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 2, servicesMock, instant);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("[127.0.0.1]:2"));
    }

    //Sapient generated method id: ${9984030b-066f-3e00-9501-33713b1f22ce}, hash: 1D8E171058AAD81BA20A36080A0CECEC
    @Test()
    public void toStringWhenAddrIsNull() {
        /* Branches:
         * (hostname != null) : false
         * (addr != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((InetAddress) null, 8080, services, instant);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("[ PeerAddress of unsupported type ]:0"));
    }

    //Sapient generated method id: ${6d160ca4-2a1a-3ab8-a0c2-14da2d4e9144}, hash: C223907AD16E031E0133A21555049D23
    @Test()
    public void toSocketAddressWhenHostnameIsNull() {
        /* Branches:
         * (hostname != null) : false
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.ofEpochSecond(1700000000);
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);

        //Act Statement(s)
        InetSocketAddress result = target.toSocketAddress();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 0);

        //Assert statement(s)
        assertThat(result, equalTo(inetSocketAddress));
    }
}
