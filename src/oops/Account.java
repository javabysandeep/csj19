package oops;

public class Account {
    int accountNumber;
    double balance;
    String accountHolderName;

    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(final String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    static String bankName = "SBI";

    Account() {
        System.out.println("No arguments");
    }

    public Account(final int accountNumber, final double balance, final String accountHolderName) {
        this();
//        this(); compile time error
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.calculateInterest(this);
    }

    public void calculateInterest(Account account){
        double interest = account.balance * 0.06;
        System.out.println(interest);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public Account getAccount(){
        return this;
    }

    public static void main(String[] args) {
        Account account = new Account(123, 100344.0d, "Sandeep");
        System.out.println(account);
        System.out.println(account.accountHolderName);
        System.out.println(account.accountNumber);
        System.out.println(account.balance);
        System.out.println(Account.bankName);
    }
}
