package it.mox.spikes.domain;

/**
 * @author Matteo Moci ( matteo (dot) moci (at) gmail (dot) com )
 */
public class Document implements Entity<Document> {

    private final String id;

    public Document(final String id) {

        this.id = id;
    }

    public String getId() {

        return id;
    }

    @Override
    public boolean sameEntityAs(Document other) {

        return this.id.equals(other.getId());
    }
}
