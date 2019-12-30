package cn.v.service;

import cn.v.dao.ExchangeMapper;
import cn.v.pojo.Exchange;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExchangeServiceImpl implements  ExchangeService {

    @Resource
    ExchangeMapper exchangeMapper;

    @Override
    public List<Exchange> queryexchange() {
        return exchangeMapper.queryexchange();
    }
}
