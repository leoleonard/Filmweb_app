import java.util.Scanner;

public class FilmwebController {
    //pola musza byc zdefiniowane jako private!

    private static final int ADD_MOVIE = 1;
    private static final int REMOVE_MOVIE = 2;
    private static final int SEARCH_MOVIE = 3;
    private static final int EXIT = 4;

    private MovieDatabase database = new MovieDatabase();
    private UIService uiService = new UIService();

    void mainLoop() {
        int option;
        do {
            //glowna petla programu
            ShowOptions();
            //wybor opcji
             option = readOption();
            //wykonanie opcji dokonanej przez uzytkownika
            executeOption(option);
        } while (option != EXIT);
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
            case ADD_MOVIE:
                //wczytanie informacji o filmie i zapisanie ich w bazie
                getAddMovie();
                break;
            case REMOVE_MOVIE:
                getRemoveMovie();
                break;
            case SEARCH_MOVIE:

                break;
            case EXIT:
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

    private void getRemoveMovie() {

    }

    private void getAddMovie() {
        Movie movie = uiService.readMovie();
        database.add(movie);
    }

}
