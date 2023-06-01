/*
Write a Java program to illustrate the concept creation of own exceptions. Write the class NumberRangeException which is inherited from Exception, contains only a default constructor which will print the message "Please enter a number between 25 and 50". Write the class MyException with the main() method which will receive only one argument and convert that into int. If the given integer is in between 25 and 50 print the given value, otherwise throw the NumberRangeException().*/
class NumberRangeException extends Exception {
    public NumberRangeException() {
        super("Please enter a number between 25 and 50");
    }
}

public class MyException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);

            if (number >= 25 && number <= 50) {
                System.out.println("Given value: " + number);
            } else {
                throw new NumberRangeException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
