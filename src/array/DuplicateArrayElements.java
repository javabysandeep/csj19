package array;

import java.util.Arrays;
import java.util.stream.Stream;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 13, 10, 11, 20, 3, 4, 5, 6, 7, 8, 2,1};

        boolean flag = false;
      /*  for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length && i != j; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
*/

        //solution 2:
        // First sort the array then do the adjacent element comparison
        Arrays.sort(array);//o(nlogn) + o(n)
        Arrays.stream(array).forEach(System.out::println);
        for (int left = 0, right = 1; left < array.length - 1; left++, right++) {
            if (array[left] == array[right]) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "duplicate" : "not duplicate");
    }
}
