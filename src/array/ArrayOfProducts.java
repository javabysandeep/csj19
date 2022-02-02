package array;

public class ArrayOfProducts {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Mobile"),
                new Product(2, "Laptop"),
                new Product(3, "Desktop"),
                new Product(4, "Watch"),
                new Product(5, "Ipad"),
        };
        for (Product product : products) {
            System.out.println(product);
        }

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        // enhanced for loop
        for (int[] innerArray : array) {
            for (int i:innerArray) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //traditional array
        System.out.println("tradional for loop");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
    }
}
