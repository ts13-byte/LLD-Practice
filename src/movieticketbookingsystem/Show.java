package movieticketbookingsystem;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private int showId;
    private Movie movie;
    private List<Integer> bookedSeatIds;
    private Screen screen;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    public Show(int showId, Movie movie, List<Integer> bookedSeatIds, Screen screen, LocalDateTime startTime, LocalDateTime endTime) {
        this.showId = showId;
        this.movie = movie;
        this.bookedSeatIds = bookedSeatIds;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
