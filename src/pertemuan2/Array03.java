package pertemuan2;

public class Array03 {
	
	public void run ()
	{
		// create array
		int[] arr;
		arr = new int[100];
		
		// assignment array
		for (int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = (i*2);
		}
		// ambil array
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.printf("%d \n", arr[i]);
		}
	}

}
