package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger() {
        Logger.getInstance().log("Doing sth");
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("Doing sth", lastLog);
    }

    @Test
    public void testLogger2() {
        Logger testLogger = Logger.getInstance();
        testLogger.log("Doing sth");
        String lastLog = testLogger.getLastLog();
        Assert.assertEquals("Doing sth", lastLog);
    }
}
