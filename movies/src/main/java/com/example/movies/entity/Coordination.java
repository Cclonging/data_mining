package com.example.movies.entity;

public class Coordination {
    private Integer num;
    private String name;
    private String category;
    private String time;
    private Double score;
    private Integer userid;

    public Coordination() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Coordination{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", time='" + time + '\'' +
                ", score=" + score +
                ", userid=" + userid +
                '}';
    }
}
