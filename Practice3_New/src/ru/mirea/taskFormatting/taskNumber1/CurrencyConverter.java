package ru.mirea.taskFormatting.taskNumber1;

import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyConverter {
    private Locale defaultLoc = Locale.ENGLISH;

    public Locale getDefaultLoc() {
        return defaultLoc;
    }

    public void setDefaultLoc(Locale defaultLoc) {
        this.defaultLoc = defaultLoc;
    }

    public String convert(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(defaultLoc);
        return formatter.format(currency);
    }

    public String convertENG(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(Locale.ENGLISH);
        return formatter.format(currency);
    }

    public String convertFR(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(Locale.FRANCE);
        return formatter.format(currency);
    }

    public String convertUS(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        return formatter.format(currency);
    }

    public String convertGerman(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(Locale.GERMAN);
        return formatter.format(currency);
    }

    public String convertChina(double currency)
    {
        NumberFormat formatter = NumberFormat.getInstance(Locale.CHINA);
        return formatter.format(currency);
    }
}
