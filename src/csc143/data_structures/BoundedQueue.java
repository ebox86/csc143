package csc143.data_structures;
/**
 * BoundedQueue -- interface for a bounded queue data structure
 * 
 * includes all standard functions for interfacing with a queue
 * @author Evan Kohout
 * @version csc143 -- HW5
 *
 */
public interface BoundedQueue {
    public void add(Object o) throws Overfill; 
    public Object remove() throws Underempty; 
    public Object peek() throws Underempty;
    public boolean hasStuff();
    public boolean hasRoom();
}