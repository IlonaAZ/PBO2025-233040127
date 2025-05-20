package Tugas_P11_233040127;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        System.out.println("Mobil " + merk + " tahun " + tahun + " dengan " + jumlahPintu + " pintu.");
    }
}
