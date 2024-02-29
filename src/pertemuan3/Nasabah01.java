package pertemuan3;

public class Nasabah01 {
	
	String no;
	String nama;
	double saldo; //mengubah tipe data saldo menjadi double
	
	void setNo(String no) {
		this.no = no;
	}
	
	String getNo() {
		return no;
	}
	
	void setName (String nama) {
		this.nama = nama;
	}
	
	String getName() {
		return nama;
	}
	
	
	void setSaldo(double saldo) {//mengubah nama setter dari setsaldo menjadi setSaldo
		this.saldo = saldo;
	}
	
	double getSaldo() { //mengubah nama getter daari getsaldo menjadi getSaldo
		return saldo;
	}
}
