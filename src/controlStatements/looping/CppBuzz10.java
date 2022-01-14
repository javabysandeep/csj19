package controlStatements.looping;

public class CppBuzz10 {
    public static void main(String[] args) {
        String s = "friends";
        int x = 0;
        do {
            System.out.print(s.charAt(x));
            x++;
        } while (x < 2);
    }
}
//output: fr