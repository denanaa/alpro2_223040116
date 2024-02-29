package UAS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HitungKarakter {
    public static void main(String[] args) {
        // Mengganti pathFile dengan path lokasi file yang ingin dibaca
        String pathFile = "AksesFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String line;
            int jumlahTitik = 0;
            int jumlahKoma = 0;

            while ((line = reader.readLine()) != null) {
                for (char karakter : line.toCharArray()) {
                    if (karakter == '.') {
                        jumlahTitik++;
                    } else if (karakter == ',') {
                        jumlahKoma++;
                    }
                }
            }

            int hasilJumlah = jumlahTitik + jumlahKoma;
            System.out.println("Jumlah titik: " + jumlahTitik);
            System.out.println("Jumlah koma: " + jumlahKoma);
            System.out.println("Hasil penjumlahan: " + hasilJumlah);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

