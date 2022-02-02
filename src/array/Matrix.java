package array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //1. Accept the 2d array
        //  int[][] matrix = acceptMatrix();
        //2. print the 2d array
        //printMatrix(matrix);

        //3. Addition of two matrices
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] additionMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Matrix addition ");
        printMatrix(additionMatrix);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                result[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return result;
    }

    public static int[][] acceptMatrix() {
        System.out.println("Enter the row and column size");
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        int[][] matrix = new int[rowCount][columnCount];
        System.out.println("Enter the matrix ");

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


}
