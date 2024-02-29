package pertemuan3;

public class Record02ke2 {
	
	public void run() {
		//deklarasi dan inisialisasi array Pegawai
		Pegawai02[] arrPeg = new Pegawai02[5];
		
		//create data pegawai
		Pegawai02 p1 = new Pegawai02();
		Pegawai02 p2 = new Pegawai02();
		Pegawai02 p3 = new Pegawai02();
		Pegawai02 p4 = new Pegawai02();
		Pegawai02 p5 = new Pegawai02();
		
		//assignment atribut record
		p1.setName("Nana");
		p2.setName("Syerly");
		p3.setName("Jek");
		p4.setName("Bagus");
		p5.setName("Umar");
		
		//mengisi elemen-elemen array dengan objek pegawai
		arrPeg[0] = p1;
		arrPeg[1] = p2;
		arrPeg[2] = p3;
		arrPeg[3] = p4;
		arrPeg[4] = p5;
		
		//output 
		for ( int i = 0; i < arrPeg.length; i++) {
			if ( arrPeg[i] != null) {
			System.out.printf("== Data ke-%d == \n", i);
			System.out.printf("No : %s \n", arrPeg[i].getNo());
			System.out.printf("Nama : %s \n", arrPeg[i].getName());
			System.out.printf("Gaji : %.2f \n", arrPeg[i].getGaji());
			}
			else
			{
				System.out.printf("== Data ke-%d == \n", i);
				System.out.printf("kosong");
			}
		}
	}

}
