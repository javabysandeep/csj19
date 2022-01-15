package oops.polymorphism.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(add(10, 30));
        System.out.println(add(10, 30,50));
        System.out.println(add(10.3f, 30));
    }

    static final int add(int number1, int number2) {
        return number1 + number2;
    }

    /*static void add(int number1, int number2) {
//        return number1 + number2;
    }*/
    static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    static float add(float number1, float number2) {
        return number1 + number2;
    }
}
