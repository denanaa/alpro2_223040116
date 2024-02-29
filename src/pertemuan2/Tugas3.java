package pertemuan2;

import java.util.Scanner;

public class Tugas3 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		//array dengan panjang 5
		char[] nilaiMataKuliah = new char[5];
		
		//mendefinisikan nilai indeks matakuliah
		int nilaiA = 4;
		int nilaiB = 3;
		int nilaiC = 2;
		
		//mengisi array dengan input pengguna
		System.out.println("Masukkan nilai matakuliah (A, B, atau C): ");
		for (int i = 0; i < nilaiMataKuliah.length; i++) {
			System.out.print("Matakuliah ke-" + (i + 1) + " : ");
			nilaiMataKuliah[i] = input.next().charAt(0);
		}
		
		//menghitung total nilai matakuliah dalam array
		int totalNilai = 0;
		for (int i = 0; i < nilaiMataKuliah.length; i++) {
			char nilai = nilaiMataKuliah[i];
			switch (nilai) {
			case 'A':
				totalNilai += nilaiA;
				break;
			case 'B':
				totalNilai += nilaiB;
				break;
			case 'C':
				totalNilai += nilaiC;
				break;
			default:
				System.out.println("Karakter tidak valid: " + nilai);
				break;
			}
		}
		
		//menghitung IPK
		double ipk = (double) totalNilai / nilaiMataKuliah.length;
		
		//menampilkan nilai IPK
		System.out.println("Nilai IPK anda adalah: " + ipk);
		
		input.close();
		
	}
}
