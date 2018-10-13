import java.sql.SQLOutput;
import java.util.Scanner;

public class FIlmweb {
    public static void main(String[] args) {
        //zmienna zawiera: typ, referencje, przypisanie

        //tworzenie obiektu
        //:::Movie  movie1 = new Movie("Titanic", 1997, "James Cameron", "Dramat");
        //tworzenie tablicy: typ [] nazwa = new typ[rozmiar tablicy]
        Movie[] movies = new Movie[5];
        movies[0] =  new Movie("Titanic", 1997, "James Cameron", "Dramat");
       // movie1.show();

        System.out.println("Dodaj film");
        Scanner scanner = new Scanner(System.in);
        movies[1] = new Movie();
        System.out.println("Podaj tytluł");
        movies[1].setTitle(scanner.nextLine());
        System.out.println("Podaj rok");
        movies[1].setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj rezysera");
        movies[1].setDirector(scanner.nextLine());
        System.out.println("Podaj gatunek");
        movies[1].setGenre(scanner.nextLine());

        movies[1].show();
        //wywowalenie metody na obiekcie
    }
}
