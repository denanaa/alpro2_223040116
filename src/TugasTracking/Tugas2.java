package TugasTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);	
			
		// menerima jumlah data
		int N = input.nextInt();
			
		// membuat ArrayList untuk menyimpan indeks nilaI yang ditemukan
		ArrayList<Integer> indeksDitemukan = new ArrayList<>();

		// membuat array untuk menyimpan data sebanyak N
		int[] data = new int[N];
			                    
		// mengisi array dengan data yang dimasukkan
		for (int i = 0; i < N; i++) {
			data[i] = input.nextInt();
		}
		
		// nilai yang dicari
		int nilaiDicari = input.nextInt();
		
		// melakukan pencarian dan mencatat indeks serta menghitung total nilai yang ditemukan
		int totalDitemukan = 0;
		for (int i = 0; i < N; i++) {
				if (data[i] == nilaiDicari) {
					indeksDitemukan.add(i + 1); // Menankahkan indeks ks ArrayList 
					totalDitemukan += nilaiDicari; // Menambahkan nilai ke total
				}
		}
		
		// menampilkan output berdasarkan hasil pencarian
		if (!indeksDitemukan.isEmpty()) {
			System.out.println("Data Ditemukan");
			for (int indeks : indeksDitemukan) {
			System.out.println("Indeks ke-" + (indeks-1));
			}
			System.out.println("Total " + totalDitemukan);
		} else {
			System.out.println("Data Tidak Ditenukan");
			}
		
			input.close();
		}
}
