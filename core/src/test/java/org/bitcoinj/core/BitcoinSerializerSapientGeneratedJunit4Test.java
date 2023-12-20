package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.nio.BufferUnderflowException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;
import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class BitcoinSerializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Message messageMock = mock(Message.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters networkParametersMock2 = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${624f44cd-c1ca-373a-afc6-46c308a780ea}
    @Test()
    public void withProtocolVersion1WhenProtocolVersionEqualsThisProtocolVersion() {
        /* Branches:
         * (protocolVersion == this.protocolVersion) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 1);
    //Act Statement(s)
    BitcoinSerializer result = target.withProtocolVersion(1);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
}*/
    }

    //Sapient generated method id: ${cc64e9b0-e58b-3ffb-8b01-12468c9651b0}
    @Test()
    public void withProtocolVersion1WhenProtocolVersionNotEqualsThisProtocolVersion() {
        /* Branches:
         * (protocolVersion == this.protocolVersion) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(0).when(networkParametersMock).getPacketMagic();
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock).thenReturn(networkParametersMock2);
    doReturn(0).when(networkParametersMock2).getPacketMagic();
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 2);
    //Act Statement(s)
    BitcoinSerializer result = target.withProtocolVersion(1);
    BitcoinSerializer bitcoinSerializer = new BitcoinSerializer((Network) null, 1);
    //Assert statement(s)
    //TODO: Please implement equals method in BitcoinSerializer for verification to succeed or you need to adjust respective assertion statements
    assertThat(result, equalTo(bitcoinSerializer));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(2));
    verify(networkParametersMock).getPacketMagic();
    verify(networkParametersMock2).getPacketMagic();
}*/
    }

    //Sapient generated method id: ${7dcfa5bf-4bf8-370e-ac63-5f64974e548f}
    @Test()
    public void serializeWhenILessThanCOMMAND_LENAndLogIsDebugEnabled() throws IOException {
        /* Branches:
         * (i < name.length()) : true
         * (i < COMMAND_LEN) : true
         * (log.isDebugEnabled()) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(1).when(networkParametersMock).getPacketMagic();
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 65, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    byteUtils.when(() -> ByteUtils.writeInt32BE(1, byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    byte[] byteArray2 = new byte[] {};
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.serialize("A", byteArray2, outputStream);
    //Assert statement(s)
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock, atLeast(1)).getPacketMagic();
    byteUtils.verify(() -> ByteUtils.writeInt32BE(1, byteArray, 0), atLeast(1));
}*/
    }

    //Sapient generated method id: ${2c7b0ff8-bb05-3972-b626-bdc52304629e}
    @Test()
    public void serialize1WhenNameIsNotNull() throws IOException {
        /* Branches:
         * (name == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(messageMock).serialize();
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = spy(new BitcoinSerializer(networkParameters2, 0));
    doNothing().when(target).serialize(eq("version"), eq(byteArray), (OutputStream) any());
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.serialize(messageMock, outputStream);
    //Assert statement(s)
    verify(messageMock).serialize();
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    verify(target).serialize(eq("version"), eq(byteArray), (OutputStream) any());
}*/
    }

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() throws Exception {
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = spy(new BitcoinSerializer(networkParameters2, 0));
    doNothing().when(target).seekPastMagicBytes((ByteBuffer) any());
    doReturn(messageMock).when(target).deserializePayload((BitcoinSerializer.BitcoinPacketHeader) any(), (ByteBuffer) any());
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Message result = target.deserialize(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(messageMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    verify(target).seekPastMagicBytes((ByteBuffer) any());
    verify(target).deserializePayload((BitcoinSerializer.BitcoinPacketHeader) any(), (ByteBuffer) any());
}*/
    }

    //Sapient generated method id: ${f1fa6e83-3ce8-3694-88d0-5e77f0c20f27}
    @Test()
    public void deserializeHeaderTest() throws ProtocolException, IOException, BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getPacketMagic();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            BitcoinSerializer.BitcoinPacketHeader result = target.deserializeHeader(byteBuffer);
            BitcoinSerializer.BitcoinPacketHeader bitcoinSerializerBitcoinPacketHeader = new BitcoinSerializer.BitcoinPacketHeader(byteBuffer);
            //Assert statement(s)
            //TODO: Please implement equals method in BitcoinPacketHeader for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(bitcoinSerializerBitcoinPacketHeader));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            verify(networkParametersMock).getPacketMagic();
        }
    }

    //Sapient generated method id: ${a1ab99b1-eec7-356b-b9fe-abd938ce31f5}
    @Test()
    public void deserializePayloadWhen3IndexOfHeaderChecksumNotEquals3IndexOfHashThrowsProtocolException() throws ProtocolException, BufferUnderflowException {
        /* Branches:
         * (header.checksum[0] != hash[0]) : false
         * (header.checksum[1] != hash[1]) : false
         * (header.checksum[2] != hash[2]) : false
         * (header.checksum[3] != hash[3]) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    byte[] byteArray = new byte[] { (byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86 };
    byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("5df6e0e2761359d30a8275058e299fcc0381534545f55cf43e41983f5d4c9456");
    byteUtils.when(() -> ByteUtils.formatHex((byte[]) null)).thenReturn("A");
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    thrown.expect(ProtocolException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    BitcoinSerializer.BitcoinPacketHeader bitcoinSerializerBitcoinPacketHeader = new BitcoinSerializer.BitcoinPacketHeader(byteBuffer);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    target.deserializePayload(bitcoinSerializerBitcoinPacketHeader, byteBuffer2);
    //Assert statement(s)
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
    byteUtils.verify(() -> ByteUtils.formatHex((byte[]) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${17174e58-db47-3671-b710-a2ae0916c91b}
    @Test()
    public void deserializePayloadWhenLogIsDebugEnabledThrowsProtocolException() throws ProtocolException, BufferUnderflowException {
        /* Branches:
         * (header.checksum[0] != hash[0]) : false
         * (header.checksum[1] != hash[1]) : false
         * (header.checksum[2] != hash[2]) : false
         * (header.checksum[3] != hash[3]) : false
         * (log.isDebugEnabled()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getPacketMagic();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            BitcoinSerializer.BitcoinPacketHeader bitcoinSerializerBitcoinPacketHeader = new BitcoinSerializer.BitcoinPacketHeader(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.deserializePayload(bitcoinSerializerBitcoinPacketHeader, byteBuffer2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            verify(networkParametersMock).getPacketMagic();
        }
    }

    //Sapient generated method id: ${90c83f42-cca7-310a-8fda-4759b1b13765}
    @Test()
    public void getParametersTest() {
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(0).when(networkParametersMock).getPacketMagic();
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock).thenReturn(networkParametersMock2);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    //Act Statement(s)
    NetworkParameters result = target.getParameters();
    //Assert statement(s)
    assertThat(result, equalTo(networkParametersMock2));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(2));
    verify(networkParametersMock).getPacketMagic();
}*/
    }

    //Sapient generated method id: ${d47ea993-3d62-3c23-83e9-362cda5c62d5}
    @Test()
    public void makeAddressV1MessageTest() throws ProtocolException {
        //Arrange Statement(s)
        //AddressV1Message addressV1MessageMock = mock(AddressV1Message.class);
        /*try (MockedStatic<AddressV1Message> addressV1Message = mockStatic(AddressV1Message.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    addressV1Message.when(() -> AddressV1Message.read((ByteBuffer) any())).thenReturn(addressV1MessageMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    AddressV1Message result = target.makeAddressV1Message(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(addressV1MessageMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    addressV1Message.verify(() -> AddressV1Message.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${9b2c82ef-6626-3884-871b-4b1de3073a66}
    @Test()
    public void makeAddressV2MessageTest() throws ProtocolException {
        //Arrange Statement(s)
        //AddressV2Message addressV2MessageMock = mock(AddressV2Message.class);
        /*try (MockedStatic<AddressV2Message> addressV2Message = mockStatic(AddressV2Message.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    addressV2Message.when(() -> AddressV2Message.read((ByteBuffer) any())).thenReturn(addressV2MessageMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    AddressV2Message result = target.makeAddressV2Message(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(addressV2MessageMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    addressV2Message.verify(() -> AddressV2Message.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${6072de5a-2f9c-30d7-a066-af56b9c44738}
    @Test()
    public void makeBlockTest() throws ProtocolException {
        //Arrange Statement(s)
        //Block blockMock = mock(Block.class);
        /*try (MockedStatic<Block> block = mockStatic(Block.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    block.when(() -> Block.read((ByteBuffer) any())).thenReturn(blockMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Block result = target.makeBlock(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(blockMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    block.verify(() -> Block.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${75db7280-9ce9-39e5-92ab-aeaf6d55b168}
    @Test()
    public void makeBloomFilterTest() throws ProtocolException {
        //Arrange Statement(s)
        //BloomFilter bloomFilterMock = mock(BloomFilter.class);
        /*try (MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    bloomFilter.when(() -> BloomFilter.read((ByteBuffer) any())).thenReturn(bloomFilterMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Message result = target.makeBloomFilter(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(bloomFilterMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    bloomFilter.verify(() -> BloomFilter.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${5c51819a-e9f5-3107-bdc2-c409118d560c}
    @Test()
    public void makeFilteredBlockTest() throws ProtocolException {
        //Arrange Statement(s)
        FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        try (MockedStatic<FilteredBlock> filteredBlock = mockStatic(FilteredBlock.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getPacketMagic();
            filteredBlock.when(() -> FilteredBlock.read((ByteBuffer) any())).thenReturn(filteredBlockMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            FilteredBlock result = target.makeFilteredBlock(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(filteredBlockMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            verify(networkParametersMock).getPacketMagic();
            filteredBlock.verify(() -> FilteredBlock.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${5d252fbc-4834-3aff-9968-d6a5c67a2074}
    @Test()
    public void makeInventoryMessageTest() throws ProtocolException {
        //Arrange Statement(s)
        //InventoryMessage inventoryMessageMock = mock(InventoryMessage.class);
        /*try (MockedStatic<InventoryMessage> inventoryMessage = mockStatic(InventoryMessage.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    inventoryMessage.when(() -> InventoryMessage.read((ByteBuffer) any())).thenReturn(inventoryMessageMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    InventoryMessage result = target.makeInventoryMessage(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(inventoryMessageMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    inventoryMessage.verify(() -> InventoryMessage.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${be379120-8a39-3bcd-87b4-f1dae294a260}
    @Test()
    public void makeTransactionTest() throws ProtocolException {
        //Arrange Statement(s)
        //Transaction transactionMock = mock(Transaction.class);
        /*try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    transaction.when(() -> Transaction.read((ByteBuffer) any(), eq(0))).thenReturn(transactionMock);
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Transaction result = target.makeTransaction(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(transactionMock));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
    transaction.verify(() -> Transaction.read((ByteBuffer) any(), eq(0)));
}*/
    }

    //Sapient generated method id: ${3cf75e16-0ae1-3aac-a554-213dee3712dc}
    @Test()
    public void seekPastMagicBytesWhenMagicCursorNotLessThan0() throws BufferUnderflowException {
        /* Branches:
         * (b == expectedByte) : true
         * (magicCursor < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getPacketMagic();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.seekPastMagicBytes(byteBuffer);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            verify(networkParametersMock).getPacketMagic();
        }
    }
}
