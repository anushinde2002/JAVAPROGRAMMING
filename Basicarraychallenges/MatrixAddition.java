// WAP to add two matrices of the same size

//package Basicarraychallenges;

import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        // Check if matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices should have the same dimensions for addition.");
            return;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];

        // Iterate through each element of both matrices and add them
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the original matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Print the sum matrix
        System.out.println("Sum of matrices:");
        printMatrix(sumMatrix);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
