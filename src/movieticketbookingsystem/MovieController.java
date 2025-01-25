package movieticketbookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
   private Map<City, List<Movie>> cityVsMoviesList;
   private List<Movie> allMovies;

   MovieController() {
       cityVsMoviesList = new HashMap<>();
       allMovies = new ArrayList<>();
   }

   //CRUD Operations
    public void getMoviesInACity(City city) {

    }

    public void addAMovieInACity(City city , Movie movie) {

    }

    public void getMovieByName(String movieName) {

    }

    //Delete , update , add more operations here.


}
