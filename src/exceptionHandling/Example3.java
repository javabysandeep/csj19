package exceptionHandling;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } catch (ArithmeticException ae) {
            System.out.println("Catch");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("After finally");

    }
}
