package exceptionHandling;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(getValue());
    }

    private static int getValue() {
        try {
            System.out.println(10/0);
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }
}
