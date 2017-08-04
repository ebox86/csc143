package csc143.data_structures;
/**
 * UnboundedQueue -- interface for an unbounded queue data structure
 * 
 * includes all standard functions for interfacing with a queue
 * @author Evan Kohout
 * @version csc143 -- HW5
 *
 */
public interface UnboundedQueue {
    public void add(Object o); 
    public Object remove() throws Underempty; 
    public Object peek() throws Underempty;
    public boolean hasStuff();
}