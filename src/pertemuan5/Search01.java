package pertemuan5;

public class Search01 {
	
	public boolean sekuensial (int x, int[] data)
	{
		boolean ketemu = false;
		int i =0;
		while (i< data.length && !ketemu)
		{
			if (x == data [i])
				ketemu = true;
			i++;
		}
		return ketemu;
	}
	public void run ()
	{
		int [] data = {10, 7, 4, 5, 2, 3};
		int x = 10;
		
		boolean hasil = sekuensial (x, data);
		
		if (hasil == true)
			System.out.println("Data Ditemukan");
		else
			System.out.println("Data tidak ditemukan");
	}

}

