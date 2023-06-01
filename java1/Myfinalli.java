/*
Write a Java program to handle an ArithmeticException divided by zero by using try, catch and finally blocks.

Write the main() method with in the class MyFinallyBlock which will receive four arguments and convert the first two into integers, the last two into float values.

Write the try, catch and finally blocks separately for finding division of two integers and two float values.

If the input is given as command line arguments to the main() as "10", "4", "10", "4" then the program should print the output as:
Result of integer values division : 2
Inside the 1st finally block
Result of float values division : 2.5
Inside the 2nd finally block
If the input is given as command line arguments to the main() as "5", "0", "3.8", "0.0" then the program should print the output as:
Inside the 1st catch block
Inside the 1st finally block
Result of float values division : Infinity
Inside the 2nd finally block*/
public class MyFinallyBlock {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Division of two integers
            int resultInt = num1 / num2;
            System.out.println("Result of integer values division: " + resultInt);
        } catch (NumberFormatException e) {
            System.out.println("Inside the 1st catch block");
        } catch (ArithmeticException e) {
            System.out.println("Inside the 2nd catch block");
        } finally {
            System.out.println("Inside the 1st finally block");
        }

        try {
            float num3 = Float.parseFloat(args[2]);
            float num4 = Float.parseFloat(args[3]);

            // Division of two float values
            float resultFloat = num3 / num4;
            System.out.println("Result of float values division: " + resultFloat);
        } catch (NumberFormatException e) {
            System.out.println("Inside the 1st catch block");
        } catch (ArithmeticException e) {
            System.out.println("Inside the 2nd catch block");
        } finally {
            System.out.println("Inside the 2nd finally block");
        }
    }
}
