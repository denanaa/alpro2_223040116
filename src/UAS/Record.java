package UAS;

import java.util.Scanner;

public class Record {
	
    private String nip;
    private String nama;
    private int masuk;
    private int tidak_masuk;
    private int upah_per_hari = 100000;
    private int pengurangan_upah = 10000;

    public Record(String nip, String nama, int masuk, int tidak_masuk) {
        this.nip = nip;
        this.nama = nama;
        this.masuk = masuk;
        this.tidak_masuk = tidak_masuk;
    }

    public int hitungUpahTotal() {
        return (masuk * upah_per_hari) - (tidak_masuk * pengurangan_upah);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input
        System.out.print("Masukkan NIP dan Nama Pegawai: ");
        String nipNama = scanner.nextLine();
        String[] nipNamaArray = nipNama.split(" ");
        String nip = nipNamaArray[0];
        String nama = nipNamaArray[1];

        System.out.print("Masukkan jumlah masuk: ");
        int masuk = scanner.nextInt();

        System.out.print("Masukkan jumlah tidak masuk: ");
        int tidakMasuk = scanner.nextInt();

        // Membuat objek Record (sebelumnya Pegawai)
        Record record = new Record(nip, nama, masuk, tidakMasuk);

        // Menghitung dan menampilkan total upah pegawai
        int totalUpah = record.hitungUpahTotal();
        System.out.println(nip + " - " + nama + " - " + totalUpah);

        scanner.close();
    }
}


