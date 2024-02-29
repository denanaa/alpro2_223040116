package pertemuan3;

public class Kerja {
	
	private String nomor;
	private String nama;
	private int jam;
	
	public Kerja (String nomor, String nama, int jam) {
		this.nomor = nomor;
		this.nama = nama;
		this.jam = jam;
	}
	
	public String getNomor() {
		return nomor;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getjam() {
		return jam;
	}

}
