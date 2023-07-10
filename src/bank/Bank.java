package bank;

public class Bank extends BankAccount{

    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.setAccountNumber(12345);
        bank.setBalance(2000.0);
        int accountNumber= bank.getAccountNumber();
        double balance=bank.getBalance();
        System.out.println(" Account number: "+accountNumber);
        System.out.println("Balance: "+balance);
   }

}
