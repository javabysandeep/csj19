package controlStatements.decisionMaking;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity and rate ");
        int quantity = scanner.nextInt();
        float rate = scanner.nextFloat();
        float amt = quantity * rate;
        float discountRate = 0.0f;
        if (amt < 5000) {
            discountRate = 0.10f;
        } else if (amt >= 5000 && amt < 10000) {
            discountRate = 0.15f;
        } else if (amt >= 10000 && amt < 20000) {
            discountRate = 0.20f;
        } else if (amt > 20000) {
            discountRate = 0.5f;
        }
        float discountAmount = amt * discountRate;
        float payable = amt - discountAmount;
        System.out.println("Amount payable " + payable);
    }
}
