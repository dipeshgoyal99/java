/*
Write a Java program for creation of illustrating throw. 
Write a class ThrowExample contains a method checkEligibilty(int age, int weight)
 which throws an ArithmeticException with a message "Student is not eligible for 
 registration" when age < 12 and weight < 40, otherwise it prints "Student Entry 
 is Valid!!". Write the main() method in the same class which will receive two 
 arguments as age and weight, convert them into integers.*/
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
