package csc143.data_structures;

/**
 * MyUnboundedStack -- implements an unbounded stack data structure using a linked list
 * @author evankoh
 * @version csc143 -- HW5
 */
public class MyUnboundedStack implements UnboundedStack {

	// fields
	
    protected int capacity;
    protected StackHelper temp;
	
    // constructor
    
    /**
     * constructs new MyUnboundedStack object
     */
	public MyUnboundedStack() {
        temp = null;
        capacity = 0;
	}

	/**
	 * push -- pushes an element to the stack
	 * @param o -- object to be pushed
	 */
	@Override
	public void push(Object o) {
        StackHelper tmp1 = new StackHelper (o, null);
        if (temp == null)
            temp = tmp1;
        else
        {
            tmp1.setLink(temp);
            temp = tmp1;
        }
        capacity++ ;
	}

	/**
	 * pop -- pops an element from the stack
	 */
	@Override
	public Object pop() throws Underempty {
		if (hasStuff() )
            throw new Underempty("stack already empty exception") ;
        StackHelper ptr = temp;
        temp = ptr.getLink();
        capacity-- ;
        return ptr.getData();
	}

	/**
	 * peek -- checks the first element of the stack
	 */
	@Override
	public Object peek() throws Underempty {
        if (hasStuff() )
            throw new Underempty("stack already empty exception") ;
        return temp.getData();
	}

	/**
	 * hasStuff -- checks to see if the stack is empty
	 */
	@Override
	public boolean hasStuff() {
		 return temp == null;
	}
}

/*
 * Helper class used to determine placement in the linked list
 */
class StackHelper {
	// fields
    protected Object data;
    protected StackHelper tmp;

    // constructors
    public StackHelper() {
        tmp = null;
        data = 0;
    }    

    // methods
    public StackHelper(Object d,StackHelper n) {
        data = d;
        tmp = n;
    }    
    
    public void setLink(StackHelper n) {
        tmp = n;
    }    

    public void setData(int d) {
        data = d;
    }    
    
    public StackHelper getLink() {
        return tmp;
    }   
    
    public Object getData() {
        return data;
    }
}
