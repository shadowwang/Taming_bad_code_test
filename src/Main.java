import com.parsons.refactor.*;

public class Main {

    public static void main(String[] args) {
        TimeSubject utcTime = new UTCTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("sydney", new CityClock(10));
        utcTime.attach("newYork", new CityClock(-5));

        Clock phoneClock = new PhoneClock(utcTime);
        phoneClock.setLocalTime(9);

        utcTime.printTimeOfAllClocks();
    }
}
