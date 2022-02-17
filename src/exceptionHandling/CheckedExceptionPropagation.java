package exceptionHandling;

public class CheckedExceptionPropagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception ex) {
            System.out.println("main catch");
        }
        System.out.println("rest of the code main");
    }

    private static void m1() throws Exception {
        m2();
        System.out.println("rest of the code m2");
    }

    private static void m2() throws Exception {
        m3();
        System.out.println("rest of the code m3");
    }

    private static void m3() throws Exception {
        throw new Exception("explicitly thrown");
//        System.out.println("rest of the code m3");
    }
}
