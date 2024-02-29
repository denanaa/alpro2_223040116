package pertemuan2;

import java.util.Scanner;

public class Array05 {
	
	public void run ()
	{
		// create array
		double[] arr;
		arr = new double[3];
		
		Scanner scan = new Scanner(System.in);
		
		// assignment array
		for (int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = scan.nextDouble();
		}
		// ambil array
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.printf("%.2f \n", arr[i]);
		}
	}

}
