import com.parsons.refactor.*;

public class Main {

    public static void main(String[] args) {
        UTCTime utcTime = new UTCTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("sydney", new CityClock(10));
        utcTime.attach("newYork", new CityClock(-5));

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);
        //设定北京时间上午9点
        phoneClock.setLocalTime(9);

        utcTime.printTimeOfAllClocks();
    }
}
