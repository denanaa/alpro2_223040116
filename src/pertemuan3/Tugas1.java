package pertemuan3;

import java.util.Scanner;

public class Tugas1 {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Nasabah : ");
		int jumlahNasabah = scan.nextInt();
		
		Nasabah[] nasabahArray = new Nasabah[jumlahNasabah];
		
		for (int i = 0; i < jumlahNasabah; i++) {
			System.out.println("Masukkan data Nasabah ke-" + (i + 1) + " : ");
			System.out.print("Nomor Rekening : ");
			String nomorRekening = scan.next();
			System.out.print("Nama : ");
			String nama = scan.next();
			System.out.print("Saldo : ");
			double saldo = scan.nextDouble();
			
			Nasabah nasabah = new Nasabah(nomorRekening, nama, saldo);
			nasabahArray[i] = nasabah;
		}
		
		System.out.println("Data Nasabah :");
		for (int i = 0; i < jumlahNasabah; i++) {
			Nasabah nasabah = nasabahArray[i];
			String namaKapital = nasabah.getNama().toUpperCase();
			System.out.println(nasabah.getNomorRekening() + " - " + namaKapital + " - " + nasabah.getSaldo());
			System.out.println();
		}
	}

}
