package ru.mirea.task8;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0] = new Magazine("Журнал А", "Страна А", "2025");
        printables[1] = new Magazine("Журнал B", "Страна B", "1992");
        printables[2] = new Book("Книга C", "Аноним", "Страна С", "Научная литература", "2020");
        printables[3] = new Magazine("Журнал D", "Страна D", "18XX");
        printables[4] = new Book("Книга E", "Народное творчество", "Страна E", "Сказка", "1001");

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
