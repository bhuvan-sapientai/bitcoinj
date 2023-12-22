package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.Stopwatch;

import java.util.concurrent.TimeUnit;

import org.mockito.MockedStatic;

import java.io.File;
import java.util.Optional;
import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

public class WalletFilesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Wallet walletMock = mock(Wallet.class, "wallet");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${33d93db6-b323-3f6d-961d-10c273404938}
    @Test()
    public void setListenerTest() {
        //Arrange Statement(s)
        File file = new File("pathname1");
        WalletFiles target = new WalletFiles(walletMock, file, 0L, TimeUnit.NANOSECONDS);
        WalletFiles.Listener walletFilesListenerMock = mock(WalletFiles.Listener.class);
        //Act Statement(s)
        target.setListener(walletFilesListenerMock);
    }

    //Sapient generated method id: ${64f96677-f12b-3bca-9163-3f25ee0bdc58}
    @Ignore()
    @Test()
    public void saveNowWhenDirectoryNotExistsThrowsFileNotFoundException() throws IOException {
        /* Branches:
         * (executor.isShutdown()) : false
         * (!directory.exists()) : true  #  inside saveNowInternal method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("");
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            File file = new File("pathname1");
            WalletFiles target = new WalletFiles(walletMock, file, 5L, TimeUnit.SECONDS);
            doReturn(0).when(walletMock).getLastBlockSeenHeight();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(walletMock).getLastBlockSeenHash();
            File file2 = new File("pathname1");
            doNothing().when(walletMock).saveToFile(eq(file2), (File) any());
            //Act Statement(s)
            target.saveNow();
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            verify(walletMock).getLastBlockSeenHeight();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getLastBlockSeenHash();
            verify(walletMock).saveToFile(eq(file2), (File) any());
        }
    }

    //Sapient generated method id: ${ccb4660a-47a2-3fea-bd8e-57462e7fddb8}
    @Ignore()
    @Test()
    public void saveNowWhenListenerIsNull() throws IOException {
        /* Branches:
         * (executor.isShutdown()) : false
         * (!directory.exists()) : false  #  inside saveNowInternal method
         * (listener != null) : false  #  inside saveNowInternal method
         * (listener != null) : false  #  inside saveNowInternal method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("String");
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            File file = new File("pathname1");
            WalletFiles target = new WalletFiles(walletMock, file, 0L, TimeUnit.MILLISECONDS);
            doReturn(0).when(walletMock).getLastBlockSeenHeight();
            Instant instant = Instant.now();
            doReturn(Optional.of(instant)).when(walletMock).lastBlockSeenTime();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(walletMock).getLastBlockSeenHash();
            File file2 = new File("pathname1");
            doNothing().when(walletMock).saveToFile(eq(file2), (File) any());
            //Act Statement(s)
            target.saveNow();
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            verify(walletMock).getLastBlockSeenHeight();
            verify(walletMock).lastBlockSeenTime();
            verify(walletMock).getLastBlockSeenHash();
            verify(walletMock).saveToFile(eq(file2), (File) any());
        }
    }

    //Sapient generated method id: ${0524be10-41b8-3186-bf70-4ef597746e8d}
    @Ignore()
    @Test()
    public void saveLaterWhenSavePendingNotGetAndSetTrue() {
        /* Branches:
         * (executor.isShutdown()) : false
         * (savePending.getAndSet(true)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        WalletFiles target = new WalletFiles(walletMock, file, 1L, TimeUnit.SECONDS);
        //Act Statement(s)
        target.saveLater();
    }

    //Sapient generated method id: ${7b5fac9d-b61e-36a3-89f5-75f3af2d86ec}
    @Ignore(value = "Potential harmful system call (ScheduledThreadPoolExecutor.shutdown, ScheduledThreadPoolExecutor.awaitTermination) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void shutdownAndWaitTest() throws InterruptedException {
        //Arrange Statement(s)
        File file = new File("pathname1");
        WalletFiles target = new WalletFiles(walletMock, file, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        target.shutdownAndWait();
    }

    //Sapient generated method id: ${cf21a120-9078-3942-99d4-3742d3b48a91}
    @Ignore(value = "Potential harmful system call (ScheduledThreadPoolExecutor.shutdown, ScheduledThreadPoolExecutor.awaitTermination) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void shutdownAndWaitWhenCaughtInterruptedExceptionThrowsRuntimeException() throws InterruptedException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        WalletFiles target = new WalletFiles(walletMock, file, 5L, TimeUnit.SECONDS);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(InterruptedException.class));
        //Act Statement(s)
        target.shutdownAndWait();
    }
}
