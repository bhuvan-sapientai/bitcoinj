package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.internal.Preconditions;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class DeterministicHierarchySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final HDPath rootPathMock = mock(HDPath.class, "rootPath");

    private final ChildNumber childNumberMock = mock(ChildNumber.class);

    private final ChildNumber childNumberMock2 = mock(ChildNumber.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    private final HDPath hDPathMock3 = mock(HDPath.class);

    private final HDPath hDPathMock4 = mock(HDPath.class);

    private final DeterministicKey keyMock = mock(DeterministicKey.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${4706f091-c110-342a-8f50-cd57ec64202d}
    @Test()
    public void putKeyWhenParentIsNotNull() {
        /* Branches:
         * (parent != null) : true
         */
        doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
        doReturn(hDPathMock, rootPathMock, hDPathMock3).when(keyMock).getPath();
        doReturn(deterministicKeyMock, deterministicKeyMock2).when(keyMock).getParent();
        doReturn(hDPathMock4).when(deterministicKeyMock2).getPath();
        doReturn(childNumberMock, childNumberMock2).when(keyMock).getChildNumber();
        DeterministicHierarchy target = new DeterministicHierarchy(keyMock);

        //Act Statement(s)
        target.putKey(keyMock);

        //Assert statement(s)
        verify(keyMock, times(3)).getPath();
        verify(keyMock, times(2)).getParent();
        verify(deterministicKeyMock).getPath();
        verify(keyMock, times(2)).getChildNumber();
        verify(deterministicKeyMock2).getPath();
    }

    //Sapient generated method id: ${278d7fd4-a2c9-352f-ab36-f62c16594b92}
    @Test()
    public void putKeysTest() {
        doReturn(deterministicKeyMock).when(keyMock).getParent();
        doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
        doReturn(childNumberMock).when(keyMock).getChildNumber();
        doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
        DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
        doNothing().when(target).putKey(deterministicKeyMock2);
        List<DeterministicKey> deterministicKeyList = new ArrayList<>();
        deterministicKeyList.add(deterministicKeyMock2);

        //Act Statement(s)
        target.putKeys(deterministicKeyList);

        //Assert statement(s)
        verify(keyMock, times(2)).getPath();
        verify(keyMock).getParent();
        verify(deterministicKeyMock).getPath();
        verify(keyMock).getChildNumber();
        verify(target).putKey(deterministicKeyMock2);
    }

    //Sapient generated method id: ${2bafa839-995b-3253-b961-8ad2c1102276}
    @Test()
    public void getWhenRelativePathThrowsIllegalArgumentException() {
        /* Branches:
         * (relativePath) : true
         * (!keys.containsKey(absolutePath)) : true
         * (!create) : true
         * (relativePath) : true
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class, "rootKey");
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock).when(deterministicKeyMock).getPath();
            ChildNumber childNumber = new ChildNumber(0, false);
            doReturn(childNumber).when(keyMock).getChildNumber();
            doReturn(null, rootPathMock).when(keyMock).getPath();
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            DeterministicHierarchy target = new DeterministicHierarchy(keyMock);
            List list2 = new ArrayList<>();
            HDPath hDPath3 = new HDPath(false, list2);
            ChildNumber childNumber2 = new ChildNumber(0, false);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber2);
            doReturn(hDPath3).when(rootPathMock).extend(childNumberList);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No key found for relative path M.");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.get(childNumberList, true, false);
            //Assert statement(s)
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(rootPathMock).extend(childNumberList);
        }
    }

    //Sapient generated method id: ${f00a1a9a-b0c1-375f-9aa4-bb9ffe58a3f2}
    @Test()
    public void getWhenAbsolutePathSizeGreaterThan0() {
        /* Branches:
         * (relativePath) : true
         * (!keys.containsKey(absolutePath)) : true
         * (!create) : false
         * (absolutePath.size() > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(1).when(hDPathMock).size();
            List list = new ArrayList<>();
            doReturn(list).when(hDPathMock).subList(0, 0);
            doReturn(childNumberMock).when(hDPathMock).get(0);
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(childNumberMock2).when(keyMock).getChildNumber();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock3);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock3, childNumberMock)).thenReturn(deterministicKeyMock2);
            DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(hDPathMock).when(rootPathMock).extend(childNumberList);
            doNothing().when(target).putKey(deterministicKeyMock2);
            //Act Statement(s)
            DeterministicKey result = target.get(childNumberList, true, true);
            //Assert statement(s)
            assertThat(result, equalTo(keyMock));
            verify(keyMock, times(2)).getPath();
            verify(hDPathMock, times(3)).size();
            verify(hDPathMock).subList(0, 0);
            verify(hDPathMock).get(0);
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDPath.verify(() -> HDPath.M(anyList()));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock3, childNumberMock), atLeast(1));
            verify(rootPathMock).extend(childNumberList);
            verify(target).putKey(deterministicKeyMock2);
        }
    }

    //Sapient generated method id: ${f74c6dbf-69f1-3014-85ef-06547feacf55}
    @Test()
    public void getWhenAbsolutePathSizeNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (relativePath) : true
         * (!keys.containsKey(absolutePath)) : true
         * (!create) : false
         * (absolutePath.size() > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(childNumberMock).when(keyMock).getChildNumber();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock3);
            DeterministicHierarchy target = new DeterministicHierarchy(keyMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(hDPathMock4).when(rootPathMock).extend(childNumberList);
            doReturn(-1).when(hDPathMock4).size();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.get(childNumberList, true, true);
            //Assert statement(s)
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(rootPathMock).extend(childNumberList);
            verify(hDPathMock4).size();
        }
    }

    //Sapient generated method id: ${6518e29b-f38f-3e8b-b3c8-111c93f9927a}
    @Test()
    public void getWhenNotRelativePathThrowsIllegalArgumentException() {
        /* Branches:
         * (relativePath) : false
         * (!keys.containsKey(absolutePath)) : true
         * (!create) : true
         * (relativePath) : false
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class, "rootKey");
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock).when(deterministicKeyMock).getPath();
            ChildNumber childNumber = new ChildNumber(0, false);
            doReturn(childNumber).when(keyMock).getChildNumber();
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            doReturn(null, hDPath2).when(keyMock).getPath();
            List list2 = new ArrayList<>();
            HDPath hDPath3 = new HDPath(false, list2);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath3);
            DeterministicHierarchy target = new DeterministicHierarchy(keyMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No key found for absolute path M.");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            ChildNumber childNumber2 = new ChildNumber(0, false);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber2);
            //Act Statement(s)
            target.get(childNumberList, false, false);
            //Assert statement(s)
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${40fc7af5-625c-3a83-a14b-2599ed1dfea5}
    @Test()
    public void deriveNextChildWhenLastChildNumberIsNotNull() {
        /* Branches:
         * (nAttempts++ < HDKeyDerivation.MAX_CHILD_DERIVATION_ATTEMPTS) : true
         * (lastChildNumber != null) : true  #  inside getNextChildNumberToDerive method
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(childNumberMock).when(keyMock).getChildNumber();
            doReturn(1).when(childNumberMock).num();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock3), (ChildNumber) any())).thenReturn(deterministicKeyMock2);
            doReturn(hDPathMock2).when(deterministicKeyMock3).getPath();
            DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock3).when(target).get(childNumberList, false, false);
            doNothing().when(target).putKey(deterministicKeyMock2);
            //Act Statement(s)
            DeterministicKey result = target.deriveNextChild(childNumberList, false, false, false);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock2));
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            verify(childNumberMock).num();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock3), (ChildNumber) any()));
            verify(deterministicKeyMock3).getPath();
            verify(target).get(childNumberList, false, false);
            verify(target).putKey(deterministicKeyMock2);
        }
    }

    //Sapient generated method id: ${514c68b2-346c-3a06-a3e4-20fb83054539}
    @Test()
    public void deriveNextChildWhenLastChildNumberIsNull() {
        /* Branches:
         * (nAttempts++ < HDKeyDerivation.MAX_CHILD_DERIVATION_ATTEMPTS) : true
         * (lastChildNumber != null) : false  #  inside getNextChildNumberToDerive method
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(null).when(keyMock).getChildNumber();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock3), (ChildNumber) any())).thenReturn(deterministicKeyMock2);
            doReturn(hDPathMock2).when(deterministicKeyMock3).getPath();
            DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock3).when(target).get(childNumberList, false, false);
            doNothing().when(target).putKey(deterministicKeyMock2);
            //Act Statement(s)
            DeterministicKey result = target.deriveNextChild(childNumberList, false, false, false);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock2));
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock3), (ChildNumber) any()));
            verify(deterministicKeyMock3).getPath();
            verify(target).get(childNumberList, false, false);
            verify(target).putKey(deterministicKeyMock2);
        }
    }

    //Sapient generated method id: ${1383cac1-67e1-3da3-9e08-583a63944d1e}
    @Test()
    public void deriveNextChildWhenCaughtHDDerivationExceptionThrowsHDDerivationException() {
        /* Branches:
         * (nAttempts++ < HDKeyDerivation.MAX_CHILD_DERIVATION_ATTEMPTS) : true
         * (lastChildNumber != null) : true  #  inside getNextChildNumberToDerive method
         * (catch-exception (HDDerivationException)) : true
         */
        //Arrange Statement(s)
        HDDerivationException hDDerivationExceptionMock = mock(HDDerivationException.class);
        DeterministicKey deterministicKeyMock4 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock5 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock6 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock7 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock8 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock9 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock10 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock11 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock12 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock13 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock14 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock15 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock16 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock17 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock18 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock19 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock20 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock21 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock22 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock23 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock24 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock25 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock26 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock27 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock28 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock29 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock30 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock31 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock32 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock33 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock34 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock35 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock36 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock37 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock38 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock39 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock40 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock41 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock42 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock43 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock44 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock45 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock46 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock47 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock48 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock49 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock50 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock51 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock52 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock53 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock54 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock55 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock56 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock57 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock58 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock59 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock60 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock61 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock62 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock63 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock64 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock65 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock66 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock67 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock68 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock69 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock70 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock71 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock72 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock73 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock74 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock75 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock76 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock77 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock78 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock79 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock80 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock81 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock82 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock83 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock84 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock85 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock86 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock87 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock88 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock89 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock90 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock91 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock92 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock93 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock94 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock95 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock96 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock97 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock98 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock99 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock100 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock101 = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(childNumberMock).when(keyMock).getChildNumber();
            doReturn(1).when(childNumberMock).num();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            doReturn(hDPathMock2).when(deterministicKeyMock2).getPath();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock2, (ChildNumber) null)).thenReturn(hDDerivationExceptionMock).thenReturn(deterministicKeyMock3).thenReturn(deterministicKeyMock4).thenReturn(deterministicKeyMock5).thenReturn(deterministicKeyMock6).thenReturn(deterministicKeyMock7).thenReturn(deterministicKeyMock8).thenReturn(deterministicKeyMock9).thenReturn(deterministicKeyMock10).thenReturn(deterministicKeyMock11).thenReturn(deterministicKeyMock12).thenReturn(deterministicKeyMock13).thenReturn(deterministicKeyMock14).thenReturn(deterministicKeyMock15).thenReturn(deterministicKeyMock16).thenReturn(deterministicKeyMock17).thenReturn(deterministicKeyMock18).thenReturn(deterministicKeyMock19).thenReturn(deterministicKeyMock20).thenReturn(deterministicKeyMock21).thenReturn(deterministicKeyMock22).thenReturn(deterministicKeyMock23).thenReturn(deterministicKeyMock24).thenReturn(deterministicKeyMock25).thenReturn(deterministicKeyMock26).thenReturn(deterministicKeyMock27).thenReturn(deterministicKeyMock28).thenReturn(deterministicKeyMock29).thenReturn(deterministicKeyMock30).thenReturn(deterministicKeyMock31).thenReturn(deterministicKeyMock32).thenReturn(deterministicKeyMock33).thenReturn(deterministicKeyMock34).thenReturn(deterministicKeyMock35).thenReturn(deterministicKeyMock36).thenReturn(deterministicKeyMock37).thenReturn(deterministicKeyMock38).thenReturn(deterministicKeyMock39).thenReturn(deterministicKeyMock40).thenReturn(deterministicKeyMock41).thenReturn(deterministicKeyMock42).thenReturn(deterministicKeyMock43).thenReturn(deterministicKeyMock44).thenReturn(deterministicKeyMock45).thenReturn(deterministicKeyMock46).thenReturn(deterministicKeyMock47).thenReturn(deterministicKeyMock48).thenReturn(deterministicKeyMock49).thenReturn(deterministicKeyMock50).thenReturn(deterministicKeyMock51).thenReturn(deterministicKeyMock52).thenReturn(deterministicKeyMock53).thenReturn(deterministicKeyMock54).thenReturn(deterministicKeyMock55).thenReturn(deterministicKeyMock56).thenReturn(deterministicKeyMock57).thenReturn(deterministicKeyMock58).thenReturn(deterministicKeyMock59).thenReturn(deterministicKeyMock60).thenReturn(deterministicKeyMock61).thenReturn(deterministicKeyMock62).thenReturn(deterministicKeyMock63).thenReturn(deterministicKeyMock64).thenReturn(deterministicKeyMock65).thenReturn(deterministicKeyMock66).thenReturn(deterministicKeyMock67).thenReturn(deterministicKeyMock68).thenReturn(deterministicKeyMock69).thenReturn(deterministicKeyMock70).thenReturn(deterministicKeyMock71).thenReturn(deterministicKeyMock72).thenReturn(deterministicKeyMock73).thenReturn(deterministicKeyMock74).thenReturn(deterministicKeyMock75).thenReturn(deterministicKeyMock76).thenReturn(deterministicKeyMock77).thenReturn(deterministicKeyMock78).thenReturn(deterministicKeyMock79).thenReturn(deterministicKeyMock80).thenReturn(deterministicKeyMock81).thenReturn(deterministicKeyMock82).thenReturn(deterministicKeyMock83).thenReturn(deterministicKeyMock84).thenReturn(deterministicKeyMock85).thenReturn(deterministicKeyMock86).thenReturn(deterministicKeyMock87).thenReturn(deterministicKeyMock88).thenReturn(deterministicKeyMock89).thenReturn(deterministicKeyMock90).thenReturn(deterministicKeyMock91).thenReturn(deterministicKeyMock92).thenReturn(deterministicKeyMock93).thenReturn(deterministicKeyMock94).thenReturn(deterministicKeyMock95).thenReturn(deterministicKeyMock96).thenReturn(deterministicKeyMock97).thenReturn(deterministicKeyMock98).thenReturn(deterministicKeyMock99).thenReturn(deterministicKeyMock100);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock101);
            DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock2).when(target).get(childNumberList, false, false);
            doNothing().when(target).putKey(deterministicKeyMock3);
            doNothing().when(target).putKey(deterministicKeyMock4);
            doNothing().when(target).putKey(deterministicKeyMock5);
            doNothing().when(target).putKey(deterministicKeyMock6);
            doNothing().when(target).putKey(deterministicKeyMock7);
            doNothing().when(target).putKey(deterministicKeyMock8);
            doNothing().when(target).putKey(deterministicKeyMock9);
            doNothing().when(target).putKey(deterministicKeyMock10);
            doNothing().when(target).putKey(deterministicKeyMock11);
            doNothing().when(target).putKey(deterministicKeyMock12);
            doNothing().when(target).putKey(deterministicKeyMock13);
            doNothing().when(target).putKey(deterministicKeyMock14);
            doNothing().when(target).putKey(deterministicKeyMock15);
            doNothing().when(target).putKey(deterministicKeyMock16);
            doNothing().when(target).putKey(deterministicKeyMock17);
            doNothing().when(target).putKey(deterministicKeyMock18);
            doNothing().when(target).putKey(deterministicKeyMock19);
            doNothing().when(target).putKey(deterministicKeyMock20);
            doNothing().when(target).putKey(deterministicKeyMock21);
            doNothing().when(target).putKey(deterministicKeyMock22);
            doNothing().when(target).putKey(deterministicKeyMock23);
            doNothing().when(target).putKey(deterministicKeyMock24);
            doNothing().when(target).putKey(deterministicKeyMock25);
            doNothing().when(target).putKey(deterministicKeyMock26);
            doNothing().when(target).putKey(deterministicKeyMock27);
            doNothing().when(target).putKey(deterministicKeyMock28);
            doNothing().when(target).putKey(deterministicKeyMock29);
            doNothing().when(target).putKey(deterministicKeyMock30);
            doNothing().when(target).putKey(deterministicKeyMock31);
            doNothing().when(target).putKey(deterministicKeyMock32);
            doNothing().when(target).putKey(deterministicKeyMock33);
            doNothing().when(target).putKey(deterministicKeyMock34);
            doNothing().when(target).putKey(deterministicKeyMock35);
            doNothing().when(target).putKey(deterministicKeyMock36);
            doNothing().when(target).putKey(deterministicKeyMock37);
            doNothing().when(target).putKey(deterministicKeyMock38);
            doNothing().when(target).putKey(deterministicKeyMock39);
            doNothing().when(target).putKey(deterministicKeyMock40);
            doNothing().when(target).putKey(deterministicKeyMock41);
            doNothing().when(target).putKey(deterministicKeyMock42);
            doNothing().when(target).putKey(deterministicKeyMock43);
            doNothing().when(target).putKey(deterministicKeyMock44);
            doNothing().when(target).putKey(deterministicKeyMock45);
            doNothing().when(target).putKey(deterministicKeyMock46);
            doNothing().when(target).putKey(deterministicKeyMock47);
            doNothing().when(target).putKey(deterministicKeyMock48);
            doNothing().when(target).putKey(deterministicKeyMock49);
            doNothing().when(target).putKey(deterministicKeyMock50);
            doNothing().when(target).putKey(deterministicKeyMock51);
            doNothing().when(target).putKey(deterministicKeyMock52);
            doNothing().when(target).putKey(deterministicKeyMock53);
            doNothing().when(target).putKey(deterministicKeyMock54);
            doNothing().when(target).putKey(deterministicKeyMock55);
            doNothing().when(target).putKey(deterministicKeyMock56);
            doNothing().when(target).putKey(deterministicKeyMock57);
            doNothing().when(target).putKey(deterministicKeyMock58);
            doNothing().when(target).putKey(deterministicKeyMock59);
            doNothing().when(target).putKey(deterministicKeyMock60);
            doNothing().when(target).putKey(deterministicKeyMock61);
            doNothing().when(target).putKey(deterministicKeyMock62);
            doNothing().when(target).putKey(deterministicKeyMock63);
            doNothing().when(target).putKey(deterministicKeyMock64);
            doNothing().when(target).putKey(deterministicKeyMock65);
            doNothing().when(target).putKey(deterministicKeyMock66);
            doNothing().when(target).putKey(deterministicKeyMock67);
            doNothing().when(target).putKey(deterministicKeyMock68);
            doNothing().when(target).putKey(deterministicKeyMock69);
            doNothing().when(target).putKey(deterministicKeyMock70);
            doNothing().when(target).putKey(deterministicKeyMock71);
            doNothing().when(target).putKey(deterministicKeyMock72);
            doNothing().when(target).putKey(deterministicKeyMock73);
            doNothing().when(target).putKey(deterministicKeyMock74);
            doNothing().when(target).putKey(deterministicKeyMock75);
            doNothing().when(target).putKey(deterministicKeyMock76);
            doNothing().when(target).putKey(deterministicKeyMock77);
            doNothing().when(target).putKey(deterministicKeyMock78);
            doNothing().when(target).putKey(deterministicKeyMock79);
            doNothing().when(target).putKey(deterministicKeyMock80);
            doNothing().when(target).putKey(deterministicKeyMock81);
            doNothing().when(target).putKey(deterministicKeyMock82);
            doNothing().when(target).putKey(deterministicKeyMock83);
            doNothing().when(target).putKey(deterministicKeyMock84);
            doNothing().when(target).putKey(deterministicKeyMock85);
            doNothing().when(target).putKey(deterministicKeyMock86);
            doNothing().when(target).putKey(deterministicKeyMock87);
            doNothing().when(target).putKey(deterministicKeyMock88);
            doNothing().when(target).putKey(deterministicKeyMock89);
            doNothing().when(target).putKey(deterministicKeyMock90);
            doNothing().when(target).putKey(deterministicKeyMock91);
            doNothing().when(target).putKey(deterministicKeyMock92);
            doNothing().when(target).putKey(deterministicKeyMock93);
            doNothing().when(target).putKey(deterministicKeyMock94);
            doNothing().when(target).putKey(deterministicKeyMock95);
            doNothing().when(target).putKey(deterministicKeyMock96);
            doNothing().when(target).putKey(deterministicKeyMock97);
            doNothing().when(target).putKey(deterministicKeyMock98);
            doNothing().when(target).putKey(deterministicKeyMock99);
            doNothing().when(target).putKey(deterministicKeyMock100);
            doNothing().when(target).putKey(deterministicKeyMock101);
            HDDerivationException hDDerivationException = new HDDerivationException("Maximum number of child derivation attempts reached, this is probably an indication of a bug.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            target.deriveNextChild(childNumberList, false, false, false);
            //Assert statement(s)
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            verify(childNumberMock).num();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock2, (ChildNumber) null), atLeast(99));
            verify(deterministicKeyMock2, times(100)).getPath();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()));
            verify(target).get(childNumberList, false, false);
            verify(target).putKey(deterministicKeyMock3);
            verify(target).putKey(deterministicKeyMock4);
            verify(target).putKey(deterministicKeyMock5);
            verify(target).putKey(deterministicKeyMock6);
            verify(target).putKey(deterministicKeyMock7);
            verify(target).putKey(deterministicKeyMock8);
            verify(target).putKey(deterministicKeyMock9);
            verify(target).putKey(deterministicKeyMock10);
            verify(target).putKey(deterministicKeyMock11);
            verify(target).putKey(deterministicKeyMock12);
            verify(target).putKey(deterministicKeyMock13);
            verify(target).putKey(deterministicKeyMock14);
            verify(target).putKey(deterministicKeyMock15);
            verify(target).putKey(deterministicKeyMock16);
            verify(target).putKey(deterministicKeyMock17);
            verify(target).putKey(deterministicKeyMock18);
            verify(target).putKey(deterministicKeyMock19);
            verify(target).putKey(deterministicKeyMock20);
            verify(target).putKey(deterministicKeyMock21);
            verify(target).putKey(deterministicKeyMock22);
            verify(target).putKey(deterministicKeyMock23);
            verify(target).putKey(deterministicKeyMock24);
            verify(target).putKey(deterministicKeyMock25);
            verify(target).putKey(deterministicKeyMock26);
            verify(target).putKey(deterministicKeyMock27);
            verify(target).putKey(deterministicKeyMock28);
            verify(target).putKey(deterministicKeyMock29);
            verify(target).putKey(deterministicKeyMock30);
            verify(target).putKey(deterministicKeyMock31);
            verify(target).putKey(deterministicKeyMock32);
            verify(target).putKey(deterministicKeyMock33);
            verify(target).putKey(deterministicKeyMock34);
            verify(target).putKey(deterministicKeyMock35);
            verify(target).putKey(deterministicKeyMock36);
            verify(target).putKey(deterministicKeyMock37);
            verify(target).putKey(deterministicKeyMock38);
            verify(target).putKey(deterministicKeyMock39);
            verify(target).putKey(deterministicKeyMock40);
            verify(target).putKey(deterministicKeyMock41);
            verify(target).putKey(deterministicKeyMock42);
            verify(target).putKey(deterministicKeyMock43);
            verify(target).putKey(deterministicKeyMock44);
            verify(target).putKey(deterministicKeyMock45);
            verify(target).putKey(deterministicKeyMock46);
            verify(target).putKey(deterministicKeyMock47);
            verify(target).putKey(deterministicKeyMock48);
            verify(target).putKey(deterministicKeyMock49);
            verify(target).putKey(deterministicKeyMock50);
            verify(target).putKey(deterministicKeyMock51);
            verify(target).putKey(deterministicKeyMock52);
            verify(target).putKey(deterministicKeyMock53);
            verify(target).putKey(deterministicKeyMock54);
            verify(target).putKey(deterministicKeyMock55);
            verify(target).putKey(deterministicKeyMock56);
            verify(target).putKey(deterministicKeyMock57);
            verify(target).putKey(deterministicKeyMock58);
            verify(target).putKey(deterministicKeyMock59);
            verify(target).putKey(deterministicKeyMock60);
            verify(target).putKey(deterministicKeyMock61);
            verify(target).putKey(deterministicKeyMock62);
            verify(target).putKey(deterministicKeyMock63);
            verify(target).putKey(deterministicKeyMock64);
            verify(target).putKey(deterministicKeyMock65);
            verify(target).putKey(deterministicKeyMock66);
            verify(target).putKey(deterministicKeyMock67);
            verify(target).putKey(deterministicKeyMock68);
            verify(target).putKey(deterministicKeyMock69);
            verify(target).putKey(deterministicKeyMock70);
            verify(target).putKey(deterministicKeyMock71);
            verify(target).putKey(deterministicKeyMock72);
            verify(target).putKey(deterministicKeyMock73);
            verify(target).putKey(deterministicKeyMock74);
            verify(target).putKey(deterministicKeyMock75);
            verify(target).putKey(deterministicKeyMock76);
            verify(target).putKey(deterministicKeyMock77);
            verify(target).putKey(deterministicKeyMock78);
            verify(target).putKey(deterministicKeyMock79);
            verify(target).putKey(deterministicKeyMock80);
            verify(target).putKey(deterministicKeyMock81);
            verify(target).putKey(deterministicKeyMock82);
            verify(target).putKey(deterministicKeyMock83);
            verify(target).putKey(deterministicKeyMock84);
            verify(target).putKey(deterministicKeyMock85);
            verify(target).putKey(deterministicKeyMock86);
            verify(target).putKey(deterministicKeyMock87);
            verify(target).putKey(deterministicKeyMock88);
            verify(target).putKey(deterministicKeyMock89);
            verify(target).putKey(deterministicKeyMock90);
            verify(target).putKey(deterministicKeyMock91);
            verify(target).putKey(deterministicKeyMock92);
            verify(target).putKey(deterministicKeyMock93);
            verify(target).putKey(deterministicKeyMock94);
            verify(target).putKey(deterministicKeyMock95);
            verify(target).putKey(deterministicKeyMock96);
            verify(target).putKey(deterministicKeyMock97);
            verify(target).putKey(deterministicKeyMock98);
            verify(target).putKey(deterministicKeyMock99);
            verify(target).putKey(deterministicKeyMock100);
            verify(target).putKey(deterministicKeyMock101);
        }
    }

    //Sapient generated method id: ${09651aa6-0c86-3ab9-99e7-e3eb95b56ca6}
    @Test()
    public void getNumChildrenWhenCnIsNull() {
        /* Branches:
         * (cn == null) : true
         */
        doReturn(deterministicKeyMock).when(keyMock).getParent();
        doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
        doReturn(null).when(keyMock).getChildNumber();
        doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
        DeterministicHierarchy target = new DeterministicHierarchy(keyMock);

        //Act Statement(s)
        int result = target.getNumChildren(hDPathMock2);

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(keyMock, times(2)).getPath();
        verify(keyMock).getParent();
        verify(deterministicKeyMock).getPath();
        verify(keyMock).getChildNumber();
    }

    //Sapient generated method id: ${7279f84e-b0a0-32b4-a1f7-0e36c86c05a3}
    @Test()
    public void getNumChildrenWhenCnIsNotNull() {
        /* Branches:
         * (cn == null) : false
         */
        doReturn(deterministicKeyMock).when(keyMock).getParent();
        doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
        doReturn(childNumberMock).when(keyMock).getChildNumber();
        doReturn(1).when(childNumberMock).num();
        doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
        DeterministicHierarchy target = new DeterministicHierarchy(keyMock);

        //Act Statement(s)
        int result = target.getNumChildren(hDPathMock2);

        //Assert statement(s)
        assertThat(result, equalTo(2));
        verify(keyMock, times(2)).getPath();
        verify(keyMock).getParent();
        verify(deterministicKeyMock).getPath();
        verify(keyMock).getChildNumber();
        verify(childNumberMock).num();
    }

    //Sapient generated method id: ${bc074e57-33d7-30e4-9d2e-dbc423e9a448}
    @Test()
    public void deriveChildTest() {
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            doReturn(deterministicKeyMock).when(keyMock).getParent();
            doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
            doReturn(childNumberMock).when(keyMock).getChildNumber();
            doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock3, childNumberMock2)).thenReturn(deterministicKeyMock2);
            DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock3).when(target).get(childNumberList, false, false);
            doNothing().when(target).putKey(deterministicKeyMock2);
            //Act Statement(s)
            DeterministicKey result = target.deriveChild(childNumberList, false, false, childNumberMock2);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock2));
            verify(keyMock, times(2)).getPath();
            verify(keyMock).getParent();
            verify(deterministicKeyMock).getPath();
            verify(keyMock).getChildNumber();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock3, childNumberMock2), atLeast(1));
            verify(target).get(childNumberList, false, false);
            verify(target).putKey(deterministicKeyMock2);
        }
    }

    //Sapient generated method id: ${2a8672b2-2ecd-3251-b270-144f691989dc}
    @Test()
    public void getRootKeyTest() {
        doReturn(deterministicKeyMock).when(keyMock).getParent();
        doReturn(hDPathMock2).when(deterministicKeyMock).getPath();
        doReturn(childNumberMock).when(keyMock).getChildNumber();
        doReturn(hDPathMock, rootPathMock).when(keyMock).getPath();
        DeterministicHierarchy target = spy(new DeterministicHierarchy(keyMock));
        doReturn(deterministicKeyMock2).when(target).get(rootPathMock, false, false);

        //Act Statement(s)
        DeterministicKey result = target.getRootKey();

        //Assert statement(s)
        assertThat(result, equalTo(deterministicKeyMock2));
        verify(keyMock, times(2)).getPath();
        verify(keyMock).getParent();
        verify(deterministicKeyMock).getPath();
        verify(keyMock).getChildNumber();
        verify(target).get(rootPathMock, false, false);
    }
}
