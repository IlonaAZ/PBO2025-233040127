package RelasiKelas;

public class TranskripNilaiMain
{
public static void main(String[] args)



{
	// create Dosen
	Dosen dsn1 = new Dosen("1221212121221","Pak Arkan");
	
	/*Create objek matakuliah*/
	
	MataKuliah mk1 = new MataKuliah("001", "Algoritma pemograman 1", "A", 3);
	MataKuliah mk2 = new MataKuliah("002", "Algoritma pemograman 2", "BC", 3);
	MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek", "BC", 3);
	
	/*Create objek KHS*/
	KartuHasilStudi khs = new KartuHasilStudi("20222");
	khs.addMatakuliah(mk1);
	khs.addMatakuliah(mk2);
	khs.addMatakuliah(mk3);
	
	/*Create objek Mahasiswa*/
	Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
	
//	Set dosen
	mk1.setDosenPengampu(dsn1);
	
	/*Create objek TranskripNilai*/
	TrankripNilai transkrip = new TrankripNilai (mhs);
	transkrip.addKHS (khs);
	transkrip.display();
}
}
