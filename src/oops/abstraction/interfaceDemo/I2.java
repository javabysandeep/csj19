package oops.abstraction.interfaceDemo;

public interface I2 {
    int number = 200;
    static void display(){
        System.out.println("I2 display static");
    }
    class A{
        void display(){
            System.out.println("I2:A:- display");
        }
    }

    void print();

    default void sendOtp(){
        System.out.println("I2 default method");
    }
}
