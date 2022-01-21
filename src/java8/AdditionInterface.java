package java8;

@FunctionalInterface
public interface AdditionInterface {
    int add(int number1, int number2);
//    int multiply(int number1, int number2);
    default void display() {
        System.out.println("default in functional interface");
    }
    static void staticMethod() {
        System.out.println("static method in functional interface");
    }
}
