package controlStatements.decisionMaking;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);

        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u') {
            System.out.println("Its vowel");
        } else {
            System.out.println("Not a vowel");
        }

    }
}
