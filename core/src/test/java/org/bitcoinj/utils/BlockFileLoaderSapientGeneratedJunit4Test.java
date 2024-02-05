package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.bitcoinj.core.Block;

import java.util.Spliterator;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.util.Iterator;

import org.bitcoinj.core.MessageSerializer;

import java.util.stream.Stream;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.io.File;
import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

import java.util.LinkedList;

import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class BlockFileLoaderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final MessageSerializer messageSerializerMock = mock(MessageSerializer.class);

    private final Network networkMock = mock(Network.class, "Network");

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${63245f9e-f000-3313-9d0c-c439bcebbd0d}
    @Test()
    public void getReferenceClientBlockFileListWhenFileNotExists() {
        /* Branches:
         * (!file.exists()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            //Act Statement(s)
            List<File> result = BlockFileLoader.getReferenceClientBlockFileList(file);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${4704d881-b0c5-34b3-8a51-99a6ef09ab3e}
    @Ignore()
    @Test()
    public void getReferenceClientBlockFileListWhenFileExists() {
        /* Branches:
         * (!file.exists()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            //Act Statement(s)
            List<File> result = BlockFileLoader.getReferenceClientBlockFileList(file);
            File file2 = new File(file, "blk00000.dat");
            List<File> fileResultList = new LinkedList<>();
            fileResultList.add(file2);
            //Assert statement(s)
            assertThat(result.size(), equalTo(fileResultList.size()));
            assertThat(result, containsInRelativeOrder(fileResultList.toArray()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6014283f-7ec9-3602-8e31-dca00cf9b8e8}
    @Test()
    public void getReferenceClientBlockFileList1Test() {
        //Arrange Statement(s)
        try (MockedStatic<BlockFileLoader> blockFileLoader = mockStatic(BlockFileLoader.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            blockFileLoader.when(() -> BlockFileLoader.defaultBlocksDir()).thenReturn(file);
            List<File> fileList = new ArrayList<>();
            blockFileLoader.when(() -> BlockFileLoader.getReferenceClientBlockFileList(file)).thenReturn(fileList);
            //Act Statement(s)
            List<File> result = BlockFileLoader.getReferenceClientBlockFileList();
            //Assert statement(s)
            assertThat(result, equalTo(fileList));
            blockFileLoader.verify(() -> BlockFileLoader.defaultBlocksDir(), atLeast(1));
            blockFileLoader.verify(() -> BlockFileLoader.getReferenceClientBlockFileList(file), atLeast(1));
        }
    }

    //Sapient generated method id: ${505d86e5-1de9-3050-9118-f73ef98b6060}
    @Test()
    public void defaultBlocksDirWhenDefaultBlocksDirNotIsDirectoryThrowsRuntimeException() {
        /* Branches:
         * (!defaultBlocksDir.isDirectory()) : true
         */
        //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException("Default blocks directory not found");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        //Act Statement(s)
        BlockFileLoader.defaultBlocksDir();
    }

    //Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
    @Ignore()
    @Test()
    public void iteratorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
            Stream stream = Stream.empty();
            doReturn(stream).when(target).stream();
            //Act Statement(s)
            Iterator<Block> result = target.iterator();
            List list = new ArrayList<>();
            Iterator<Block> iteratorResult = list.iterator();
            //Assert statement(s)
            assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).stream();
        }
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Ignore()
    @Test()
    public void streamTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
            Stream stream = Stream.empty();
            File file2 = new File("pathname1");
            doReturn(stream).when(target).fileBlockStream(file2);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.stream();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).fileBlockStream(file2);
        }
    }

    //Sapient generated method id: ${3e917d90-34e0-3792-88c5-f9e7ccb945d0}
    @Ignore()
    @Test()
    public void streamBuffersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
            Stream stream = Stream.empty();
            File file2 = new File("pathname1");
            doReturn(stream).when(target).fileBlockStream(file2);
            //Act Statement(s)
            Stream<ByteBuffer> result = target.streamBuffers();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).fileBlockStream(file2);
        }
    }

    //Sapient generated method id: ${e7371402-39fb-3b8c-a2b7-40c698f1f1a1}
    @Ignore()
    @Test()
    public void fileBlockStreamTest() throws FileNotFoundException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "NetworkParameters");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
            File file2 = new File("pathname1");
            //TODO: Needs to return real value
            doReturn(null).when(target).fileBlockSpliterator(file2);
            //Act Statement(s)
            Stream<ByteBuffer> result = target.fileBlockStream(file2);
            Stream stream = Stream.empty();
            //Assert statement(s)
            //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(stream));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).fileBlockSpliterator(file2);
        }
    }

    //Sapient generated method id: ${068381fa-c8ce-32df-8cb7-791fd56199fe}
    @Ignore()
    @Test()
    public void fileBlockSpliteratorTest() throws FileNotFoundException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = new BlockFileLoader(networkMock, file);
            File file2 = new File("pathname1");
            //Act Statement(s)
            Spliterator<ByteBuffer> result = target.fileBlockSpliterator(file2);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d86a23e3-c244-33f3-b317-b2c8e501f35f}
    @Ignore()
    @Test()
    public void fileBlockSpliteratorWhenCaughtFileNotFoundExceptionThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (FileNotFoundException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "int");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            File file = new File("pathname1");
            BlockFileLoader target = new BlockFileLoader(networkMock, file);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(FileNotFoundException.class)));
            File file2 = new File("pathname1");
            //Act Statement(s)
            target.fileBlockSpliterator(file2);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }
}
