package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collector;

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

import org.junit.Ignore;

public class HDPathSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InternalUtils.Splitter SEPARATOR_SPLITTERMock = mock(InternalUtils.Splitter.class, "SEPARATOR_SPLITTER");

    private final HDPath hDPathMock = mock(HDPath.class);

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
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
        //ChildNumber childNumber = new ChildNumber(1);
        //ChildNumber childNumber2 = new ChildNumber(2);
        //ChildNumber childNumber3 = new ChildNumber(3);
        //List<ChildNumber> childNumberList = new ArrayList<>();
        //childNumberList.add(childNumber);
        //childNumberList.add(childNumber2);
        //childNumberList.add(childNumber3);
        //Act Statement(s)
        //HDPath result = HDPath.M(childNumberList);
        //HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${27deda1c-b30b-3b87-a038-1958d6d2387f}
    @Test()
    public void M1Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
    //Act Statement(s)
    HDPath result = HDPath.M();
    //Assert statement(s)
    assertThat(result, equalTo(hDPathMock));
    hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${25c66651-7d13-3c76-9111-bc2bd09073cc}
    @Test()
    public void M2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    List list = new ArrayList<>();
    HDPath hDPath2 = new HDPath(false, list);
    hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
    ChildNumber childNumber = new ChildNumber(0, false);
    //Act Statement(s)
    HDPath result = HDPath.M(childNumber);
    //Assert statement(s)
    assertThat(result, equalTo(hDPath2));
    hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${78c5cfcd-4d63-3aee-a69c-b9c0d2f08d83}
    @Test()
    public void M3Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock);
    ChildNumber[] childNumberArray = new ChildNumber[] {};
    //Act Statement(s)
    HDPath result = HDPath.M(childNumberArray);
    //Assert statement(s)
    assertThat(result, equalTo(hDPathMock));
    hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${bab39149-7b96-3bad-8aa2-47385c364c32}
    @Test()
    public void mTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //List<ChildNumber> childNumberList = new ArrayList<>();
        //Act Statement(s)
        //HDPath result = HDPath.m(childNumberList);
        //HDPath hDPath = new HDPath(true, childNumberList);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${15885ab5-a128-3fe1-bac6-0ff3fcf3eaca}
    @Test()
    public void m1Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPathMock);
    //Act Statement(s)
    HDPath result = HDPath.m();
    //Assert statement(s)
    assertThat(result, equalTo(hDPathMock));
    hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5272e895-85ff-340c-b8fa-cb17b50d747b}
    @Test()
    public void m2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    List list = new ArrayList<>();
    HDPath hDPath2 = new HDPath(false, list);
    hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPath2);
    ChildNumber childNumber = ChildNumber.PURPOSE_BIP86;
    //Act Statement(s)
    HDPath result = HDPath.m(childNumber);
    //Assert statement(s)
    assertThat(result, equalTo(hDPath2));
    hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${f81b0b8e-112f-34d7-97b2-5c3b71c06680}
    @Test()
    public void m3Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
    hDPath.when(() -> HDPath.m(anyList())).thenReturn(hDPathMock);
    ChildNumber[] childNumberArray = new ChildNumber[] {};
    //Act Statement(s)
    HDPath result = HDPath.m(childNumberArray);
    //Assert statement(s)
    assertThat(result, equalTo(hDPathMock));
    hDPath.verify(() -> HDPath.m(anyList()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${67df9a13-15fa-3529-a28c-2e50c5a12ceb}
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
        //List<String> stringList = new ArrayList<>();
        //stringList.add("\"m\"");
        //stringList.add("\"0\"");
        //stringList.add("\"1\"");
        //stringList.add("\"2\"");
        //stringList.add("\"3\"");
        //stringList.add("\"4\"");
        //stringList.add("\"5\"");
        //stringList.add("\"6\"");
        //stringList.add("\"7\"");
        //stringList.add("\"8\"");
        //stringList.add("\"9\"");
        //stringList.add("\"10\"");
        //stringList.add("\"11\"");
        //stringList.add("\"12\"");
        //stringList.add("\"13\"");
        //stringList.add("\"14\"");
        //stringList.add("\"15\"");
        //stringList.add("\"16\"");
        //stringList.add("\"17\"");
        //stringList.add("\"18\"");
        //stringList.add("\"19\"");
        //stringList.add("\"20\"");
        //stringList.add("\"21\"");
        //stringList.add("\"22\"");
        //stringList.add("\"23\"");
        //stringList.add("\"24\"");
        //stringList.add("\"25\"");
        //stringList.add("\"26\"");
        //stringList.add("\"27\"");
        //stringList.add("\"28\"");
        //stringList.add("\"29\"");
        //stringList.add("\"30\"");
        //stringList.add("\"31\"");
        //doReturn(stringList).when(SEPARATOR_SPLITTERMock).splitToList("m/0/1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17/18/19/20/21/22/23/24/25/26/27/28/29/30/31");
        //Act Statement(s)
        //HDPath result = HDPath.parsePath("m/0/1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17/18/19/20/21/22/23/24/25/26/27/28/29/30/31");
        //ChildNumber childNumber = new ChildNumber(0, false);
        //ChildNumber childNumber2 = new ChildNumber(0, false);
        //ChildNumber childNumber3 = new ChildNumber(0, false);
        //ChildNumber childNumber4 = new ChildNumber(0, false);
        //ChildNumber childNumber5 = new ChildNumber(0, false);
        //ChildNumber childNumber6 = new ChildNumber(0, false);
        //ChildNumber childNumber7 = new ChildNumber(0, false);
        //ChildNumber childNumber8 = new ChildNumber(0, false);
        //ChildNumber childNumber9 = new ChildNumber(0, false);
        //ChildNumber childNumber10 = new ChildNumber(0, false);
        //ChildNumber childNumber11 = new ChildNumber(0, false);
        //ChildNumber childNumber12 = new ChildNumber(0, false);
        //ChildNumber childNumber13 = new ChildNumber(0, false);
        //ChildNumber childNumber14 = new ChildNumber(0, false);
        //ChildNumber childNumber15 = new ChildNumber(0, false);
        //ChildNumber childNumber16 = new ChildNumber(0, false);
        //ChildNumber childNumber17 = new ChildNumber(0, false);
        //ChildNumber childNumber18 = new ChildNumber(0, false);
        //ChildNumber childNumber19 = new ChildNumber(0, false);
        //ChildNumber childNumber20 = new ChildNumber(0, false);
        //ChildNumber childNumber21 = new ChildNumber(0, false);
        //ChildNumber childNumber22 = new ChildNumber(0, false);
        //ChildNumber childNumber23 = new ChildNumber(0, false);
        //ChildNumber childNumber24 = new ChildNumber(0, false);
        //ChildNumber childNumber25 = new ChildNumber(0, false);
        //ChildNumber childNumber26 = new ChildNumber(0, false);
        //ChildNumber childNumber27 = new ChildNumber(0, false);
        //ChildNumber childNumber28 = new ChildNumber(0, false);
        //ChildNumber childNumber29 = new ChildNumber(0, false);
        //ChildNumber childNumber30 = new ChildNumber(0, false);
        //ChildNumber childNumber31 = new ChildNumber(0, false);
        //ChildNumber childNumber32 = new ChildNumber(0, false);
        //ChildNumber childNumber33 = new ChildNumber(0, false);
        //List<ChildNumber> childNumberList = new ArrayList<>(33);
        //childNumberList.add(childNumber);
        //childNumberList.add(childNumber2);
        //childNumberList.add(childNumber3);
        //childNumberList.add(childNumber4);
        //childNumberList.add(childNumber5);
        //childNumberList.add(childNumber6);
        //childNumberList.add(childNumber7);
        //childNumberList.add(childNumber8);
        //childNumberList.add(childNumber9);
        //childNumberList.add(childNumber10);
        //childNumberList.add(childNumber11);
        //childNumberList.add(childNumber12);
        //childNumberList.add(childNumber13);
        //childNumberList.add(childNumber14);
        //childNumberList.add(childNumber15);
        //childNumberList.add(childNumber16);
        //childNumberList.add(childNumber17);
        //childNumberList.add(childNumber18);
        //childNumberList.add(childNumber19);
        //childNumberList.add(childNumber20);
        //childNumberList.add(childNumber21);
        //childNumberList.add(childNumber22);
        //childNumberList.add(childNumber23);
        //childNumberList.add(childNumber24);
        //childNumberList.add(childNumber25);
        //childNumberList.add(childNumber26);
        //childNumberList.add(childNumber27);
        //childNumberList.add(childNumber28);
        //childNumberList.add(childNumber29);
        //childNumberList.add(childNumber30);
        //childNumberList.add(childNumber31);
        //childNumberList.add(childNumber32);
        //childNumberList.add(childNumber33);
        //HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
        //verify(SEPARATOR_SPLITTERMock).splitToList("m/0/1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17/18/19/20/21/22/23/24/25/26/27/28/29/30/31");
    }

    //Sapient generated method id: ${66f50321-e3de-3b3e-a14c-c8d562e967fd}
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
        //List<String> stringList = new ArrayList<>();
        //stringList.add("\"M\"");
        //stringList.add("\"0\"");
        //stringList.add("\"1\"");
        //stringList.add("\"2\"");
        //doReturn(stringList).when(SEPARATOR_SPLITTERMock).splitToList("M/0/1/2");
        //Act Statement(s)
        //HDPath result = HDPath.parsePath("M/0/1/2");
        //ChildNumber childNumber = new ChildNumber(0, false);
        //ChildNumber childNumber2 = new ChildNumber(0, false);
        //ChildNumber childNumber3 = new ChildNumber(0, false);
        //ChildNumber childNumber4 = new ChildNumber(0, false);
        //List<ChildNumber> childNumberList = new ArrayList<>(4);
        //childNumberList.add(childNumber);
        //childNumberList.add(childNumber2);
        //childNumberList.add(childNumber3);
        //childNumberList.add(childNumber4);
        //HDPath hDPath = new HDPath(false, childNumberList);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
        //verify(SEPARATOR_SPLITTERMock).splitToList("M/0/1/2");
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
        ChildNumber childNumber = new ChildNumber(0, false);
        ChildNumber childNumber2 = new ChildNumber(0, false);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        childNumberList.add(childNumber2);
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
        //ChildNumber childNumber = new ChildNumber(0, false);
        //ChildNumber childNumber2 = new ChildNumber(0, false);
        //ChildNumber childNumber3 = new ChildNumber(0, false);
        //ChildNumber childNumber4 = new ChildNumber(0, false);
        //ChildNumber childNumber5 = new ChildNumber(0, false);
        //ChildNumber childNumber6 = new ChildNumber(0, false);
        //ChildNumber childNumber7 = new ChildNumber(0, false);
        //ChildNumber childNumber8 = new ChildNumber(0, false);
        //ChildNumber childNumber9 = new ChildNumber(0, false);
        //List<ChildNumber> childNumberList = new ArrayList<>();
        //childNumberList.add(childNumber);
        //childNumberList.add(childNumber2);
        //childNumberList.add(childNumber3);
        //childNumberList.add(childNumber4);
        //childNumberList.add(childNumber5);
        //childNumberList.add(childNumber6);
        //childNumberList.add(childNumber7);
        //childNumberList.add(childNumber8);
        //childNumberList.add(childNumber9);
        //HDPath target = new HDPath(true, childNumberList);
        //ChildNumber childNumber10 = new ChildNumber(0, false);
        //ChildNumber childNumber11 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray3 = new ChildNumber[][] { childNumber11 };
        //ChildNumber[] childNumberArray2 = new ChildNumber[] { childNumberArray3 };
        //ChildNumber childNumber12 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray5 = new ChildNumber[][] { childNumber12 };
        //ChildNumber[] childNumberArray4 = new ChildNumber[] { childNumberArray5 };
        //ChildNumber childNumber13 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray7 = new ChildNumber[][] { childNumber13 };
        //ChildNumber[] childNumberArray6 = new ChildNumber[] { childNumberArray7 };
        //ChildNumber childNumber14 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray9 = new ChildNumber[][] { childNumber14 };
        //ChildNumber[] childNumberArray8 = new ChildNumber[] { childNumberArray9 };
        //ChildNumber childNumber15 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray11 = new ChildNumber[][] { childNumber15 };
        //ChildNumber[] childNumberArray10 = new ChildNumber[] { childNumberArray11 };
        //ChildNumber childNumber16 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray13 = new ChildNumber[][] { childNumber16 };
        //ChildNumber[] childNumberArray12 = new ChildNumber[] { childNumberArray13 };
        //ChildNumber childNumber17 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray15 = new ChildNumber[][] { childNumber17 };
        //ChildNumber[] childNumberArray14 = new ChildNumber[] { childNumberArray15 };
        //ChildNumber childNumber18 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray17 = new ChildNumber[][] { childNumber18 };
        //ChildNumber[] childNumberArray16 = new ChildNumber[] { childNumberArray17 };
        //ChildNumber[] childNumberArray = new ChildNumber[] { childNumberArray2, childNumberArray4, childNumberArray6, childNumberArray8, childNumberArray10, childNumberArray12, childNumberArray14, childNumberArray16 };
        //Act Statement(s)
        //HDPath result = target.extend(childNumber10, childNumberArray);
        //ChildNumber childNumber19 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray19 = new ChildNumber[][] { childNumber19 };
        //ChildNumber[] childNumberArray18 = new ChildNumber[] { childNumberArray19 };
        //ChildNumber childNumber20 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray21 = new ChildNumber[][] { childNumber20 };
        //ChildNumber[] childNumberArray20 = new ChildNumber[] { childNumberArray21 };
        //ChildNumber childNumber21 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray23 = new ChildNumber[][] { childNumber21 };
        //ChildNumber[] childNumberArray22 = new ChildNumber[] { childNumberArray23 };
        //ChildNumber childNumber22 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray25 = new ChildNumber[][] { childNumber22 };
        //ChildNumber[] childNumberArray24 = new ChildNumber[] { childNumberArray25 };
        //ChildNumber childNumber23 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray27 = new ChildNumber[][] { childNumber23 };
        //ChildNumber[] childNumberArray26 = new ChildNumber[] { childNumberArray27 };
        //ChildNumber childNumber24 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray29 = new ChildNumber[][] { childNumber24 };
        //ChildNumber[] childNumberArray28 = new ChildNumber[] { childNumberArray29 };
        //ChildNumber childNumber25 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray31 = new ChildNumber[][] { childNumber25 };
        //ChildNumber[] childNumberArray30 = new ChildNumber[] { childNumberArray31 };
        //ChildNumber childNumber26 = new ChildNumber(0, false);
        //ChildNumber[][] childNumberArray33 = new ChildNumber[][] { childNumber26 };
        //ChildNumber[] childNumberArray32 = new ChildNumber[] { childNumberArray33 };
        //ArrayList<ChildNumber> childNumberList2 = new ArrayList<>();
        //childNumberList2.add(childNumber10);
        //childNumberList2.add(childNumberArray18);
        //childNumberList2.add(childNumberArray20);
        //childNumberList2.add(childNumberArray22);
        //childNumberList2.add(childNumberArray24);
        //childNumberList2.add(childNumberArray26);
        //childNumberList2.add(childNumberArray28);
        //childNumberList2.add(childNumberArray30);
        //childNumberList2.add(childNumberArray32);
        //HDPath hDPath = new HDPath(true, childNumberList2);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${696ce658-d62f-32d5-880b-fff3f98998b4}
    @Test()
    public void extend1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ChildNumber childNumber = new ChildNumber(3);
        //ChildNumber childNumber2 = new ChildNumber(4);
        //List<ChildNumber> childNumberList = new ArrayList<>();
        //childNumberList.add(childNumber);
        //childNumberList.add(childNumber2);
        //HDPath target = new HDPath(true, childNumberList);
        //Act Statement(s)
        //HDPath result = target.extend(hDPathMock);
        //ArrayList<ChildNumber> childNumberList2 = new ArrayList<>();
        //HDPath hDPath = new HDPath(true, childNumberList2);
        //Assert statement(s)
        //assertThat(result, equalTo(hDPath));
    }

    //Sapient generated method id: ${48116735-199f-3177-8f4c-7b2283223a97}
    @Test()
    public void extend2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            ChildNumber childNumber = new ChildNumber(3);
            ChildNumber childNumber2 = new ChildNumber(4);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            HDPath target = spy(new HDPath(true, childNumberList));
            doReturn(hDPathMock).when(target).extend(hDPath2);
            ChildNumber childNumber3 = new ChildNumber(1);
            ChildNumber childNumber4 = new ChildNumber(2);
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumber3);
            childNumberList2.add(childNumber4);
            //Act Statement(s)
            HDPath result = target.extend(childNumberList2);
            //Assert statement(s)
            assertThat(result, equalTo(hDPathMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).extend(hDPath2);
        }
    }

    //Sapient generated method id: ${01c74efc-0565-379f-a4be-8a9a7469b495}
    @Ignore()
    @Test()
    public void listTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildNumber childNumber = new ChildNumber(0, false);
        ChildNumber childNumber2 = new ChildNumber(0, false);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        childNumberList.add(childNumber2);
        HDPath target = new HDPath(true, childNumberList);
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
        ChildNumber childNumber = new ChildNumber(1);
        ChildNumber childNumber2 = new ChildNumber(2);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        childNumberList.add(childNumber2);
        HDPath target = new HDPath(true, childNumberList);
        //Act Statement(s)
        HDPath result = target.parent();
        ChildNumber childNumber3Mock = mock(ChildNumber.class);
        List<ChildNumber> childNumberList2 = new ArrayList<>();
        childNumberList2.add(childNumber3Mock);
        HDPath hDPath = new HDPath(true, childNumberList2);
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
        ChildNumber childNumber = new ChildNumber(1);
        ChildNumber childNumber2 = new ChildNumber(2);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        childNumberList.add(childNumber2);
        HDPath target = spy(new HDPath(true, childNumberList));
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
            HDPath target = new HDPath(true, childNumberList);
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
        HDPath target = new HDPath(true, childNumberList);
        //Act Statement(s)
        ChildNumber result = target.get(0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
    @Ignore()
    @Test()
    public void sizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildNumber childNumber = new ChildNumber(0, false);
        ChildNumber childNumber2 = new ChildNumber(0, false);
        ChildNumber childNumber3 = new ChildNumber(0, false);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        childNumberList.add(childNumber2);
        childNumberList.add(childNumber3);
        HDPath target = new HDPath(true, childNumberList);
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
        ChildNumber childNumber = new ChildNumber(0, false);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
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
        ChildNumber childNumber = new ChildNumber(1);
        List<ChildNumber> childNumberList = new ArrayList<>();
        childNumberList.add(childNumber);
        HDPath target = new HDPath(false, childNumberList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("M/toString_object1"));
    }
}
