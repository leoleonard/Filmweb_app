public class Movie {
    //model

    //pola - specyfikator dostepu, typ, nazwa
    //pola w klasie powinny byc private! - Javabeans
    private int id;
    private String title;
    private int year;
    private String director;
    private String genre;

    Movie() {};
    //konstrktor bez parametrow


    //konstruktory
    //:::utworzenie konstruktora nie(!) domyslnego

    public Movie(int id, String title, int year, String director, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //metody

//    void show() {
//        System.out.printf("%s %s %s %d\n", title, director, genre, year);
//    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d\n", title, director, genre, year);
    }

}
