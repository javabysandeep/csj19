package controlStatements.looping;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nsum of factors "+sum);
        System.out.println(sum==number?"Perfect":"Not a perfect");
    }
}
