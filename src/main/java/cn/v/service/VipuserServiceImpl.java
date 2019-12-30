package cn.v.service;

import cn.v.dao.VipuserMapper;
import cn.v.pojo.Vipuser;
import cn.v.util.RedisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VipuserServiceImpl implements VipuserService {

    @Resource
    private VipuserMapper vipuserMapper;
    @Resource
    private RedisService redisService;

    @Override
    public Vipuser login(Vipuser vipuser) {
       Vipuser  vipuser1= vipuserMapper.login(vipuser);
       if(vipuser1==null)
       {
           return null;
       }else{
           return vipuser1;
       }
    }
}
