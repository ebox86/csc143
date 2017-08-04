package csc143.data_structures;

/**
 * MyUnboundedQueue -- implements an unbounded queue data structure using a linked list
 * @author evankoh
 * @version csc143 -- HW5
 */
public class MyUnboundedQueue implements UnboundedQueue {

	// fields
	
    protected QueueHelper front, rear;
    public int size;
	
    // constructor
    
	public MyUnboundedQueue() {
        front = null;
        rear = null;
        size = 0;
	}

	// methods
	
	/**
	 * add -- adds an element to the queue
	 * @param o -- the Object to be added
	 */
	@Override
	public void add(Object o) {
        QueueHelper nptr = new QueueHelper(o, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++ ;
	}

	/**
	 * remove -- removes an element from the queue
	 * @throws Underempty -- thrown if the queue is already empty
	 */
	@Override
	public Object remove() throws Underempty {
		if (hasStuff() )
            throw new Underempty("queue already empty exception");
        QueueHelper ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size-- ;        
        return ptr.getData();
	}

	/**
	 * peek -- checks the first element in the queue
	 * @throws Underempty -- thrown if queue is already empty
	 */
	@Override
	public Object peek() throws Underempty {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * hasStuff -- checks to see if the queue is empty or not
	 */
	@Override
	public boolean hasStuff() {
		return front == null;
	}

}

/*
 * Helper class used to determine placement in the linked list
 */
class QueueHelper {
	
	// fields
    
	protected Object data;
    protected QueueHelper tmp;

    // constructors
    
    public QueueHelper() {
        tmp = null;
        data = 0;
    }    

    // methods
    
    public QueueHelper(Object d,QueueHelper n) {
        data = d;
        tmp = n;
    }    
    
    public void setLink(QueueHelper n) {
        tmp = n;
    }    

    public void setData(int d) {
        data = d;
    }    
    
    public QueueHelper getLink() {
        return tmp;
    }   
    
    public Object getData() {
        return data;
    }
}
