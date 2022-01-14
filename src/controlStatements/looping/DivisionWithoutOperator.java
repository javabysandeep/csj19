package controlStatements.looping;

import java.util.Scanner;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();//36
        int number2 = scanner.nextInt();//6
        if (number2 < 0) {
            return;
        }
        int quotient = 0;
        while ((number1 > 0) && (number1 >= number2)) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient " + quotient);
        System.out.println("Remainder " + number1);

    }
}
