package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.net.UnknownHostException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;

import java.net.Inet4Address;
import java.net.Inet6Address;

import org.bitcoinj.base.VarInt;
import org.bitcoinj.base.internal.ByteUtils;

import java.net.InetSocketAddress;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.internal.TorUtils;

import java.net.InetAddress;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

public class PeerAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Services servicesMock = mock(Services.class, "services");

    private final Services servicesMock2 = mock(Services.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${8e7c5be6-5337-3c53-b54a-24702ea2a526}
    @Test()
    public void simpleTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        //Act Statement(s)
        PeerAddress result = PeerAddress.simple(inetAddress, 0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${61d1f796-4c0e-34e0-9313-737133052c85}
    @Test()
    public void simple1Test() {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        //Act Statement(s)
        PeerAddress result = PeerAddress.simple(inetSocketAddress);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${22fb7b99-09e3-349c-9181-3d6ef3cfa974}
    @Test()
    public void inetTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e9287c70-6cb7-3b87-a7a3-ce1da3a0dec3}
    @Test()
    public void inet1Test() {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        Instant instant = Instant.now();
        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetSocketAddress, servicesMock, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ce99f7e6-1ff6-3845-bc38-dce3496f92e0}
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
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${5f2264f0-82f4-32a2-ad0f-9b6413447d7a}
    @Ignore()
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
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${f4a755a2-0015-3529-9c2e-6baedc9b944c}
    @Ignore()
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
            byte[] byteArray = new byte[]{};
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

    //Sapient generated method id: ${86f795a4-60b5-3506-9594-97a8329330f2}
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
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 1);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(1));
            services.verify(() -> Services.read((ByteBuffer) any()), atLeast(1));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6699f3ef-f230-349c-8bf3-9a41a76b182e}
    @Ignore()
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
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress result = PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${e610ff89-19f9-30b2-a6d4-3f040d563f5c}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${e17c23e7-1e10-329e-9a68-ec0a3de670a9}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
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
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3019096-b872-34f9-8f18-211ece0d2c40}
    @Ignore()
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
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${f6949cef-7181-305d-a857-39f617738109}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
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
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${2db0b1a8-13e0-3171-950f-8f0b3f73e860}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${efec9101-bd23-3b0e-a50f-17663f8e0c6c}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<TorUtils> torUtils = mockStatic(TorUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
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
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            torUtils.verify(() -> TorUtils.encodeOnionUrlV2(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${baad0387-05c8-37ad-b7be-95ed76f9fa45}
    @Ignore()
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
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).longValue();
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${8b80c52d-4f7b-31f2-a343-dcba6c724a1c}
    @Ignore()
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<TorUtils> torUtils = mockStatic(TorUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(0L).when(varIntMock).longValue();
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
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            torUtils.verify(() -> TorUtils.encodeOnionUrlV3(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${81dadd94-33eb-39be-8ed0-621caad3ffd7}
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

    //Sapient generated method id: ${1d945e61-ead1-3fca-bada-791c0fd91213}
    @Test()
    public void writeWhenProtocolVariantGreaterThan2ThrowsIllegalStateException() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        target.write(byteBuffer, 3);
    }

    //Sapient generated method id: ${a6605660-e17e-3c1f-a57a-45c5a3065f12}
    @Ignore()
    @Test()
    public void writeWhenAddrIsNotNull() throws BufferOverflowException {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         * (addr != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1704367386L), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 127, (byte) 0, (byte) 0, (byte) 1};
            peerAddress.when(() -> PeerAddress.mapIntoIPv6(byteArray2)).thenReturn(byteArray);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer3).when(servicesMock).write((ByteBuffer) any());
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer4, 1);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer4));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1704367386L), (ByteBuffer) any()));
            peerAddress.verify(() -> PeerAddress.mapIntoIPv6(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
            verify(servicesMock).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${27c81483-3328-3bec-ac88-f353bc69d343}
    @Ignore()
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
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1704367387L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            doReturn(null).when(varIntMock).write((ByteBuffer) any());
            VarInt varInt2 = VarInt.of(4L);
            varInt.when(() -> VarInt.of(4L)).thenReturn(varInt2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer2);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((Inet4Address) null, 0, servicesMock, instant);
            doReturn(0L).when(servicesMock).bits();
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer3, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer3));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1704367387L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            varInt.verify(() -> VarInt.of(4L), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
            verify(servicesMock).bits();
        }
    }

    //Sapient generated method id: ${aa685a74-e3ad-313d-b4e6-082a58c2ab81}
    @Ignore()
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
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((InetAddress) null, 0, servicesMock, instant);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
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

    //Sapient generated method id: ${cee73d7a-0a6e-3902-a8a7-5f2836a98c81}
    @Ignore()
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
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1704367387L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            doReturn(null).when(varIntMock).write((ByteBuffer) any());
            VarInt varInt2 = VarInt.of(16L);
            varInt.when(() -> VarInt.of(16L)).thenReturn(varInt2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer2);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((Inet6Address) null, 0, servicesMock, instant);
            doReturn(0L).when(servicesMock).bits();
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer3, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer3));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1704367387L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            varInt.verify(() -> VarInt.of(16L), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
            verify(servicesMock).bits();
        }
    }

    //Sapient generated method id: ${8d097f9a-4563-3eb3-803e-5e275a2ff1ba}
    @Ignore()
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
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1704367386L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
            doReturn(0L).when(servicesMock).bits();
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.write(byteBuffer3, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1704367386L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            verify(servicesMock).bits();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = spy(PeerAddress.inet(inetAddress, 0, servicesMock, instant));
        doReturn(1).when(target).getMessageSize(0);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        doReturn(byteBuffer).when(target).write((ByteBuffer) any(), eq(0));
        //Act Statement(s)
        byte[] result = target.serialize(0);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).getMessageSize(0);
        verify(target).write((ByteBuffer) any(), eq(0));
    }

    //Sapient generated method id: ${af39f50b-3759-3ed1-9698-c6f0052233ac}
    @Test()
    public void getMessageSizeWhenProtocolVariantGreaterThan2ThrowsIllegalStateException() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getMessageSize(3);
    }

    //Sapient generated method id: ${917fd796-333c-3f6b-8022-973831ce7fea}
    @Test()
    public void getMessageSizeWhenProtocolVariantNotEquals2() {
        /* Branches:
         * (protocolVariant < 1) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : false
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Act Statement(s)
        int result = target.getMessageSize(1);
        //Assert statement(s)
        assertThat(result, equalTo(30));
    }

    //Sapient generated method id: ${8ccc1762-4703-3bd1-961e-73f2b1a59f66}
    @Ignore()
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
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((Inet4Address) null, 0, servicesMock, instant);
        doReturn(1L).when(servicesMock).bits();
        //Act Statement(s)
        int result = target.getMessageSize(2);
        //Assert statement(s)
        assertThat(result, equalTo(13));
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${d46027ac-c001-346f-8801-d2171e0afd0b}
    @Ignore()
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
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((Inet6Address) null, 0, servicesMock, instant);
        doReturn(1L).when(servicesMock).bits();
        //Act Statement(s)
        int result = target.getMessageSize(2);
        //Assert statement(s)
        assertThat(result, equalTo(25));
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${b71a6650-73d0-3aad-b021-a10337c87928}
    @Ignore()
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
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        doReturn(1L).when(servicesMock).bits();
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getMessageSize(2);
        //Assert statement(s)
        verify(servicesMock).bits();
    }

    //Sapient generated method id: ${b1cf9104-71c3-3ed1-a574-f4bba85b9153}
    @Ignore()
    @Test()
    public void getByAddressTest() throws UnknownHostException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        InetAddress result = PeerAddress.getByAddress(byteArray);
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        //Assert statement(s)
        assertThat(result, equalTo(inetAddress));
    }

    //Sapient generated method id: ${e29149e3-926b-3931-a470-4c7147be7ce2}
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
            thrown.expectCause(isA(UnknownHostException.class));
            //Act Statement(s)
            PeerAddress.getByAddress(byteArray);
            //Assert statement(s)
            inetAddress.verify(() -> InetAddress.getByAddress(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${0e431553-3cd7-3cf1-89c5-ebfb93338756}
    @Ignore()
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            byte[] result = PeerAddress.mapIntoIPv6(byteArray);
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${793dd006-2cde-38a0-ba5d-abb69ee416bb}
    @Ignore()
    @Test()
    public void mapIntoIPv6WhenIpLengthNotEquals16AndIpLengthEquals16() {
        /* Branches:
         * (ip.length == 4) : false
         * (ip.length == 16) : false
         * (ip.length == 16) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            byte[] result = PeerAddress.mapIntoIPv6(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${5fc69f6e-540a-3a35-8caa-84ba195c637c}
    @Test()
    public void getSocketAddressTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Act Statement(s)
        InetSocketAddress result = target.getSocketAddress();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 0);
        //Assert statement(s)
        assertThat(result, equalTo(inetSocketAddress));
    }

    //Sapient generated method id: ${042a07c6-415f-3feb-9b50-b06f1fcd4b38}
    @Test()
    public void timeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Act Statement(s)
        Instant result = target.time();
        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}
    @Ignore()
    @Test()
    public void getTimeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Act Statement(s)
        long result = target.getTime();
        //Assert statement(s)
        assertThat(result, equalTo(1704367388L));
    }

    //Sapient generated method id: ${95f6af8f-2efe-3edb-bb32-8b4aec91c38e}
    @Test()
    public void toStringWhenAddrIsNotNull() {
        /* Branches:
         * (hostname != null) : false
         * (addr != null) : true
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 2, servicesMock, instant);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("[127.0.0.1]:2"));
    }

    //Sapient generated method id: ${9984030b-066f-3e00-9501-33713b1f22ce}
    @Ignore()
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
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((InetAddress) null, 2, servicesMock, instant);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("[ PeerAddress of unsupported type ]:2"));
    }

    //Sapient generated method id: ${6d160ca4-2a1a-3ab8-a0c2-14da2d4e9144}
    @Test()
    public void toSocketAddressWhenHostnameIsNull() {
        /* Branches:
         * (hostname != null) : false
         */
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock, instant);
        //Act Statement(s)
        InetSocketAddress result = target.toSocketAddress();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 0);
        //Assert statement(s)
        assertThat(result, equalTo(inetSocketAddress));
    }
}
