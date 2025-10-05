package ru.mirea.taskEnums;

public class Tester {
    static void main() {
        Seasons favoriteSeason = Seasons.FALL;
        Seasons.love(favoriteSeason);
        System.out.println(favoriteSeason.getMidTemp());
        System.out.println(favoriteSeason.getDescription());

        for (Seasons season: Seasons.values())
        {
            System.out.printf("Время года: %s, средняя температура: %s, описание: %s\n",
                    season.toString(), season.getMidTemp(), season.getDescription());
        }
    }
}
