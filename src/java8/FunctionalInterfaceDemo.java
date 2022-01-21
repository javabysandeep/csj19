package java8;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //Way 1: Using Traditional way
        AdditionInterface addition = new AdditionImpl();
        System.out.println(addition.add(20, 30));

        //way 2 : Anonymous class
        AdditionInterface addition1 = new AdditionInterface() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println(addition1.add(100, 200));

        //way 3: Using lambda expression we can override the functional interface method.
        AdditionInterface lambda = (number1, number2) -> number1 + number2;
        System.out.println(lambda.add(30, 40));
        lambda.display();// calling default method
    }
}
