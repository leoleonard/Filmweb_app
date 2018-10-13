import java.util.Scanner;

public class FilmwebController {

    private static final int ADD_MOVIE = 1;
    private static final int REMOVE_MOVIE = 2;
    private static final int SEARCH_MOVIE = 3;
    private static final int EXIT = 4;

    void mainLoop() {
        //glowna petla programu
        ShowOptions();
        //wybor opcji
        int option = readOption();
        //wykonanie opcji dokonanej przez uzytkownika
        executeOption(option);
    }


    void ShowOptions() {
        System.out.println(ADD_MOVIE + " = Dodanie filmu");
        System.out.println(REMOVE_MOVIE + " = Usuwanie filmu");
        System.out.println(SEARCH_MOVIE + " = Wyszukaj film");
        System.out.println(EXIT +" = Koniec programu");
    }

    int readOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numer opcji");
        int optionNumber = scanner.nextInt();
        return optionNumber;
    }

    void executeOption(int opt) {
        //zdefiniowanie switcha
        switch (opt) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

}
