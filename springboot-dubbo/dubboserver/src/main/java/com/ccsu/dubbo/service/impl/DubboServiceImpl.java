package com.ccsu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ccsu.dubbo.service.DubboService;
import org.springframework.stereotype.Component;


/**
 * @author wenzhenyu
 * @description
 * @date 2019/1/25
 */
@Service(interfaceClass = DubboService.class)
@Component
public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name){
        return name +" ,hello from dubbo server";
    }




}
