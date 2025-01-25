package movieticketbookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private int theatreId;
    private String Address;
    private City city;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(int theatreId, String address, City city) {
        this.theatreId = theatreId;
        Address = address;
        this.city = city;
        this.screens = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
