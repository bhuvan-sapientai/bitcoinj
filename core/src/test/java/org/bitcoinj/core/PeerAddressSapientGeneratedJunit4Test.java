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

import java.util.Objects;

import org.bitcoinj.base.internal.TimeUtils;

public class PeerAddressSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Services servicesMock = mock(Services.class, "services");

    private final Services servicesMock2 = mock(Services.class);

    private final VarInt varIntMock = mock(VarInt.class);

    private final VarInt varIntMock2 = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${8e7c5be6-5337-3c53-b54a-24702ea2a526}
    @Test()
    public void simpleTest() {
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            Services services2 = Services.of(0L);
            services.when(() -> Services.none()).thenReturn(services2);
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            //Act Statement(s)
            PeerAddress.simple(inetAddress, 8080);
            //Assert statement(s)
            services.verify(() -> Services.none(), atLeast(1));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${61d1f796-4c0e-34e0-9313-737133052c85}
    @Test()
    public void simple1Test() {
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            Services services2 = Services.of(0L);
            services.when(() -> Services.none()).thenReturn(services2);
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            //Act Statement(s)
            PeerAddress.simple(inetSocketAddress);
            //Assert statement(s)
            services.verify(() -> Services.none(), atLeast(1));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${22fb7b99-09e3-349c-9181-3d6ef3cfa974}
    @Test()
    public void inetTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetAddress, 0, services, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e9287c70-6cb7-3b87-a7a3-ce1da3a0dec3}
    @Test()
    public void inet1Test() {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        //Act Statement(s)
        PeerAddress result = PeerAddress.inet(inetSocketAddress, services, instant);
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
    public void readWhenIdNotIsPresent() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : false
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${6699f3ef-f230-349c-8bf3-9a41a76b182e}
    @Ignore()
    @Test()
    public void readWhenSwitchIdGetCaseI2P() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = I2P or switch(id.get()) = CJDNS) : true
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
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
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${e17c23e7-1e10-329e-9a68-ec0a3de670a9}
    @Ignore()
    @Test()
    public void readWhenAddrLenEquals4() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV4) : true
         * (addrLen != 4) : false
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
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
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${f6949cef-7181-305d-a857-39f617738109}
    @Ignore()
    @Test()
    public void readWhenAddrLenEquals16() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = IPV6) : true
         * (addrLen != 16) : false
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
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
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varInt2);
            Services services2 = Services.of(0L);
            services.when(() -> Services.of(0L)).thenReturn(services2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PeerAddress.read(byteBuffer, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            services.verify(() -> Services.of(0L), atLeast(1));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${efec9101-bd23-3b0e-a50f-17663f8e0c6c}
    @Ignore()
    @Test()
    public void readWhenAddrLenEquals10() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV2) : true
         * (addrLen != 10) : false
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("String");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
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
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${8b80c52d-4f7b-31f2-a343-dcba6c724a1c}
    @Ignore()
    @Test()
    public void readWhenAddrLenEquals32() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (protocolVariant < 0) : false
         * (protocolVariant > 2) : false
         * (protocolVariant == 2) : true
         * (id.isPresent()) : true
         * (switch(id.get()) = TORV3) : true
         * (addrLen != 32) : false
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("String");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        PeerAddress.read(byteBuffer, 3);
    }

    //Sapient generated method id: ${81dadd94-33eb-39be-8ed0-621caad3ffd7}
    @Ignore()
    @Test()
    public void localhostTest() {
        //Arrange Statement(s)
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class, CALLS_REAL_METHODS)) {
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(0))).thenReturn(peerAddress2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            PeerAddress result = PeerAddress.localhost(networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo(peerAddress2));
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
        PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock2, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        target.write(byteBuffer, 3);
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
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            doReturn(null).when(varIntMock).write((ByteBuffer) any());
            Services services = Services.of(0L);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((Inet4Address) null, 0, services, instant);
            doReturn(0L).when(servicesMock).bits();
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.write(byteBuffer2, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            verify(servicesMock).bits();
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
        VarInt varIntMock2 = mock(VarInt.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1703674794L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            varInt.when(() -> VarInt.of(16L)).thenReturn(varIntMock2);
            doReturn(null).when(varIntMock2).write((ByteBuffer) any());
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer3);
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet((Inet6Address) null, 0, servicesMock2, instant);
            doReturn(0L).when(servicesMock2).bits();
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer4, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer4));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1703674794L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            varInt.verify(() -> VarInt.of(16L), atLeast(1));
            verify(varIntMock2).write((ByteBuffer) any());
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()));
            verify(servicesMock2).bits();
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
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1703674794L), (ByteBuffer) any())).thenReturn(byteBuffer);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer2).when(varIntMock).write((ByteBuffer) any());
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock2, instant);
            doReturn(0L).when(servicesMock2).bits();
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.write(byteBuffer3, 2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1703674794L), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            verify(servicesMock2).bits();
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
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = spy(PeerAddress.inet(inetAddress, 8080, services, instant));
        doReturn(1).when(target).getMessageSize(1);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        doReturn(byteBuffer).when(target).write((ByteBuffer) any(), eq(1));
        //Act Statement(s)
        byte[] result = target.serialize(1);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).getMessageSize(1);
        verify(target).write((ByteBuffer) any(), eq(1));
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
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 8080, services, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 0");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getMessageSize(0);
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((Inet4Address) null, 8080, services, instant);
        IllegalStateException illegalStateException = new IllegalStateException("invalid protocolVariant: 3");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getMessageSize(3);
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet((Inet6Address) null, 8080, services, instant);
        doReturn(0L).when(servicesMock).bits();
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getMessageSize(2);
        //Assert statement(s)
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
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(-4);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant = Instant.now();
            PeerAddress target = PeerAddress.inet(inetAddress, 0, servicesMock2, instant);
            doReturn(1L).when(servicesMock2).bits();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getMessageSize(2);
            //Assert statement(s)
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
            verify(servicesMock2).bits();
        }
    }

    //Sapient generated method id: ${b1cf9104-71c3-3ed1-a574-f4bba85b9153}
    @Ignore()
    @Test()
    public void getByAddressTest() throws UnknownHostException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
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
        UnknownHostException unknownHostExceptionMock = mock(UnknownHostException.class);
        try (MockedStatic<InetAddress> inetAddress = mockStatic(InetAddress.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
            inetAddress.when(() -> InetAddress.getByAddress(byteArray)).thenThrow(unknownHostExceptionMock);
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
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
            //Act Statement(s)
            byte[] result = PeerAddress.mapIntoIPv6(byteArray);
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${5fc69f6e-540a-3a35-8caa-84ba195c637c}
    @Test()
    public void getSocketAddressTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = spy(PeerAddress.inet(inetAddress, 8080, services, instant));
        InetAddress inetAddress2 = InetAddress.getLoopbackAddress();
        doReturn(inetAddress2).when(target).getAddr();
        //Act Statement(s)
        InetSocketAddress result = target.getSocketAddress();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress2, 8080);
        //Assert statement(s)
        assertThat(result, equalTo(inetSocketAddress));
        verify(target).getAddr();
    }

    //Sapient generated method id: ${042a07c6-415f-3feb-9b50-b06f1fcd4b38}
    @Test()
    public void timeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 8080, services, instant);
        //Act Statement(s)
        Instant result = target.time();
        Instant instant2 = Objects.requireNonNull(instant);
        //Assert statement(s)
        assertThat(result, equalTo(instant2));
    }

    //Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}
    @Ignore()
    @Test()
    public void getTimeTest() {
        //Arrange Statement(s)
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 8080, services, instant);
        //Act Statement(s)
        long result = target.getTime();
        //Assert statement(s)
        assertThat(result, equalTo(1703674797L));
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
        Services services = Services.of(0L);
        Instant instant = Instant.now();
        PeerAddress target = PeerAddress.inet(inetAddress, 8080, services, instant);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("[127.0.0.1]:8080"));
    }
}
