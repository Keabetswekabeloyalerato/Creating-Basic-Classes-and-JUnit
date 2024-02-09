import static org.junit.Assert.*;
import org.junit.Test;

public class TestOfTime {

    @Test
    public void testTimeToString() {
        Time time = new Time(12, 30);
        assertEquals("12:30:00", time.toString());
    }

    @Test
    public void testTimeSubtractionEarlyAndLate() {
        Time earlierTime = new Time(10, 15);
        Time laterTime = new Time(15, 45);
        
        Duration earlierDuration = earlierTime.asDuration();
        Duration laterDuration = laterTime.asDuration();
        Duration difference = laterDuration.subtract(earlierDuration);        
        long totalSeconds = difference.intValue("second");
        int hours = (int) (totalSeconds / 3600);
        int minutes = (int) ((totalSeconds % 3600) / 60);
        int seconds = (int) (totalSeconds % 60);

       String durationString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
           
       assertEquals("05:30:00", durationString);
    }

    @Test
    public void testTimeSubtractionZero() {
        Time sameTime = new Time(8, 30);
        
        Duration duration = sameTime.subtract(sameTime);
        assertEquals(Duration.ZERO, duration);
    }

    @Test
    public void testDurationIntValueMilliseconds() {
        Duration duration = new Duration(2000);
        assertEquals(2000, duration.intValue("millisecond"));
    }

    @Test
    public void testDurationIntValueSeconds() {
        Duration duration = new Duration(180000);
        assertEquals(180, duration.intValue("second"));
    }

    @Test
    public void testDurationIntValueMinutes() {
        Duration duration = new Duration(3600000);
        assertEquals(60, duration.intValue("minute"));
    }

    @Test
    public void testDurationIntValueHours() {
        Duration duration = new Duration(7200000);
        assertEquals(2, duration.intValue("hour"));
    }

  }
