package csc143.data_structures;

public interface BoundedQueue {
    public void add(Object o) throws Overfill; 
    public Object remove() throws Underempty; 
    public Object peek() throws Underempty;
    public boolean hasStuff();
    public boolean hasRoom();
}