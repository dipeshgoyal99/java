/*
Write a Java program that implements an interface.

Create an interface called Car with two abstract methods String getName() and int getMaxSpeed()Create a class called BMW which implements the interface Car and provides the implementation for the abstract methods getName() and getMaxSpeed() (make sure to declare the appropriate fields to store name and maxSpeed and also the constructor to initialize them).

Similarly, create a class called Audi which implements the interface Car and provides the implementation for the abstract methods getName() and getMaxSpeed() (make sure to declare the appropriate fields to store name and maxSpeed and also the constructor to initialize them).

Create a public class called MainApp with the main() method.
Take the input from the command line arguments. Create objects for the classes BMW and Audi then print*/
interface Car {
    String getName();
    int getMaxSpeed();
}

class BMW implements Car {
    private String name;
    private int maxSpeed;

    public BMW(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class Audi implements Car {
    private String name;
    private int maxSpeed;

    public Audi(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

public class MainApp {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide four arguments: BMW name, BMW maxSpeed, Audi name, Audi maxSpeed.");
            return;
        }

        String bmwName = args[0];
        int bmwMaxSpeed = Integer.parseInt(args[1]);
        String audiName = args[2];
        int audiMaxSpeed = Integer.parseInt(args[3]);

        Car bmw = new BMW(bmwName, bmwMaxSpeed);
        Car audi = new Audi(audiName, audiMaxSpeed);

        System.out.println("BMW Name: " + bmw.getName());
        System.out.println("BMW Max Speed: " + bmw.getMaxSpeed());

        System.out.println("Audi Name: " + audi.getName());
        System.out.println("Audi Max Speed: " + audi.getMaxSpeed());
    }
}
