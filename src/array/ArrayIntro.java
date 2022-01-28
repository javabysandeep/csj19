package array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int a;// declaration
        a = 10;// initialization
        int b = 20; // declaration + initialization
        int[] array = new int[10];
        System.out.println(array);// base address of an object
        System.out.println(array[0]);

        int[] array1;
        array1 = new int[10];

        int[] array3 = {1, 2, 3, 4, 5, 6};
        System.out.println(array3);// reference
        System.out.println(array3[5]);//6
//        System.out.println(array3[6]);//AIOBE
//        int[] array4 = new int[-20];// NegativeArraySizeException

        // accessing all elements
        for (int index = 0; index < array3.length; index++) {
            System.out.println(array3[index]);
        }
        int[] arrayd = {1,2,3,4,5};
        Arrays.stream(arrayd).forEach(System.out::print);
        System.out.println();
        arrayd = new int[10];
        Arrays.stream(arrayd).forEach(System.out::print);
    }
}
