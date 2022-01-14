package controlStatements.transferStatements;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                continue;
//                break;
                return;
            }
            System.out.print(i + " ");
        }
        System.out.println("Rest of the code");
    }
}
