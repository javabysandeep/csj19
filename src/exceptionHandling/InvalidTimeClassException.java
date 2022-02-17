package exceptionHandling;

/*This is a checked exception which has to be handled at compile time.*/
public class InvalidTimeClassException extends Exception {
    InvalidTimeClassException() {
        super();
    }

    InvalidTimeClassException(String message) {
        super(message);
    }
}