package array;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
//        char[] reverseArray = reverseArray(chars);
        // Solution 2 -- using swap
        reverseArraySwap(chars);
        for (char ch : chars) {
            System.out.print(ch+" ");
        }
    }

    private static char[] reverseArray(char[] chars) {
        char[] result = new char[chars.length];
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = chars[i];
        }
        return result;
    }

    private static void reverseArraySwap(char[] chars) {
        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            char ch = chars[left];
            chars[left] = chars[right];
            chars[right] = ch;
        }
    }
}
