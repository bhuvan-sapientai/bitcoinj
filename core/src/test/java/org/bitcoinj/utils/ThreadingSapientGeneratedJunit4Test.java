package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
import org.mockito.MockedStatic;

import java.util.concurrent.locks.ReentrantLock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class ThreadingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${854b3f0b-2915-393d-9545-bcce0ce2d7ea}, hash: 310A2C1253560A760655ACA23D0D0848
    @Ignore(value = "Potential harmful system call (CompletableFuture.join) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForUserCodeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.join) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.waitForUserCode();
    }

    //Sapient generated method id: ${df989bdd-bf46-3e9a-9d63-d54a2b5bf6c3}, hash: 112B82153D09B29C58DB71A146DE4D0C
    @Test()
    public void lockTest() {
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock("Object lock")).thenReturn(reentrantLock);
            //Act Statement(s)
            ReentrantLock result = Threading.lock(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(reentrantLock));
            threading.verify(() -> Threading.lock("Object lock"), atLeast(1));
        }
    }

    //Sapient generated method id: ${c8797ac2-3ff2-3636-b136-78c3f8e09094}, hash: AE63E25D055F3B8558D9A0AD5B86EA20
    @Test()
    public void lock1WhenPlatformUtilsNotIsAndroidRuntime() {
        /* Branches:
         * (PlatformUtils.isAndroidRuntime()) : false
         */

        //Act Statement(s)
        ReentrantLock result = Threading.lock("A");

        //Assert statement(s)
        //TODO: Please implement equals method in ReentrantLock for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c709ef01-e2a5-3bd3-a000-165e7ea4587b}, hash: 037B352D5EFF3D69A5290FCA9F42D6D2
    @Test()
    public void warnOnLockCyclesTest() {

        //Act Statement(s)
        Threading.warnOnLockCycles();
    }

    //Sapient generated method id: ${1b7c8f1c-c415-3464-8cb6-3edf54bfde7c}, hash: FBCEF2E5520C3F62CEDE70E3D2E5AE71
    @Test()
    public void throwOnLockCyclesTest() {

        //Act Statement(s)
        Threading.throwOnLockCycles();
    }

    //Sapient generated method id: ${5ce10835-ac42-3f12-8f8f-0f4ad46215c3}, hash: 85409AD3C11DDF59228FEF2AC85C0198
    @Test()
    public void ignoreLockCyclesTest() {

        //Act Statement(s)
        Threading.ignoreLockCycles();
    }

    //Sapient generated method id: ${fe424d28-b206-364e-b0bc-652243091ec0}, hash: BBC926BD6146ADB2032EC52199AB3BC0
    @Test()
    public void setPolicyTest() {

        //Act Statement(s)
        Threading.setPolicy(CycleDetectingLockFactory.Policies.THROW);

        //Assert statement(s)
        assertThat(Threading.getPolicy(), equalTo(CycleDetectingLockFactory.Policies.THROW));
    }

    //Sapient generated method id: ${24082d81-f972-3165-924d-5598e3d763e8}, hash: B5BF7D79BBFFCB2DA2C10F2434EFB8D4
    @Test()
    public void getPolicyTest() {

        //Act Statement(s)
        CycleDetectingLockFactory.Policy result = Threading.getPolicy();

        //Assert statement(s)
        assertThat(result, equalTo(CycleDetectingLockFactory.Policies.THROW));
    }
}
