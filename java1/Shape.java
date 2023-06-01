/*
Write a Java program to illustrate the abstract class concept.

Create an abstract class Shape, which contains an empty method numberOfSides().

Define three classes named Trapezoid, Triangle and Hexagon extends the class Shape, such that each one of the classes contains only the method numberOfSides(), that contains the number of sides in the given geometrical figure.

Write a class AbstractExample with the main() method, declare an object to the class Shape, create instances of each class and call numberOfSides() methods of each class.*/

abstract class Shape {
    abstract void numberOfSides();
}

class Trapezoid extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Trapezoid: 4");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Triangle: 3");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in Hexagon: 6");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape shape;

        shape = new Trapezoid();
        shape.numberOfSides();

        shape = new Triangle();
        shape.numberOfSides();

        shape = new Hexagon();
        shape.numberOfSides();
    }
}
