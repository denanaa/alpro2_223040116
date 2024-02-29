package pertemuan4;

import java.util.Scanner;

public class Tugas2 {
		
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("Masukkan baris & kolom matriks:");
		        int numRows = input.nextInt();
		        int numCols = input.nextInt();

		        int[][] matrix = new int[numRows][numCols];

		        System.out.println("Masukkan elemen matriks:");
		        for (int i = 0; i < numRows; i++) {
		            for (int j = 0; j < numCols; j++) {
		                matrix[i][j] = input.nextInt();
		            }
		        }

		        System.out.println("Masukkan baris yang akan dihitung total elemennya:");
		        int targetRow = input.nextInt();

		        if (targetRow < 0 || targetRow >= numRows) {
		            System.out.println("Baris yang dipilih tidak valid.");
		            return;
		        }

		        int rowSum = calculateRowSum(matrix, targetRow, numCols);

		        System.out.println("Total elemen pada baris " + targetRow + ": " + rowSum);
		    }
		    
		    public static int calculateRowSum(int[][] matrix, int targetRow, int numCols) {
		        int rowSum = 0;
		        for (int j = 0; j < numCols; j++) {
		            rowSum += matrix[targetRow][j];
		        }
		        return rowSum;
		    }
		}
