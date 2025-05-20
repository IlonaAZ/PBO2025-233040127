package Tugas_P11_233040127;

public class RemoteTV implements InterfaceKendali {
    @Override
    public void nyalakan() {
        System.out.println("TV dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("TV dimatikan.");
    }
}
