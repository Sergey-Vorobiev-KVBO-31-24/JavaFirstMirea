package ru.mirea.task5;

public class PhoneNumber {
    public static String phoneNumber(String str) throws InvalidPhoneException {
        if (str.startsWith("+") && str.length() >= 12 && isDigit(str.substring(1)))
        {
            return str.substring(0, str.length()-10) +
                    "(" + str.substring(str.length()-10, str.length()-7) + ")-" +
                    str.substring(str.length()-7, str.length()-4) + "-" +
                    str.substring(str.length()-4, str.length()-2) + "-" +
                    str.substring(str.length()-2);
        }
        if (str.startsWith("8") && str.length() == 11 && isDigit(str))
        {
            return "+7" +
                    "(" + str.substring(1, 4) + ")-" +
                    str.substring(4, 7) + "-" +
                    str.substring(7, 9) + "-" +
                    str.substring(9);
        }
        throw new InvalidPhoneException("Несоотвествие формату.");
    }

    private static boolean isDigit(String str)
    {
        return str.matches("[0-9]+");
    }
}