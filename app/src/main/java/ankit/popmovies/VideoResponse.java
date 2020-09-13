package ankit.popmovies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoResponse
{
    @SerializedName("results")  private List<Videos> results;

    public List<Videos> getVideoResults() {
        return results;
    }
}
