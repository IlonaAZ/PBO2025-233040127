package RelasiKelas;

public class Mahasiswa 
{
	private String NRP;
	private String Nama;
	
//	public Mahasiswa(String nRP, String nama) {
//		super();
//		NRP = nRP;
//		Nama = nama;
//	}
	public Mahasiswa(String nRP, String nama) {
		super();
		NRP = nRP;
		this.Nama = nama;
	}	
	
	public String display() 
	{
	return "NRP: "+ NRP+ ", Nama: "+ Nama;	
	}
	
	public String getNRP() {
		return NRP;
	}
	public void setNRP(String nRP) {
		NRP = nRP;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}

	
}