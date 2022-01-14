package controlStatements.looping;

public class PrintEvenWithoutMod {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        for (int i = 2; i <= number; i = i + 2) {
            sum += i;
        }
        System.out.println("Sum of even " + sum);
    }
}
