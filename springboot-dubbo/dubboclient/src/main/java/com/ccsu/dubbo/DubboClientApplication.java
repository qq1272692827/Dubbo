package com.ccsu.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wenzhenyu
 * @description dubbo客户端
 * @date 2019/1/25
 */
//@ComponentScan(basePackages = "com.ccsu")
@SpringBootApplication
@EnableDubboConfiguration
public class DubboClientApplication {

    public static void main(String[]args){

        SpringApplication.run(DubboClientApplication.class,args);

    }

}
