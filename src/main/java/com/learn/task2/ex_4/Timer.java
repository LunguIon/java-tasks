package com.learn.task2.ex_4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Timer {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    private Timer() {}

    private static class Holder {
        private static final Timer instance = new Timer();
    }

    public static Timer initialize() {
      return Holder.instance;
    }

    public String getTime() {
        return LocalTime.now().format(formatter);
    }

    public int timer(int seconds) throws InterruptedException {
        Date startDate = new Date();
        Thread.sleep(seconds* 1000L);
        Date endDate = new Date();
        return (int)((endDate.getTime() - startDate.getTime()) / 1000);
    }

}
