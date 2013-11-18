package it.mox.spikes.repository;

/**
 * @author Matteo Moci ( matteo (dot) moci (at) gmail (dot) com )
 */
public interface Repository<ID, T> {

    void store(T entity);

    T getById(ID id);

}
