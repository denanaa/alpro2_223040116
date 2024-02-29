package OperasiFile;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceFile {
	
	public void run ()
	{ // Check if source file exists
		File sourceFile = new File ("tesUpdate.txt");
		File targetFile = new File ("tesUpdate.tmp");
		try
		{ // Create a Scanner for input and a Printwriter for output
			Scanner input = new Scanner (sourceFile);
			PrintWriter output = new PrintWriter (targetFile);
			
			while (input.hasNext () )
			{
				String teks = input.nextLine () ;
				if (teks.equals ("5")) { //jika data file adalah 5 
					output.println ("lima");
				}
				else // data file selain 5
				{
					System.out.println (teks);
					output.println (teks);
				}
			}
			// delete file source
			// rename file target ke file source
			input.close () ;
			output.close () ;
		}
		catch (Exception e) {
			System.out.println ("Proses File Error");
		}
	}

}
