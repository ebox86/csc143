package csc143.data_structures;

/**
 * A subinterface of BasicMap for the Map Assignment, Standard Version. 
 * <p>
 * This interface enhances the functionality of the map by providing some 
 * additional standard map operations.
 * @author Dan
 */
public interface StandardMap<K, V> extends BasicMap<K, V> {
    
    /**
     * Returns true if the current map contains a mapping for the
     * specified key.
     * @param key The key whose presence in the map is being tested.
     * @return true if this map contains a mapping for the specified
     * key.
     */
    public boolean containsKey(Object key);
    
    /**
     * Returns true if the current map contains one or more
     * keys mapped to the specified value.
     * @param value The value whose presence in the current 
     * map is being tested.
     * @return true if the current map contains one or more
     * keys mapped to the specified value.
     */
    public boolean containsValue(Object value);
    
    /**
     * Returns the number of key-value mappings in this map
     * @return The number of key-value mappings in this map
     */
    public int size();
    
    /**
     * Returns a string representation of this map. The string 
     * representation consists of a list of key-value mappings 
     * in pre-order traversal of the tree, enclosed in braces ("{}"). 
     * Adjacent mappings are separated by the characters ", " 
     * (comma and space). Each key-value mapping is rendered as the 
     * key followed by an equals sign ("=") followed by the associated 
     * value. Keys and values are converted to strings as by 
     * String.valueOf(Object).
     * @return A String representation of the key-value pairs in the
     * current map
     */
    public String toString();
}
