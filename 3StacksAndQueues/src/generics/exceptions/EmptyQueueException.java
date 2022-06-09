package generics.exceptions;

public class EmptyQueueException extends RuntimeException{

    public EmptyQueueException() {
        super("Empty queue - unable to perform operation");
    }
}
