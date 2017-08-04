package csc143.data_structures;

/**
 * MyBoundedQueue -- creates a queue data structure as an implementation of BoundedQueue
 * @author Evan Kohout
 * @version csc143 -- HW5
 */
public class MyBoundedQueue implements BoundedQueue {

	// fields
	
    protected Object Queue[] ;
    protected int front, rear, capacity, len;
	
    // constructors
    
	/**
	 * default constructor -- creates new MyBoundedQueue with size 10
	 */
	public MyBoundedQueue() {
        capacity = 10;
        len = 0;
        Queue = new Object[capacity];
        front = -1;
        rear = -1;
	}
	
	/**
	 * Constructor used to created a new MyBoundedQueue object with size specified
	 * @param size -- the size of the queue
	 */
	public MyBoundedQueue(int size){
        this.capacity = size;
        len = 0;
        Queue = new Object[size];
        rear = -1;
        front = -1;
	}

	// methods
	
	/**
	 * add -- adds
	 */
	@Override
	public void add(Object o) throws Overfill {
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = o;
        }
        else if (rear + 1 >= capacity)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < capacity)
            Queue[++rear] = o;    
        len++ ;  
	}

	/**
	 * remove -- removes an object from the queue
	 * @throws Underempty -- thrown if queue is empty
	 */
	@Override
	public Object remove() throws Underempty {
		 if (hasRoom())
	           throw new Underempty("queue empty exception");
	        else 
	        {
	            len-- ;
	            Object ele = Queue[front];
	            if ( front == rear) 
	            {
	                front = -1;
	                rear = -1;
	            }
	            else
	                front++;                
	            return ele;
	        }        
	}

	/**
	 * peek -- checks the first element of the queue
	 * @throws Underempty -- thrown if the queue is empty
	 */
	@Override
	public Object peek() throws Underempty {
	       if (hasRoom())
	           throw new Underempty("queue empty exception");
	        return Queue[front];
	}

	/**
	 * hasStuff -- checks to see if the queue is full or not
	 */
	@Override
	public boolean hasStuff() {
		return front == 0 && rear == capacity -1 ;
	}

	/**
	 * hasRoom -- checks to see if the queue is empty or not
	 */
	@Override
	public boolean hasRoom() {
		return front == -1;
	}

}
