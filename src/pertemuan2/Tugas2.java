package pertemuan2;

import java.util.Scanner;

public class Tugas2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//mengisi array dengan input pengguna
		System.out.println("Masukkan lima bilangin bulat");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Elemen ke-" + (i + 1) + " : ");
			arr[i] = input.nextInt();
		}
		
		//menghitung total nilai dari elemen-elemen dalam array
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		//menampilkan total nilai
		System.out.println("Total nilai dari elemn-elemen array adalah : " + total);
		
		input.close();
	}
}
