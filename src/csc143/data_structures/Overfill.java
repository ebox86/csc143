package csc143.data_structures;

/**
 * Overfill -- exception to throw when storage of stack or queue is full
 * @author Evan Kohout
 * @version csc143
 */
@SuppressWarnings("serial")
public class Overfill extends java.lang.Exception {
    public Overfill(String msg) {
        super(msg);
    }
}