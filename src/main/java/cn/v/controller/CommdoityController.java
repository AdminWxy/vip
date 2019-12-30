package cn.v.controller;

import cn.v.pojo.Commdoity;
import cn.v.service.CommdoityService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CommdoityController {

    @Resource
    private CommdoityService commdoityService;

    @RequestMapping("/info")
    public String getInfo(Integer vipid, Model model) {
        model.addAttribute("vipid",vipid);
        System.out.println(vipid);
        return "main.jsp";
    }
    @RequestMapping("/list")
    @ResponseBody
    public String getAll(Integer vipid) {
        return JSON.toJSONString(commdoityService.querycommdoity(vipid));
    }

    @RequestMapping("/mai")
    public String getM(Integer id, Model model) {
        Commdoity commdoity = commdoityService.getById(id);
        model.addAttribute("commdoity",commdoity);
        return "index2.jsp";
    }
}
