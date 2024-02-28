package com.kriszti.app.videostore.dto.incoming;

public class VideoCreationCommand {

    private String title;

    private String director;

    private Integer year;

    public VideoCreationCommand() {
    }

    public VideoCreationCommand(String title, String director, Integer year) {
        this.title = title;
        this.director = director;
        this.year = year;
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
}
