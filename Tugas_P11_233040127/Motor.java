package Tugas_P11_233040127;

public class Motor extends Kendaraan {
    private boolean memilikiBox;

    public Motor(String merk, int tahun, boolean memilikiBox) {
        super(merk, tahun);
        this.memilikiBox = memilikiBox;
    }

    @Override
    public void info() {
        System.out.println("Motor " + merk + " tahun " + tahun + (memilikiBox ? " dengan box." : " tanpa box."));
    }
}
