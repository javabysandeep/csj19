package operators;

public class IncrementDecrementOperators {
    // ++, --{Unary operators} +, -
    public static void main(String[] args) {
        // PRE Increment, Pre-decrement
        //Post-increment, post-decrement
        // ++, --, will work with the variable
        int number1 = 10;
        int number2 = 10;
        int number3 = 10;
        int number4 = 10;
        System.out.println(++number1); // pre-increment 11
        System.out.println(number2++); // post increment 10
        System.out.println(--number3); // pre-decrement 9
        System.out.println(number4--);//post-decrement 10

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + c++ + --c + --d + d++ + ++d);//21
        System.out.println(a++ + ++b + c++ + --c + --d + d++ + ++d);// 26
    }
}
