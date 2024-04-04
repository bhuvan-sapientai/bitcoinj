package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.Network;
import org.mockito.stubbing.Answer;
import org.bitcoinj.core.Block;

import java.util.Spliterator;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.io.File;
import java.util.ArrayList;

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

import org.junit.Ignore;

public class BlockFileLoaderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Network networkMock = mock(Network.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${63245f9e-f000-3313-9d0c-c439bcebbd0d}, hash: 4838C81942DAAD7F60989C63EB8969A6
    @Ignore()
    @Test()
    public void getReferenceClientBlockFileListWhenFileNotExists() {
        /* Branches:
         * (!file.exists()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: file
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${4704d881-b0c5-34b3-8a51-99a6ef09ab3e}, hash: 84E5A24C5C51A3336C860686F7A42648
    @Ignore()
    @Test()
    public void getReferenceClientBlockFileListWhenFileExists() {
        /* Branches:
         * (!file.exists()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: file
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            //Act Statement(s)
            List<File> result = BlockFileLoader.getReferenceClientBlockFileList(file);
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(File.class)));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6014283f-7ec9-3602-8e31-dca00cf9b8e8}, hash: 9B2BB5BA8A4174CD735406FCD56600EB
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

    //Sapient generated method id: ${505d86e5-1de9-3050-9118-f73ef98b6060}, hash: A38BF7475632A09E059922304DDF63A8
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

    //Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 6DBC8A9118B9B187020F9CA620CD5B57
    @Ignore()
    @Test()
    public void iteratorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
        Stream stream = Stream.empty();
        doReturn(stream).when(target).stream();
        //Act Statement(s)
        Iterator<Block> result = target.iterator();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(target).stream();
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: 51732CA139658DE744BBD739308B084E
    @Ignore()
    @Test()
    public void streamTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
        Stream stream = Stream.empty();
        File file2 = new File("pathname1");
        doReturn(stream).when(target).fileBlockStream(file2);
        thrown.expect(NullPointerException.class);
        //Act Statement(s)
        target.stream();
        //Assert statement(s)
        verify(target).fileBlockStream(file2);
    }

    //Sapient generated method id: ${3e917d90-34e0-3792-88c5-f9e7ccb945d0}, hash: CA4856CFAEF4C01E7C0917B060148797
    @Ignore()
    @Test()
    public void streamBuffersTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
        Stream stream = Stream.empty();
        File file2 = new File("pathname1");
        doReturn(stream).when(target).fileBlockStream(file2);
        //Act Statement(s)
        Stream<ByteBuffer> result = target.streamBuffers();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(target).fileBlockStream(file2);
    }

    //Sapient generated method id: ${e7371402-39fb-3b8c-a2b7-40c698f1f1a1}, hash: 15B5E2BD7466AA0E9297803E109ABEA8
    @Ignore()
    @Test()
    public void fileBlockStreamTest() throws FileNotFoundException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "main");
        File file = new File("pathname1");
        BlockFileLoader target = spy(new BlockFileLoader(networkMock, file));
        Spliterator spliteratorMock = mock(Spliterator.class);
        File file2 = new File("pathname1");
        doReturn(spliteratorMock).when(target).fileBlockSpliterator(file2);
        //Act Statement(s)
        Stream<ByteBuffer> result = target.fileBlockStream(file2);
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(target).fileBlockSpliterator(file2);
    }

    //Sapient generated method id: ${068381fa-c8ce-32df-8cb7-791fd56199fe}, hash: 8008F68194C2B1BE8512AF701AE47960
    @Ignore()
    @Test()
    public void fileBlockSpliteratorTest() throws FileNotFoundException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "example_network");
        File file = new File("pathname1");
        BlockFileLoader target = new BlockFileLoader(networkMock, file);
        File file2 = new File("pathname1");
        //Act Statement(s)
        Spliterator<ByteBuffer> result = target.fileBlockSpliterator(file2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${d86a23e3-c244-33f3-b317-b2c8e501f35f}, hash: 3A74A6F27A2B56115479EF5C0AD80207
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
        Network networkMock = mock(Network.class, "example_network");
        File file = new File("pathname1");
        BlockFileLoader target = new BlockFileLoader(networkMock, file);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(FileNotFoundException.class)));
        File file2 = new File("pathname1");
        //Act Statement(s)
        target.fileBlockSpliterator(file2);
    }
}
