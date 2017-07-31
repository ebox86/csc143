package csc143.data_structures;

public interface UnboundedQueue {
    public void add(Object o); 
    public Object remove() throws Underempty; 
    public Object peek() throws Underempty;
    public boolean hasStuff();
}