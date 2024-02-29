package UAS;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Pekerja {
    private String nip;
    private String nama;
    private int gaji;

    public void Pegawai (String nip, String nama, int gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String toString() {
        return nip + " " + nama + " " + gaji;
    }
}

public class ProgramPegawai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah pegawai
        System.out.print("Masukkan jumlah pegawai: ");
        int n = scanner.nextInt();
        Pegawai[] pegawaiArr = new Pegawai[n];

        // Membaca data pegawai
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data pegawai ke-" + (i + 1));
            System.out.print("NIP: ");
            int nip = scanner.nextInt();
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Gaji: ");
            int gaji = scanner.nextInt();

            pegawaiArr[i] = new Pegawai(nip, nama, gaji);
        }

        // Menyimpan data pegawai ke dalam file
        simpanDataPegawai(pegawaiArr);

        // Menampilkan data pegawai dari file
        tampilkanDataPegawai();

        scanner.close();
    }

    private static void simpanDataPegawai(Pegawai[] pegawaiArr) {
        // Mengganti pathFile dengan path lokasi file untuk menyimpan data pegawai
        String pathFile = "DataPegawai.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
            for (Pegawai pegawai : pegawaiArr) {
                writer.write(pegawai.toString());
                writer.newLine();
            }
            System.out.println("Data pegawai berhasil disimpan ke dalam file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void tampilkanDataPegawai() {
        // Mengganti pathFile dengan path lokasi file yang berisi data pegawai
        String pathFile = "DataPegawai.txt";

        try (Scanner fileScanner = new Scanner(new File(pathFile))) {
            System.out.println("Data pegawai yang ada di file:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}




