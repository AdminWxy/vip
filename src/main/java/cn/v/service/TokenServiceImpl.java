package cn.v.service;

import cn.v.pojo.Vipuser;
import cn.v.util.MD5;
import cn.v.util.RedisService;
import nl.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {

    @Resource
    private RedisService redisService;
    @Override
    public Vipuser validate(String token) {
        if(token!=null)
        {
            boolean flag=redisService.hasKey(token);
            if(flag==true)
            {
                return (Vipuser)redisService.get(token);
            }else{
                return null;
            }
        }
        return null;
    }




    @Override
   public String gettoken(String userAgent, Vipuser vipuser) {
        StringBuffer token = new StringBuffer();
        UserAgent ua= UserAgent.parseUserAgentString(userAgent);
        if(ua.getOperatingSystem().isMobileDevice())
        {
            token.append("MOBLIE-");
        }else{
            token.append("PC-");
        }
        String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        token.append(MD5.getMd5(vipuser.getVipnumber(),16)).append("-")
                .append(vipuser.getVipid())
                .append("-")
                .append(time)
                .append("-")
                .append(MD5.getMd5(userAgent,6));
        redisService.set(token.toString(),vipuser,20*60L);
        return token.toString();
    }

}
