package ProgramFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TulisFile {
	
	public void run ()
	{

		
	File file = new File ("C:\\Users\\ASUS\\eclipse-workspace\\Alpro2Nana\\ALPRO2\\tulis.txt");
	
	try
	{
		PrintWriter write = new PrintWriter (file);
		write.print ("Saya "); 
		write.print ("anak ");
		write.print ("Informatika. ");
		write.close () ;
		
		System.out.println("File berhasil dibuat");
		
	}
	
		catch (FileNotFoundException e)
		{
		System.out.println ("File tidak ditemukan");
		}
	}

}
