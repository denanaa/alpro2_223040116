package pertemuan3;

public class Record02 {
	
	public void run() {
		//deklarasi dan insialisasi array Pegawai
		Pegawai02[] arrPeg = new Pegawai02[2];
		
		//create data pegawai
		Pegawai02 p1 = new Pegawai02();
		Pegawai02 p2 = new Pegawai02();
		
		//assignment atribut record
		p1.setName("Nana");
		p2.setName("Syerly");
		
		//mengisi elemen-elemen array dengan objek pegawai
		arrPeg[0] = p1;
		arrPeg[1] = p2;
		
		//output 
		for ( int i = 0; i < arrPeg.length; i++) {
			System.out.printf("No : %s \n", arrPeg[i].getNo());
			System.out.printf("Nama : %s \n", arrPeg[i].getName());
			System.out.printf("Gaji : %.2f \n", arrPeg[i].getGaji());
		}
	}

}
