package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator: Three operands
        System.out.println((4 > 30) ? "expression is true " : 20);

        int number1 = 20;
        int number2 = 5;

        int smaller = (number1 < number2) ? number1 : 'A';
        System.out.println(smaller);

        System.out.println((number1 < number2) ? 'B' : 'A');
        System.out.println((number1 < number2) ? 10.5 : 'A');

        System.out.println(~4);//-5// change sign (number+1)
    }
}
