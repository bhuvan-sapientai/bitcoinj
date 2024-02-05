package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class TransactionalMultiKeyHashMapSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionalHashMap<Object, Object> mapValuesMock = mock(TransactionalHashMap.class, "mapValues");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private TransactionalMultiKeyHashMap<Object, Object, Object> target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${f2580bf9-57c5-38b8-b003-ac7734507635}
    @Test()
    public void BeginTransactionTest() {
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.BeginTransaction();
    }

    //Sapient generated method id: ${634b31cf-7a2f-3f9b-9203-5127ac44586f}
    @Test()
    public void CommitTransactionTest() {
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.CommitTransaction();
    }

    //Sapient generated method id: ${a1e67f11-404f-33fa-aa6c-c1875a1a5c52}
    @Test()
    public void AbortTransactionTest() {
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.AbortTransaction();
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Ignore()
    @Test()
    public void getTest() {
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object2 = new Object();
        Object object = mapValuesMock.get(object2);
        doReturn(object).when(mapValuesMock).get(object2);
        //Act Statement(s)
        Object result = target.get(object2);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(mapValuesMock).get(object2);
    }

    //Sapient generated method id: ${41653620-2a9b-3c46-8b79-25f8bbf36c23}
    @Test()
    public void putWhenSetIsNull() {
        /* Branches:
         * (set == null) : true
         */
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        Object object2 = new Object();
        doNothing().when(mapValuesMock).put(object, object2);
        Object object3 = new Object();
        //Act Statement(s)
        target.put(object, object3, object2);
        //Assert statement(s)
        verify(mapValuesMock).put(object, object2);
    }

    //Sapient generated method id: ${bb9c92a1-f34a-3b3a-9997-40367ebee9ef}
    @Ignore()
    @Test()
    public void removeByUniqueKeyTest() {
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object2 = new Object();
        Object object = mapValuesMock.remove(object2);
        doReturn(object).when(mapValuesMock).remove(object2);
        //Act Statement(s)
        Object result = target.removeByUniqueKey(object2);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(mapValuesMock).remove(object2);
    }

    //Sapient generated method id: ${93a37ec3-b3bf-348f-9153-ae969a5fb211}
    @Test()
    public void removeByMultiKeyWhenSetIsNull() {
        /* Branches:
         * (set != null) : false
         */
        //Arrange Statement(s)
        target = new TransactionalMultiKeyHashMap<>();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        //Act Statement(s)
        target.removeByMultiKey(object);
    }
}
