package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 11, 99};
        // requirement : sorted array
        int key = 2;
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        boolean foundFlag = false;
        while (low < high) {
            if (key > array[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (key < array[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (key == array[mid]) {
                foundFlag = true;
                break;
            }
        }
        System.out.println(foundFlag ? "found" : "not found");
    }
}
