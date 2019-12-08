package com.example.puzzledroid.tableScore;

public class Score {

    private Integer id;
    private String user;
    private Integer score;
    private Integer time;

    public Score(Integer id, String user, Integer score, Integer time) {
        this.id = id;
        this.user = user;
        this.score = score;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
