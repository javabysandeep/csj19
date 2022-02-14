package exceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
//            System.exit(0);//stops the application. rest of the code wont be executed
            System.out.println(10/1);
            try{
                System.out.println("Nested try");
                System.out.println(10/0);
            }catch (Exception ex){
                System.out.println("Nested catch");
            }
            System.out.println("Rest of the code inside the try");
        }
        catch (Exception ex) {
            System.out.println("Catch block");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("Rest of the code");
    }
}
