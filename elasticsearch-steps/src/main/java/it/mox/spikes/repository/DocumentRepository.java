package it.mox.spikes.repository;

import it.mox.spikes.domain.Document;
import org.elasticsearch.client.Client;

/**
 * @author Matteo Moci ( matteo (dot) moci (at) gmail (dot) com )
 */
public class DocumentRepository implements Repository<String, Document> {

    private final Client client;

    public DocumentRepository(final Client client) {

        this.client = client;
    }

    @Override
    public void store(final Document entity) {
        //
    }

    @Override
    public Document getById(final String id) {

        throw new UnsupportedOperationException("not implemented yet");

    }
}
