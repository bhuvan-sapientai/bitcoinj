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

import org.junit.Ignore;

import java.util.List;
import java.util.ArrayList;
import java.time.Instant;

public class BitcoinSerializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Message messageMock = mock(Message.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters networkParametersMock2 = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Network networkMock = mock(Network.class);

    //Sapient generated method id: ${624f44cd-c1ca-373a-afc6-46c308a780ea}
    @Test()
    public void withProtocolVersion1WhenProtocolVersionEqualsThisProtocolVersion() {
        /* Branches:
         * (protocolVersion == this.protocolVersion) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
    NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 1);
    //Act Statement(s)
    BitcoinSerializer result = target.withProtocolVersion(1);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${cc64e9b0-e58b-3ffb-8b01-12468c9651b0}
    @Test()
    public void withProtocolVersion1WhenProtocolVersionNotEqualsThisProtocolVersion() {
        /* Branches:
         * (protocolVersion == this.protocolVersion) : false
         */
        //Arrange Statement(s)
        //NetworkParameters networkParameters2Mock = mock(NetworkParameters.class, "0");
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
    doReturn(0).when(networkParametersMock).getPacketMagic();
    BitcoinSerializer target = new BitcoinSerializer(networkParameters2Mock, 2);
    //Act Statement(s)
    BitcoinSerializer result = target.withProtocolVersion(2);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
    verify(networkParametersMock).getPacketMagic();
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
    MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 116, (byte) 101, (byte) 115, (byte) 116, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    byteUtils.when(() -> ByteUtils.writeInt32BE(1, byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray2 = new byte[] { (byte) 0 };
    byte[] byteArray3 = new byte[] { (byte) 1, (byte) 2, (byte) 3 };
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray3)).thenReturn(byteArray2);
    byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("000000007465737400000000000000000300000000000000");
    byteUtils.when(() -> ByteUtils.formatHex(byteArray3)).thenReturn("String");
    NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 1);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.serialize("test", byteArray3, outputStream);
    //Assert statement(s)
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt32BE(1, byteArray, 0), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray3), atLeast(1));
    byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
    byteUtils.verify(() -> ByteUtils.formatHex(byteArray3), atLeast(1));
}*/
    }

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() throws Exception {
        //Arrange Statement(s)
        //Message messageMock = mock(Message.class);
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
    @Ignore()
    @Test()
    public void deserializeHeaderTest() throws ProtocolException, IOException, BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 0);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            BitcoinSerializer.BitcoinPacketHeader result = target.deserializeHeader(byteBuffer);
            BitcoinSerializer.BitcoinPacketHeader bitcoinSerializerBitcoinPacketHeader = new BitcoinSerializer.BitcoinPacketHeader(byteBuffer);
            //Assert statement(s)
            //TODO: Please implement equals method in BitcoinPacketHeader for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(bitcoinSerializerBitcoinPacketHeader));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${90c83f42-cca7-310a-8fda-4759b1b13765}
    @Ignore()
    @Test()
    public void getParametersTest() {
        //Arrange Statement(s)
        NetworkParameters networkParametersMock2 = mock(NetworkParameters.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(0).when(networkParametersMock).getPacketMagic();
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParametersMock).thenReturn(networkParametersMock2);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters2, 70015);
            //Act Statement(s)
            NetworkParameters result = target.getParameters();
            //Assert statement(s)
            assertThat(result, equalTo(networkParametersMock2));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(2));
            verify(networkParametersMock).getPacketMagic();
        }
    }

    //Sapient generated method id: ${d47ea993-3d62-3c23-83e9-362cda5c62d5}
    @Ignore()
    @Test()
    public void makeAddressV1MessageTest() throws ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<AddressV1Message> addressV1Message = mockStatic(AddressV1Message.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            AddressV1Message addressV1Message2 = AddressV1Message.read(byteBuffer);
            addressV1Message.when(() -> AddressV1Message.read((ByteBuffer) any())).thenReturn(addressV1Message2);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 1);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            AddressV1Message result = target.makeAddressV1Message(byteBuffer2);
            //Assert statement(s)
            assertThat(result, equalTo(addressV1Message2));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            addressV1Message.verify(() -> AddressV1Message.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${9b2c82ef-6626-3884-871b-4b1de3073a66}
    @Ignore()
    @Test()
    public void makeAddressV2MessageTest() throws ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<AddressV2Message> addressV2Message = mockStatic(AddressV2Message.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    AddressV2Message addressV2Message2 = AddressV2Message.read(byteBuffer);
    addressV2Message.when(() -> AddressV2Message.read((ByteBuffer) any())).thenReturn(addressV2Message2);
    NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 1);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    AddressV2Message result = target.makeAddressV2Message(byteBuffer2);
    //Assert statement(s)
    assertThat(result, equalTo(addressV2Message2));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    addressV2Message.verify(() -> AddressV2Message.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${6072de5a-2f9c-30d7-a066-af56b9c44738}
    @Ignore()
    @Test()
    public void makeBlockTest() throws ProtocolException {
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Block> block = mockStatic(Block.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            block.when(() -> Block.read((ByteBuffer) any())).thenReturn(block2);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 1);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            Block result = target.makeBlock(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(block2));
            networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
            block.verify(() -> Block.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${75db7280-9ce9-39e5-92ab-aeaf6d55b168}
    @Ignore()
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
    @Ignore()
    @Test()
    public void makeFilteredBlockTest() throws ProtocolException {
        //Arrange Statement(s)
        //FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        /*try (MockedStatic<FilteredBlock> filteredBlock = mockStatic(FilteredBlock.class);
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
}*/
    }

    //Sapient generated method id: ${5d252fbc-4834-3aff-9968-d6a5c67a2074}
    @Ignore()
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
    @Ignore()
    @Test()
    public void makeTransactionTest() throws ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    networkParameters.when(() -> NetworkParameters.of((Network) null)).thenReturn(networkParameters2);
    Transaction transaction2 = new Transaction();
    transaction.when(() -> Transaction.read((ByteBuffer) any(), eq(0))).thenReturn(transaction2);
    NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
    BitcoinSerializer target = new BitcoinSerializer(networkParameters3, 0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Transaction result = target.makeTransaction(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(transaction2));
    networkParameters.verify(() -> NetworkParameters.of((Network) null), atLeast(1));
    transaction.verify(() -> Transaction.read((ByteBuffer) any(), eq(0)));
}*/
    }

    //Sapient generated method id: ${3cf75e16-0ae1-3aac-a554-213dee3712dc}
    @Ignore()
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
        NetworkParameters networkParameters3Mock = mock(NetworkParameters.class, "-619021263");
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            BitcoinSerializer target = new BitcoinSerializer(networkParameters3Mock, 70015);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.seekPastMagicBytes(byteBuffer);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }
}
