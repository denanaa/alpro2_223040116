package Rekursif;

public class ContohRekursif {

	    public static void main(String[] args) {
	    	// 1. Inisialisasi variabel bilangan dengan nilai 7
	        int bilangan = 7;
	        
	        // 2. Panggil fungsi hitungFaktorial untuk menghitung faktorial dari angka
	        long jawaban = hitungFaktorial(bilangan);
	        
	        // 3. Cetak hasil faktorial
	        System.out.println("Hasil faktorial dari " + bilangan + " adalah " + jawaban);
	    }
	    
	    // 4. Definisi fungsi hitungFaktorial
	    static long hitungFaktorial(int n) {
	    	
	    	// 5. Kasus dasar: jika n adalah 0 atau 1, kembalikan 1
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	        	// 6. Pemanggilan rekursif: n * hasil dari hitungFaktorial(n - 1)
	            return n * hitungFaktorial(n - 1);
	        }
	    }
	}
