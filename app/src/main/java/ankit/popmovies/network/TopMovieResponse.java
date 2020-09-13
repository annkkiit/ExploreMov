package ankit.popmovies.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ankit.popmovies.database.MovieTopRated;

public class TopMovieResponse
{
    @SerializedName("results") private List<MovieTopRated> results;

    public List<MovieTopRated> getResults() {
        return results;
    }
}
