package controlStatements.decisionMaking;

import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("Multiple of five");
        } else {
            System.out.println("Not Multiple of five");
        }
        System.out.println((number % 5 == 0) ? "Multiple of five" : "Not Multiple of five");
    }
}
