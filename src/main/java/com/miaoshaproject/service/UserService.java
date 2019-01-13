package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;
    /*
    * telphone：是用户注册的手机号
    * password：是用户加密后的密码
    * */
    UserModel validataLogin(String telphone,String encrptPassword) throws BusinessException;
}
