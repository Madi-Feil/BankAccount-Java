public class TestingBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        
        // first bank account
        System.out.println("Account number:" + ba.getAccountNumber());
        ba.depositMoney(500, "savings");
        ba.depositMoney(200, "checking");
        ba.displayAccountBlanace();

        ba.withdrawlMoney(300, "savings");
        ba.withdrawlMoney(100, "checking");
        ba.displayAccountBlanace();

        System.out.println(BankAccount.totalHoldings);

        // second bank account
        BankAccount ba2 = new BankAccount();
        System.out.println("Account Number:" + ba2.getAccountNumber());
        ba2.depositMoney(1000, "savings");
        ba2.depositMoney(250, "checking");
        ba2.displayAccountBlanace();

        System.out.println(BankAccount.totalHoldings);

        ba2.withdrawlMoney(400, "savings");
        ba2.withdrawlMoney(50, "checking");
        ba2.displayAccountBlanace();

        System.out.println(BankAccount.totalHoldings);
    }
}