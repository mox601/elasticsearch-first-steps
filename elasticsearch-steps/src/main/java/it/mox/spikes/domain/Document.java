package it.mox.spikes.domain;

/**
 * @author Matteo Moci ( matteo (dot) moci (at) gmail (dot) com )
 */
public class Document implements Entity<String, Document> {

    private final String id;

    public Document(final String actual) {

        this.id = actual;
    }

    @Override
    public String getId() {

        return this.id;
    }

    public int doSmth() {
        return 5;
    }

    @Override
    public boolean sameIdentityAs(final Document other) {

        return id.equals(other.getId());
    }
}
