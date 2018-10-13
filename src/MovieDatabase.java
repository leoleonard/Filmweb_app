import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    //model

    //zdefiniowanie listy: typ, co przechowuje, nazwa;
    //lista jest interfejsem, korzysta z polimorfizmu
    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
    }

}
