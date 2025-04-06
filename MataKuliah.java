package RelasiKelas;

public class MataKuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String nama, String nilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    

    public Dosen getDosenPengampu() {
		return dosenPengampu;
	}

	public void setDosenPengampu(Dosen dosenPengampu) {
		this.dosenPengampu = dosenPengampu;
	}

	public String display() {
    	return kode + "-" + nama +"-"+ nilai+"-"+sks+ (dosenPengampu != null ? "-" +dosenPengampu.getNama():"");
    }
}
