package strings;

import java.util.HashMap;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String name = "cyber cyber success";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : name.trim().toCharArray()) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        System.out.println(hashMap);
    }
}
