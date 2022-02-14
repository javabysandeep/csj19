package exceptionHandling;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            System.out.println(10/0);
        } catch (Exception ex){
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
