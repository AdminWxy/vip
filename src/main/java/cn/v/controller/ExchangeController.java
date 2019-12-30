package cn.v.controller;

import cn.v.pojo.Commdoity;
import cn.v.pojo.Exchange;
import cn.v.pojo.Vipuser;
import cn.v.service.CommdoityService;
import cn.v.service.ExchangeService;
import cn.v.util.RedisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;

@Controller
public class ExchangeController {

    @Resource
    private ExchangeService exchangeService;
    @Resource
    private CommdoityService commdoityService;
/*    @RequestMapping("/queryexchange")
    @ResponseBody
    public List<Exchange> query() {
        return exchangeService.queryexchange();
    }*/

    @RequestMapping("lookexchange")
    public String look(Integer vipid, Model model) {
        List<Commdoity> list = commdoityService.querycommdoity2(vipid);
        int sum = 0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i).getTotalprice();
        }
        model.addAttribute("sum",sum);
        model.addAttribute("list",list);
        return "exchange.jsp";

}
}
