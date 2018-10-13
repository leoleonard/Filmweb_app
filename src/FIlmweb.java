import java.sql.SQLOutput;
import java.util.Scanner;

public class FIlmweb {
    public static void main(String[] args) {
        //zmienna zawiera: typ, referencje, przypisanie

        //tworzenie obiektu
        //:::Movie  movie1 = new Movie("Titanic", 1997, "James Cameron", "Dramat");
        //tworzenie tablicy: typ [] nazwa = new typ[rozmiar tablicy]
        Movie[] movies = new Movie[2];
        //movies[0] =  new Movie("Titanic", 1997, "James Cameron", "Dramat");
        // movie1.show();

        //wczytanie infomracji o 2 fimach poprzez petle
        //tworzenie petly: movies.fori; movies.for;
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dodaj film");
            movies[i] = createMovie();
            //::przeniesienie do metody static
        }

        for (Movie movie : movies) {
            movie.show();
        }

    }

    private static Movie createMovie() {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
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
