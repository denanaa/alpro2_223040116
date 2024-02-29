package pertemuan4;

import java.util.Scanner;

public class Latihan3 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int[][] inputMatrix(int rows, int cols) {
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
	
	public static void outputMatrix(int[][] matrix) {
		System.out.println("Matriks:");
		for (int i = 0; i <  matrix.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("|");
		}
	}
	
	public static void main (String[] args) {
		int rows = 2;
		int cols = 3;
		
		// Input matriks 
		int [][] matrix = inputMatrix(rows, cols);
		
		//Ouput matriks
		outputMatrix(matrix);
	}

}
