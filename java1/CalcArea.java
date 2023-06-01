/*
Write a Java program to illustrate the abstract class concept.

Create an abstract class CalcArea and declare the methods triangleArea(double b, double h), rectangleArea(double l, double b), squareArea(double s), circleArea(double r).

Create a class FindArea which extends the abstract class CalcArea used to find areas of triangle, rectangle, square, circle.

Write a class Area with the main() method which will receive two arguments and convert them to double type.
*/

abstract class CalcArea {
    abstract double triangleArea(double b, double h);
    abstract double rectangleArea(double l, double b);
    abstract double squareArea(double s);
    abstract double circleArea(double r);
}

class FindArea extends CalcArea {
    @Override
    double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    @Override
    double rectangleArea(double l, double b) {
        return l * b;
    }

    @Override
    double squareArea(double s) {
        return s * s;
    }

    @Override
    double circleArea(double r) {
        return Math.PI * r * r;
    }
}

public class Area {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments.");
            return;
        }

        try {
            double arg1 = Double.parseDouble(args[0]);
            double arg2 = Double.parseDouble(args[1]);

            FindArea findArea = new FindArea();
            double triangleArea = findArea.triangleArea(arg1, arg2);
            double rectangleArea = findArea.rectangleArea(arg1, arg2);
            double squareArea = findArea.squareArea(arg1);
            double circleArea = findArea.circleArea(arg1);

            System.out.println("Triangle Area: " + triangleArea);
            System.out.println("Rectangle Area: " + rectangleArea);
            System.out.println("Square Area: " + squareArea);
            System.out.println("Circle Area: " + circleArea);
        } catch (NumberFormatException e) {
            System.out.println("Invalid arguments. Please provide numbers.");
        }
    }
}
