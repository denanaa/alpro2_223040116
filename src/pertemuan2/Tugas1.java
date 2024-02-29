package pertemuan2;

import java.util.Scanner;

public class Tugas1 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//inisialisasi array dengan panjang 5 
		int[] arr = new int[5];
		
		//mengisi array dengan input pengguna
		System.out.println("Masukkan lima bilangan bulat : ");
		for (int i = 0; i < arr.length;i++) { 
			System.out.print("Elemen ke-" + (i + 1) + " : ");
			arr[i] = input.nextInt();
		}
			
		// meminta batas nilai dari pengguna
		System.out.print("Masukkan batas nilai: ");
		int batasNilai = input.nextInt();
		
		//menampilkan elemen-elemen yang lebih besar dari batas nilai
		System.out.println("Elemen-elemen yang lebih besar dari " + batasNilai + ":");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > batasNilai) {
				System.out.println("Elemen ke-" + (i + 1) + " : " + arr[i]);	
			}
		}
		input.close();
	}

}
