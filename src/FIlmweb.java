public class FIlmweb {
    public static void main(String[] args) {
        //zmienna zawiera: typ, referencje, przypisanie

        //tworzenie tablicy: typ [] nazwa = new typ[rozmiar tablicy]
        int x = 5;
        int[] tab = {5, 10, 15};


        //tworzenie obiektu
        //Movie  movie1 = new Movie("Titanic", 1997, "James Cameron", "Dramat");

        Movie[] movies = new Movie[5];
        movies[0] =  new Movie("Titanic", 1997, "James Cameron", "Dramat");

       // movie1.show();
        movies[0].show();
        //wywowalenie metody na obiekcie
    }
}
