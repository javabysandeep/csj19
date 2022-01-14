package controlStatements.decisionMaking;

public class IfElseDemo4 {
    public static void main(String[] args) {
        int number = 13;
        if (number >= 1 && number <= 12) {
            if (number == 1) {
                System.out.println("jan");
            }
            if (number == 2) {
                System.out.println("feb");
            }
            if (number == 3) {
                System.out.println("mar");
            }
            if (number == 4) {
                System.out.println("april");
            }
            if (number == 5) {
                System.out.println("may");
            }
            if (number == 6) {
                System.out.println("jun");
            }
            if (number == 7) {
                System.out.println("july");
            }
            if (number == 8) {
                System.out.println("aug");
            }
            if (number == 9) {
                System.out.println("sep");
            }
            if (number == 10) {
                System.out.println("oct");
            }
            if (number == 11) {
                System.out.println("nov");
            }
            if (number == 12) {
                System.out.println("dec");
            }
        } else {
            System.out.println("Invalid input " + number);
        }

    }
}
