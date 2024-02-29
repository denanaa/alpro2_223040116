package pertemuan4;

import java.util.Scanner;

public class Latihan2 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	// Membuat matriks
	int baris = 3;
	int kolom = 3;
	int[][] matriks = new int[baris][kolom];
	
	// Mengisi matriks dengan input dari pengguna
	for (int i = 0; i < baris; i++) {
		for (int j = 0; j < kolom; j++) {
			System.out.print("Masukkan elemen matriks[" + i + "][" + j + "]:");
			matriks[i][j] = input.nextInt();
		}
	}
	
	// Menampilkan matriks 
	System.out.println("Matriks:");
	for (int i = 0; i < baris; i++) {
		for (int j = 0; j < kolom; j++) {
			System.out.print(matriks[i][j] + "");
		}
		System.out.println(); //Pindah ke baris berikutnya setelah selesai dengan satu baris
	}
	
		
	}
}
