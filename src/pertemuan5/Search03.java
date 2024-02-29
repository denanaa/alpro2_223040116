package pertemuan5;

public class Search03 {
	
	public boolean biner (int x, int[] data) {
		boolean ketemu = false;
		int i = 0;
		int j = data.length-1;
		int idx =0;
		
		while (i <= j && !ketemu) {
			idx = (i+j) / 2;
			if (x == data [idx])
				ketemu = true;
			else if (x < data[idx])
				j = idx-1;
			else
				i = idx+1;
		}
		return ketemu;
	}
	public void run () {
		int [] data = {2, 3, 4, 6, 7, 8, 9};
		int x =6;
		
		boolean hasil = biner(x, data);
		
		if (hasil == true)
			System.out.println ("Data ditemukan");
		else
			System.out.println ("Dara tidak ditemukan");
	}

}
