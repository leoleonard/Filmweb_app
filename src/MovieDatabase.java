import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    //model

    //zdefiniowanie listy: typ, co przechowuje, nazwa;
    //lista jest interfejsem, korzysta z polimorfizmu
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void add(Movie movie) throws DuplicateMovieException {
        //czy film z danym ID istnieje juz w bazie?
        Movie foundMovie = findById(movie.getId());
        if (foundMovie != null)
            throw new DuplicateMovieException();
        movies.add(movie);
    }

    void removeById(int movieId) {
        //wyszukaj a potem usun obiekt; gdy nie znaleziono - nie rob nic
        Movie foundMovie = findById(movieId);
        if (foundMovie != null) {
            movies.remove(foundMovie);
        }
    }

    Movie findById(int movieId) {
        for (Movie movie : movies) {
            if(movie.getId() == movieId) {
                return movie;
            }
        }
        return null;
        //gdy nie znaleziono filmu
    }

}
