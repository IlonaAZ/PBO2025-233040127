package RelasiKelas;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSKS = 0;
        for (MataKuliah mk : daftarMatakuliah) {
            totalNilai += mk.getNilai() * mk.getSks(); 
            totalSKS += mk.getSks();
        }

        if (totalSKS > 0) {
            ips = totalNilai / totalSKS;
        } else {
            ips = 0;
        }
    }

    // Getter & Setter
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<MataKuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
}