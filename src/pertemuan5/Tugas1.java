package pertemuan5;

import java.util.Scanner;

public class Tugas1 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah N data: ");
        int n = scanner.nextInt();
        int[] data = new int[n];

        System.out.println("Masukkan " + n + " nilai (pisahkan dengan spasi):");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

}
