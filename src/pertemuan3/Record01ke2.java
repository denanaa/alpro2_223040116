package pertemuan3;

public class Record01ke2 {
	
	public void run () {
		//create data pegawai
		Nasabah01 p = new Nasabah01 ();
	
		//assignment atribut record 
		p.setNo("223040116");
		p.setName("Nana");
		p.setSaldo(250000.47);
		
		//output
		System.out.printf("No.Rekening : %s \n", p.getNo());
		System.out.printf("Nama : %s \n", p.getName());
		System.out.printf("Saldo : %f \n", p.getSaldo());
    }
}
