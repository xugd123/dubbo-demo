package com.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.pojo.User;
import com.example.dubboapi.service.IUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserInit implements CommandLineRunner {
    @Reference(interfaceClass = IUserService.class)
    private IUserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user = userService.selectUserByUserId(1);
        System.out.println(user);
    }
}
