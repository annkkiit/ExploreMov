package ankit.popmovies.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ankit.popmovies.Reviews;

public class ReviewResponse
{
    @SerializedName("results") private List<Reviews> reviewResults;

    public List<Reviews> getReviewResults() {
        return reviewResults;
    }
}
