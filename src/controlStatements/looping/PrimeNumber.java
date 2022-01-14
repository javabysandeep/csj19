package controlStatements.looping;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        System.out.println(count==1?"not a prime":"prime");
    }
}
