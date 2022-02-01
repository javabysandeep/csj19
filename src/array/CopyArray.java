package array;

public class CopyArray {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
//        char[] charsCopy = chars;// this reference value copy and not array copy
        char[] charsCopy = new char[chars.length];
        for (int index = 0; index < charsCopy.length; index++) {
            charsCopy[index] = chars[index];
        }
        for (char ch : charsCopy) {
            System.out.print(ch + "");
        }
    }
}
