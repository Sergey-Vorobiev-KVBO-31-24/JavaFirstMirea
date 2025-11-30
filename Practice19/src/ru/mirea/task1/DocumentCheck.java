package ru.mirea.task1;

import java.util.Scanner;

public class DocumentCheck {
    public int get()
    {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        if (!id.matches("[0-9]+")) {
            throw new DocumentException("ИНН должен представлять из себя натуральное число.");
        }

        if (id.length() != 12)
        {
            throw new DocumentException("ИНН должен состоять ровно из 12 цифр.");
        }

        if (Integer.parseInt(id.substring(0,2)) > 85)
        {
            throw new DocumentException("первые две цифры должны представлять из себя код субъекта.");
        }

        return Integer.parseInt(id);
    }
}
