import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FIleService {

    private  static final String FILE_NAME = "movies.csv";

    void save(MovieDatabase database) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        List<Movie> movies = database.getMovies();
        //przerobienie obiektu na String w csv
        for (Movie movie : movies) {
            String csv = movie.toCsv();
            writer.write(csv);
            writer.newLine();
        }
        writer.close();
    }

}
