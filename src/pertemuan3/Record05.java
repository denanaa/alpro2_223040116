package pertemuan3;

import java.util.Scanner;

public class Record05 {
	
	Scanner scan = new Scanner (System.in);
	
	public void run ()
	{
		Pegawai03 [] arrPeg = new Pegawai03[3];
		for (int i = 0; i < arrPeg.length; i++)
		{
			String kode = scan.next();
			String nama = scan.next();
			int gaji = scan.nextInt();
			
			Pegawai03 p = new Pegawai03(kode, nama, gaji);
			arrPeg[i] = p ;
	}

	for (int i = 0; i < arrPeg.length; i++)
	{
		Pegawai03 p = arrPeg[i];
		String namaKapital = p.getNama().toUpperCase();
		System.out.printf("%s - %s - %d\n", p.getNo(), namaKapital, p.getGaji());
	}
	}
}
