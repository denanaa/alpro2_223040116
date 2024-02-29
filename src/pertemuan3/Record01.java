package pertemuan3;

public class Record01 {
	
	public void run () {
		//create data pegawai
		Pegawai01 p = new Pegawai01 ();
		
		//assignment atribut record 
		p.setNo("01");
		p.setName("Nana");
		p.setGaji(700000);
		
		//output 
		System.out.printf("No: %s \n", p.getNo());
		System.out.printf("Nama: %s \n", p.getName());
		System.out.printf("Gaji: %s \n", p.getGaji());
	}
}
