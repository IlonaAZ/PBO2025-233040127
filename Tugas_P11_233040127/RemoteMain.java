package Tugas_P11_233040127;

public class RemoteMain {
	public static void main(String[] args) {
		
		// Contoh penggunaan interface Kendali
        InterfaceKendali ac = new RemoteAC();
        InterfaceKendali tv = new RemoteTV();

        ac.nyalakan();
        tv.nyalakan();

        ac.matikan();
        tv.matikan();
	}
}
