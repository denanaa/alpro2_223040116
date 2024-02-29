package pertemuan3;

import java.util.Scanner;

public class Tugas2 {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Nasabah : ");
		int jumlahNasabah = scan.nextInt();
		
		Nasabah[] nasabahArray = new Nasabah[jumlahNasabah];
		double totalSaldo = 0.00; //menyimpan total saldo
		
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
			
			//tambahkan saldo ke totalSaldo
			totalSaldo += saldo;
		}
		
		System.out.println("Data Nasabah :");
		for (int i = 0; i < jumlahNasabah; i++) {
			Nasabah nasabah = nasabahArray[i];
			String namaKapital = nasabah.getNama().toUpperCase();
			System.out.println(nasabah.getNomorRekening() + " - " + namaKapital + " - " + nasabah.getSaldo());
			System.out.println();
		}
		
		//cetak total saldo pada baris terakhir
		System.out.println("Total Saldo Nasabah : " + totalSaldo);
	}

}
