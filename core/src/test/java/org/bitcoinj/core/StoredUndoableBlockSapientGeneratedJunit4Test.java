package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.junit.Ignore;

public class StoredUndoableBlockSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        TransactionOutputChanges transactionOutputChanges = new TransactionOutputChanges(list, list2);
        StoredUndoableBlock target = new StoredUndoableBlock(sha256Hash, transactionOutputChanges);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Undoable Block A"));
    }
}
