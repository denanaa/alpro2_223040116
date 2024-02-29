package pertemuan5;

import java.util.ArrayList;
import java.util.Scanner; 

public class Tugas2 {
	
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

        ArrayList<Integer> foundIndices = new ArrayList<>();
        int totalCount = 0;

        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                foundIndices.add(i);
                totalCount++;
            }
        }

        if (totalCount > 0) {
            System.out.println("Data Ditemukan");
            for (int i : foundIndices) {
                System.out.println("Indeks ke-" + i);
            }
            System.out.println("Total " + totalCount);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

}
