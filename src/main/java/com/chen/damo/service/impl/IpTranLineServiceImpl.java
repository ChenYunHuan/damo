package com.chen.damo.service.impl;

import com.chen.damo.annotation.LogMessageSign;
import com.chen.damo.enums.OperationType;
import com.chen.damo.service.IpTranLineService;
import com.chen.damo.dao.IpTranLineInfoMapper;
import com.chen.damo.entity.IpTranLineInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IpTranLineServiceImpl implements IpTranLineService {
    @Resource
    private IpTranLineInfoMapper ipTranLineInfoMapper;

    @Override
    @LogMessageSign(eventContent = "查询",operationType = OperationType.QUERY)
    public List<IpTranLineInfo> findAll() {
        return ipTranLineInfoMapper.selectAll();
    }
}
