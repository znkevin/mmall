package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount=userMapper.checkUsername(username);
        if (resultCount==0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        User user=userMapper.selectLonin(username,password);
        if(user==null){
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }
        // 把密码设置为空
        user.setPassword(StringUtils.EMPTY);

        return ServerResponse.createBySuccess("登录成功",user);
    }
}
