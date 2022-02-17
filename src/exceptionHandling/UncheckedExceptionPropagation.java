package exceptionHandling;

public class UncheckedExceptionPropagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception ex) {
            System.out.println("main catch");
        }
        System.out.println("rest of the code main");
    }

    private static void m1() {
        m2();
        System.out.println("rest of the code m2");
    }

    private static void m2() {
        m3();
        System.out.println("rest of the code m3");
    }

    private static void m3() {
        System.out.println(10 / 0);
        System.out.println("rest of the code m3");
    }
}
