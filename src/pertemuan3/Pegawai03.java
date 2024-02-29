package pertemuan3;

public class Pegawai03 {
	
	private String no;
	private String nama;
	private int gaji;
	
	public Pegawai03 () {}
	
	public Pegawai03(String n, String nm, int g) {
		no = n;
		nama = nm;
		gaji = g;
	}
	
	//setter untuk atribut 'no'
	public void setNo(String n) {
		no = n;
	}
	
	//getter untuk atribut 'no'
	public String getNo() {
		return no;
	}
	
	//setter untuk atribut 'nama'
	public void setNama(String nm) {
		nama = nm;
	}
	
	//getter untuk atribut 'nama'
	public String getNama() {
		return nama;
	}
	
	//setter untuk atribut 'gaji'
	public void setGaji(int g) {
		gaji = g;
	}
	
	//getter untuk atribut 'gaji'
	public int getGaji() {
		return gaji;
	}
}
