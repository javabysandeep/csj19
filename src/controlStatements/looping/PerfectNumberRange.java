package controlStatements.looping;

public class PerfectNumberRange {
    public static void main(String[] args) {
        int range = 10000;
        for (int i = 1; i <= range; i++) {
            if (isPerfect(i)) {
                System.out.print(i+" ");
            }
        }
    }
    private static boolean isPerfect(final int number) {
        int sum = 0;
        for (int j = 1; j <= number / 2; j++) {
            if (number % j == 0) {
                sum += j;
            }
        }
        return sum == number;
    }
}
