package ru.mirea.task3;

import java.util.Calendar;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatedStudent extends Student {
    Calendar birthdate;

    public DatedStudent(String name, String lastname, String spec, int year, String group, int gPA, Calendar birthdate)
    {
        super(name, lastname, spec, year, group, gPA);
        this.birthdate = birthdate;
    }

    public String toString(String format)
    {
        int day = birthdate.get(Calendar.DAY_OF_MONTH);
        int month = birthdate.get(Calendar.MONTH) + 1;
        int year = birthdate.get(Calendar.YEAR);

        return switch (format) {
            case "shortest" -> String.format("%02d.%02d.%02d", day, month, year);
            case "shorten" -> {
                String monthName = Month.of(month).getDisplayName(TextStyle.SHORT, Locale.getDefault());
                yield String.format("%d %s %dг.", day, monthName, year);
            }
            case "full" -> {
                String monthName = Month.of(month).getDisplayName(TextStyle.FULL, Locale.getDefault());
                yield String.format("%d %s %d года", day, monthName, year);
            }
            default -> "Не выбран формат даты";
        };
    }
}
