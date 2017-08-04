package csc143.data_structures;

/**
 * Underempty -- exception to throw when storage of stack or queue is empty
 * @author Evan Kohout
 * @version csc143
 */
@SuppressWarnings("serial")
public class Underempty extends java.lang.Exception {
    public Underempty(String msg) {
        super(msg);
    }
}