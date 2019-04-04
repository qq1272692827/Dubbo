package com.ccsu.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wenzhenyu
 * @description dubbo服务端
 * @date 2019/1/25
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboServerApplication {

    public static void main(String[]args){
        SpringApplication.run(DubboServerApplication.class,args);
    }

}
