package pertemuan3;

public class Nasabah {
	
	private String nomorRekening;
	private String nama;
	private double saldo;
	
	public Nasabah (String nomorRekening, String nama, double saldo) {
		this.nomorRekening = nomorRekening;
		this.nama = nama;
		this.saldo = saldo;
	}
	
	public String getNomorRekening() {
		return nomorRekening;
	}
	
	public String getNama() {
		return nama;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
