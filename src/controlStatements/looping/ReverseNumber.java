package controlStatements.looping;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = scanner.nextLong();
        long originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = (int) number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.println(sum == originalNumber ? "Palindrome" : "Not Palindrome");
    }
}
