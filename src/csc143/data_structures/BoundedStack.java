package csc143.data_structures;

public interface BoundedStack {
    public void push(Object o) throws Overfill;
    public Object pop() throws Underempty;
    public Object peek() throws Underempty;
    public boolean hasStuff();
    public boolean hasRoom();
}