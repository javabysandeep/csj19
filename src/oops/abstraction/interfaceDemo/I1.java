package oops.abstraction.interfaceDemo;

public interface I1 {
    int number = 100;
    static void display(){
        System.out.println("I1 display static");
    }
    class A{
        void display(){
            System.out.println("I1:A:- display");
        }
    }
    void print();

    default void sendOtp(){
        System.out.println("I1 default method");
    }
}
