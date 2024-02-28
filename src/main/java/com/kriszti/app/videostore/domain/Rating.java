package com.kriszti.app.videostore.domain;

import com.kriszti.app.videostore.dto.incoming.RatingCreationCommand;
import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ratingText;

    private Integer rating;

    public Rating() {
    }

    public Rating(RatingCreationCommand command) {
        this.ratingText = command.getRatingText();
        this.rating = command.getRating();
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
