package exceptionHandling;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println(10 / 0);
        } catch (Exception ex) {
            System.out.println("exception");
        }
        System.out.println("Rest of the code");

    }
}
