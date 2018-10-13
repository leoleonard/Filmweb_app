import java.util.Scanner;

public class UIService {
    //tu wczytywanie informacji o filmach

    //dodanie skanera do calej klasy
    private Scanner scanner = new Scanner(System.in);

    Movie readMovie() {
        Movie movie = new Movie();
        System.out.println("Podaj unikalne ID");
        movie.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj tytuł");
        movie.setTitle(scanner.nextLine());
        System.out.println("Podaj rok");
        movie.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj rezysera");
        movie.setDirector(scanner.nextLine());
        System.out.println("Podaj gatunek");
        movie.setGenre(scanner.nextLine());
        return movie;
    }


}
