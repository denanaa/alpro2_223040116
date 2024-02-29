package pertemuan5;

import java.util.Scanner;

public class Search04 {

		public boolean sekuensial(int x, int[] data) {
	        boolean ketemu = false;
	        int i = 0;
	        while (i < data.length && !ketemu) {
	            if (x == data[i])
	                ketemu = true;
	            i++;
	        }
	        return ketemu;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Masukkan  nilai : ");
	        String dataString = scanner.nextLine();
	        String[] dataValues = dataString.split(" ");
	        int[] data = new int[dataValues.length];
	        for (int i = 0; i < dataValues.length; i++) {
	            data[i] = Integer.parseInt(dataValues[i]);
	        }

	        System.out.println("Masukkan nilai yang dicari: ");
	        int x = scanner.nextInt();

	        Search01 search = new Search01();
	        boolean hasil = search.sekuensial(x, data);

	        if (hasil) {
	            System.out.println("Data ditemukan");
	        } else {
	            System.out.println("Data tidak ditemukan");
	        }
	    }

}

