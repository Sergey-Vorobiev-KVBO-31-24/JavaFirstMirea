package ru.mirea.taskEnums;

public enum Seasons {
    SUMMER (22),
    FALL(10),
    WINTER(-5),
    SPRING(14);

    private final int midTemp;

    private Seasons(int midTemp) {
        this.midTemp = midTemp;
    }

    public int getMidTemp() {
        return midTemp;
    }

    public static void love(Seasons season)
    {
        switch (season)
        {
            case SUMMER: System.out.println("Я люблю лето"); break;
            case FALL: System.out.println("Я люблю осень"); break;
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
        }
    }

    public String getDescription()
    {
        return "Холодное время года";
    }

    @Override
    public String getDescription()
    {
        return "Тёплое время года";
    }
}
