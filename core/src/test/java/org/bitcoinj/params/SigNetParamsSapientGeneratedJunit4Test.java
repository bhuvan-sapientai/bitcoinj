package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import org.bitcoinj.core.Block;
import org.bitcoinj.base.internal.Preconditions;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class SigNetParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block genesisBlockMock = mock(Block.class, "genesisBlock");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SigNetParams target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }
}
