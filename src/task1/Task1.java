package task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Wprowadź swoje imię");
        String name = scanner.nextLine();
        System.out.println("Wprowadź swoje nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Wprowadź swoje stanowisko");
        String workPlace = scanner.nextLine();
        System.out.println("Wprowadź wielkość Twojej pensji");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj swoją płeć M - mężczyzna | K - kobieta");
        char gender = scanner.nextLine().charAt(0); //charAt(?)
        System.out.println("Wprowadź swój numer PESEL");
        String pesel = scanner.nextLine();

//        alternatywa dla podania i wyświetlenia płci
//        System.out.println("Podaj swoją płeć M - mężczyzna | K - kobieta");
//        String gender1 = scanner.nextLine();
//        if (gender1.equals("M")){
//            System.out.printf("Mężczyzna %s", gender1);
//        }else {
//            System.out.printf("Kobieta %s",gender1);
//        }
        System.out.printf("Nazywasz się: %s %s \n"+"Jesteś %s\n"+"Pracujesz jako %s"+" i zarabiasz %.2f zł\n"+"Twój numer PESEL to %s\n", name, lastName, gender, workPlace, salary, pesel);

        scanner.close();

    }
}
