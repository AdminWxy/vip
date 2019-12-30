package cn.v.service;

import cn.v.dao.CommdoityMapper;
import cn.v.pojo.Commdoity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommdoityServiceImpl implements CommdoityService {

    @Resource
    private CommdoityMapper commdoityMapper;


    @Override
    public List<Commdoity> querycommdoity(Integer vipid) {
        return commdoityMapper.querycommdoity(vipid);
    }

    @Override
    public List<Commdoity> querycommdoity2(Integer vipid) {
        return commdoityMapper.querycommdoity2(vipid);
    }

    @Override
    public int consumptioncount(Integer vipid) {
        return commdoityMapper.consumptioncount(vipid);
    }

    @Override
    public Commdoity getById(Integer id) {
        return commdoityMapper.getById(id);
    }

    @Override
    public int add(Commdoity commdoity) {
        return commdoityMapper.add(commdoity);
    }
}
