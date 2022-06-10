package generics.exceptions;

public class FullQueueException extends RuntimeException{
    public FullQueueException() {
        super("Full queue - cannot perform operation");
    }
}
