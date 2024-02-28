package com.kriszti.app.videostore.domain;

import com.kriszti.app.videostore.dto.incoming.VideoCreationCommand;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private Integer year;

    @Column(name = "rented_out")
    private Boolean flag;

    @Column(name = "picture_url")
    private String pictureUrl;

    @OneToMany( mappedBy = "rating")
    private List<Rating> ratings;

    public Video() {
    }

    public Video(VideoCreationCommand command) {
        this.title = command.getTitle();
        this.director = command.getDirector();
        this.year = command.getYear();
        this.flag = false;
        this.pictureUrl = command.getPictureUrl();
        this.ratings = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
