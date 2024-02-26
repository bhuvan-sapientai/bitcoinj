package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

import org.bitcoinj.base.VarInt;

import java.net.InetAddress;

import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import java.time.Instant;

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

public class VersionMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final Services servicesMock = mock(Services.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${7ec5d0ac-6390-3fe5-a724-28b80dd29de6}
    @Test()
    public void readWhenClientVersionLessThanProtocolVersionMINIMUMIntValueThrowsThrowable() throws Throwable {
        /* Branches:
         * (clientVersion >= ProtocolVersion.MINIMUM.intValue()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            thrown.expect(Throwable.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            VersionMessage.read(byteBuffer);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${d7d57af3-a748-35ec-8d28-8549802898a1}
    @Test()
    public void readWhenClientVersionLessThanProtocolVersionBLOOM_FILTERIntValue() throws Throwable {
        /* Branches:
         * (clientVersion >= ProtocolVersion.MINIMUM.intValue()) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : false
         */
        //Arrange Statement(s)
        Services servicesMock2 = mock(Services.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(1L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock).thenReturn(servicesMock2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8))).thenReturn(byteBuffer2);
            buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("return_of_readLengthPrefixedString1");
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(70000L).thenReturn(0L);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            VersionMessage result = VersionMessage.read(byteBuffer3);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(2));
            services.verify(() -> Services.read((ByteBuffer) any()), atLeast(2));
            byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26)));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8)));
            buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${d4f99154-84c3-3cd3-9346-abd2d205fdef}
    @Test()
    public void readWhenPayloadGetNotEquals0() throws Throwable {
        /* Branches:
         * (clientVersion >= ProtocolVersion.MINIMUM.intValue()) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : true
         * (payload.get() != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(-1L);
            Services services2 = Services.of(0L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock).thenReturn(services2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8))).thenReturn(byteBuffer2);
            buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("return_of_readLengthPrefixedString1");
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(70001L).thenReturn(0L);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            VersionMessage result = VersionMessage.read(byteBuffer3);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(2));
            services.verify(() -> Services.read((ByteBuffer) any()), atLeast(2));
            byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26)));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8)));
            buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${9cd4c033-61ee-3be5-a04e-67c09571e01d}
    @Test()
    public void readWhenPayloadGetEquals0() throws Throwable {
        /* Branches:
         * (clientVersion >= ProtocolVersion.MINIMUM.intValue()) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : true
         * (payload.get() != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Services> services = mockStatic(Services.class)) {
            byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(0L);
            Services services2 = Services.of(0L);
            services.when(() -> Services.read((ByteBuffer) any())).thenReturn(servicesMock).thenReturn(services2);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(16))).thenReturn(byteArray);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            peerAddress.when(() -> PeerAddress.getByAddress(byteArray)).thenReturn(inetAddress);
            byteUtils.when(() -> ByteUtils.readUint16BE((ByteBuffer) any())).thenReturn(0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            buffers.when(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8))).thenReturn(byteBuffer2);
            buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("return_of_readLengthPrefixedString1");
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(70001L).thenReturn(0L);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            VersionMessage result = VersionMessage.read(byteBuffer3);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()), atLeast(2));
            services.verify(() -> Services.read((ByteBuffer) any()), atLeast(2));
            byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(16)));
            peerAddress.verify(() -> PeerAddress.getByAddress(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.readUint16BE((ByteBuffer) any()));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(26)));
            buffers.verify(() -> Buffers.skipBytes((ByteBuffer) any(), eq(8)));
            buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${3e2ccb4e-d64b-361e-8c0b-a7f5ca47d588}
    @Test()
    public void clientVersionTest() {
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        int result = target.clientVersion();

        //Assert statement(s)
        assertThat(result, equalTo(70013));
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${aa9352bb-8003-3648-89bf-8ac79fc33136}
    @Test()
    public void servicesTest() {
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        Services result = target.services();
        Services services = Services.none();

        //Assert statement(s)
        assertThat(result, equalTo(services));
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${6fe58293-6ecb-365b-9a21-75d60574bea7}
    @Test()
    public void bitcoinSerializeToStreamWhenRelayTxesBeforeFilter() throws IOException {
        /* Branches:
         * (relayTxesBeforeFilter) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Services services2 = Services.none();
            Instant instant = Instant.now();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            Services services3 = Services.none();
            services.when(() -> Services.none()).thenReturn(services2).thenReturn(services3);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(70013), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            byteUtils.when(() -> ByteUtils.writeInt64LE(eq(0L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{};
            peerAddress.when(() -> PeerAddress.mapIntoIPv6(byteArray2)).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            VarInt varInt2 = VarInt.of(24L);
            varInt.when(() -> VarInt.of(24L)).thenReturn(varInt2);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            VersionMessage target = new VersionMessage(networkParameters, 1);
            OutputStream outputStream = OutputStream.nullOutputStream();
            //Act Statement(s)
            target.bitcoinSerializeToStream(outputStream);
            //Assert statement(s)
            services.verify(() -> Services.none(), atLeast(2));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(70013), (OutputStream) any()));
            byteUtils.verify(() -> ByteUtils.writeInt64LE(eq(0L), (OutputStream) any()));
            peerAddress.verify(() -> PeerAddress.mapIntoIPv6(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (OutputStream) any()));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0), (OutputStream) any()), atLeast(2));
            varInt.verify(() -> VarInt.of(24L), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1L), (OutputStream) any()));
        }
    }

    //Sapient generated method id: ${d5bd5bd8-2e54-3633-b644-e8875aa2f992}
    @Test()
    public void toStringWhenRelayTxesBeforeFilter() {
        /* Branches:
         * (localServices.hasAny()) : false
         * (!relayTxesBeforeFilter) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 2);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("\nclient version: 70013\n\ntime:           2024-02-26T12:24:41Z\nreceiving svc:  \nreceiving addr: B\nsub version:    /bitcoinj:0.17-SNAPSHOT/\nbest height:    2\ndelay tx relay: false\n"));
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${58212c05-0c08-317d-b2fb-ab0a548951e7}
    @Test()
    public void duplicateTest() {
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        VersionMessage result = target.duplicate();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${636ef9a2-f336-3a09-bf43-9d48f229ef7f}
    @Test()
    public void appendToSubVerWhenComponentNotContains_AndComponentNotContains_AndComponentContains_ThrowsIllegalArgumentException() {
        /* Branches:
         * (component.contains("/")) : false  #  inside checkSubVerComponent method
         * (component.contains("(")) : false  #  inside checkSubVerComponent method
         * (component.contains(")")) : true  #  inside checkSubVerComponent method
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("name contains invalid characters");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        target.appendToSubVer(")", "version1", "comments1");

        //Assert statement(s)
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${f9a94092-d738-3d71-b150-0ac3bbe2dbc5}
    @Test()
    public void appendToSubVerWhenComponentNotContains_ThrowsIllegalArgumentException() {
        /* Branches:
         * (component.contains("/")) : false  #  inside checkSubVerComponent method
         * (component.contains("(")) : false  #  inside checkSubVerComponent method
         * (component.contains(")")) : false  #  inside checkSubVerComponent method
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("name contains invalid characters");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        target.appendToSubVer("A", ")", "comments1");

        //Assert statement(s)
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${8b0b45f5-d3a8-35f3-99d5-48203ce188bc}
    @Test()
    public void appendToSubVerWhenCommentsIsNotNull() {
        /* Branches:
         * (component.contains("/")) : false  #  inside checkSubVerComponent method
         * (component.contains("(")) : false  #  inside checkSubVerComponent method
         * (component.contains(")")) : false  #  inside checkSubVerComponent method
         * (comments != null) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        target.appendToSubVer("C", "B", "A");

        //Assert statement(s)
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${f1b4fb54-b24a-3e81-b913-9d81680266f6}
    @Test()
    public void appendToSubVerWhenCommentsIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (component.contains("/")) : false  #  inside checkSubVerComponent method
         * (component.contains("(")) : false  #  inside checkSubVerComponent method
         * (component.contains(")")) : false  #  inside checkSubVerComponent method
         * (comments != null) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("name contains invalid characters");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        target.appendToSubVer("A", "B", ")");

        //Assert statement(s)
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${761cf6fa-1520-3ff5-8c53-855ee388bdee}
    @Test()
    public void appendToSubVerWhenCommentsIsNull() {
        /* Branches:
         * (component.contains("/")) : false  #  inside checkSubVerComponent method
         * (component.contains("(")) : false  #  inside checkSubVerComponent method
         * (component.contains(")")) : false  #  inside checkSubVerComponent method
         * (comments != null) : false
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        target.appendToSubVer("B", "A", (String) null);

        //Assert statement(s)
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${0c994290-e94b-35b1-a267-e7fe4838bd49}
    @Test()
    public void isPingPongSupportedTest() {
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getPort();
        VersionMessage target = new VersionMessage(paramsMock, 1);

        //Act Statement(s)
        boolean result = target.isPingPongSupported();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(paramsMock).getPort();
    }

    //Sapient generated method id: ${2337c104-de1f-364d-8ce3-57eec55420af}
    @Test()
    public void toStringServicesTest() {
        //Arrange Statement(s)
        Services servicesMock = mock(Services.class, "toStringServices_services1");
        try (MockedStatic<Services> services = mockStatic(Services.class)) {
            services.when(() -> Services.of(0L)).thenReturn(servicesMock);
            //Act Statement(s)
            String result = VersionMessage.toStringServices(0L);
            //Assert statement(s)
            assertThat(result, equalTo("toStringServices_services1"));
            services.verify(() -> Services.of(0L), atLeast(1));
        }
    }
}
