package ex_4;

import com.learn.task2.ex_4.Timer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimerTests {
    Timer timer;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    @Before
    public void setUp() {
        timer = Timer.initialize();
    }

    @Test
    public void testTimerCurrentTime() {
        String result = timer.getTime();
        String timeNow = LocalTime.now().format(formatter);
        assertEquals(timeNow, result);
    }

    @Test
    public void TestTimer5s() throws InterruptedException {
        int seconds = 5;
        int result = timer.timer(seconds);
        assertEquals(seconds, result);
    }




}
