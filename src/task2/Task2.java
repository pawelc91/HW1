package task2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj swoją datę urodzenia w formacie YYYY-MM-DD");
        String birth = scanner.nextLine();
        scanner.close();
        String year = birth.substring(0,4);
        System.out.println("Twój rok urodzenia to: " + year);
        double bYear = Double.parseDouble(year);

        LocalDate actualDate = LocalDate.now();
        System.out.println("Dzisiaj jest: " + actualDate);
        String today = actualDate.toString();
        String actualYear = today.substring(0,4);
        double aYear = Double.parseDouble(actualYear);

        double age;
        age = aYear - bYear;
        System.out.printf("Masz %.0f lat", age);


    }
}
