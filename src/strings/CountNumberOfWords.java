package strings;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String str =  "String-handling-questions-pushed";
        System.out.println(str.length());
        String[] arrayofStrings = str.split(":");
        System.out.println(arrayofStrings.length);

    }
}
