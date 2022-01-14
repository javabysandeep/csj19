package controlStatements.decisionMaking;

import java.util.Locale;
import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().toUpperCase().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not a Alphabet");
        }

    }
}
