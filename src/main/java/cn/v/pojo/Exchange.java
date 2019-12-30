package cn.v.pojo;

import java.io.Serializable;

public class Exchange implements Serializable {


    private Integer commodityid;//int(10)
    private double commdoityscore;//decimal(5,2)
    private Integer isture;//int(2)
    private String commodityname;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public double getCommdoityscore() {
        return commdoityscore;
    }

    public void setCommdoityscore(double commdoityscore) {
        this.commdoityscore = commdoityscore;
    }

    public Integer getIsture() {
        return isture;
    }

    public void setIsture(Integer isture) {
        this.isture = isture;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }
}
