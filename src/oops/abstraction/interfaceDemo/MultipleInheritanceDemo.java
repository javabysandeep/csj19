package oops.abstraction.interfaceDemo;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        I1 ref = new I1I2Impl();
        System.out.println(I1.number);
        System.out.println(I2.number);
        I1.display();
        I2.display();

        I1.A a = new I1.A();
        a.display();

        I2.A i2a = new I2.A();
        i2a.display();
        ref.print();
    }
}
