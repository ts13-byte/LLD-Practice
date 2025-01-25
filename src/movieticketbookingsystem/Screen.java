package movieticketbookingsystem;

import java.util.List;

public class Screen {
    private int screenId;
    private List<Seat> seats;

    public Screen(int screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
