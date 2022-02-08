package strings;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "          Welcome to the online training";

        s1 = s1.replace('a', '@');

        System.out.println(s1);

        s1 = s1.replace("tr@ining", "Java Training         ");

        System.out.println(s1);
        s1 = s1.trim();
        System.out.println(s1);
    }
}
