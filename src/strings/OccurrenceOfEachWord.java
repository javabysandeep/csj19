package strings;

import java.util.HashMap;

public class OccurrenceOfEachWord {
    public static void main(String[] args) {
        String name = "cyber cyber success";
        String[] words = name.trim().split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }
}
