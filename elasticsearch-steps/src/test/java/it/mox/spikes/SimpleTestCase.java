package it.mox.spikes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SimpleTestCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTestCase.class);

    @Test
    public void testName() throws Exception {
        LOGGER.info("it runs");
        assertTrue(true);
    }
}
