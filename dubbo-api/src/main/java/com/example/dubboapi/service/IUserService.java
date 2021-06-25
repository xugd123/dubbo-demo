package com.example.dubboapi.service;


import com.example.dubboapi.pojo.User;

import java.rmi.RemoteException;

public interface IUserService {

   User selectUserByUserId(Integer userId) throws RemoteException;

}
