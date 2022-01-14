package controlStatements.decisionMaking;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scanner.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println((number1 % 2 == 0) ? "Even" : "odd");
    }
}
