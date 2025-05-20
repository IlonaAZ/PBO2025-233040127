package Tugas_P11_233040127;

public class RemoteAC implements InterfaceKendali {
    @Override
    public void nyalakan() {
        System.out.println("AC dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("AC dimatikan.");
    }
}
