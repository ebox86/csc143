package csc143.data_structures;

/**
 * A subinterface of BasicMap for the Map Assignment, Challenge version. 
 * <p>
 * With this interface, the map now becomes iterable.
 * @author Dan
 */
public interface ImprovedMap<K, V> extends StandardMap<K, V> {
    
    /**
     * Returns an iterator on set of the keys for this map.
     * @return An iterator over the keys for the current map.
     */
    public SimpleIterator<K> keyIterator();
    
}
