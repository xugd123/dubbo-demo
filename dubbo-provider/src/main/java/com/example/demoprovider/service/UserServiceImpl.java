package com.example.demoprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.pojo.User;
import com.example.dubboapi.service.IUserService;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;

/*
 * 提供服务
 */
//service注解为dubbo
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUserByUserId(Integer userId) throws RemoteException {
        User user=new User();
        user.setUserId(userId);
        user.setName("zhangsan");
        System.out.println("提供服务，接受客户端的用户id为"+userId);
        return user;
    }
}
