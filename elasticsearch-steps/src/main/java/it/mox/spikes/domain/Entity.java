package it.mox.spikes.domain;

/**
 * @author Matteo Moci ( matteo (dot) moci (at) gmail (dot) com )
 */
public interface Entity<T> {

    boolean sameEntityAs(T other);

}
