package cn.v.dao;

import cn.v.pojo.Commdoity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommdoityMapper  {

    List<Commdoity>querycommdoity(@Param("vipid")Integer vipid);

    List<Commdoity> querycommdoity2(@Param("vipid")Integer vipid);

    int  consumptioncount(Integer vipid);

    Commdoity getById(@Param("id") Integer id);

    int add(Commdoity commdoity);
}
