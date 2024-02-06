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

import java.util.ArrayList;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.script.Script;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;

public class WalletProtobufSerializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final CodedInputStream codedInputStreamMock = mock(CodedInputStream.class);

    private final Network networkMock = mock(Network.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet protosWalletMock = mock(Protos.Wallet.class);

    private final org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class);

    private final WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final ByteString byteStringMock3 = mock(ByteString.class);

    private final ByteString byteStringMock4 = mock(ByteString.class);

    private final ByteString byteStringMock5 = mock(ByteString.class);

    private final ByteString byteStringMock6 = mock(ByteString.class);

    private final ByteString byteStringMock7 = mock(ByteString.class);

    private final ByteString byteStringMock8 = mock(ByteString.class);

    private final ByteString byteStringMock9 = mock(ByteString.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock2 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock3 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress.Builder protosPeerAddressBuilderMock4 = mock(Protos.PeerAddress.Builder.class);

    private final Protos.PeerAddress protosPeerAddressMock = mock(Protos.PeerAddress.class);

    private final Protos.ScriptWitness.Builder protosScriptWitnessBuilderMock = mock(Protos.ScriptWitness.Builder.class);

    private final Protos.ScriptWitness.Builder protosScriptWitnessBuilderMock2 = mock(Protos.ScriptWitness.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock10 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock11 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock12 = mock(Protos.Transaction.Builder.class);

    private final Protos.Transaction.Builder protosTransactionBuilderMock13 = mock(Protos.Transaction.Builder.class);

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

    private final Protos.Wallet.Builder protosWalletBuilderMock4 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock5 = mock(Protos.Wallet.Builder.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    //Sapient generated method id: ${59878bef-d583-3574-bec9-1702ce99d070}
    @Test()
    public void writeWalletTest() throws IOException {
        //Arrange Statement(s)
        //CodedOutputStream codedOutputStreamMock = mock(CodedOutputStream.class);
        /*try (MockedStatic<CodedOutputStream> codedOutputStream = mockStatic(CodedOutputStream.class)) {
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
}*/
    }

    //Sapient generated method id: ${ca8fdda1-9f39-3d04-b5be-df95984eb9b3}
    @Test()
    public void walletToTextTest() {
        //Arrange Statement(s)
        WalletProtobufSerializer target = spy(new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock));
        Protos.Wallet protosWalletMock = mock(Protos.Wallet.class, "walletToText_protos.Wallet1");
        doReturn(protosWalletMock).when(target).walletToProto(walletMock);
        //Act Statement(s)
        String result = target.walletToText(walletMock);
        //Assert statement(s)
        assertThat(result, equalTo("walletToText_protos.Wallet1"));
        verify(target).walletToProto(walletMock);
    }

    //Sapient generated method id: ${9dbdc604-193d-3f67-8203-f784e9d830c1}
    @Test()
    public void walletToProtoWhenSwitchTxGetPurposeCaseDefaultThrowsRuntimeException() {
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
         * (switch(tx.getPurpose()) = default) : true  #  inside makeTxProto method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
    MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
    MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
    MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
    MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
    MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
    MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class)) {
    doReturn(networkMock).when(walletMock).network();
    doReturn("J").when(networkMock).id();
    doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
    //TODO: Needs to return real value
    doReturn(null).when(walletMock).getWalletTransactions();
    protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
    doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
    doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
    doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
    doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
    doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
    doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
    doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    Protos.TransactionConfidence.Builder builder = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
    doReturn(builder).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    Protos.TransactionConfidence.Builder builder2 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
    doReturn(builder2).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setDepth(0);
    doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setDepth(0);
    doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    byte[] byteArray = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
    protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
    doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byte[] byteArray2 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
    byte[] byteArray3 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
    protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
    byte[] byteArray4 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
    protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
    doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
    byte[] byteArray5 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
    byte[] byteArray6 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
    byte[] byteArray7 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
    protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
    byte[] byteArray8 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
    protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
    doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
    doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
    doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
    byte[] byteArray9 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
    WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
    RuntimeException runtimeException = new RuntimeException("New tx purpose serialization not implemented.");
    thrown.expect(RuntimeException.class);
    thrown.expectMessage(runtimeException.getMessage());
    //Act Statement(s)
    target.walletToProto(walletMock);
    //Assert statement(s)
    verify(walletMock).network();
    verify(networkMock).id();
    verify(walletMock, times(2)).getDescription();
    verify(walletMock).getWalletTransactions();
    protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
    verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    verify(protosTransactionBuilderMock2).setHash(byteStringMock);
    verify(protosTransactionBuilderMock3).setVersion(0);
    verify(protosTransactionBuilderMock).setUpdatedAt(0L);
    verify(protosTransactionBuilderMock).setLockTime(0);
    verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    verify(protosTransactionInputBuilderMock).setSequence(0);
    verify(protosTransactionInputBuilderMock).setValue(0L);
    verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    verify(protosTransactionConfidenceBuilderMock).setDepth(0);
    verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
    protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
    verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
    protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
    protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
    verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    verify(protosTransactionOutputBuilderMock5).setValue(0L);
    byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
    protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
    protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
    verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    verify(protosPeerAddressBuilderMock2).setPort(0);
    verify(protosPeerAddressBuilderMock3).setServices(0L);
    verify(protosPeerAddressBuilderMock4).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
}*/
    }

    //Sapient generated method id: ${334c093c-30d2-3708-be57-99714061aa1f}
    @Ignore()
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
        /*try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
    MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
    MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
    MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
    MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
    MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
    MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
    MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
    doReturn(networkMock).when(walletMock).network();
    doReturn("J").when(networkMock).id();
    doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
    //TODO: Needs to return real value
    doReturn(null).when(walletMock).getWalletTransactions();
    List<Protos.Key> protosKeyList = new ArrayList<>();
    doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
    List<Script> scriptList = new ArrayList<>();
    doReturn(scriptList).when(walletMock).getWatchedScripts();
    doReturn(null).when(walletMock).getLastBlockSeenHash();
    Instant instant = Instant.now();
    doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
    doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
    doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
    protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
    Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
    doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
    Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
    doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
    doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
    doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
    doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
    doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
    doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
    doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
    doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
    doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
    doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
    doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
    doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
    doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
    doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_CLAIM);
    doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_CLAIM);
    doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
    byte[] byteArray = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
    protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
    doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byte[] byteArray2 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
    byte[] byteArray3 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
    protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
    byte[] byteArray4 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
    protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
    doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
    byte[] byteArray5 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
    byte[] byteArray6 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
    byte[] byteArray7 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
    protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
    byte[] byteArray8 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
    protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
    doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
    doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
    doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
    byte[] byteArray9 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
    WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
    RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
    thrown.expect(RuntimeException.class);
    thrown.expectMessage(runtimeException.getMessage());
    //Act Statement(s)
    target.walletToProto(walletMock);
    //Assert statement(s)
    verify(walletMock).network();
    verify(networkMock).id();
    verify(walletMock, times(2)).getDescription();
    verify(walletMock).getWalletTransactions();
    verify(walletMock).serializeKeyChainGroupToProtobufInternal();
    verify(walletMock).getWatchedScripts();
    verify(walletMock).getLastBlockSeenHash();
    verify(walletMock).lastBlockSeenTime();
    verify(walletMock).getKeyCrypter();
    verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
    protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
    verify(protosWalletBuilderMock).setNetworkIdentifier("J");
    verify(protosWalletBuilderMock).setDescription("Q");
    verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    verify(protosWalletBuilderMock).addAllKey(protosKeyList);
    verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
    verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    verify(protosTransactionBuilderMock2).setHash(byteStringMock);
    verify(protosTransactionBuilderMock3).setVersion(0);
    verify(protosTransactionBuilderMock).setUpdatedAt(0L);
    verify(protosTransactionBuilderMock).setLockTime(0);
    verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    verify(protosTransactionInputBuilderMock).setSequence(0);
    verify(protosTransactionInputBuilderMock).setValue(0L);
    verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    verify(protosTransactionConfidenceBuilderMock).setDepth(0);
    verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_CLAIM);
    verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    verify(protosTransactionBuilderMock).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
    protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
    verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
    protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
    protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
    verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    verify(protosTransactionOutputBuilderMock5).setValue(0L);
    byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
    protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
    protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
    verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    verify(protosPeerAddressBuilderMock2).setPort(0);
    verify(protosPeerAddressBuilderMock3).setServices(0L);
    verify(protosPeerAddressBuilderMock4).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
}*/
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
    MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
    MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
    MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
    MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
    MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
    MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
    MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
    doReturn(networkMock).when(walletMock).network();
    doReturn("J").when(networkMock).id();
    doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
    //TODO: Needs to return real value
    doReturn(null).when(walletMock).getWalletTransactions();
    List<Protos.Key> protosKeyList = new ArrayList<>();
    doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
    List<Script> scriptList = new ArrayList<>();
    doReturn(scriptList).when(walletMock).getWatchedScripts();
    doReturn(null).when(walletMock).getLastBlockSeenHash();
    Instant instant = Instant.now();
    doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
    doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
    doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
    protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
    Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
    doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
    Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
    doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
    doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
    doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
    doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
    doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
    doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
    doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
    doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
    doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
    doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
    doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
    doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
    doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
    doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_PLEDGE);
    doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_PLEDGE);
    doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
    byte[] byteArray = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
    protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
    doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byte[] byteArray2 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
    byte[] byteArray3 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
    protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
    byte[] byteArray4 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
    protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
    doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
    byte[] byteArray5 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
    byte[] byteArray6 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
    byte[] byteArray7 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
    protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
    byte[] byteArray8 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
    protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
    doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
    doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
    doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
    byte[] byteArray9 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
    WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
    RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
    thrown.expect(RuntimeException.class);
    thrown.expectMessage(runtimeException.getMessage());
    //Act Statement(s)
    target.walletToProto(walletMock);
    //Assert statement(s)
    verify(walletMock).network();
    verify(networkMock).id();
    verify(walletMock, times(2)).getDescription();
    verify(walletMock).getWalletTransactions();
    verify(walletMock).serializeKeyChainGroupToProtobufInternal();
    verify(walletMock).getWatchedScripts();
    verify(walletMock).getLastBlockSeenHash();
    verify(walletMock).lastBlockSeenTime();
    verify(walletMock).getKeyCrypter();
    verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
    protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
    verify(protosWalletBuilderMock).setNetworkIdentifier("J");
    verify(protosWalletBuilderMock).setDescription("Q");
    verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    verify(protosWalletBuilderMock).addAllKey(protosKeyList);
    verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
    verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    verify(protosTransactionBuilderMock2).setHash(byteStringMock);
    verify(protosTransactionBuilderMock3).setVersion(0);
    verify(protosTransactionBuilderMock).setUpdatedAt(0L);
    verify(protosTransactionBuilderMock).setLockTime(0);
    verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    verify(protosTransactionInputBuilderMock).setSequence(0);
    verify(protosTransactionInputBuilderMock).setValue(0L);
    verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    verify(protosTransactionConfidenceBuilderMock).setDepth(0);
    verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_PLEDGE);
    verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    verify(protosTransactionBuilderMock).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
    protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
    verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
    protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
    protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
    verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    verify(protosTransactionOutputBuilderMock5).setValue(0L);
    byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
    protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
    protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
    verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    verify(protosPeerAddressBuilderMock2).setPort(0);
    verify(protosPeerAddressBuilderMock3).setServices(0L);
    verify(protosPeerAddressBuilderMock4).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
}*/
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
        /*try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
    MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
    MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
    MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
    MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
    MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
    MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
    MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
    doReturn(networkMock).when(walletMock).network();
    doReturn("J").when(networkMock).id();
    doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
    //TODO: Needs to return real value
    doReturn(null).when(walletMock).getWalletTransactions();
    List<Protos.Key> protosKeyList = new ArrayList<>();
    doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
    List<Script> scriptList = new ArrayList<>();
    doReturn(scriptList).when(walletMock).getWatchedScripts();
    doReturn(null).when(walletMock).getLastBlockSeenHash();
    Instant instant = Instant.now();
    doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
    doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
    doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
    protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
    Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
    doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
    Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
    doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
    doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
    doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
    doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
    doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
    doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
    doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
    doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
    doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
    doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
    doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
    doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
    doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
    doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_STUB);
    doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_STUB);
    doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
    byte[] byteArray = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
    protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
    doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byte[] byteArray2 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
    byte[] byteArray3 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
    protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
    byte[] byteArray4 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
    protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
    doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
    byte[] byteArray5 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
    byte[] byteArray6 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
    byte[] byteArray7 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
    protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
    byte[] byteArray8 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
    protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
    doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
    doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
    doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
    byte[] byteArray9 = new byte[] {};
    byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
    WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
    RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
    thrown.expect(RuntimeException.class);
    thrown.expectMessage(runtimeException.getMessage());
    //Act Statement(s)
    target.walletToProto(walletMock);
    //Assert statement(s)
    verify(walletMock).network();
    verify(networkMock).id();
    verify(walletMock, times(2)).getDescription();
    verify(walletMock).getWalletTransactions();
    verify(walletMock).serializeKeyChainGroupToProtobufInternal();
    verify(walletMock).getWatchedScripts();
    verify(walletMock).getLastBlockSeenHash();
    verify(walletMock).lastBlockSeenTime();
    verify(walletMock).getKeyCrypter();
    verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
    protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
    verify(protosWalletBuilderMock).setNetworkIdentifier("J");
    verify(protosWalletBuilderMock).setDescription("Q");
    verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
    verify(protosWalletBuilderMock).addAllKey(protosKeyList);
    verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
    verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
    protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
    verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
    verify(protosTransactionBuilderMock2).setHash(byteStringMock);
    verify(protosTransactionBuilderMock3).setVersion(0);
    verify(protosTransactionBuilderMock).setUpdatedAt(0L);
    verify(protosTransactionBuilderMock).setLockTime(0);
    verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
    verify(protosTransactionInputBuilderMock).setSequence(0);
    verify(protosTransactionInputBuilderMock).setValue(0L);
    verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
    verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
    verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
    verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
    verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
    verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
    verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
    verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
    verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
    verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
    verify(protosTransactionConfidenceBuilderMock).setDepth(0);
    verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
    verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
    verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
    verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
    verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.ASSURANCE_CONTRACT_STUB);
    verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
    verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
    verify(protosTransactionBuilderMock).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
    protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
    verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
    verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
    verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
    byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
    protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
    protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
    verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
    verify(protosTransactionOutputBuilderMock5).setValue(0L);
    byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
    protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
    byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
    protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
    verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
    verify(protosPeerAddressBuilderMock2).setPort(0);
    verify(protosPeerAddressBuilderMock3).setServices(0L);
    verify(protosPeerAddressBuilderMock4).build();
    byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
}*/
    }

    //Sapient generated method id: ${a4edb7ed-59e3-3fe2-8e75-cb4fc00f11b5}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("").when(networkMock).id();
            doReturn("return_of_getDescription1", "").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("");
            doReturn(builder2).when(protosWalletBuilderMock).setDescription("");
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.KEY_ROTATION);
            doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.KEY_ROTATION);
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
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
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            verify(walletMock).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock).getWatchedScripts();
            verify(walletMock).getLastBlockSeenHash();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getKeyCrypter();
            verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("");
            verify(protosWalletBuilderMock).setDescription("");
            verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2).setHash(byteStringMock);
            verify(protosTransactionBuilderMock3).setVersion(0);
            verify(protosTransactionBuilderMock).setUpdatedAt(0L);
            verify(protosTransactionBuilderMock).setLockTime(0);
            verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock).setSequence(0);
            verify(protosTransactionInputBuilderMock).setValue(0L);
            verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.KEY_ROTATION);
            verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            verify(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            verify(protosPeerAddressBuilderMock2).setPort(0);
            verify(protosPeerAddressBuilderMock3).setServices(0L);
            verify(protosPeerAddressBuilderMock4).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
        }
    }

    //Sapient generated method id: ${48c09dfc-17f1-3157-9adb-1fb96bdc8387}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
            doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.RAISE_FEE);
            doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.RAISE_FEE);
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
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
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            verify(walletMock).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock).getWatchedScripts();
            verify(walletMock).getLastBlockSeenHash();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getKeyCrypter();
            verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("J");
            verify(protosWalletBuilderMock).setDescription("Q");
            verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2).setHash(byteStringMock);
            verify(protosTransactionBuilderMock3).setVersion(0);
            verify(protosTransactionBuilderMock).setUpdatedAt(0L);
            verify(protosTransactionBuilderMock).setLockTime(0);
            verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock).setSequence(0);
            verify(protosTransactionInputBuilderMock).setValue(0L);
            verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.RAISE_FEE);
            verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            verify(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            verify(protosPeerAddressBuilderMock2).setPort(0);
            verify(protosPeerAddressBuilderMock3).setServices(0L);
            verify(protosPeerAddressBuilderMock4).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
        }
    }

    //Sapient generated method id: ${722e77fe-0a77-3b58-a894-1f4150d94e10}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(keyCrypterMock).when(walletMock).getKeyCrypter();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
            doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder3 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder3).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder4 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder4).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.USER_PAYMENT);
            doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.USER_PAYMENT);
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
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
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock9);
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            RuntimeException runtimeException = new RuntimeException("The wallet has encryption of type 'UNENCRYPTED' but this WalletProtobufSerializer does not know how to persist this.");
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            //Act Statement(s)
            target.walletToProto(walletMock);
            //Assert statement(s)
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            verify(walletMock).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock).getWatchedScripts();
            verify(walletMock).getLastBlockSeenHash();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getKeyCrypter();
            verify(keyCrypterMock, times(2)).getUnderstoodEncryptionType();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("J");
            verify(protosWalletBuilderMock).setDescription("Q");
            verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2).setHash(byteStringMock);
            verify(protosTransactionBuilderMock3).setVersion(0);
            verify(protosTransactionBuilderMock).setUpdatedAt(0L);
            verify(protosTransactionBuilderMock).setLockTime(0);
            verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock).setSequence(0);
            verify(protosTransactionInputBuilderMock).setValue(0L);
            verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock).addData(byteStringMock2);
            verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock3);
            verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock).addBlockHash(byteStringMock4);
            verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock5);
            verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.USER_PAYMENT);
            verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            verify(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            verify(protosPeerAddressBuilderMock2).setPort(0);
            verify(protosPeerAddressBuilderMock3).setServices(0L);
            verify(protosPeerAddressBuilderMock4).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
        }
    }

    //Sapient generated method id: ${c2653ee9-0456-39df-99f7-b9e7f3b4dff8}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        WalletExtension walletExtensionMock = mock(WalletExtension.class);
        ByteString byteString2Mock = mock(ByteString.class);
        Protos.Script protosScriptMock = mock(Protos.Script.class);
        Protos.Wallet.Builder protosWalletBuilderMock6 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock7 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock8 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock9 = mock(Protos.Wallet.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock10 = mock(Protos.Wallet.Builder.class);
        Protos.Extension.Builder protosExtensionBuilderMock = mock(Protos.Extension.Builder.class);
        Protos.Extension.Builder protosExtensionBuilderMock2 = mock(Protos.Extension.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock11 = mock(Protos.Wallet.Builder.class);
        Protos.Tag.Builder protosTagBuilderMock = mock(Protos.Tag.Builder.class);
        Protos.Wallet.Builder protosWalletBuilderMock12 = mock(Protos.Wallet.Builder.class);
        ByteString byteStringMock10 = mock(ByteString.class);
        ByteString byteStringMock11 = mock(ByteString.class);
        Protos.Script.Builder protosScriptBuilderMock = mock(Protos.Script.Builder.class);
        Protos.Script.Builder protosScriptBuilderMock2 = mock(Protos.Script.Builder.class);
        ByteString byteStringMock12 = mock(ByteString.class);
        Protos.Script.Builder protosScriptBuilderMock3 = mock(Protos.Script.Builder.class);
        Protos.Tag.Builder protosTagBuilderMock2 = mock(Protos.Tag.Builder.class);
        try (MockedStatic<Protos.Tag> protosTag = mockStatic(Protos.Tag.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Extension> protosExtension = mockStatic(Protos.Extension.class);
             MockedStatic<Protos.Script> protosScript = mockStatic(Protos.Script.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class);
             MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
            //TODO: Needs to return real value
            doReturn(null).when(walletMock).getWalletTransactions();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock).program();
            doReturn(Optional.empty()).when(scriptMock).creationTime();
            doReturn(sha256HashMock).when(walletMock).getLastBlockSeenHash();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(sha256HashMock).getBytes();
            doReturn(0).when(walletMock).getLastBlockSeenHeight();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            doReturn(null).when(walletMock).getKeyCrypter();
            Instant instant2 = (Instant) Instant.now();
            doReturn(Optional.of(instant2)).when(walletMock).keyRotationTime();
            Map<String, WalletExtension> stringWalletExtensionMap = new HashMap<>();
            stringWalletExtensionMap.put("0", walletExtensionMock);
            doReturn(stringWalletExtensionMap).when(walletMock).getExtensions();
            doReturn("X").when(walletExtensionMock).getWalletExtensionID();
            doReturn(false).when(walletExtensionMock).isWalletExtensionMandatory();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(walletExtensionMock).serializeWalletExtension();
            Map<String, ByteString> stringByteStringMap = new HashMap<>();
            stringByteStringMap.put("Z", byteString2Mock);
            doReturn(stringByteStringMap).when(walletMock).getTags();
            doReturn(0).when(walletMock).getVersion();
            protosWallet.when(() -> Protos.Wallet.newBuilder()).thenReturn(protosWalletBuilderMock);
            Protos.Wallet.Builder builder = protosWalletBuilderMock.setNetworkIdentifier("J");
            doReturn(builder).when(protosWalletBuilderMock).setNetworkIdentifier("J");
            Protos.Wallet.Builder builder2 = protosWalletBuilderMock.setDescription("Q");
            doReturn(builder2).when(protosWalletBuilderMock).setDescription("Q");
            doReturn(protosWalletBuilderMock2).when(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            doReturn(protosWalletBuilderMock3).when(protosWalletBuilderMock).addAllKey(protosKeyList);
            doReturn(protosWalletBuilderMock4).when(protosWalletBuilderMock).addWatchedScript(protosScriptMock);
            doReturn(protosWalletBuilderMock5).when(protosWalletBuilderMock).setLastSeenBlockHash(byteStringMock);
            doReturn(protosWalletBuilderMock6).when(protosWalletBuilderMock).setLastSeenBlockHeight(0);
            doReturn(protosWalletBuilderMock7).when(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            doReturn(protosWalletBuilderMock8).when(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            doReturn(protosWalletBuilderMock9).when(protosWalletBuilderMock).setKeyRotationTime(0L);
            doReturn(protosWalletBuilderMock10).when(protosWalletBuilderMock).addExtension(protosExtensionBuilderMock);
            Protos.Extension.Builder builder3 = protosExtensionBuilderMock.setId("X");
            doReturn(builder3).when(protosExtensionBuilderMock).setId("X");
            Protos.Extension.Builder builder4 = protosExtensionBuilderMock.setMandatory(false);
            doReturn(builder4).when(protosExtensionBuilderMock).setMandatory(false);
            doReturn(protosExtensionBuilderMock2).when(protosExtensionBuilderMock).setData(byteStringMock2);
            doReturn(protosWalletBuilderMock11).when(protosWalletBuilderMock).addTags(protosTagBuilderMock);
            doReturn(protosWalletBuilderMock12).when(protosWalletBuilderMock).setVersion(0);
            doReturn(protosWalletMock).when(protosWalletBuilderMock).build();
            protosTransaction.when(() -> Protos.Transaction.newBuilder()).thenReturn(protosTransactionBuilderMock);
            doReturn(protosTransactionBuilderMock2).when(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            doReturn(protosTransactionBuilderMock3).when(protosTransactionBuilderMock2).setHash(byteStringMock3);
            doReturn(protosTransactionBuilderMock4).when(protosTransactionBuilderMock3).setVersion(0);
            doReturn(protosTransactionBuilderMock5).when(protosTransactionBuilderMock).setUpdatedAt(0L);
            doReturn(protosTransactionBuilderMock6).when(protosTransactionBuilderMock).setLockTime(0);
            doReturn(protosTransactionBuilderMock7).when(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            doReturn(protosTransactionInputBuilderMock2).when(protosTransactionInputBuilderMock).setSequence(0);
            doReturn(protosTransactionInputBuilderMock3).when(protosTransactionInputBuilderMock).setValue(0L);
            doReturn(protosTransactionInputBuilderMock4).when(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            doReturn(protosScriptWitnessBuilderMock2).when(protosScriptWitnessBuilderMock).addData(byteStringMock4);
            doReturn(protosTransactionBuilderMock8).when(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            doReturn(protosTransactionOutputBuilderMock2).when(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock5);
            doReturn(protosTransactionOutputBuilderMock3).when(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            doReturn(protosTransactionBuilderMock9).when(protosTransactionBuilderMock).addBlockHash(byteStringMock6);
            doReturn(protosTransactionBuilderMock10).when(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            doReturn(protosTransactionBuilderMock11).when(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            Protos.TransactionConfidence.Builder builder5 = protosTransactionConfidenceBuilderMock.setType(Protos.TransactionConfidence.Type.BUILDING);
            doReturn(builder5).when(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            Protos.TransactionConfidence.Builder builder6 = protosTransactionConfidenceBuilderMock.setAppearedAtHeight(0);
            doReturn(builder6).when(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            Protos.TransactionConfidence.Builder builder7 = protosTransactionConfidenceBuilderMock.setDepth(0);
            doReturn(builder7).when(protosTransactionConfidenceBuilderMock).setDepth(0);
            doReturn(protosTransactionConfidenceBuilderMock2).when(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock7);
            doReturn(protosTransactionConfidenceBuilderMock3).when(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            doReturn(protosTransactionConfidenceBuilderMock4).when(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            doReturn(protosTransactionConfidenceBuilderMock5).when(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            Protos.Transaction.Builder builder8 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            doReturn(builder8).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
            byte[] byteArray4 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock3);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock9);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byte[] byteArray5 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byte[] byteArray6 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock9);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byte[] byteArray7 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock10);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byte[] byteArray8 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock10);
            byte[] byteArray9 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock5);
            byte[] byteArray10 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray10)).thenReturn(byteStringMock6);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
            byte[] byteArray11 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray11)).thenReturn(byteStringMock7);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock11);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray12 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray12)).thenReturn(byteStringMock11);
            protosScript.when(() -> Protos.Script.newBuilder()).thenReturn(protosScriptBuilderMock);
            doReturn(protosScriptBuilderMock2).when(protosScriptBuilderMock).setProgram(byteStringMock12);
            doReturn(protosScriptBuilderMock3).when(protosScriptBuilderMock2).setCreationTimestamp(0L);
            doReturn(protosScriptMock).when(protosScriptBuilderMock3).build();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock12);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            protosExtension.when(() -> Protos.Extension.newBuilder()).thenReturn(protosExtensionBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock2);
            protosTag.when(() -> Protos.Tag.newBuilder()).thenReturn(protosTagBuilderMock2);
            Protos.Tag.Builder builder9 = protosTagBuilderMock2.setTag("Z");
            doReturn(builder9).when(protosTagBuilderMock2).setTag("Z");
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            //Act Statement(s)
            Protos.Wallet result = target.walletToProto(walletMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosWalletMock));
            verify(walletMock).network();
            verify(networkMock).id();
            verify(walletMock, times(2)).getDescription();
            verify(walletMock).getWalletTransactions();
            verify(walletMock).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock).getWatchedScripts();
            verify(scriptMock).program();
            verify(scriptMock).creationTime();
            verify(walletMock).getLastBlockSeenHash();
            verify(sha256HashMock).getBytes();
            verify(walletMock).getLastBlockSeenHeight();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getKeyCrypter();
            verify(walletMock).keyRotationTime();
            verify(walletMock).getExtensions();
            verify(walletExtensionMock).getWalletExtensionID();
            verify(walletExtensionMock).isWalletExtensionMandatory();
            verify(walletExtensionMock).serializeWalletExtension();
            verify(walletMock).getTags();
            verify(walletMock).getVersion();
            protosWallet.verify(() -> Protos.Wallet.newBuilder(), atLeast(1));
            verify(protosWalletBuilderMock).setNetworkIdentifier("J");
            verify(protosWalletBuilderMock).setDescription("Q");
            verify(protosWalletBuilderMock).addTransaction(protosTransactionMock);
            verify(protosWalletBuilderMock).addAllKey(protosKeyList);
            verify(protosWalletBuilderMock).addWatchedScript(protosScriptMock);
            verify(protosWalletBuilderMock).setLastSeenBlockHash(byteStringMock);
            verify(protosWalletBuilderMock).setLastSeenBlockHeight(0);
            verify(protosWalletBuilderMock).setLastSeenBlockTimeSecs(0L);
            verify(protosWalletBuilderMock).setEncryptionType(Protos.Wallet.EncryptionType.UNENCRYPTED);
            verify(protosWalletBuilderMock).setKeyRotationTime(0L);
            verify(protosWalletBuilderMock).addExtension(protosExtensionBuilderMock);
            verify(protosExtensionBuilderMock).setId("X");
            verify(protosExtensionBuilderMock).setMandatory(false);
            verify(protosExtensionBuilderMock).setData(byteStringMock2);
            verify(protosWalletBuilderMock).addTags(protosTagBuilderMock);
            verify(protosWalletBuilderMock).setVersion(0);
            verify(protosWalletBuilderMock).build();
            protosTransaction.verify(() -> Protos.Transaction.newBuilder(), atLeast(1));
            verify(protosTransactionBuilderMock).setPool(Protos.Transaction.Pool.UNSPENT);
            verify(protosTransactionBuilderMock2).setHash(byteStringMock3);
            verify(protosTransactionBuilderMock3).setVersion(0);
            verify(protosTransactionBuilderMock).setUpdatedAt(0L);
            verify(protosTransactionBuilderMock).setLockTime(0);
            verify(protosTransactionBuilderMock).addTransactionInput(protosTransactionInputBuilderMock);
            verify(protosTransactionInputBuilderMock).setSequence(0);
            verify(protosTransactionInputBuilderMock).setValue(0L);
            verify(protosTransactionInputBuilderMock).setWitness(protosScriptWitnessBuilderMock);
            verify(protosScriptWitnessBuilderMock).addData(byteStringMock4);
            verify(protosTransactionBuilderMock).addTransactionOutput(protosTransactionOutputBuilderMock);
            verify(protosTransactionOutputBuilderMock).setSpentByTransactionHash(byteStringMock5);
            verify(protosTransactionOutputBuilderMock2).setSpentByTransactionIndex(0);
            verify(protosTransactionBuilderMock).addBlockHash(byteStringMock6);
            verify(protosTransactionBuilderMock).addBlockRelativityOffsets(0);
            verify(protosTransactionBuilderMock).setConfidence(protosTransactionConfidenceBuilderMock);
            verify(protosTransactionConfidenceBuilderMock).setType(Protos.TransactionConfidence.Type.BUILDING);
            verify(protosTransactionConfidenceBuilderMock).setAppearedAtHeight(0);
            verify(protosTransactionConfidenceBuilderMock).setDepth(0);
            verify(protosTransactionConfidenceBuilderMock).setOverridingTransaction(byteStringMock7);
            verify(protosTransactionConfidenceBuilderMock).setSource(Protos.TransactionConfidence.Source.SOURCE_SELF);
            verify(protosTransactionConfidenceBuilderMock).addBroadcastBy(protosPeerAddressMock);
            verify(protosTransactionConfidenceBuilderMock).setLastBroadcastedAt(0L);
            verify(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.UNKNOWN);
            verify(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            verify(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            verify(protosTransactionBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock8);
            verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock9);
            verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock10);
            verify(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray10), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray11), atLeast(1));
            protosPeerAddress.verify(() -> Protos.PeerAddress.newBuilder(), atLeast(1));
            verify(protosPeerAddressBuilderMock).setIpAddress(byteStringMock11);
            verify(protosPeerAddressBuilderMock2).setPort(0);
            verify(protosPeerAddressBuilderMock3).setServices(0L);
            verify(protosPeerAddressBuilderMock4).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray12), atLeast(1));
            protosScript.verify(() -> Protos.Script.newBuilder(), atLeast(1));
            verify(protosScriptBuilderMock).setProgram(byteStringMock12);
            verify(protosScriptBuilderMock2).setCreationTimestamp(0L);
            verify(protosScriptBuilderMock3).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            protosExtension.verify(() -> Protos.Extension.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosTag.verify(() -> Protos.Tag.newBuilder(), atLeast(1));
            verify(protosTagBuilderMock2).setTag("Z");
        }
    }

    //Sapient generated method id: ${eb970ee3-e78f-3dc8-89e1-d93d405ef84a}
    @Test()
    public void hashToByteStringTest() {
        //Arrange Statement(s)
        Sha256Hash hashMock = mock(Sha256Hash.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(hashMock).getBytes();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            //Act Statement(s)
            ByteString result = WalletProtobufSerializer.hashToByteString(hashMock);
            //Assert statement(s)
            assertThat(result, equalTo(byteStringMock));
            verify(hashMock).getBytes();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${b26f93c5-0f0b-3b74-ad48-b1aeac61ec7e}
    @Test()
    public void byteStringToHashTest() {
        //Arrange Statement(s)
        ByteString bsMock = mock(ByteString.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(bsMock).toByteArray();
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = WalletProtobufSerializer.byteStringToHash(bsMock);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            verify(bsMock).toByteArray();
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${2971dd73-51b2-30d4-963e-1ec5abd7e5fb}
    @Test()
    public void readWalletTest() throws Exception {
        //Arrange Statement(s)
        WalletProtobufSerializer target = spy(new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        WalletExtension[] walletExtensionArray = new WalletExtension[]{};
        doReturn(walletMock).when(target).readWallet(inputStream, false, walletExtensionArray);
        //Act Statement(s)
        org.bitcoinj.wallet.Wallet result = target.readWallet(inputStream, walletExtensionArray);
        //Assert statement(s)
        assertThat(result, equalTo(walletMock));
        verify(target).readWallet(inputStream, false, walletExtensionArray);
    }

    //Sapient generated method id: ${c484b432-3a34-3125-b70e-c91951f7ca34}
    @Test()
    public void readWallet1ThrowsUnreadableWalletException() throws UnreadableWalletException, IOException {
        //Arrange Statement(s)
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class);
             MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(0).when(codedInputStreamMock).setSizeLimit(536870912);
            protosWallet.when(() -> Protos.Wallet.parseFrom(codedInputStreamMock)).thenReturn(protosWalletMock);
            doReturn("A").when(protosWalletMock).getNetworkIdentifier();
            WalletProtobufSerializer target = new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock);
            UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Unknown network parameters ID A");
            thrown.expect(UnreadableWalletException.class);
            thrown.expectMessage(unreadableWalletException.getMessage());
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            //Act Statement(s)
            target.readWallet(inputStream, false, walletExtensionArray);
            //Assert statement(s)
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).setSizeLimit(536870912);
            protosWallet.verify(() -> Protos.Wallet.parseFrom(codedInputStreamMock), atLeast(1));
            verify(protosWalletMock).getNetworkIdentifier();
        }
    }

    //Sapient generated method id: ${a5bd7750-ca1e-32e2-b152-00d6dd8bc37a}
    @Test()
    public void parseToProtoTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Protos.Wallet> protosWallet = mockStatic(Protos.Wallet.class);
             MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(0).when(codedInputStreamMock).setSizeLimit(536870912);
            protosWallet.when(() -> Protos.Wallet.parseFrom(codedInputStreamMock)).thenReturn(protosWalletMock);
            //Act Statement(s)
            Protos.Wallet result = WalletProtobufSerializer.parseToProto(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(protosWalletMock));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).setSizeLimit(536870912);
            protosWallet.verify(() -> Protos.Wallet.parseFrom(codedInputStreamMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2daf8d1c-7fb9-3106-bfa9-80aea3da6162}
    @Test()
    public void isWalletWhenFieldNotEquals1() throws IOException {
        /* Branches:
         * (field != 1) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(0).when(codedInputStreamMock).readTag();
            //Act Statement(s)
            boolean result = WalletProtobufSerializer.isWallet(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).readTag();
        }
    }

    //Sapient generated method id: ${d8e2c681-3824-39f1-9627-ede18f0ec33c}
    @Test()
    public void isWalletWhenCaughtIOException() throws IOException {
        /* Branches:
         * (field != 1) : true
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            IOException iOException = new IOException();
            doThrow(iOException).when(codedInputStreamMock).readTag();
            //Act Statement(s)
            boolean result = WalletProtobufSerializer.isWallet(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).readTag();
        }
    }

    //Sapient generated method id: ${299980e4-0d22-373a-b8d7-564f31143f62}
    @Test()
    public void isWalletWhenBitcoinNetworkParamsFromIDNetworkIsNotNull() throws IOException {
        /* Branches:
         * (field != 1) : false
         * (BitcoinNetworkParams.fromID(network) != null) : true
         */
        //Arrange Statement(s)
        BitcoinNetworkParams bitcoinNetworkParamsMock = mock(BitcoinNetworkParams.class);
        try (MockedStatic<BitcoinNetworkParams> bitcoinNetworkParams = mockStatic(BitcoinNetworkParams.class);
             MockedStatic<WireFormat> wireFormat = mockStatic(WireFormat.class);
             MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(1).when(codedInputStreamMock).readTag();
            doReturn("return_of_readString1").when(codedInputStreamMock).readString();
            wireFormat.when(() -> WireFormat.getTagFieldNumber(1)).thenReturn(1);
            bitcoinNetworkParams.when(() -> BitcoinNetworkParams.fromID("return_of_readString1")).thenReturn(bitcoinNetworkParamsMock);
            //Act Statement(s)
            boolean result = WalletProtobufSerializer.isWallet(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).readTag();
            verify(codedInputStreamMock).readString();
            wireFormat.verify(() -> WireFormat.getTagFieldNumber(1), atLeast(1));
            bitcoinNetworkParams.verify(() -> BitcoinNetworkParams.fromID("return_of_readString1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f6378884-34c3-3630-95e5-26114796320d}
    @Test()
    public void isWalletWhenBitcoinNetworkParamsFromIDNetworkIsNull() throws IOException {
        /* Branches:
         * (field != 1) : false
         * (BitcoinNetworkParams.fromID(network) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BitcoinNetworkParams> bitcoinNetworkParams = mockStatic(BitcoinNetworkParams.class);
             MockedStatic<WireFormat> wireFormat = mockStatic(WireFormat.class);
             MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(1).when(codedInputStreamMock).readTag();
            doReturn("return_of_readString1").when(codedInputStreamMock).readString();
            wireFormat.when(() -> WireFormat.getTagFieldNumber(1)).thenReturn(1);
            bitcoinNetworkParams.when(() -> BitcoinNetworkParams.fromID("return_of_readString1")).thenReturn(null);
            //Act Statement(s)
            boolean result = WalletProtobufSerializer.isWallet(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).readTag();
            verify(codedInputStreamMock).readString();
            wireFormat.verify(() -> WireFormat.getTagFieldNumber(1), atLeast(1));
            bitcoinNetworkParams.verify(() -> BitcoinNetworkParams.fromID("return_of_readString1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${207e3b59-f227-391a-a24b-359230c1ae17}
    @Test()
    public void isWalletWhenBitcoinNetworkParamsFromIDNetworkIsNotNullAndCaughtIOException() throws IOException {
        /* Branches:
         * (field != 1) : false
         * (BitcoinNetworkParams.fromID(network) != null) : true
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<WireFormat> wireFormat = mockStatic(WireFormat.class);
             MockedStatic<CodedInputStream> codedInputStream = mockStatic(CodedInputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            codedInputStream.when(() -> CodedInputStream.newInstance(inputStream)).thenReturn(codedInputStreamMock);
            doReturn(1).when(codedInputStreamMock).readTag();
            IOException iOException = new IOException();
            doThrow(iOException).when(codedInputStreamMock).readString();
            wireFormat.when(() -> WireFormat.getTagFieldNumber(1)).thenReturn(1);
            //Act Statement(s)
            boolean result = WalletProtobufSerializer.isWallet(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            codedInputStream.verify(() -> CodedInputStream.newInstance(inputStream), atLeast(1));
            verify(codedInputStreamMock).readTag();
            verify(codedInputStreamMock).readString();
            wireFormat.verify(() -> WireFormat.getTagFieldNumber(1), atLeast(1));
        }
    }
}
