package pertemuan3;

import java.util.Scanner;

public class Tugas3 {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Pekerja : ");
		int jumlahPekerja = scan.nextInt();
		
		Kerja[] kerjaArray = new Kerja[jumlahPekerja];
		
		for (int i = 0; i < jumlahPekerja; i++) {
			System.out.println("Masukkan data Pekerja ke-" + (i + 1) + " : ");
			System.out.print("Nomor : ");
			String nomor = scan.next();
			System.out.print("Nama : ");
			String nama = scan.next();
			System.out.print("Jam Kerja : ");
			int jam = scan.nextInt();
			
			Kerja kerja = new Kerja(nomor, nama, jam);
			kerjaArray[i] = kerja;
		}
		
		System.out.println("Data Pekerja :");
		for (int i = 0; i < jumlahPekerja; i++) {
			Kerja kerja = kerjaArray[i];
			int jam = kerja.getjam();
			int gaji = 0;
			 
			if(jam >= 48) {
				gaji = 1000000 + (jam - 48) * 20000;
			} else if ( jam < 48) {
				gaji = 1000000 - (48 - jam) * 50000;
			}
			System.out.println((i + 1) + "." + "Gaji : " + gaji);
			System.out.println();
		}
	}

}
