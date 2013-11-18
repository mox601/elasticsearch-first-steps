package it.mox.spikes;

import com.github.tlrx.elasticsearch.test.EsSetup;
import it.mox.spikes.repository.DocumentRepository;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class SimpleTestCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTestCase.class);

    private EsSetup esSetup;

    private DocumentRepository documentRepository;

    @BeforeClass
    public void setUp() throws Exception {

        //start a node
        final Settings localNodeSettings = null;
        this.esSetup = new EsSetup(localNodeSettings);

        //get a transport client
        final Client client = this.esSetup.client();
        //use client in persistence layer
        this.documentRepository = new DocumentRepository(client);
        assertNotNull(this.documentRepository);

    }

    @BeforeMethod
    public void beforeMethod() throws Exception {

        deleteAllIndices();

        putMappings();

    }

    private void deleteAllIndices() {


    }

    private void putMappings() {

    }

    @Test
    public void testName() throws Exception {

        LOGGER.info("it runs!");
        assertTrue(true);

    }
}
