package pertemuan2;

public class Slide2 {
	
	public void run ()
	{
		// create array
		int[] arr;
		arr = new int[6];
		
		// assignment array
		for (int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = 5 + (i*5);
		}
		// ambil array
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.printf("%d \n", arr[i]);
		}
	}

}
