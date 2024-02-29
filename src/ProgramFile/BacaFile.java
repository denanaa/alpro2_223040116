package ProgramFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile {
	
	public void run ()
	{
	
	File file = new File ("baca.txt");
	
	try
	{
			Scanner scan = new Scanner (file);
			while (scan.hasNext())
			{
				String teks = scan.next();
				System.out.println (teks);
			}
			scan.close();
	}
	catch (FileNotFoundException e)
	{
	System.out.println ("File tidak ditemukan");
	}
	}

}
