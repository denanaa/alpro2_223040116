package pertemuan5;

public class Search02 {
	
	public int cariMaks (int[] data) {
		 
		int maks = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] >maks)
				maks = data [i];
		}
		return maks;	
	}
	public void run () {
		int [] data = {2, 4, 3, 1, 7, 5};
		
		System.out.printf("Nilai maks : %d",cariMaks (data));
	}

}
