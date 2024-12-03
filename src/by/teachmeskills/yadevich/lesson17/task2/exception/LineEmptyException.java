package by.teachmeskills.yadevich.lesson17.task2.exception;

public class LineEmptyException extends Exception{
    private int exceptionCode;

    public LineEmptyException(String message, int exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }
}
