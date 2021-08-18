package com.bjpowernode.domain;

public class Classroom {
    private Integer cid;
    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Classroom() {
    }

    public Classroom(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
