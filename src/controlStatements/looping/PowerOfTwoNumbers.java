package controlStatements.looping;

import java.util.Scanner;

public class PowerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number and power");
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println(result);
    }
}

