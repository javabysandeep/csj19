package array;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] array = {881, 2, 3, 490, 5, 6, 7, 8, 11, 99};
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if(array[index] > max){
                max = array[index];
            }
        }
        System.out.println("Max "+max);

    }
}
