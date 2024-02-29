package pertemuan4;

import java.util.Scanner;

public class Tugas1 {


		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("Masukkan matriks ke 1:");
		        int row1 = input.nextInt();
		        int col1 = input.nextInt();

		        System.out.println("Masukkan matriks ke 2:");
		        int row2 = input.nextInt();
		        int col2 = input.nextInt();

		        if (col1 != row2) {
		            System.out.println("Ordo perkalian matriks tidak sesuai...");
		            return;
		        }

		        int[][] matrix1 = new int[row1][col1];
		        int[][] matrix2 = new int[row2][col2];

		        System.out.println("Masukkan matriks ke 1:");
		        for (int i = 0; i < row1; i++) {
		            for (int j = 0; j < col1; j++) {
		                matrix1[i][j] = input.nextInt();
		            }
		        }

		        System.out.println("Masukkan matriks ke 2:");
		        for (int i = 0; i < row2; i++) {
		            for (int j = 0; j < col2; j++) {
		                matrix2[i][j] = input.nextInt();
		            }
		        }

		        int[][] result = multiplyMatrices(matrix1, matrix2, row1, col1, col2);

		        System.out.println("Hasil perkalian matriks:");
		        for (int i = 0; i < row1; i++) {
		            for (int j = 0; j < col2; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int row1, int col1, int col2) {
		        int[][] result = new int[row1][col2];

		        for (int i = 0; i < row1; i++) {
		            for (int j = 0; j < col2; j++) {
		                for (int k = 0; k < col1; k++) {
		                    result[i][j] += matrix1[i][k] * matrix2[k][j];
		                }
		            }
		        }

		        return result;
		}
	}
