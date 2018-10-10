package com.springboot.dubbo.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.duboo.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author xiaozefeng
 * @date 2018/10/10 下午2:11
 */
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello Dubbo";
    }
}
