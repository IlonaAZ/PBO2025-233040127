package Tugas_P11_233040127;

public class KendaraanMain {
	public static void main(String[] args) {
        // Contoh penggunaan kelas abstrak Kendaraan
        Kendaraan mobil = new Mobil("Toyota", 2020, 4);
        Kendaraan motor = new Motor("Yamaha", 2018, true);

        mobil.info();
        motor.info();
        
	}
}
