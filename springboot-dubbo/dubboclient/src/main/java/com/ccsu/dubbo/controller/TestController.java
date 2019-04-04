package com.ccsu.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ccsu.dubbo.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description 测试
 * @date 2019/1/25
 */
@RestController
public class TestController {


    @Reference(url = "dubbo://127.0.0.1:20880")
    DubboService dubboService;


    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/sayHello")
    String sayHello(@RequestParam String name){

        return dubboService.sayHello(name);
    }

}
