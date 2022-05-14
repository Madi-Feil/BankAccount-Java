import java.util.Random;

public class BankAccount {

    // static stuff that belongs to the BankAccount class

    public static int numberAccounts = 0;
    public static double totalHoldings = 0;

    private static int generateId() {
		Random randGenerator = new Random();
        int randomId = randGenerator.nextInt(1000000000) + 999999999;
		return randomId;
	}
    
    //following attributes for the class
    private double checkingBalance;
    private double savingBalance;
    private int accountNumber;

    public BankAccount() {
        BankAccount.numberAccounts += 1;
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.accountNumber = BankAccount.generateId();
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    //depositing money method
    public void depositMoney(double amount, String account) {
        if(account.equals("savings")) {
            this.savingBalance += amount;
        }
        else if(account.equals("checking")){
            this.checkingBalance += amount;
        }
        BankAccount.totalHoldings += amount;
    }

    //withdrawing money method
    public void withdrawlMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingBalance - amount >= 0) {
                successful = true;
                this.savingBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0) {
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        if(successful) {
            BankAccount.totalHoldings -= amount;
        }
        else {
            System.out.println("To little Funds.");
        }
    }

    public void displayAccountBlanace() {
        System.out.println(String.format("Saving: %.2f, checking: %.2f" , this.savingBalance, this.checkingBalance));
    }

}