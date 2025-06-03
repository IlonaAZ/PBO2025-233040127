package Pertemuan14;



public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    //menyebabkan COMPILE ERROR karena mencoba override final method
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Informasi Rekening Tabungan:");
        super.displayAccountInfo();
        System.out.println("Bunga: " + interestRate + "%");
    }
    */

    // solusi: membuat method baru dengan nama yang berbeda
    public void displaySavingsInfo() {
        displayAccountInfo(); 
        System.out.println("Bunga: " + interestRate + "%");
    }
}