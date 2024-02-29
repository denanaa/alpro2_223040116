package TugasTracking;

import java.util.Scanner;

public class Tugas1 {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		//menerima jumlah data
		int N = input.nextInt();
		
		// membuat array untuk menyimpan data sebanyak N
		int[] data = new int [N];
				
		// Mengisi array dengan data yang dimasukkan
		for (int i = 0; i < N; i++) {
			data[i] = input.nextInt();
		}
		
		// nilai yang dicari
		int nilaiDicari = input.nextInt();
				
		// melakukan, pencarian, dan menghitung junlah kemunculan nilaiDicari
		int jumlahDitemukan = 0;
		for (int i = 0; i < N; i++) {
			if (data[i] == nilaiDicari) {
				jumlahDitemukan++;
			}
		}
					
		// menampilkan output berdasarkan jumlah nilai yang ditenukan
		if (jumlahDitemukan > 0) {
				System.out.println(jumlahDitemukan);
		} else {
				System.out.println("Data Tidak Ditemukan");
		}
		
		input.close();
	}
}
