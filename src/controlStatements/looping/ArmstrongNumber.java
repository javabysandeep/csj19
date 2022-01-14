package controlStatements.looping;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = scanner.nextLong();
        long originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = (int) number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        System.out.println(sum==originalNumber?"Armstrong":"Not Armstorng");
    }
}
