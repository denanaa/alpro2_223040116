package TugasTracking;
//
//public class TugasTracing {
//	
//	public boolean biner (int x, int[] data)
//	{
//		boolean ketemu = false;
//		int i = 0;
//		int j = data.length-1;
//		int idx = 0;
//		
//		while (i <= j && !ketemu)
//		{
//			idx = (i+j) / 2;
//			
//			if (x == data[idx])
//			{
//				ketemu = true; //pernyataan-1
//				System.out.println("Pernyataan-1");
//			}
//			else if (x < data[idx])
//			{
//			j = idx - 1; //pernyataan-2
//			System.out.println("Pernyataan-2");
//			}
//			else
//			{
//			i = idx + 1; //pernyataan-3
//			System.out.println("Pernyataan-3");
//			}
//		}
//		
//		return ketemu;
//	}
//
//	public void run() {
//		int[] data = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//		
//		System.out.println("Hasil untuk x = 3: ");
//		biner(3, data);
//		
//		System.out.println("\nHasil untuk x = 10: ");
//		biner(10, data);
//		
//		System.out.println("\nHasil untuk x = 16: ");
//		biner(16, data);
//	}
//}

public class TugasTracing {

    private int countPernyataan1;
    private int countPernyataan2;
    private int countPernyataan3;

    public boolean biner(int x, int[] data) {
        boolean ketemu = false;
        int i = 0;
        int j = data.length - 1;
        int idx = 0;

        while (i <= j && !ketemu) {
            idx = (i + j) / 2;

            if (x == data[idx]) {
                ketemu = true; // Pernyataan-1
                System.out.println("Pernyataan-1");
                countPernyataan1++;
            } else if (x < data[idx]) {
                j = idx - 1; // Pernyataan-2
                System.out.println("Pernyataan-2");
                countPernyataan2++;
            } else {
                i = idx + 1; // Pernyataan-3
                System.out.println("Pernyataan-3");
                countPernyataan3++;
            }
        }

        return ketemu;
    }

    public void run() {
        int[] data = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Reset count for each run
        countPernyataan1 = 0;
        countPernyataan2 = 0;
        countPernyataan3 = 0;

        System.out.println("Hasil untuk x = 3: ");
        if (biner(3, data)) {
            System.out.println("Data ditemukan");
            System.out.println("Jumlah eksekusi Pernyataan-1: " + countPernyataan1);
            System.out.println("Jumlah eksekusi Pernyataan-2: " + countPernyataan2);
            System.out.println("Jumlah eksekusi Pernyataan-3: " + countPernyataan3);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nHasil untuk x = 10: ");
        if (biner(10, data)) {
            System.out.println("Data ditemukan");
            System.out.println("Jumlah eksekusi Pernyataan-1: " + countPernyataan1);
            System.out.println("Jumlah eksekusi Pernyataan-2: " + countPernyataan2);
            System.out.println("Jumlah eksekusi Pernyataan-3: " + countPernyataan3);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nHasil untuk x = 16: ");
        if (biner(16, data)) {
            System.out.println("Data ditemukan");
            System.out.println("Jumlah eksekusi Pernyataan-1: " + countPernyataan1);
            System.out.println("Jumlah eksekusi Pernyataan-2: " + countPernyataan2);
            System.out.println("Jumlah eksekusi Pernyataan-3: " + countPernyataan3);
        } else {
            System.out.println("Data tidak ditemukan");
            System.out.println("Jumlah eksekusi Pernyataan-1: " + countPernyataan1);
            System.out.println("Jumlah eksekusi Pernyataan-2: " + countPernyataan2);
            System.out.println("Jumlah eksekusi Pernyataan-3: " + countPernyataan3);
        }
        
    }
}

//    public static void main(String[] args) {
//        TugasTracing tugasTracing = new TugasTracing();
//        tugasTracing.run();
//    }
//}


