package com.photoadventure.cogini_project.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created by Sam on 1/25/2018.
 */

public class Post {
    private String name;
    private String title;
    private String author;
    private String date;
    private String time;
    private String photoUri;
    private int numberOfViews;
    private int numberOfLikes;

    public Post() {
    }

    public Post(String name, String title, String author) {
        this.name = name;
        this.title = title;
        this.author = author;
        this.date = getCurrentDate();
        this.time = getCurrentTime();
        this.photoUri = null;
        this.numberOfViews = 0;
        this.numberOfLikes = 0;
    }

    private String getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(Calendar.getInstance().getTime());
        return date;
    }

    private String getCurrentTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormat.format(Calendar.getInstance().getTime());
        return time;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}
