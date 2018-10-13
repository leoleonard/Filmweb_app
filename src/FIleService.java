import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIleService {

    private  static final String FILE_NAME = "movies.csv";

    void save(MovieDatabase database) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        
    }

}
