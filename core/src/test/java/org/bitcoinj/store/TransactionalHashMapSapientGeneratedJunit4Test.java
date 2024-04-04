package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;

public class TransactionalHashMapSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${b04b432f-9970-393b-8e0a-3f02a386d3be}, hash: 852F0D5E805BA4B0026E32E08E3C44C0
    @Test()
    public void beginDatabaseBatchWriteTest() {
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();

        //Act Statement(s)
        target.beginDatabaseBatchWrite();
    }

    //Sapient generated method id: ${d4f282c8-2d73-371b-881f-8fee7262abc6}, hash: 69BE97AA794C2A66CB30871EE9D52D35
    @Test()
    public void commitDatabaseBatchWriteWhenTempMapGetIsNull() {
        /* Branches:
         * (tempSetRemoved.get() != null) : false
         * (tempMap.get() != null) : false
         */
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();

        //Act Statement(s)
        target.commitDatabaseBatchWrite();
    }

    //Sapient generated method id: ${bb5143f8-c902-349e-b57f-69694a4394f7}, hash: C5C2BCB75C57A3A84520504FCF5CAF00
    @Test()
    public void abortDatabaseBatchWriteTest() {
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();

        //Act Statement(s)
        target.abortDatabaseBatchWrite();
    }

    //Sapient generated method id: ${09c48173-d0fd-33c3-a484-bf49cec49755}, hash: 6A729D5107854590F8CABFA6EADC581B
    @Test()
    public void getWhenBooleanTRUENotEqualsInTransactionGet() {
        /* Branches:
         * (Boolean.TRUE.equals(inTransaction.get())) : false
         */
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();
        Object object = new Object();

        //Act Statement(s)
        Object result = target.get(object);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${128d10a9-2c9d-313e-bc92-47cc4bf4101f}, hash: 5DB2AAAEA4CD636D8425C6F88BACF725
    @Test()
    public void valuesWhenMapKeySetIsEmpty() {
        /* Branches:
         * (for-each(map.keySet())) : false
         */
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();

        //Act Statement(s)
        List<Object> result = target.values();

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${ed293257-f31e-37b7-a18b-dd304c20ac98}, hash: DD017F12530B1B6580CBB8BEA195F4E4
    @Test()
    public void putWhenBooleanTRUENotEqualsInTransactionGet() {
        /* Branches:
         * (Boolean.TRUE.equals(inTransaction.get())) : false
         */
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        target.put(object, object2);
    }

    //Sapient generated method id: ${09c5c3af-53e2-3d13-bb45-99580e95ea15}, hash: 376ADACA6E970A5ED6294E81B476A719
    @Test()
    public void removeWhenBooleanTRUENotEqualsInTransactionGet() {
        /* Branches:
         * (Boolean.TRUE.equals(inTransaction.get())) : false
         */
        //Arrange Statement(s)
        TransactionalHashMap<Object, Object> target = new TransactionalHashMap<>();
        Object object = new Object();

        //Act Statement(s)
        Object result = target.remove(object);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
