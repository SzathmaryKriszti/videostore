package com.kriszti.app.videostore.dto.incoming;

public class VideoCreationCommand {

    private String title;

    private String director;

    private Integer year;

    private String pictureUrl;

    public VideoCreationCommand() {
    }

    public VideoCreationCommand(String title, String director, Integer year, String pictureUrl) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.pictureUrl = pictureUrl;
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
