package controlStatements.looping;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i < 1) {
            System.out.println(i);
            i++;
        }
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (i < 1);
    }
}
