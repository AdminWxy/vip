package cn.v.pojo;

import java.io.Serializable;

public class Vipuser implements Serializable {

   private Integer vipid;//bigint(10)
    private String vipnumber;//varchar(20)
    private String password;//varchar(20)
    private String username;//varchar(20)
private double vipscore;
    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public String getVipnumber() {
        return vipnumber;
    }

    public void setVipnumber(String vipnumber) {
        this.vipnumber = vipnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public double getVipscore() {
        return vipscore;
    }

    public void setVipscore(double vipscore) {
        this.vipscore = vipscore;
    }
}
