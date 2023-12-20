package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;
import org.bitcoinj.base.internal.PlatformUtils;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
import org.mockito.MockedStatic;

import java.util.concurrent.locks.ReentrantLock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class ThreadingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${854b3f0b-2915-393d-9545-bcce0ce2d7ea}
    @Ignore(value = "Potential harmful system call (CompletableFuture.join) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForUserCodeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.waitForUserCode();
    }

    //Sapient generated method id: ${df989bdd-bf46-3e9a-9d63-d54a2b5bf6c3}
    @Test()
    public void lockTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
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

    //Sapient generated method id: ${c8797ac2-3ff2-3636-b136-78c3f8e09094}
    @Test()
    public void lock1WhenPlatformUtilsNotIsAndroidRuntime() {
        /* Branches:
         * (PlatformUtils.isAndroidRuntime()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class)) {
            platformUtils.when(() -> PlatformUtils.isAndroidRuntime()).thenReturn(false);
            //Act Statement(s)
            ReentrantLock result = Threading.lock("non-android");
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.newInstance(CycleDetectingLockFactory.Policies.THROW);
            ReentrantLock reentrantLock = cycleDetectingLockFactory.newReentrantLock("non-android");
            //Assert statement(s)
            //TODO: Please implement equals method in ReentrantLock for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(reentrantLock));
            platformUtils.verify(() -> PlatformUtils.isAndroidRuntime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c709ef01-e2a5-3bd3-a000-165e7ea4587b}
    @Test()
    public void warnOnLockCyclesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.warnOnLockCycles();
    }

    //Sapient generated method id: ${1b7c8f1c-c415-3464-8cb6-3edf54bfde7c}
    @Test()
    public void throwOnLockCyclesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.throwOnLockCycles();
    }

    //Sapient generated method id: ${5ce10835-ac42-3f12-8f8f-0f4ad46215c3}
    @Test()
    public void ignoreLockCyclesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.ignoreLockCycles();
    }

    //Sapient generated method id: ${fe424d28-b206-364e-b0bc-652243091ec0}
    @Test()
    public void setPolicyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Threading.setPolicy(CycleDetectingLockFactory.Policies.THROW);

        //Assert statement(s)
        assertThat(Threading.getPolicy(), equalTo(CycleDetectingLockFactory.Policies.THROW));
    }

    //Sapient generated method id: ${24082d81-f972-3165-924d-5598e3d763e8}
    @Test()
    public void getPolicyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        CycleDetectingLockFactory.Policy result = Threading.getPolicy();

        //Assert statement(s)
        assertThat(result, equalTo(CycleDetectingLockFactory.Policies.THROW));
    }
}
