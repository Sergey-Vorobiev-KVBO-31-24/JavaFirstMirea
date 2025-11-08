package ru.mirea.task6;

import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String filename = sc.next();
        sc.close();

        FileReader reader = new FileReader("src/ru/mirea/task6/" + filename);
        String result = getLine(reader);
        reader.close();

        System.out.println(result);
    }

    public static String getLine(FileReader reader) throws IOException {
        // Чтение
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        int character = reader.read();
        while (character != -1)
        {
            if ((char)character == ' ')
            {
                words.add(word.toString());
                word.setLength(0);
            }
            else word.append((char)character);
            character = reader.read();
        }
        if (!word.isEmpty()) words.add(word.toString());

        // Работа с прочитанным
        if (words.isEmpty()) return "";

        String result = arrangeWords(new StringBuilder(), words);

        if (result.isEmpty()) System.out.println("По полученным словам невозможно составить строку, упорядоченную нужным образом.");
        return result;
    }

    public static String arrangeWords(StringBuilder sb, ArrayList<String> words)
    {
        if (words.isEmpty()) return sb.toString();

        for (String word: words)
        {
            if (sb.isEmpty() || sb.charAt(sb.length()-1) == word.charAt(0))
            {
                StringBuilder newSB = copySB(sb);
                if (!newSB.isEmpty()) newSB.append(' ');
                newSB.append(word);

                ArrayList<String> newWords = copyALS(words);
                newWords.remove(word);

                String result = arrangeWords(newSB, newWords);
                if (!result.isEmpty()) return result;
            }
        }
        return "";
    }

    private static StringBuilder copySB(StringBuilder sb)
    {
        return new StringBuilder(sb.toString());
    }

    private static ArrayList<String> copyALS(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<>(list.size());
        newList.addAll(list);
        return newList;
    }
}
