package csc143.data_structures;

/**
 * A subinterface of BasicMap for the Map Assignment, Standard Version. 
 * <p>
 * This interface enhances the functionality of the map by providing some 
 * additional standard map operations.
 * @author Dan
 */
public interface BetterMap<K, V> extends StandardMap<K, V> {
    
    /**
     * Remove the mapping for the specified key from this map
     * if present. Returns the value to which the specified key
     * was mapped, null if the current map contains no mapping 
     * for the specified key.
     * @param key The key whose mapping is to be removed from 
     * the map.
     * @return The value associated with the key, or null if the
     * map contained no mapping for the key.
     */
    public V remove(Object key);
    
}
