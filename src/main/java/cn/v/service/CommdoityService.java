package cn.v.service;

import cn.v.pojo.Commdoity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommdoityService {
    List<Commdoity> querycommdoity(Integer vipid);
    List<Commdoity> querycommdoity2(Integer vipid);
    int  consumptioncount(Integer vipid);
    Commdoity getById(Integer id);
    int add(Commdoity commdoity);
}
