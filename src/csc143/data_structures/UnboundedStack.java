package csc143.data_structures;

public interface UnboundedStack {
    public void push(Object o);
    public Object pop() throws Underempty;
    public Object peek() throws Underempty;
    public boolean hasStuff();
}