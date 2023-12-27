package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.internal.InternalUtils;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.base.internal.StreamUtils;

import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import java.util.stream.Collector;

import org.junit.Ignore;

public class HDPathSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InternalUtils.Splitter SEPARATOR_SPLITTERMock = mock(InternalUtils.Splitter.class, "SEPARATOR_SPLITTER");

    private final HDPath hDPathMock = mock(HDPath.class);

    private final ChildNumber childNumberMock = mock(ChildNumber.class);

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        //Act Statement(s)
        HDPath result = HDPath.deserialize(integerList);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2fa9bfbd-09e6-3251-8c93-24f1ba036cea}
    @Test()
    public void MTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        //Act Statement(s)
        HDPath result = HDPath.M(childNumberList);
        HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${27deda1c-b30b-3b87-a038-1958d6d2387f}
    @Test()
    public void M1Test() {
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
            //Act Statement(s)
            HDPath result = HDPath.M();
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${25c66651-7d13-3c76-9111-bc2bd09073cc}
    @Test()
    public void M2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
            ChildNumber childNumber = new ChildNumber(0, false);
            //Act Statement(s)
            HDPath result = HDPath.M(childNumber);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${78c5cfcd-4d63-3aee-a69c-b9c0d2f08d83}
    @Test()
    public void M3Test() {
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            //Act Statement(s)
            HDPath result = HDPath.M(childNumberArray);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${bab39149-7b96-3bad-8aa2-47385c364c32}
    @Test()
    public void mTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        //Act Statement(s)
        HDPath result = HDPath.m(childNumberList);
        HDPath hDPath = new HDPath(true, childNumberList);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${15885ab5-a128-3fe1-bac6-0ff3fcf3eaca}
    @Test()
    public void m1Test() {
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPathMock);
            //Act Statement(s)
            HDPath result = HDPath.m();
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5272e895-85ff-340c-b8fa-cb17b50d747b}
    @Test()
    public void m2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPathMock);
            ChildNumber childNumber = ChildNumber.PURPOSE_BIP86;
            //Act Statement(s)
            HDPath result = HDPath.m(childNumber);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f81b0b8e-112f-34d7-97b2-5c3b71c06680}
    @Test()
    public void m3Test() {
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPathMock);
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            //Act Statement(s)
            HDPath result = HDPath.m(childNumberArray);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${67df9a13-15fa-3529-a28c-2e50c5a12ceb}
    @Ignore()
    @Test()
    public void parsePathWhenNIsEmptyAndIsHard() {
        /* Branches:
         * (!parsedNodes.isEmpty()) : true
         * (firstNode.equals(Character.toString(PREFIX_PRIVATE))) : true
         * (hasPrivateKey) : true
         * (for-each(parsedNodes)) : true
         * (n.isEmpty()) : true
         * (isHard) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(SEPARATOR_SPLITTERMock).splitToList("path1");
        //Act Statement(s)
        HDPath result = HDPath.parsePath("path1");
        List<ChildNumber> childNumberList = new ArrayList<>(0);
        HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
        verify(SEPARATOR_SPLITTERMock).splitToList("path1");
    }

    //Sapient generated method id: ${66f50321-e3de-3b3e-a14c-c8d562e967fd}
    @Ignore()
    @Test()
    public void parsePathWhenParsedNodesIsNotEmptyAndNIsEmptyAndIsHard() {
        /* Branches:
         * (!parsedNodes.isEmpty()) : true
         * (firstNode.equals(Character.toString(PREFIX_PRIVATE))) : false
         * (hasPrivateKey) : false
         * (firstNode.equals(Character.toString(PREFIX_PUBLIC))) : true
         * (for-each(parsedNodes)) : true
         * (n.isEmpty()) : true
         * (isHard) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(SEPARATOR_SPLITTERMock).splitToList("path1");
        //Act Statement(s)
        HDPath result = HDPath.parsePath("path1");
        List<ChildNumber> childNumberList = new ArrayList<>(0);
        HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
        verify(SEPARATOR_SPLITTERMock).splitToList("path1");
    }

    //Sapient generated method id: ${4bb88830-6b11-334a-84c6-a0c47588db47}
    @Test()
    public void hasPrivateKeyWhenHasPrivateKey() {
        /* Branches:
         * (hasPrivateKey) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(true, childNumberList);
        //Act Statement(s)
        boolean result = target.hasPrivateKey();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${3c6cbaec-143a-36b1-8ab7-134d4de7cb8f}
    @Test()
    public void hasPrivateKeyWhenNotHasPrivateKey() {
        /* Branches:
         * (hasPrivateKey) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        boolean result = target.hasPrivateKey();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${a6919fef-2149-3a63-9ffa-fa7507f84a39}
    @Test()
    public void extendTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        ChildNumber[] childNumberArray = new ChildNumber[]{};
        //Act Statement(s)
        HDPath result = target.extend(childNumberMock, childNumberArray);
        ArrayList<ChildNumber> childNumberList2 = new ArrayList<>();
        childNumberList2.add(childNumberMock);
        HDPath hDPath = new HDPath(false, childNumberList2);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${696ce658-d62f-32d5-880b-fff3f98998b4}
    @Ignore()
    @Test()
    public void extend1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        HDPath result = target.extend(hDPathMock);
        ArrayList<ChildNumber> childNumberList2 = new ArrayList<>();
        HDPath hDPath = new HDPath(false, childNumberList2);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${48116735-199f-3177-8f4c-7b2283223a97}
    @Test()
    public void extend2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock2 = mock(HDPath.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            HDPath target = spy(new HDPath(false, childNumberList));
            doReturn(hDPathMock2).when(target).extend(hDPathMock);
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            //Act Statement(s)
            HDPath result = target.extend(childNumberList2);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock2));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).extend(hDPathMock);
        }
    }

    //Sapient generated method id: ${01c74efc-0565-379f-a4be-8a9a7469b495}
    @Test()
    public void listTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        List<ChildNumber> result = target.list();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${4fef1131-a963-342f-b55e-5d522467a752}
    @Ignore()
    @Test()
    public void parentWhenUnmodifiableListSizeGreaterThan1() {
        /* Branches:
         * (unmodifiableList.size() > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        HDPath result = target.parent();
        List<ChildNumber> childNumberList2 = new ArrayList<>();
        childNumberList2.add(childNumberMock);
        HDPath hDPath = new HDPath(false, childNumberList2);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${df85931b-e132-302f-ba1c-b2ec12be882c}
    @Test()
    public void parentWhenUnmodifiableListSizeNotGreaterThan1() {
        /* Branches:
         * (unmodifiableList.size() > 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        HDPath result = target.parent();
        List<ChildNumber> childNumberList2 = new ArrayList<>();
        HDPath hDPath = new HDPath(false, childNumberList2);
        //Assert statement(s)
        assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${c0e03cef-1b5f-3612-91de-90363817726c}
    @Test()
    public void ancestorsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = spy(new HDPath(false, childNumberList));
        List<HDPath> hDPathList = new ArrayList<>();
        doReturn(hDPathList).when(target).ancestors(false);
        //Act Statement(s)
        List<HDPath> result = target.ancestors();
        //Assert statement(s)
        assertThat(result, equalTo(hDPathList));
        verify(target).ancestors(false);
    }

    //Sapient generated method id: ${c1a63049-d63e-367b-a03c-bfc292b460b1}
    @Ignore()
    @Test()
    public void ancestors1WhenIncludeSelf() {
        /* Branches:
         * (includeSelf) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            List<ChildNumber> childNumberList = new ArrayList<>();
            HDPath target = new HDPath(false, childNumberList);
            //Act Statement(s)
            List<HDPath> result = target.ancestors(true);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e762357b-e752-354a-86f7-f813a058eb9e}
    @Ignore()
    @Test()
    public void ancestors1WhenNotIncludeSelf() {
        /* Branches:
         * (includeSelf) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            List<ChildNumber> childNumberList = new ArrayList<>();
            HDPath target = new HDPath(false, childNumberList);
            //Act Statement(s)
            List<HDPath> result = target.ancestors(false);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Ignore()
    @Test()
    public void getTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        ChildNumber result = target.get(0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
    @Test()
    public void sizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${382aac96-9938-317a-b93a-f259822eb535}
    @Ignore()
    @Test()
    public void toStringWhenUnmodifiableListIsNotEmpty() {
        /* Branches:
         * (hasPrivateKey) : true
         * (for-each(unmodifiableList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(true, childNumberList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("m/toString_object1"));
    }

    //Sapient generated method id: ${9b92032c-db88-366c-b2a7-cefabe6ad69f}
    @Ignore()
    @Test()
    public void toStringWhenNotHasPrivateKeyAndUnmodifiableListIsNotEmpty() {
        /* Branches:
         * (hasPrivateKey) : false
         * (for-each(unmodifiableList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ChildNumber> childNumberList = new ArrayList<>();
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("M/toString_object1"));
    }
}
