package exceptionHandling;

public class ThrowsDemo implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException, ArithmeticException {

        ThrowsDemo t = new ThrowsDemo();
        ThrowsDemo t1 = (ThrowsDemo) t.clone();

        /*try{
            m1();
        }catch (ArithmeticException e){}*/
        m1();
        System.out.println("main rest of the code");
    }

    static void m1() throws ArithmeticException {
        System.out.println("m1");
        System.out.println(10/0);
    }
}
