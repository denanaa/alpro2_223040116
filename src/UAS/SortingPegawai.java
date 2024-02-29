package UAS;

import java.util.Scanner;

class Pegawai {
    private int nip;
    private String nama;
    private int gaji;

    public Pegawai(int nip, String nama, int gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public String toString() {
        return nip + " " + nama + " " + gaji;
    }
}

public class SortingPegawai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah pegawai
        System.out.print("Masukkan jumlah pegawai: ");
        int n = scanner.nextInt();
        Pegawai[] pegawaiArray = new Pegawai[n];

        // Membaca data pegawai
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data pegawai ke-" + (i + 1));
            System.out.print("NIP: ");
            int nip = scanner.nextInt();
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Gaji: ");
            int gaji = scanner.nextInt();

            pegawaiArray[i] = new Pegawai(nip, nama, gaji);
        }

        // Melakukan pengurutan berdasarkan gaji menggunakan algoritma sesuai NRP
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((i + 1) % 2 == 1) { // NRP ganjil, gunakan selection sort
                    if (pegawaiArray[j].getGaji() < pegawaiArray[j + 1].getGaji()) {
                        // Tukar pegawaiArray[j] dan pegawaiArray[j + 1]
                        Pegawai temp = pegawaiArray[j];
                        pegawaiArray[j] = pegawaiArray[j + 1];
                        pegawaiArray[j + 1] = temp;
                    }
                } else { // NRP genap, gunakan bubble sort
                    if (pegawaiArray[j].getGaji() < pegawaiArray[j + 1].getGaji()) {
                        // Tukar pegawaiArray[j] dan pegawaiArray[j + 1]
                        Pegawai temp = pegawaiArray[j];
                        pegawaiArray[j] = pegawaiArray[j + 1];
                        pegawaiArray[j + 1] = temp;
                    }
                }
            }
        }

        // Menampilkan hasil pengurutan
        System.out.println("Hasil Pengurutan Pegawai Berdasarkan Gaji (Descending):");
        for (Pegawai pegawai : pegawaiArray) {
            System.out.println(pegawai.toString());
        }

        scanner.close();
    }
}
