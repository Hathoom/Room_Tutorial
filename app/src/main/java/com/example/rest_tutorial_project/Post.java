package com.example.rest_tutorial_project;

import com.google.gson.annotations.SerializedName;

// each post is a class, like getting info from JSON
public class Post {

    private int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
