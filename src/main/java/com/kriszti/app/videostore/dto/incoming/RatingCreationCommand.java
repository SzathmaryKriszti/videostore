package com.kriszti.app.videostore.dto.incoming;

public class RatingCreationCommand {

    private String ratingText;

    private Integer rating;

    public RatingCreationCommand() {
    }

    public RatingCreationCommand(String ratingText, Integer rating) {
        this.ratingText = ratingText;
        this.rating = rating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
