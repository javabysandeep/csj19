package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 11, 99};
        int key = 34;
        boolean foundFlag = false;
        for (int index = 0; index < array.length; index++) {
            if (key == array[index]) {
                foundFlag = true;
                break;
            }
        }
        System.out.println(foundFlag ? "found " : "not found");
    }
}
