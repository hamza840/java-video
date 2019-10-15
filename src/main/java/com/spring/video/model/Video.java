package com.spring.video.model;

public class Video {
    String id;
    String name;
    String videoSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
