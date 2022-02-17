package exceptionHandling;

public class CustomExceptionDemo {
    public static void main(String[] args) throws InvalidTimeClassException {
        int time  = 10;
        if(time <= 1){
            throw  new InvalidTimeClassException("sir class morning mai lo");
        }
        System.out.println("rest of the code");
    }
}
