package Pertemuan14;

	public class BankTest {
	    public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount("199501004", 1000000);
	        SavingAccount acc2 = new SavingAccount("199501230", 5000000, 0.5);

	        acc1.deposit(1000000);
	        acc1.displayAccountInfo();

	        acc2.deposit(500000);
	        acc2.displaySavingsInfo(); 
	    }
	}
