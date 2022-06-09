package generics.exceptions;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException() {
        super("Empty stack - cannot perform operation");
    }
}
