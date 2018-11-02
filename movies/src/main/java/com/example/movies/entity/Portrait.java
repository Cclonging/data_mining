package com.example.movies.entity;

/**
 * 基于用户画像的推荐列表类
 */
public class Portrait {

    private Integer mo;
    private Integer userid;

    public Portrait() {
    }

    public Integer getMo() {
        return mo;
    }

    public void setMo(Integer mo) {
        this.mo = mo;
    }

    public Portrait(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Portrait{" +
                "mo=" + mo +
                ", userid=" + userid +
                '}';
    }
}
