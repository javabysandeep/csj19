package controlStatements.looping;

import java.util.Scanner;

public class PerfectNumberRangeFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        int range = scanner.nextInt();
        for (int num = 1; num <= range; num++) {
            int sum = 0;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == num) {
                System.out.print(num+" ");
            }
        }
    }
}
