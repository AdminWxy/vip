package cn.v.controller;

import cn.v.pojo.Commdoity;
import cn.v.pojo.Vipuser;
import cn.v.service.CommdoityService;
import cn.v.service.TokenService;
import cn.v.service.VipuserService;
import cn.v.util.RedisService;
import com.sun.xml.internal.ws.api.message.Header;
import jdk.internal.org.objectweb.asm.commons.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VipuserController {

    @Resource
    private TokenService tokenService;
    @Resource
    private VipuserService vipuserService;
    @Resource
    private CommdoityService commdoityService;
    @Resource
    private RedisService redisService;
    @RequestMapping("/login")
    public Map login(Vipuser vipuser, HttpServletRequest request) {
        Vipuser vipuserdata = vipuserService.login(vipuser);
        Map map = new HashMap();
        if (vipuserdata != null) {
            String userAgent = request.getHeader("user-agent");
            String token = tokenService.gettoken(userAgent, vipuserdata);
            map.put("vipuserdata",vipuserdata);
            map.put("token",token);
            map.put("result", true);
        } else {
            map.put("result", false);
            map.put("error","用户名或密码错误！");
        }
        return map;
    }
}