package RelasiKelas;

public class Dosen {
    private String nip;
    private String nama;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String display() {
    	return "Dosen : " + nama + "(NIP : "+ nip +")";
    }
}
