package csc143.data_structures;
/**
 * BoundedStack -- interface for a bounded stack data structure
 * 
 * includes all standard functions for interfacing with a stack
 * @author Evan Kohout
 * @version csc143 -- HW5
 *
 */
public interface BoundedStack {
    public void push(Object o) throws Overfill;
    public Object pop() throws Underempty;
    public Object peek() throws Underempty;
    public boolean hasStuff();
    public boolean hasRoom();
}