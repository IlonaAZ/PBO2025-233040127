package Pertemuan14;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("233040127", "Ilona");
        Mahasiswa mhs2 = new Mahasiswa("233040122", "Ayang");
        Mahasiswa mhs3 = new Mahasiswa("233040118", "Kyungsoo");
        
        System.out.println("Informasi Mahasiswa");
        System.out.println();
        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        mhs3.displayInfo();
        
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Batas Maksimum SKS untuk semua mahasiswa: " + Mahasiswa.MAX_SKS);
    }
}