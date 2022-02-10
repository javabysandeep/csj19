package strings;

public class OccurrenceOfSubstring {
    public static void main(String[] args) {

        String name = "cyber cyber success";
        String substring = "cyber";
        int count = 0;
        // boolean contains = name.contains(substring);
        //System.out.println(contains);
        for (String word : name.trim().split(" ")) {
            if (word.equals(substring)) {
                count++;
            }
        }
        System.out.println("Occurrence of " + substring + " " + count);
    }
}
