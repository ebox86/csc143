package csc143.data_structures;
/**
 * UnboundedStack -- interface for an unbounded stack data structure
 * 
 * includes all standard functions for interfacing with a stack
 * @author Evan Kohout
 * @version csc143 -- HW5
 *
 */
public interface UnboundedStack {
    public void push(Object o);
    public Object pop() throws Underempty;
    public Object peek() throws Underempty;
    public boolean hasStuff();
}