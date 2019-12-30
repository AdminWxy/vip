package cn.v.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Commdoity implements Serializable {


    private Integer commodityid;//bigint(20)
    private String commodityname;//varchar(20)
    private int buynumber;//int(20)
    private double price;//decimal(5,2)
    private double totalprice;//decimal(5,2)
    private Integer vipid;//int(10)
    private Date createTime;
    private int isture;

    public int getIsture() {
        return isture;
    }

    public void setIsture(int isture) {
        this.isture = isture;
    }

    private  String commdoityscore;

    public String getCommdoityscore() {
        return commdoityscore;
    }

    public void setCommdoityscore(String commdoityscore) {
        this.commdoityscore = commdoityscore;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public int getBuynumber() {
        return buynumber;
    }

    public void setBuynumber(int buynumber) {
        this.buynumber = buynumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
