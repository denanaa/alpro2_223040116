package pertemuan4;

import java.util.Scanner;

public class Latihan5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Masukkan jumlah baris matriks pertama: ");
		int rows1 = scanner.nextInt();
		System.out.println("Masukkan jumlah kolom matriks pertama: ");
		int cols1 = scanner.nextInt();
		
		System.out.println("Masukkan jumlah baris matriks kedua: ");
		int rows2 = scanner.nextInt();
		System.out.println("Masukkan jumlah kolom matriks kedua: ");
		int cols2 = scanner.nextInt();
		
		if (cols1 != rows2) {
			System.out.println("Perkalian magtriks tidak bisa dilakukan.");
			return;
		}
		
		System.out.println("Masukkan matriks pertama:");
		int[][] matrix1 = inputMatrix(rows1, cols1);
		
		System.out.println("Masukkan matriks kedua:");
		int[][] matrix2 = inputMatrix(rows2, cols2);
		
		int[][] productMatrix = multiplyMatrices (matrix1, matrix2);
		System.out.println("Hasil perkalian matriks: ");
		printMatrix(productMatrix);
	}
	
	public static int [][] inputMatrix (int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[rows][cols];
		System.out.println("Masukkan elemen matriks: ");
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("Masukkan elemen matriks[" + i + "][" + j + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] multiplyMatrices (int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int cols2 = matrix2[0].length;
		
		int[][] result = new int[rows1][cols2];
		
		for(int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
				result[i][j] += matrix1[i][k] * matrix2[k][j];
			}
		}
	}
	
	return result;
	
}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for(int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}
