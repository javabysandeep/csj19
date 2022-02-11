package exceptionHandling;

public class ExceptionDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3/0);
        System.out.println(4);
        System.out.println(5);

        ExceptionDemo1 e1 = new ExceptionDemo1();
        ExceptionDemo1 clone = (ExceptionDemo1) e1.clone();
    }
}
