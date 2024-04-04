package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.base.Network;

import java.util.Arrays;

import org.bitcoinj.protobuf.wallet.Protos;

import java.io.ByteArrayInputStream;
import java.util.HashSet;

import org.bitcoinj.base.Coin;

import java.util.HashMap;

import org.bitcoinj.utils.ExchangeRate;

import java.util.ArrayList;
import java.io.InputStream;

import org.bitcoinj.crypto.KeyCrypter;
import com.google.protobuf.WireFormat;
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.core.TransactionConfidence;
import com.google.protobuf.CodedInputStream;
import org.bitcoinj.base.Sha256Hash;

import java.net.InetAddress;
import java.time.Instant;

import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.protobuf.CodedOutputStream;
import org.bitcoinj.params.BitcoinNetworkParams;

import java.util.Map;
import java.util.Optional;

import org.bitcoinj.core.LockTime;
import org.bitcoinj.core.TransactionWitness;

import java.util.Set;
import java.io.OutputStream;

import org.bitcoinj.base.BitcoinNetwork;
import org.bitcoinj.core.Transaction;
import com.google.protobuf.ByteString;
import org.mockito.MockedStatic;
import org.bitcoinj.core.Services;

import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class WalletProtobufSerializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final ByteString byteStringMock3 = mock(ByteString.class);

    private final ByteString byteStringMock4 = mock(ByteString.class);

    private final ByteString byteStringMock5 = mock(ByteString.class);

    private final ByteString byteStringMock6 = mock(ByteString.class);

    private final ByteString byteStringMock7 = mock(ByteString.class);

    private final ByteString byteStringMock8 = mock(ByteString.class);

    private final ByteString byteStringMock9 = mock(ByteString.class);

    private final CodedInputStream codedInputStreamMock = mock(CodedInputStream.class);

    private final Coin coinMock = mock(Coin.class);

    private final ExchangeRate exchangeRateMock = mock(ExchangeRate.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final LockTime lockTimeMock = mock(LockTime.class);

    private final Network networkMock = mock(Network.class);

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

    private final Protos.Wallet.Builder protosWalletBuilderMock = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock2 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock3 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock4 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet.Builder protosWalletBuilderMock5 = mock(Protos.Wallet.Builder.class);

    private final Protos.Wallet protosWalletMock = mock(Protos.Wallet.class);

    private final Services servicesMock = mock(Services.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);

    private final org.bitcoinj.core.TransactionConfidence transactionConfidenceMock = mock(org.bitcoinj.core.TransactionConfidence.class);

    private final org.bitcoinj.core.TransactionInput transactionInputMock = mock(org.bitcoinj.core.TransactionInput.class);

    private final org.bitcoinj.core.TransactionInput transactionInputMock2 = mock(org.bitcoinj.core.TransactionInput.class);

    private final org.bitcoinj.core.Transaction transactionMock = mock(org.bitcoinj.core.Transaction.class);

    private final org.bitcoinj.core.Transaction transactionMock2 = mock(org.bitcoinj.core.Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final org.bitcoinj.core.TransactionOutput transactionOutputMock = mock(org.bitcoinj.core.TransactionOutput.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final org.bitcoinj.wallet.Wallet walletMock = mock(org.bitcoinj.wallet.Wallet.class);

    private final WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);

    private final WalletTransaction walletTransactionMock = mock(WalletTransaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${59878bef-d583-3574-bec9-1702ce99d070}, hash: 283DF10918D650A9E4820740F1B5AF87
    @Test()
    public void writeWalletTest() throws IOException {
        //Arrange Statement(s)
        CodedOutputStream codedOutputStreamMock = mock(CodedOutputStream.class);
        try (MockedStatic<CodedOutputStream> codedOutputStream = mockStatic(CodedOutputStream.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            codedOutputStream.when(() -> CodedOutputStream.newInstance(byteArrayOutputStream, 4096)).thenReturn(codedOutputStreamMock);
            doNothing().when(codedOutputStreamMock).flush();
            WalletProtobufSerializer target = spy(new WalletProtobufSerializer(walletProtobufSerializerWalletFactoryMock));
            doReturn(protosWalletMock).when(target).walletToProto(walletMock);
            doNothing().when(protosWalletMock).writeTo(codedOutputStreamMock);
            //Act Statement(s)
            target.writeWallet(walletMock, byteArrayOutputStream);
            //Assert statement(s)
            codedOutputStream.verify(() -> CodedOutputStream.newInstance(byteArrayOutputStream, 4096), atLeast(1));
            verify(codedOutputStreamMock).flush();
            verify(target).walletToProto(walletMock);
            verify(protosWalletMock).writeTo(codedOutputStreamMock);
        }
    }

    //Sapient generated method id: ${ca8fdda1-9f39-3d04-b5be-df95984eb9b3}, hash: A69AF392B6C4999594BBF1793E127C8E
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

    //Sapient generated method id: ${9dbdc604-193d-3f67-8203-f784e9d830c1}, hash: 418494434B00AE424C74F2016BD56AD8
    @Ignore()
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
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.PeerAddress> protosPeerAddress = mockStatic(Protos.PeerAddress.class);
             MockedStatic<Protos.TransactionConfidence> protosTransactionConfidence = mockStatic(Protos.TransactionConfidence.class);
             MockedStatic<Protos.TransactionOutput> protosTransactionOutput = mockStatic(Protos.TransactionOutput.class);
             MockedStatic<Protos.ScriptWitness> protosScriptWitness = mockStatic(Protos.ScriptWitness.class);
             MockedStatic<Protos.TransactionInput> protosTransactionInput = mockStatic(Protos.TransactionInput.class);
             MockedStatic<Protos.Transaction> protosTransaction = mockStatic(Protos.Transaction.class)) {
            doReturn(networkMock).when(walletMock).network();
            doReturn("J").when(networkMock).id();
            doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.RAISE_FEE).when(transactionMock).getPurpose();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock5);
            protosPeerAddress.when(() -> Protos.PeerAddress.newBuilder()).thenReturn(protosPeerAddressBuilderMock);
            doReturn(protosPeerAddressBuilderMock2).when(protosPeerAddressBuilderMock).setIpAddress(byteStringMock9);
            doReturn(protosPeerAddressBuilderMock3).when(protosPeerAddressBuilderMock2).setPort(0);
            doReturn(protosPeerAddressBuilderMock4).when(protosPeerAddressBuilderMock3).setServices(0L);
            doReturn(protosPeerAddressMock).when(protosPeerAddressBuilderMock4).build();
            byte[] byteArray9 = new byte[]{};
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(walletTransactionMock).getPool();
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
        }
    }

    //Sapient generated method id: ${334c093c-30d2-3708-be57-99714061aa1f}, hash: 256465F7B33D87DE17741D7DD149DD5E
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.ASSURANCE_CONTRACT_CLAIM).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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
        }
    }

    //Sapient generated method id: ${8d122d67-a9cc-31c9-bede-2f8cf668fe53}, hash: 126B85D98ABA26E5ED6EBAC09E1229B3
    @Ignore()
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.ASSURANCE_CONTRACT_PLEDGE).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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
        }
    }

    //Sapient generated method id: ${89ee7775-a040-3f4a-aaf9-ef01cd907bf1}, hash: 6FE5602ED6AB648EB07D75D568387C4B
    @Ignore()
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.ASSURANCE_CONTRACT_STUB).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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
        }
    }

    //Sapient generated method id: ${a4edb7ed-59e3-3fe2-8e75-cb4fc00f11b5}, hash: FDD23E7CE8FB30C5EDF8858112742A8D
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
            doReturn("J").when(networkMock).id();
            doReturn("return_of_getDescription1", "Q").when(walletMock).getDescription();
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.KEY_ROTATION).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            Protos.Transaction.Builder builder6 = protosTransactionBuilderMock.setPurpose(Protos.Transaction.Purpose.KEY_ROTATION);
            doReturn(builder6).when(protosTransactionBuilderMock).setPurpose(Protos.Transaction.Purpose.KEY_ROTATION);
            doReturn(protosTransactionBuilderMock12).when(protosTransactionBuilderMock).setExchangeRate((Protos.ExchangeRate.Builder) any());
            doReturn(protosTransactionBuilderMock13).when(protosTransactionBuilderMock).setMemo("return_of_getMemo1");
            doReturn(protosTransactionMock).when(protosTransactionBuilderMock).build();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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

    //Sapient generated method id: ${48c09dfc-17f1-3157-9adb-1fb96bdc8387}, hash: AB71068DC5317FC4B7C65425D64A3A4B
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.RAISE_FEE).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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

    //Sapient generated method id: ${722e77fe-0a77-3b58-a894-1f4150d94e10}, hash: 3D810B48F279F09F5706193C653267B8
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.USER_PAYMENT).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            doReturn(null).when(walletMock).getLastBlockSeenHash();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock6);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock7);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock6);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock7);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock2);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock4);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
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

    //Sapient generated method id: ${c2653ee9-0456-39df-99f7-b9e7f3b4dff8}, hash: 7D1AC8C01A1E57D9B7126437220B297D
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
        org.bitcoinj.script.Script scriptMock = mock(org.bitcoinj.script.Script.class);
        Sha256Hash sha256HashMock7 = mock(Sha256Hash.class);
        WalletExtension walletExtensionMock = mock(WalletExtension.class);
        ByteString byteString13Mock = mock(ByteString.class);
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
            Iterable<WalletTransaction> iterable = new ArrayList<>(Arrays.asList(walletTransactionMock));
            doReturn(iterable).when(walletMock).getWalletTransactions();
            doReturn(transactionMock).when(walletTransactionMock).getTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(sha256HashMock).getBytes();
            doReturn(0L).when(transactionMock).getVersion();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(transactionMock).updateTime();
            doReturn(lockTimeMock).when(transactionMock).lockTime();
            doReturn(true).when(lockTimeMock).isSet();
            doReturn(0L).when(lockTimeMock).rawValue();
            List<org.bitcoinj.core.TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionInputMock).getScriptBytes();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(sha256HashMock2).getBytes();
            doReturn(0L).when(transactionOutPointMock).index();
            doReturn(true).when(transactionInputMock).hasSequence();
            doReturn(0L).when(transactionInputMock).getSequenceNumber();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock, coin).when(transactionInputMock).getValue();
            doReturn(true).when(transactionInputMock).hasWitness();
            doReturn(transactionWitnessMock).when(transactionInputMock).getWitness();
            doReturn(1).when(transactionWitnessMock).getPushCount();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(transactionWitnessMock).getPush(0);
            List<org.bitcoinj.core.TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            byte[] byteArray5 = new byte[]{};
            doReturn(byteArray5).when(transactionOutputMock).getScriptBytes();
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(transactionOutputMock).getValue();
            doReturn(transactionInputMock2).when(transactionOutputMock).getSpentBy();
            doReturn(transactionMock2).when(transactionInputMock2).getParentTransaction();
            doReturn(sha256HashMock3).when(transactionMock2).getTxId();
            byte[] byteArray6 = new byte[]{};
            doReturn(byteArray6).when(sha256HashMock3).getBytes();
            doReturn(0).when(transactionInputMock2).getIndex();
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock4, 0);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            byte[] byteArray7 = new byte[]{};
            doReturn(byteArray7).when(sha256HashMock4).getBytes();
            doReturn(true).when(transactionMock).hasConfidence();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).getAppearedAtChainHeight();
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            doReturn(TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.BUILDING, TransactionConfidence.ConfidenceType.DEAD).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock5, sha256HashMock6).when(transactionConfidenceMock).getOverridingTxId();
            byte[] byteArray8 = new byte[]{};
            doReturn(byteArray8).when(sha256HashMock6).getBytes();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            org.bitcoinj.core.PeerAddress peerAddress = org.bitcoinj.core.PeerAddress.inet(inetAddress, 0, servicesMock, instant2);
            Set<org.bitcoinj.core.PeerAddress> peerAddressSet = new HashSet<>();
            peerAddressSet.add(peerAddress);
            doReturn(peerAddressSet).when(transactionConfidenceMock).getBroadcastBy();
            doReturn(0L).when(servicesMock).bits();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant3)).when(transactionConfidenceMock).lastBroadcastTime();
            doReturn(Transaction.Purpose.UNKNOWN).when(transactionMock).getPurpose();
            doReturn(exchangeRateMock).when(transactionMock).getExchangeRate();
            doReturn("return_of_getMemo1").when(transactionMock).getMemo();
            doReturn(WalletTransaction.Pool.UNSPENT).when(walletTransactionMock).getPool();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(walletMock).serializeKeyChainGroupToProtobufInternal();
            List<org.bitcoinj.script.Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(scriptList).when(walletMock).getWatchedScripts();
            byte[] byteArray9 = new byte[]{};
            doReturn(byteArray9).when(scriptMock).program();
            doReturn(Optional.empty()).when(scriptMock).creationTime();
            doReturn(sha256HashMock7).when(walletMock).getLastBlockSeenHash();
            byte[] byteArray10 = new byte[]{};
            doReturn(byteArray10).when(sha256HashMock7).getBytes();
            doReturn(0).when(walletMock).getLastBlockSeenHeight();
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant4)).when(walletMock).lastBlockSeenTime();
            doReturn(null).when(walletMock).getKeyCrypter();
            Instant instant5 = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant5)).when(walletMock).keyRotationTime();
            Map<String, WalletExtension> stringWalletExtensionMap = new HashMap<>();
            stringWalletExtensionMap.put("0", walletExtensionMock);
            doReturn(stringWalletExtensionMap).when(walletMock).getExtensions();
            doReturn("X").when(walletExtensionMock).getWalletExtensionID();
            doReturn(false).when(walletExtensionMock).isWalletExtensionMandatory();
            byte[] byteArray11 = new byte[]{};
            doReturn(byteArray11).when(walletExtensionMock).serializeWalletExtension();
            Map<String, ByteString> stringByteStringMap = new HashMap<>();
            stringByteStringMap.put("Z", byteString13Mock);
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
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock3);
            protosTransactionInput.when(() -> Protos.TransactionInput.newBuilder()).thenReturn(protosTransactionInputBuilderMock5);
            doReturn(protosTransactionInputBuilderMock6).when(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock8);
            doReturn(protosTransactionInputBuilderMock7).when(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock9);
            doReturn(protosTransactionInputBuilderMock).when(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock8);
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock9);
            protosScriptWitness.when(() -> Protos.ScriptWitness.newBuilder()).thenReturn(protosScriptWitnessBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray4)).thenReturn(byteStringMock4);
            protosTransactionOutput.when(() -> Protos.TransactionOutput.newBuilder()).thenReturn(protosTransactionOutputBuilderMock4);
            doReturn(protosTransactionOutputBuilderMock5).when(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock10);
            doReturn(protosTransactionOutputBuilderMock).when(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.when(() -> ByteString.copyFrom(byteArray5)).thenReturn(byteStringMock10);
            byteString.when(() -> ByteString.copyFrom(byteArray6)).thenReturn(byteStringMock5);
            byteString.when(() -> ByteString.copyFrom(byteArray7)).thenReturn(byteStringMock6);
            protosTransactionConfidence.when(() -> Protos.TransactionConfidence.newBuilder()).thenReturn(protosTransactionConfidenceBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray8)).thenReturn(byteStringMock7);
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
            byteString.when(() -> ByteString.copyFrom(byteArray9)).thenReturn(byteStringMock12);
            byteString.when(() -> ByteString.copyFrom(byteArray10)).thenReturn(byteStringMock);
            protosExtension.when(() -> Protos.Extension.newBuilder()).thenReturn(protosExtensionBuilderMock);
            byteString.when(() -> ByteString.copyFrom(byteArray11)).thenReturn(byteStringMock2);
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
            verify(walletTransactionMock).getTransaction();
            verify(transactionMock).getTxId();
            verify(sha256HashMock).getBytes();
            verify(transactionMock).getVersion();
            verify(transactionMock).updateTime();
            verify(transactionMock).lockTime();
            verify(lockTimeMock).isSet();
            verify(lockTimeMock).rawValue();
            verify(transactionMock).getInputs();
            verify(transactionInputMock).getScriptBytes();
            verify(transactionInputMock, times(2)).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(sha256HashMock2).getBytes();
            verify(transactionOutPointMock).index();
            verify(transactionInputMock).hasSequence();
            verify(transactionInputMock).getSequenceNumber();
            verify(transactionInputMock, times(2)).getValue();
            verify(transactionInputMock).hasWitness();
            verify(transactionInputMock).getWitness();
            verify(transactionWitnessMock).getPushCount();
            verify(transactionWitnessMock).getPush(0);
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptBytes();
            verify(transactionOutputMock).getValue();
            verify(transactionOutputMock).getSpentBy();
            verify(transactionInputMock2).getParentTransaction();
            verify(transactionMock2).getTxId();
            verify(sha256HashMock3).getBytes();
            verify(transactionInputMock2).getIndex();
            verify(transactionMock).getAppearsInHashes();
            verify(sha256HashMock4).getBytes();
            verify(transactionMock).hasConfidence();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock, times(3)).getConfidenceType();
            verify(transactionConfidenceMock).getAppearedAtChainHeight();
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(transactionConfidenceMock, times(2)).getOverridingTxId();
            verify(sha256HashMock6).getBytes();
            verify(transactionConfidenceMock).getSource();
            verify(transactionConfidenceMock).getBroadcastBy();
            verify(servicesMock).bits();
            verify(transactionConfidenceMock).lastBroadcastTime();
            verify(transactionMock).getPurpose();
            verify(transactionMock).getExchangeRate();
            verify(transactionMock, times(2)).getMemo();
            verify(walletTransactionMock).getPool();
            verify(walletMock).serializeKeyChainGroupToProtobufInternal();
            verify(walletMock).getWatchedScripts();
            verify(scriptMock).program();
            verify(scriptMock).creationTime();
            verify(walletMock).getLastBlockSeenHash();
            verify(sha256HashMock7).getBytes();
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
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            protosTransactionInput.verify(() -> Protos.TransactionInput.newBuilder(), atLeast(1));
            verify(protosTransactionInputBuilderMock5).setScriptBytes(byteStringMock8);
            verify(protosTransactionInputBuilderMock6).setTransactionOutPointHash(byteStringMock9);
            verify(protosTransactionInputBuilderMock7).setTransactionOutPointIndex(0);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
            protosScriptWitness.verify(() -> Protos.ScriptWitness.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray4), atLeast(1));
            protosTransactionOutput.verify(() -> Protos.TransactionOutput.newBuilder(), atLeast(1));
            verify(protosTransactionOutputBuilderMock4).setScriptBytes(byteStringMock10);
            verify(protosTransactionOutputBuilderMock5).setValue(0L);
            byteString.verify(() -> ByteString.copyFrom(byteArray5), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray6), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray7), atLeast(1));
            protosTransactionConfidence.verify(() -> Protos.TransactionConfidence.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray8), atLeast(1));
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
            byteString.verify(() -> ByteString.copyFrom(byteArray9), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray10), atLeast(1));
            protosExtension.verify(() -> Protos.Extension.newBuilder(), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray11), atLeast(1));
            protosTag.verify(() -> Protos.Tag.newBuilder(), atLeast(1));
            verify(protosTagBuilderMock2).setTag("Z");
        }
    }

    //Sapient generated method id: ${eb970ee3-e78f-3dc8-89e1-d93d405ef84a}, hash: D333E19E99E6B0D1B84CCCF8EAAA656A
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

    //Sapient generated method id: ${b26f93c5-0f0b-3b74-ad48-b1aeac61ec7e}, hash: A9DC3E1CB64F266798458F72FEA2761B
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

    //Sapient generated method id: ${2971dd73-51b2-30d4-963e-1ec5abd7e5fb}, hash: 7DA84CB85CDF29DFFF3CB91471E8578A
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

    //Sapient generated method id: ${c484b432-3a34-3125-b70e-c91951f7ca34}, hash: 3163C74DD442C425CBF0009B6B582CE5
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

    //Sapient generated method id: ${a5bd7750-ca1e-32e2-b152-00d6dd8bc37a}, hash: 1A9A5754A739DFDEEC4C0CA2B08ED5E1
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

    //Sapient generated method id: ${2daf8d1c-7fb9-3106-bfa9-80aea3da6162}, hash: B4F7BD495D22A06C4039CE1254E1EA21
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

    //Sapient generated method id: ${d8e2c681-3824-39f1-9627-ede18f0ec33c}, hash: 99D8093A3AFEA0E4EC5130A844FEEE68
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

    //Sapient generated method id: ${299980e4-0d22-373a-b8d7-564f31143f62}, hash: 7E67BDEF14CDD6B9834C9C8FD933FD24
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

    //Sapient generated method id: ${f6378884-34c3-3630-95e5-26114796320d}, hash: D19669604BF495398CFAF28756FAD3D6
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

    //Sapient generated method id: ${207e3b59-f227-391a-a24b-359230c1ae17}, hash: 110C616DDE7F89CD608DB7B2C32A9DBC
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
