package by.teachmeskills.yadevich.lesson17.task1.exception;

public class InvalidInputNumberException extends Exception{
    private int exceptionCode;

    public InvalidInputNumberException(String message, int exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }
}
