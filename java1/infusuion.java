/*
Write a Java program to illustrate user-defined exceptions. Write the class
 InsufficientFundsException with private double member amount a parameterized constructor
  to initialize the amount a method getAmount() to return amount. Write another class
   CheckingAccount with two private members balance and accountNumber a parameterized
    constructor to initialize the accountNumber method deposit() to add amount to the 
    balance method withdraw() to debit amount from balance if sufficient balance is
     available, otherwise throw an exception InsufficientFundsException() with how
      much amount needed extra method getBalance() to return balance. method getNumber() 
      to return accountNumber.*/
class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class CheckingAccount {
    private double balance;
    private int accountNumber;

    public CheckingAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            double amountNeeded = amount - balance;
            throw new InsufficientFundsException(amountNeeded);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return accountNumber;
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(12345);
        account.deposit(500.00);

        try {
            account.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught InsufficientFundsException");
            System.out.println("Amount needed: " + e.getAmount());
            e.printStackTrace();
        }
    }
}
