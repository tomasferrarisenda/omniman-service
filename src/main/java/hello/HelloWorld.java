package hello;

import org.joda.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class HelloWorld {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalTime currentTime = new LocalTime();
                System.out.println("The current local time is: " + currentTime);

                Greeter greeter = new Greeter();
                System.out.println(greeter.sayHello());
            }   
        }, 0, 5000); // starts immediately and repeats every 5000 milliseconds (5 seconds)
    }
}