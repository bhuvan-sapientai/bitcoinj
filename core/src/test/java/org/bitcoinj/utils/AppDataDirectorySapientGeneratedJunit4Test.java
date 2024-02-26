package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.mockito.MockedStatic;

import java.nio.file.FileSystem;
import java.nio.file.attribute.FileAttribute;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class AppDataDirectorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Path pathMock = mock(Path.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Test()
    public void getTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<AppDataDirectory> appDataDirectory = mockStatic(AppDataDirectory.class, CALLS_REAL_METHODS)) {
            appDataDirectory.when(() -> AppDataDirectory.getPath("appName1")).thenReturn(pathMock);
            //Act Statement(s)
            Path result = AppDataDirectory.get("appName1");
            //Assert statement(s)
            assertThat(result, equalTo(pathMock));
            appDataDirectory.verify(() -> AppDataDirectory.getPath("appName1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${20c68a61-efbf-31e7-b8b9-821fdb9fe6d2}
    @Test()
    public void getWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
             MockedStatic<AppDataDirectory> appDataDirectory = mockStatic(AppDataDirectory.class, CALLS_REAL_METHODS)) {
            appDataDirectory.when(() -> AppDataDirectory.getPath("appName1")).thenReturn(pathMock);
            IOException iOException = new IOException();
            FileAttribute[] fileAttributeArray = new FileAttribute[]{};
            files.when(() -> Files.createDirectories(pathMock, fileAttributeArray)).thenThrow(iOException);
            RuntimeException runtimeException = new RuntimeException("Couldn't find/create AppDataDirectory", iOException);
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            thrown.expectCause(is(instanceOf(IOException.class)));
            //Act Statement(s)
            AppDataDirectory.get("appName1");
            //Assert statement(s)
            appDataDirectory.verify(() -> AppDataDirectory.getPath("appName1"), atLeast(1));
            files.verify(() -> Files.createDirectories(pathMock, fileAttributeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${90565fd9-3e20-331a-9d8d-3e800d694f2e}
    @Test()
    public void getPathWhenPlatformUtilsIsLinux() {
        /* Branches:
         * (PlatformUtils.isWindows()) : false
         * (PlatformUtils.isMac()) : false
         * (PlatformUtils.isLinux()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Path result = AppDataDirectory.getPath("A");
        FileSystem fileSystem = FileSystems.getDefault();
        String[] stringArray = new String[]{".a"};
        Path path = fileSystem.getPath("B", stringArray);

        //Assert statement(s)
        assertThat(result, equalTo(path));
    }
}
