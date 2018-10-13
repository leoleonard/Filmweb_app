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
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dodaj film");
            Scanner scanner = new Scanner(System.in);
            movies[i] = new Movie();
            System.out.println("Podaj tytuł");
            movies[i].setTitle(scanner.nextLine());
            System.out.println("Podaj rok");
            movies[i].setYear(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Podaj rezysera");
            movies[i].setDirector(scanner.nextLine());
            System.out.println("Podaj gatunek");
            movies[i].setGenre(scanner.nextLine());
        }

        for (Movie movie : movies) {
            movie.show();
        }

        //tworzenie petly: movies.fori; movies.for;


//        movies[0].show();
//        movies[1].show();
        //wywowalenie metody na obiekcie
    }
}
