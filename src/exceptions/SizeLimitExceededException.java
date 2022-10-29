package exceptions;

public class SizeLimitExceededException extends Exception {

    public SizeLimitExceededException(String message) {
        super(message);
    }
}
