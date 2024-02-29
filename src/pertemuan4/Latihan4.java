package pertemuan4;

import java.util.Scanner;

public class Latihan4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cols = 2;
		int rows = 2;
		
		System.out.println("Masukkan matrisk pertama:");
		int[][] matrix1 = inputMatrix(rows, cols);
		
		System.out.println("Masukkan matriks kedua:");
		int[][] matrix2 = inputMatrix(rows, cols);
		
		int[][] sumMatrix = addMatrices(matrix1, matrix2);
		System.out.println("Hasil penjumlahan matriks:");
		printMatrix(sumMatrix);
	}
	
	public static int [][] inputMatrix(int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[rows][cols];
		System.out.println("Masukkan elemen matriks:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Masukkan elemen matriks[" + i + "][" + j + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int [][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for  (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int [] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
