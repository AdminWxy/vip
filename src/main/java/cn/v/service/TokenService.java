package cn.v.service;

import cn.v.pojo.Vipuser;

public interface TokenService {
    String gettoken(String userAgent, Vipuser vipuser);
    Vipuser  validate(String token);
}
