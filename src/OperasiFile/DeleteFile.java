package OperasiFile;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteFile {
	
	public void run ()
	{ // Check if source file exists
		File sourceFile = new File ("tesDelete.txt");
		File targetFile = new File ("tesDelete.tmp");
		
		try
		{ // Create a Scanner for input and a PrintWriter for output
			Scanner input = new Scanner (sourceFile);
			PrintWriter output = new PrintWriter (targetFile);
			
		while (input.hasNext () )
		{
			
			String teks = input.nextLine ();
			if (!teks.equals ("tujuh")) { //jika data file adalah 7
				output.println (teks);
			}
		}
		System.out.println("Proses File Berhasil");
		//  delete file source
		// rename file target ke file source
		input.close ();
		output.close () ;
		}
		catch (Exception e) {
		System. out.println ("Proses File Error");
		}
	}
	
}
