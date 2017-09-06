package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger() {
        Logger.getInstance().log("Doing sth");
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("Doing sth", lastLog);
    }
}
