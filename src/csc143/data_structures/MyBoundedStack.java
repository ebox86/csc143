package csc143.data_structures;

/**
 * MyBoundedStack -- creates a queue data structure as an implementation of BoundedStack
 * @author Evan Kohout
 * @version csc143 -- HW5
 */
public class MyBoundedStack implements BoundedStack {

	//fields
	
	protected Object arr[];
	protected int capacity, len, top;
	
	// constructors
	
	/**
	 * default constructor -- creates new MyBoundedStack with size 10
	 */
	public MyBoundedStack() {
		capacity = 10;
		len = 0;
		arr = new Object[this.capacity];
		top = -1;
	}
	
	/**
	 * Constructor used to created a new MyBoundedStack object with size specified
	 * @param capacity -- the size of the stack
	 */
	public MyBoundedStack(int n){
		this.capacity = n;
		len = 0;
		arr = new Object[this.capacity];
		top = -1;
	}

	// methods
	
	/**
	 * push -- pushes an object to the stack
	 * @param o -- object to be pushed
	 * @throws Overfill -- thrown if stack is already full
	 */
	@Override
	public void push(Object o) throws Overfill {
		if(top + 1 >= capacity)
            throw new Overfill("Stack full exception");
        if(top + 1 < capacity )
            arr[++top] = o;
        len++;
	}

	/**
	 * pop -- deletes or removes an element from the stack
	 * @throws Underempty -- thrown if stack is already empty
	 */
	@Override
	public Object pop() throws Underempty {
        if( hasRoom() )
            throw new Underempty("stack empty exception");
        len-- ;
        return arr[top--]; 
	}

	/**
	 * peek -- checks the top of the element on the stack
	 * @throws Underempty -- thrown when the stack is already empty
	 */
	@Override
	public Object peek() throws Underempty {
        if( hasStuff() )
            throw new Underempty("stack empty exception");
        return arr[top];
	}

	/**
	 * hasStuff -- checks to see if the stack is empty
	 * 
	 */
	@Override
	public boolean hasStuff() {
		return top == -1;
	}

	/**
	 * hasRoom -- checks to see if the stack has room
	 */
	@Override
	public boolean hasRoom() {
		return top == capacity -1 ;
	}

}
