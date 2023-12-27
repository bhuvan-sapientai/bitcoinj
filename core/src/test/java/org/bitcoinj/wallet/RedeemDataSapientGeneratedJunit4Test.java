package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import java.util.ArrayList;

import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.script.Script;
import org.bitcoinj.script.ScriptPattern;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class RedeemDataSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey keyMock = mock(ECKey.class);

    private final Script scriptMock = mock(Script.class);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        List<ECKey> eCKeyList = new ArrayList<>();

        //Act Statement(s)
        RedeemData result = RedeemData.of(eCKeyList, scriptMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${52bc7f53-5231-3a97-98b8-a99c714d22e5}
    @Test()
    public void of1WhenScriptPatternIsP2PKRedeemScriptAndKeyIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2PKH(redeemScript)) : false
         * (ScriptPattern.isP2WPKH(redeemScript)) : false
         * (ScriptPattern.isP2PK(redeemScript)) : true
         * (key != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            ECKey eCKey = new ECKey();
            //Act Statement(s)
            RedeemData result = RedeemData.of(eCKey, scriptMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${97ffe030-5f6e-3b18-aedb-2b4967cf65cd}
    @Test()
    public void of1WhenScriptPatternNotIsP2PKRedeemScriptAndKeyIsNull() {
        /* Branches:
         * (ScriptPattern.isP2PKH(redeemScript)) : false
         * (ScriptPattern.isP2WPKH(redeemScript)) : false
         * (ScriptPattern.isP2PK(redeemScript)) : false
         * (key != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey eCKey = null;
            //Act Statement(s)
            RedeemData result = RedeemData.of(eCKey, scriptMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${77e13cd6-1234-3825-a6d6-fbe955b16476}
    @Test()
    public void getFullKeyWhenKeyHasPrivKey() {
        /* Branches:
         * (for-each(keys)) : true
         * (key.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        doReturn(true).when(keyMock).hasPrivKey();
        List<ECKey> eCKeyList = new ArrayList<>();
        eCKeyList.add(keyMock);
        RedeemData target = RedeemData.of(eCKeyList, scriptMock);

        //Act Statement(s)
        ECKey result = target.getFullKey();

        //Assert statement(s)
        assertThat(result, equalTo(keyMock));
        verify(keyMock).hasPrivKey();
    }

    //Sapient generated method id: ${e1e7700b-5003-37c3-b94d-2e0e095620f2}
    @Test()
    public void getFullKeyWhenKeyNotHasPrivKey() {
        /* Branches:
         * (for-each(keys)) : true
         * (key.hasPrivKey()) : false
         */
        //Arrange Statement(s)
        doReturn(false).when(keyMock).hasPrivKey();
        List<ECKey> eCKeyList = new ArrayList<>();
        eCKeyList.add(keyMock);
        RedeemData target = RedeemData.of(eCKeyList, scriptMock);

        //Act Statement(s)
        ECKey result = target.getFullKey();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(keyMock).hasPrivKey();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ECKey> eCKeyList = new ArrayList<>();
        RedeemData target = RedeemData.of(eCKeyList, scriptMock);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
    }
}
