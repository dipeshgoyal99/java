/*

Write a Java program that uses three threads to 


perform the below actions: First thread 
should print "Good morning" for every 1 second for 2 times Second 
thread should print "Hello" for every 1 seconds for 2 times Third
 thread should print "Welcome" for every 3 seconds for 1 times Write 
 appropriate constructor in the Printer class which implements Runnable
  interface to take three arguments : message, delay and count of types 
  String, int and int respectively. Write code in the Printer.run() method
   to print the message with appropriate delay and for number of times
    mentioned in count. Write a class called ThreadDemo with the main()
    o method which instantiates and executes three instances of the above
     mentioned Printer class as threads to produce the desired output.*/
class Printer implements Runnable {
    private String message;
    private int delay;
    private int count;

    public Printer(String message, int delay, int count) {
        this.message = message;
        this.delay = delay;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Printer("Good morning", 1000, 2));
        Thread thread2 = new Thread(new Printer("Hello", 1000, 2));
        Thread thread3 = new Thread(new Printer("Welcome", 3000, 1));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
