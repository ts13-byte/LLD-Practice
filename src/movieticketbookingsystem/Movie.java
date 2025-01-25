package movieticketbookingsystem;

public class Movie {
    private String movieName;
    private String movieId;
    private int duration;

    public Movie(String movieName, String movieId, int duration) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
