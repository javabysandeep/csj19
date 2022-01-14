package controlStatements.decisionMaking;

import java.util.Locale;
import java.util.Scanner;

public class VowelCheckSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().toUpperCase().charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");
                break;
        }
    }
}
