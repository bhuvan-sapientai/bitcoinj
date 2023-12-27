package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;
import org.bitcoinj.protobuf.wallet.Protos;
import com.google.protobuf.CodedOutputStream;

import java.io.ByteArrayInputStream;

import org.bitcoinj.params.BitcoinNetworkParams;

import java.io.InputStream;

import com.google.protobuf.WireFormat;
import com.google.protobuf.CodedInputStream;

import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.BitcoinNetwork;
import com.google.protobuf.ByteString;
import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.script.Script;

import java.nio.ByteBuffer;
import java.time.Instant;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

public class WalletProtobufSerializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final CodedInputStream codedInputStreamMock = mock(CodedInputStream.class);

    private final Network networkMock = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");

    private final Protos.Wallet.Builder protosWalletBuilderMock = mock(Protos.Wallet.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.wallet.Protos$Wallet$Builder', onlyPojoFunctions=false, builderPattern=false}");

    private final Protos.Wallet protosWalletMock = mock(Protos.Wallet.class);

    private final org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class);

    private final WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final ByteString byteString2Mock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final ByteString byteStringMock3 = mock(ByteString.class);

    private final ByteString byteStringMock4 = mock(ByteString.class);

    private final ByteString byteStringMock5 = mock(ByteString.class);

    private final ByteString byteStringMock6 = mock(ByteString.class);

    private final ByteString byteStringMock7 = mock(ByteString.class);

    private final ByteString byteStringMock8 = mock(ByteString.class);

    private final ByteString byteStringMock9 = mock(ByteString.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock2 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock3 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock4 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress protosPeerAddressMock = mock(Protos.PeerAddress.class);

    private final Protos.ScriptWitness.Builder protosScriptWitnessBuilderMock = mock(Protos.ScriptWitness.Builder.class);

    private final Protos.ScriptWitness.Builder protosScriptWitnessBuilderMock2 = mock(Protos.ScriptWitness.Builder.class);

    private final Protos.Tag.Builder protosTagBuilderMock = mock(Protos.Tag.Builder.class);

    private final Protos.Tag.Builder protosTagBuilderMock2 = mock(Protos.Tag.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock10 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock11 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock12 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock2 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock3 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock4 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock5 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock6 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock7 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock8 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock9 = mock(Protos.Transaction.Builder.class);

    private final Protos.TransactionConfidence.Builder protosTransactionConfidenceBuilderMock = mock(Protos.TransactionConfidence.Builder.class);

    private final Protos.TransactionConfidence.Builder protosTransactionConfidenceBuilderMock2 = mock(Protos.TransactionConfidence.Builder.class);

    private final Protos.TransactionConfidence.Builder protosTransactionConfidenceBuilderMock3 = mock(Protos.TransactionConfidence.Builder.class);

    private final Protos.TransactionConfidence.Builder protosTransactionConfidenceBuilderMock4 = mock(Protos.TransactionConfidence.Builder.class);

    private final Protos.TransactionConfidence.Builder protosTransactionConfidenceBuilderMock5 = mock(Protos.TransactionConfidence.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock2 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock3 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock4 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock5 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock6 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.TransactionInput.Builder protosTransactionInputBuilderMock7 = mock(Protos.TransactionInput.Builder.class);

    private final Protos.Transaction protosTransactionMock = mock(Protos.Transaction.class);

    private final Protos.TransactionOutput.Builder protosTransactionOutputBuilderMock = mock(Protos.TransactionOutput.Builder.class);

    private final Protos.TransactionOutput.Builder protosTransactionOutputBuilderMock2 = mock(Protos.TransactionOutput.Builder.class);

    private final Protos.TransactionOutput.Builder protosTransactionOutputBuilderMock3 = mock(Protos.TransactionOutput.Builder.class);

    private final Protos.TransactionOutput.Builder protosTransactionOutputBuilderMock4 = mock(Protos.TransactionOutput.Builder.class);

    private final Protos.TransactionOutput.Builder protosTransactionOutputBuilderMock5 = mock(Protos.TransactionOutput.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class, "void");

    private final Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class, "void");

    private final Protos.Wallet.Builder protosWalletBuilderMock4 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock5 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock6 = mock(Protos.Wallet.Builder.class);

    //Sapient generated method id: ${59878bef-d583-3574-bec9-1702ce99d070}
    @Test()
    public void writeWalletTest() throws IOException {
        //Arrange Statement(s)
        CodedOutputStream codedOutputStreamMock = mock(CodedOutputStream.class, "UnknownObjectContent{target='com.google.protobuf.CodedOutputStream', onlyPojoFunctions=false, builderPattern=false}");
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "com.example.WalletProtobufSerializer.WalletFactory@9012");
        org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class, "com.example.Wallet@1234");
        try (MockedStatic<CodedOutputStream> codedOutputStream = mockStatic(CodedOutputStream.class)) {
            codedOutputStream.when(() -> CodedOutputStream.newInstance((OutputStream) any(), eq(4096))).thenReturn(codedOutputStreamMock);
            doNothing().when(codedOutputStreamMock).flush();
            WalletProtobufSerializer target = spy(new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock));
            doReturn(protosWalletMock).when(target).walletToProto(walletMock);
            doNothing().when(protosWalletMock).writeTo(codedOutputStreamMock);
            OutputStream outputStream = OutputStream.nullOutputStream();
            //Act Statement(s)
            target.writeWallet(walletMock, outputStream);
            //Assert statement(s)
            codedOutputStream.verify(() -> CodedOutputStream.newInstance((OutputStream) any(), eq(4096)));
            verify(codedOutputStreamMock).flush();
            verify(target).walletToProto(walletMock);
            verify(protosWalletMock).writeTo(codedOutputStreamMock);
        }
    }

    //Sapient generated method id: ${ca8fdda1-9f39-3d04-b5be-df95984eb9b3}
    @Test()
    public void walletToTextTest() {
        //Arrange Statement(s)
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "{}");
        WalletProtobufSerializer target = spy(new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock));
        Protos.Wallet protosWalletMock = mock(Protos.Wallet.class, "walletToText_protos.Wallet1");
        org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class, "{}");
        doReturn(protosWalletMock).when(target).walletToProto(walletMock);

        //Act Statement(s)
        String result = target.walletToText(walletMock);

        //Assert statement(s)
        assertThat(result, equalTo("walletToText_protos.Wallet1"));
        verify(target).walletToProto(walletMock);
    }

    //Sapient generated method id: ${334c093c-30d2-3708-be57-99714061aa1f}
    @Test()
    public void walletToProtoWhenKeyCrypterNotInstanceOfKeyCrypterScryptThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = ASSURANCE_CONTRACT_CLAIM) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class, "{}");
        Network networkMock = mock(Network.class);
        Protos.Wallet.Builder protosWalletBuilderMock = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "{}");
        try (MockedStatic<Protos.Tag> protosTag = mockStatic(Protos.Tag.class);
             MockedStatic<Protos.ExchangeRate> protosExchangeRate = mockStatic(Protos.ExchangeRate.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence.Type> protosTransactionConfidenceType = mockStatic(Protos.TransactionConfidence.Type.class, CALLS_REAL_METHODS);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn(null).when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(null).when(walletMock).getKeyCrypter();
            doReturn(Optional.empty()).when(walletMock).keyRotationTime();
            Map<String, WalletExtension> stringWalletExtensionMap = new HashMap<>();
            doReturn(stringWalletExtensionMap).when(walletMock).getExtensions();
            Map<String, ByteString> stringByteStringMap = new HashMap<>();
            stringByteStringMap.put("", byteString2Mock);
            doReturn(stringByteStringMap).when(walletMock).getTags();
            doReturn(0).when(walletMock).getVersion();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
            doReturn(builder2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(1703679903L);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).addTags(protosTagBuilderMock);
            doReturn(protosWalletBuilderMock6).when(protosWalletBuilderMock).setVersion(0);
            doReturn(protosWalletMock).when(protosWalletBuilderMock).build();
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
            Protos.Transaction.Builder builder3 = protosTransactionBuilderMock3.setVersion(0);
            doReturn(builder3).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock).setUpdatedAt(1703679902600L);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder6 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder6).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(1703679902646L);
            Protos.Transaction.Builder builder7 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_CLAIM);
            doReturn(builder7).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byte[] byteArray2 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byte[] byteArray3 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byte[] byteArray4 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byte[] byteArray5 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byte[] byteArray6 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byte[] byteArray7 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
            protosTransactionConfidenceType.when(() -> Protos.TransactionConfidence.Type.forNumber(0)).thenReturn(Protos.TransactionConfidence.Type.BUILDING);
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{(byte) 127, (byte) 0, (byte) 0, (byte) 1};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
            Protos.ExchangeRate.Builder builder8 = Protos.ExchangeRate.newBuilder();
            protosExchangeRate.when(() -> Protos.ExchangeRate.newBuilder()).thenReturn(builder8);
            protosTag.when(() -> Protos.Tag.newBuilder()).thenReturn(protosTagBuilderMock2);
            Protos.Tag.Builder builder9 = protosTagBuilderMock2.setTag("");
            doReturn(builder9).when(protosTagBuilderMock2).setTag("");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            //Act Statement(s)
            Protos.Wallet result = target.walletToProto(walletMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosWalletMock));
            verify(walletMock, atLeast(1)).network();
            verify(networkMock, atLeast(1)).id();
            verify(walletMock, atLeast(1)).getDescription();
            verify(walletMock, atLeast(1)).getWalletTransactions();
            verify(walletMock, atLeast(1)).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock, atLeast(1)).getWatchedScripts();
            verify(walletMock, atLeast(1)).getLastBlockSeenHash();
            verify(walletMock, atLeast(1)).lastBlockSeenTime();
            verify(walletMock, atLeast(1)).getKeyCrypter();
            verify(walletMock, atLeast(1)).keyRotationTime();
            verify(walletMock, atLeast(1)).getExtensions();
            verify(walletMock, atLeast(1)).getTags();
            verify(walletMock, atLeast(1)).getVersion();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock, atLeast(1)).setNetworkIdentifier("J");
            verify(protosWalletBuilderMock, atLeast(1)).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock, atLeast(1)).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock, atLeast(1)).setLastSeenBlockTimeSecs(1703679903L);
            verify(protosWalletBuilderMock, atLeast(1)).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            verify(protosWalletBuilderMock, atLeast(1)).addTags(protosTagBuilderMock);
            verify(protosWalletBuilderMock, atLeast(1)).setVersion(0);
            verify(protosWalletBuilderMock, atLeast(1)).build();
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock, atLeast(1)).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2, atLeast(1)).setHash(byteStringMock);
            verify(protosTransactionBuilderMock3, atLeast(1)).setVersion(0);
            verify(protosTransactionBuilderMock, atLeast(1)).setUpdatedAt(1703679902600L);
            verify(protosTransactionBuilderMock, atLeast(1)).setLockTime(0);
            verify(protosTransactionBuilderMock, atLeast(1)).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setSequence(0);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setValue(0L);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock, atLeast(1)).addData(byteStringMock2);
            verify(protosTransactionBuilderMock, atLeast(1)).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock, atLeast(1)).setSpentByTransactionHash(byteStringMock3);
            verify(protosTransactionOutputBuilderMock2, atLeast(1)).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock, atLeast(1)).addBlockHash(byteStringMock4);
            verify(protosTransactionBuilderMock, atLeast(1)).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock, atLeast(1)).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setOverridingTransaction(byteStringMock5);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setLastBroadcastedAt(1703679902646L);
            verify(protosTransactionBuilderMock, atLeast(1)).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            verify(protosTransactionBuilderMock, atLeast(1)).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock, atLeast(1)).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock, atLeast(1)).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5, atLeast(1)).setScriptBytes(byteStringMock6);
            verify(protosTransactionInputBuilderMock6, atLeast(1)).setTransactionOutPointHash(byteStringMock7);
            verify(protosTransactionInputBuilderMock7, atLeast(1)).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4, atLeast(1)).setScriptBytes(byteStringMock8);
            verify(protosTransactionOutputBuilderMock5, atLeast(1)).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            protosTransactionConfidenceType.verify(() -> Protos.TransactionConfidence.Type.forNumber(0), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock, atLeast(1)).setIpAddress(byteStringMock9);
            verify(protosPeerAddressBuilderMock2, atLeast(1)).setPort(0);
            verify(protosPeerAddressBuilderMock3, atLeast(1)).setServices(0L);
            verify(protosPeerAddressBuilderMock4, atLeast(1)).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
            protosExchangeRate.verify(() -> Protos.ExchangeRate.newBuilder(), atLeast(1));
            protosTag.verify(() -> Protos.Tag.newBuilder(), atLeast(1));
            verify(protosTagBuilderMock2, atLeast(1)).setTag("");
        }
    }

    //Sapient generated method id: ${8d122d67-a9cc-31c9-bede-2f8cf668fe53}
    @Test()
    public void walletToProtoWhenKeyCrypterIsNotNullAndKeyCrypterNotInstanceOfKeyCrypterScrypt3ThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = ASSURANCE_CONTRACT_PLEDGE) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         */
        //Arrange Statement(s)
        Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class, "Protos.Wallet.Builder.setNetworkIdentifier(int)");
        Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class, "Protos.Wallet.Builder.setDescription(String)");
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("NetworkParameters.id").when(networkMock).id();
            doReturn("return_of_getDescription1", "Wallet.getDescription()").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).setNetworkIdentifier("NetworkParameters.id");
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setDescription("Wallet.getDescription()");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("NetworkParameters.id");
            verify(protosWalletBuilderMock).setDescription("Wallet.getDescription()");
        }
    }

    //Sapient generated method id: ${89ee7775-a040-3f4a-aaf9-ef01cd907bf1}
    @Test()
    public void walletToProtoWhenKeyCrypterIsNotNullAndKeyCrypterNotInstanceOfKeyCrypterScrypt7ThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = ASSURANCE_CONTRACT_STUB) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class, "[]");
        Protos.Wallet.Builder protosWalletBuilderMock = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "{}");
        try (MockedStatic<Protos.Tag> protosTag = mockStatic(Protos.Tag.class);
             MockedStatic<Protos.ExchangeRate> protosExchangeRate = mockStatic(Protos.ExchangeRate.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence.Type> protosTransactionConfidenceType = mockStatic(Protos.TransactionConfidence.Type.class, CALLS_REAL_METHODS);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn(null).when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(null).when(walletMock).getKeyCrypter();
            doReturn(Optional.empty()).when(walletMock).keyRotationTime();
            Map<String, WalletExtension> stringWalletExtensionMap = new HashMap<>();
            doReturn(stringWalletExtensionMap).when(walletMock).getExtensions();
            Map<String, ByteString> stringByteStringMap = new HashMap<>();
            stringByteStringMap.put("", byteString2Mock);
            doReturn(stringByteStringMap).when(walletMock).getTags();
            doReturn(0).when(walletMock).getVersion();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
            doReturn(builder2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(1703679930L);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).addTags(protosTagBuilderMock);
            doReturn(protosWalletBuilderMock6).when(protosWalletBuilderMock).setVersion(0);
            doReturn(protosWalletMock).when(protosWalletBuilderMock).build();
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
            Protos.Transaction.Builder builder3 = protosTransactionBuilderMock3.setVersion(0);
            doReturn(builder3).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock).setUpdatedAt(1703679914309L);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder6 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder6).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(1703679916149L);
            Protos.Transaction.Builder builder7 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_STUB);
            doReturn(builder7).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byte[] byteArray2 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byte[] byteArray3 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byte[] byteArray4 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byte[] byteArray5 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byte[] byteArray6 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byte[] byteArray7 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
            protosTransactionConfidenceType.when(() -> Protos.TransactionConfidence.Type.forNumber(0)).thenReturn(Protos.TransactionConfidence.Type.BUILDING);
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{(byte) 127, (byte) 0, (byte) 0, (byte) 1};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
            Protos.ExchangeRate.Builder builder8 = Protos.ExchangeRate.newBuilder();
            protosExchangeRate.when(() -> Protos.ExchangeRate.newBuilder()).thenReturn(builder8);
            protosTag.when(() -> Protos.Tag.newBuilder()).thenReturn(protosTagBuilderMock2);
            Protos.Tag.Builder builder9 = protosTagBuilderMock2.setTag("");
            doReturn(builder9).when(protosTagBuilderMock2).setTag("");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            //Act Statement(s)
            Protos.Wallet result = target.walletToProto(walletMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosWalletMock));
            verify(walletMock, atLeast(1)).network();
            verify(networkMock, atLeast(1)).id();
            verify(walletMock, atLeast(1)).getDescription();
            verify(walletMock, atLeast(1)).getWalletTransactions();
            verify(walletMock, atLeast(1)).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock, atLeast(1)).getWatchedScripts();
            verify(walletMock, atLeast(1)).getLastBlockSeenHash();
            verify(walletMock, atLeast(1)).lastBlockSeenTime();
            verify(walletMock, atLeast(1)).getKeyCrypter();
            verify(walletMock, atLeast(1)).keyRotationTime();
            verify(walletMock, atLeast(1)).getExtensions();
            verify(walletMock, atLeast(1)).getTags();
            verify(walletMock, atLeast(1)).getVersion();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock, atLeast(1)).setNetworkIdentifier("J");
            verify(protosWalletBuilderMock, atLeast(1)).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock, atLeast(1)).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock, atLeast(1)).setLastSeenBlockTimeSecs(1703679930L);
            verify(protosWalletBuilderMock, atLeast(1)).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            verify(protosWalletBuilderMock, atLeast(1)).addTags(protosTagBuilderMock);
            verify(protosWalletBuilderMock, atLeast(1)).setVersion(0);
            verify(protosWalletBuilderMock, atLeast(1)).build();
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock, atLeast(1)).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2, atLeast(1)).setHash(byteStringMock);
            verify(protosTransactionBuilderMock3, atLeast(1)).setVersion(0);
            verify(protosTransactionBuilderMock, atLeast(1)).setUpdatedAt(1703679914309L);
            verify(protosTransactionBuilderMock, atLeast(1)).setLockTime(0);
            verify(protosTransactionBuilderMock, atLeast(1)).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setSequence(0);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setValue(0L);
            verify(protosTransactionInputBuilderMock, atLeast(1)).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock, atLeast(1)).addData(byteStringMock2);
            verify(protosTransactionBuilderMock, atLeast(1)).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock, atLeast(1)).setSpentByTransactionHash(byteStringMock3);
            verify(protosTransactionOutputBuilderMock2, atLeast(1)).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock, atLeast(1)).addBlockHash(byteStringMock4);
            verify(protosTransactionBuilderMock, atLeast(1)).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock, atLeast(1)).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setOverridingTransaction(byteStringMock5);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock, atLeast(1)).setLastBroadcastedAt(1703679916149L);
            verify(protosTransactionBuilderMock, atLeast(1)).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            verify(protosTransactionBuilderMock, atLeast(1)).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock, atLeast(1)).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock, atLeast(1)).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5, atLeast(1)).setScriptBytes(byteStringMock6);
            verify(protosTransactionInputBuilderMock6, atLeast(1)).setTransactionOutPointHash(byteStringMock7);
            verify(protosTransactionInputBuilderMock7, atLeast(1)).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4, atLeast(1)).setScriptBytes(byteStringMock8);
            verify(protosTransactionOutputBuilderMock5, atLeast(1)).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            protosTransactionConfidenceType.verify(() -> Protos.TransactionConfidence.Type.forNumber(0), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock, atLeast(1)).setIpAddress(byteStringMock9);
            verify(protosPeerAddressBuilderMock2, atLeast(1)).setPort(0);
            verify(protosPeerAddressBuilderMock3, atLeast(1)).setServices(0L);
            verify(protosPeerAddressBuilderMock4, atLeast(1)).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
            protosExchangeRate.verify(() -> Protos.ExchangeRate.newBuilder(), atLeast(1));
            protosTag.verify(() -> Protos.Tag.newBuilder(), atLeast(1));
            verify(protosTagBuilderMock2, atLeast(1)).setTag("");
        }
    }

    //Sapient generated method id: ${a4edb7ed-59e3-3fe2-8e75-cb4fc00f11b5}
    @Test()
    public void walletToProtoWhenKeyCrypterIsNotNullAndKeyCrypterNotInstanceOfKeyCrypterScrypt11ThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = KEY_ROTATION) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("int").when(networkMock).id();
            doReturn("return_of_getDescription1", "String").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).setNetworkIdentifier("int");
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setDescription("String");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("int");
            verify(protosWalletBuilderMock).setDescription("String");
        }
    }

    //Sapient generated method id: ${48c09dfc-17f1-3157-9adb-1fb96bdc8387}
    @Test()
    public void walletToProtoWhenKeyCrypterIsNotNullAndKeyCrypterNotInstanceOfKeyCrypterScrypt15ThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = RAISE_FEE) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("int").when(networkMock).id();
            doReturn("return_of_getDescription1", "String").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).setNetworkIdentifier("int");
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setDescription("String");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("int");
            verify(protosWalletBuilderMock).setDescription("String");
        }
    }

    //Sapient generated method id: ${722e77fe-0a77-3b58-a894-1f4150d94e10}
    @Test()
    public void walletToProtoWhenKeyCrypterIsNotNullAndKeyCrypterNotInstanceOfKeyCrypterScrypt25ThrowsRuntimeException() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = USER_PAYMENT) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : false
         * (lastSeenBlockHash != null) : false
         * (keyCrypter == null) : false
         * (keyCrypter instanceof KeyCrypterScrypt) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("int").when(networkMock).id();
            doReturn("return_of_getDescription1", "String").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).setNetworkIdentifier("int");
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setDescription("String");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("int");
            verify(protosWalletBuilderMock).setDescription("String");
        }
    }

    //Sapient generated method id: ${c2653ee9-0456-39df-99f7-b9e7f3b4dff8}
    @Test()
    public void walletToProtoWhenWalletGetTagsEntrySetIsNotEmpty() {
        /* Branches:
         * (wallet.getDescription() != null) : true
         * (for-each(wallet.getWalletTransactions())) : true
         * (switch(wtx.getPool()) = UNSPENT) : true  #  inside getProtoPool method
         * (locktime.isSet()) : true  #  inside makeTxProto method
         * (for-each(tx.getInputs())) : true  #  inside makeTxProto method
         * (input.hasSequence()) : true  #  inside makeTxProto method
         * (input.getValue() != null) : true  #  inside makeTxProto method
         * (input.hasWitness()) : true  #  inside makeTxProto method
         * (i < pushCount) : true  #  inside makeTxProto method
         * (for-each(tx.getOutputs())) : true  #  inside makeTxProto method
         * (spentBy != null) : true  #  inside makeTxProto method
         * (appearsInHashes != null) : true  #  inside makeTxProto method
         * (for-each(appearsInHashes.entrySet())) : true  #  inside makeTxProto method
         * (tx.hasConfidence()) : true  #  inside makeTxProto method
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true  #  inside writeConfidence method
         * (confidence.getConfidenceType() == ConfidenceType.DEAD) : true  #  inside writeConfidence method
         * (confidence.getOverridingTxId() != null) : true  #  inside writeConfidence method
         * (switch(source) = SELF) : true  #  inside writeConfidence method
         * (for-each(confidence.getBroadcastBy())) : true  #  inside writeConfidence method
         * (switch(tx.getPurpose()) = UNKNOWN) : true  #  inside makeTxProto method
         * (exchangeRate != null) : true  #  inside makeTxProto method
         * (tx.getMemo() != null) : true  #  inside makeTxProto method
         * (for-each(wallet.getWatchedScripts())) : true
         * (lastSeenBlockHash != null) : true
         * (keyCrypter == null) : true
         * (keyRotationTime.isPresent()) : true
         * (for-each(wallet.getExtensions().values())) : true  #  inside populateExtensions method
         * (for-each(wallet.getTags().entrySet())) : true
         */
        //Arrange Statement(s)
        Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class, "int");
        Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class, "String");
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("String").when(networkMock).id();
            doReturn("return_of_getDescription1", "String").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).setNetworkIdentifier("String");
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).setDescription("String");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("String");
            verify(protosWalletBuilderMock).setDescription("String");
        }
    }

    //Sapient generated method id: ${eb970ee3-e78f-3dc8-89e1-d93d405ef84a}
    @Test()
    public void hashToByteStringTest() {
        //Arrange Statement(s)
        Sha256Hash hashMock = mock(Sha256Hash.class, "byte[]");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(hashMock).getBytes();
            ByteString byteString2 = ByteString.empty();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            //Act Statement(s)
            ByteString result = WalletProtobufSerializer.hashToByteString(hashMock);
            //Assert statement(s)
            assertThat(result, equalTo(byteString2));
            verify(hashMock).getBytes();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${b26f93c5-0f0b-3b74-ad48-b1aeac61ec7e}
    @Test()
    public void byteStringToHashTest() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            ByteString byteString = ByteString.empty();
            //Act Statement(s)
            Sha256Hash result = WalletProtobufSerializer.byteStringToHash(byteString);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }
}
