package pertemuan2;

import java.util.Scanner;

public class Array04 {
	
		public void run ()
		{
			// create array
			int[] arr;
			arr = new int[5];
			
			Scanner scan = new Scanner(System.in);
			
			// assignment array
			for (int i = 0; i <= arr.length-1; i++)
			{
				arr[i] = scan.nextInt();
			}
			// ambil array
			for (int i = 0; i <= arr.length-1; i++)
			{
				System.out.printf("%d \n", arr[i]);
			}
		}
	}
