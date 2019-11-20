package task3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj swoją datę urodzenia w formacie YYYY-MM-DD");
        String birth = scanner.nextLine();
        scanner.close();

        LocalDate dateOfBirth = LocalDate.parse(birth);
        LocalDate today = LocalDate.now();
        System.out.println("Dzisiaj jest: " + today);
        Period age = Period.between(dateOfBirth,today);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("Masz " + years + " lat " + months + " miesięcy " + days + " dni");
    }
}
