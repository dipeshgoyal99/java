/*
Write a Java program to illustrate user-defined exceptions.
 Write the class InsufficientFundsException with private 
 double member amount a parameterized constructor to
 initialize the amount a method getAmount() to return amount. Write
  another class CheckingAccount with two private members balance and a
  ccountNumber a parameterized constructor to initialize the accountNumber 
  method deposit() to add amount to the balance method withdraw() to debit
   amount from balance if sufficient balance is available, otherwise throw
    an exception InsufficientFundsException() with how much amount needed extra
     method getBalance() to return balance. method getNumber() to return accountNumber.*/
class ThrowExample {
    public static void checkEligibility(int age, int weight) {
        if (age < 12 && weight < 40) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(args[0]);
            int weight = Integer.parseInt(args[1]);
            checkEligibility(age, weight);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers for age and weight.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

