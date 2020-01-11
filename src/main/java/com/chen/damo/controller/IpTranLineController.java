package com.chen.damo.controller;

import com.chen.damo.service.IpTranLineService;
import com.chen.damo.entity.IpTranLineInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ipLine")
public class IpTranLineController {
    @Autowired
    private IpTranLineService ipTranLineService;

    @RequestMapping("getIpLineInfo")
    public List<IpTranLineInfo> findAllIpLineInfo(){
        return ipTranLineService.findAll();
    }
}
