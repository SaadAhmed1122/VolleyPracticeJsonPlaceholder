package com.example.volleypracticejsonplaceholder;

public class PostModel {
    int userId;
    String title,desc;

    public PostModel(int userId, String title, String desc) {
        this.userId = userId;
        this.title = title;
        this.desc = desc;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
