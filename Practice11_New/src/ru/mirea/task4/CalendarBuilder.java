package ru.mirea.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarBuilder {
    public Calendar build(int year, int month, int day, int h, int m)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR, h);
        cal.set(Calendar.MINUTE, m);
        return cal;
    }
}